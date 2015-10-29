package fr.tutorials.utils.hbase;

import com.sun.istack.NotNull;

import fr.tutorials.utils.AtomDataInjector;
import fr.tutorials.utils.AtomConfiguration;
import fr.tutorials.utils.HadoopTutorialException;
import fr.tutorials.utils.TimeStampBuilder;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

import v13.Day;
import v13.LimitOrder;
import v13.Order;
import v13.OrderBook;
import v13.PriceRecord;
import v13.agents.Agent;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/**
 *
 */
public class SimpleHBaseInjector implements AtomDataInjector {
  private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(SimpleHBaseInjector.class.getName());

  AtomicLong idGen = new AtomicLong(1_000_000);
  //Confs
  private final AtomConfiguration atomConf;
  private final Configuration hbConf;
 
  final HBaseDataTypeEncoder hbEncoder = new HBaseDataTypeEncoder();
  private TimeStampBuilder tsb;

  //Props
  private final byte[] cfall;

  private final AtomicLong globalCount = new AtomicLong(0L);
  
  private final Table table;

  public SimpleHBaseInjector(@NotNull AtomConfiguration conf) throws Exception {
    this.atomConf = conf;
    this.cfall = conf.getColumnFamily();
    this.hbConf = createHbaseConfiguration();
    this.table = createHTableConnexion(TableName.valueOf(atomConf.getTableName()), this.hbConf);
    this.tsb = new TimeStampBuilder();
    
    // @TODO
    this.tsb.loadConfig();
    this.tsb.init();
  }


  private Table createHTableConnexion(TableName tableName, Configuration hbConf) throws IOException {
	 Connection connection = ConnectionFactory
		.createConnection(hbConf);
    Table table = connection.getTable(tableName);
    return table;
  }

  @Override
  public void createOutput() {
    assert !(atomConf.getTableName()==null);
    String port = hbConf.get("hbase.zookeeper.property.clientPort");
    String host = hbConf.get("hbase.zookeeper.quorum");

    LOGGER.log(Level.INFO, "Try to connect to " + host + ":" + port);

    LOGGER.log(Level.INFO, "Configuration completed");
    Connection connection = null;
    try {
    	 connection = ConnectionFactory.createConnection(hbConf);
      createTable(connection);
    } catch (IOException e) {
      LOGGER.log(Level.SEVERE, "Could not create Connection", e);
      throw new HadoopTutorialException("hbase connection", e);
    } finally {
      if (connection != null)
		try {
			connection.close();
		} catch (IOException e) {
			// can't do anything here...
		}
    }
  }

  private void createTable(Connection connection) {
    Admin admin = null;
    try {
      admin = connection.getAdmin();
    } catch (MasterNotRunningException e) {
      LOGGER.log(Level.SEVERE, "Master server not running", e);
      throw new HadoopTutorialException("hbase master server", e);
    } catch (ZooKeeperConnectionException e) {
      LOGGER.log(Level.SEVERE, "Could not connect to ZooKeeper", e);
      throw new HadoopTutorialException("zookeeper", e);
    } catch (IOException e) {
    	LOGGER.log(Level.SEVERE, "IOException while accessing hbase admin", e);
        throw new HadoopTutorialException("ioexception getAdmin", e);
	}

    try {
		if (admin.tableExists(TableName.valueOf(atomConf.getTableName()))) {
		  LOGGER.log(Level.INFO, atomConf.getTableName() + " already exists");
		  return;
		}
	} catch (IOException e1) {
		LOGGER.log(Level.SEVERE, "IOException while checking table exist", e1);
        throw new HadoopTutorialException("ioexception table exists", e1);
	}

    HTableDescriptor tableDescriptor = new HTableDescriptor(TableName.valueOf(atomConf.getTableName()));
    try {
      LOGGER.log(Level.INFO, "Creating table");
      LOGGER.log(Level.INFO, admin.getClusterStatus().toString());

      tableDescriptor.addFamily(new HColumnDescriptor(atomConf.getColumnFamily()));
      admin.createTable(tableDescriptor);
      LOGGER.log(Level.INFO, "Table Created");
    } catch (IOException e) //ajouter exception spécique à la non création de table
    {
      LOGGER.log(Level.SEVERE, "Table already created but trying to create it!");
      System.exit(-1);
    }
  }

  @Override
  public void sendPriceRecord(PriceRecord pr, long bestAskPrice, long bestBidPrice) {
    long ts = System.currentTimeMillis() + 2L; //hack for update on scaledrisk (does not manage put then update with same ts)
    pr.timestamp = tsb.nextTimeStamp();

    Put p = new Put(Bytes.toBytes(createRequired("P")), ts);
    p.addColumn(cfall, Bytes.toBytes("obName"), ts, hbEncoder.encodeString(pr.obName));
    p.addColumn(cfall, Bytes.toBytes("price"), ts, hbEncoder.encodeLong(pr.price));
    p.addColumn(cfall, Bytes.toBytes("executedQuty"), ts, hbEncoder.encodeInt(pr.quantity));
    p.addColumn(cfall, Bytes.toBytes("dir"), ts, hbEncoder.encodeChar(pr.dir));
    p.addColumn(cfall, Bytes.toBytes("order1"), ts, hbEncoder.encodeString(pr.extId1));
    p.addColumn(cfall, Bytes.toBytes("order2"), ts, hbEncoder.encodeString(pr.extId2));
    p.addColumn(cfall, Bytes.toBytes("bestask"), ts, hbEncoder.encodeLong(bestAskPrice));
    p.addColumn(cfall, Bytes.toBytes("bestbid"), ts, hbEncoder.encodeLong(bestBidPrice));
    p.addColumn(cfall, Bytes.toBytes("timestamp"), ts, hbEncoder.encodeLong((pr.timestamp > 0 ? pr.timestamp : ts))); // tsb.nextTimeStamp()

    putTable(p);
  }

  @Override
  public void sendAgent(Agent a, Order o, PriceRecord pr) {
    Put p = new Put(Bytes.toBytes(createRequired("A")));
    p.addColumn(cfall, Bytes.toBytes("agentName"), hbEncoder.encodeString(a.name));
    p.addColumn(cfall, Bytes.toBytes("orderBookName"), hbEncoder.encodeString(o.obName));
    p.addColumn(cfall, Bytes.toBytes("cash"), hbEncoder.encodeLong(a.cash));
    p.addColumn(cfall, Bytes.toBytes("executed"), hbEncoder.encodeInt(pr.quantity));
    p.addColumn(cfall, Bytes.toBytes("price"), hbEncoder.encodeLong(pr.price));
    if (o.getClass().equals(LimitOrder.class)) {
      p.addColumn(cfall, Bytes.toBytes("direction"), hbEncoder.encodeChar(((LimitOrder) o).direction));
      p.addColumn(cfall, Bytes.toBytes("timestamp"), hbEncoder.encodeLong(pr.timestamp)); //pr.timestamp
      p.addColumn(cfall, Bytes.toBytes("orderExtId"), hbEncoder.encodeString(o.extId));
    }
    putTable(p);
  }

  @Override
  public void sendOrder(Order o) {
    o.timestamp = tsb.nextTimeStamp();
    long ts = System.currentTimeMillis(); //hack for update on scaledrisk (does not manage put then update with same ts)
    Put p = new Put(Bytes.toBytes(createRequired("O")), ts);
    p.addColumn(cfall, Bytes.toBytes("orderBookName"), Bytes.toBytes(o.obName)); //hbEncoder.encodeString(o.obName));
    p.addColumn(cfall, Bytes.toBytes("sender"), Bytes.toBytes(o.sender.name)); //hbEncoder.encodeString(o.sender.name));
    p.addColumn(cfall, Bytes.toBytes("extId"), Bytes.toBytes(o.extId)); //hbEncoder.encodeString(o.extId));
    p.addColumn(cfall, Bytes.toBytes("type"), hbEncoder.encodeChar(o.type)); //Bytes.toBytes(o.type)); 
    p.addColumn(cfall, Bytes.toBytes("id"), hbEncoder.encodeLong(o.id));
    p.addColumn(cfall, Bytes.toBytes("timestamp"), hbEncoder.encodeLong(o.timestamp)); //o.timestamp

    //Date d = new Date(tsb.getTimeStamp());
    if (o.getClass().equals(LimitOrder.class)) {
      LimitOrder lo = (LimitOrder) o;
      p.addColumn(cfall, Bytes.toBytes("quantity"), hbEncoder.encodeInt(lo.quantity));
      p.addColumn(cfall, Bytes.toBytes("direction"), hbEncoder.encodeChar(lo.direction));
      p.addColumn(cfall, Bytes.toBytes("price"), hbEncoder.encodeLong(lo.price));
      p.addColumn(cfall, Bytes.toBytes("validity"), hbEncoder.encodeLong(lo.validity));
    }
    putTable(p);
  }

  @Override
  public void sendTick(Day day, Collection<OrderBook> orderbooks) {
    for (OrderBook ob : orderbooks) {

      tsb.setCurrentTick(day.currentTick());
      tsb.setTimeStamp(tsb.baseTimeStampForCurrentTick());

      Put p = new Put(Bytes.toBytes(createRequired("T")));
      p.addColumn(cfall, Bytes.toBytes("numTick"), hbEncoder.encodeInt(day.currentTick()));
      p.addColumn(cfall, Bytes.toBytes("numDay"), hbEncoder.encodeInt(day.number + atomConf.getDayGap()));
      p.addColumn(cfall, Bytes.toBytes("orderBookName"), hbEncoder.encodeString(ob.obName));
      if (!ob.ask.isEmpty())
        p.addColumn(cfall, Bytes.toBytes("bestAsk"), hbEncoder.encodeLong(ob.ask.last().price));

      if (!ob.bid.isEmpty())
        p.addColumn(cfall, Bytes.toBytes("bestBid"), hbEncoder.encodeLong(ob.bid.last().price));

      if (ob.lastFixedPrice != null)
        p.addColumn(cfall, Bytes.toBytes("lastFixedPrice"), hbEncoder.encodeLong(ob.lastFixedPrice.price));

      putTable(p);

    }
  }

  @Override
  public void sendExec(Order o) {
    Put p = new Put(Bytes.toBytes(createRequired("E")));
    p.addColumn(cfall, Bytes.toBytes("sender"), hbEncoder.encodeString(o.sender.name));
    p.addColumn(cfall, Bytes.toBytes("extId"), hbEncoder.encodeString(o.extId));
    putTable(p);
  }

  @Override
  public void sendDay(int nbDays, Collection<OrderBook> orderbooks) {
    tsb.setCurrentDay(nbDays);
    for (OrderBook ob : orderbooks) {
      Put p = new Put(Bytes.toBytes(createRequired("D")));
      p.addColumn(cfall, Bytes.toBytes("NumDay"), hbEncoder.encodeInt(nbDays + atomConf.getDayGap()));
      p.addColumn(cfall, Bytes.toBytes("orderBookName"), hbEncoder.encodeString(ob.obName));
      p.addColumn(cfall, Bytes.toBytes("FirstFixedPrice"), hbEncoder.encodeLong(ob.firstPriceOfDay));
      p.addColumn(cfall, Bytes.toBytes("LowestPrice"), hbEncoder.encodeLong(ob.lowestPriceOfDay));
      p.addColumn(cfall, Bytes.toBytes("HighestPrice"), hbEncoder.encodeLong(ob.highestPriceOfDay));
      long price = 0;
      if (ob.lastFixedPrice != null)
        price = ob.lastFixedPrice.price;
      p.addColumn(cfall, Bytes.toBytes("LastFixedPrice"), hbEncoder.encodeLong(price));
      p.addColumn(cfall, Bytes.toBytes("nbPricesFixed"), hbEncoder.encodeLong(ob.numberOfPricesFixed));
      putTable(p);
    }
  }

  @Override
  public void sendAgentReferential(List<AgentReferentialLine> referencial) {
    Table table = null;
    try {
      table = createHTableConnexion(TableName.valueOf(atomConf.getTableName()), hbConf);
      for (AgentReferentialLine agent : referencial) {
        Put p = agent.toPut(hbEncoder, cfall, System.currentTimeMillis());
        table.put(p);
      }
      table.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void putTable(@NotNull Put p) {
    try {
    	table.put(p);
    	globalCount.addAndGet(1);
    } catch (IOException e) {
      LOGGER.severe("Faild to push data into queue : " + e.getMessage());
    }
  }

  @NotNull
  private String createRequired(@NotNull String name) {
    long rowKey = Long.reverseBytes(idGen.incrementAndGet());
    return String.valueOf(rowKey) + name;
  }

  private Configuration createHbaseConfiguration() throws Exception {
    Configuration conf = HBaseConfiguration.create();
//    try {
//        conf.addResource(new File(atomConf.getHadoopConfCore()).getAbsoluteFile().toURI().toURL());
//        conf.addResource(new File(atomConf.getHbaseConfHbase()).getAbsoluteFile().toURI().toURL());
//        conf.addResource(new File(atomConf.getHadoopConfHdfs()).getAbsoluteFile().toURI().toURL());
//    } catch (MalformedURLException e) {
//      LOGGER.log(Level.SEVERE, "Could not get hbase configuration files", e);
//      throw new Exception("hbase", e);
//    }
//    conf.reloadConfiguration();
    return conf;
  }

  @Override
  public void close() {
    try {
      table.close();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      LOGGER.info("Total put sent : " + globalCount.get());
    }
  }
}
