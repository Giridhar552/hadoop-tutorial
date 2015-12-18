/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package fr.finaxys.tutorials.utils.avro.models;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Agent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Agent\",\"namespace\":\"fr.finaxys.tutorials.utils.avro.models\",\"fields\":[{\"name\":\"Trace\",\"type\":\"string\"},{\"name\":\"AgentName\",\"type\":\"string\"},{\"name\":\"ObName\",\"type\":\"string\"},{\"name\":\"Cash\",\"type\":\"long\"},{\"name\":\"Executed\",\"type\":\"int\"},{\"name\":\"Price\",\"type\":\"long\"},{\"name\":\"Direction\",\"type\":\"string\"},{\"name\":\"OrderExtId\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence Trace;
  @Deprecated public java.lang.CharSequence AgentName;
  @Deprecated public java.lang.CharSequence ObName;
  @Deprecated public long Cash;
  @Deprecated public int Executed;
  @Deprecated public long Price;
  @Deprecated public java.lang.CharSequence Direction;
  @Deprecated public java.lang.CharSequence OrderExtId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Agent() {}

  /**
   * All-args constructor.
   */
  public Agent(java.lang.CharSequence Trace, java.lang.CharSequence AgentName, java.lang.CharSequence ObName, java.lang.Long Cash, java.lang.Integer Executed, java.lang.Long Price, java.lang.CharSequence Direction, java.lang.CharSequence OrderExtId) {
    this.Trace = Trace;
    this.AgentName = AgentName;
    this.ObName = ObName;
    this.Cash = Cash;
    this.Executed = Executed;
    this.Price = Price;
    this.Direction = Direction;
    this.OrderExtId = OrderExtId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Trace;
    case 1: return AgentName;
    case 2: return ObName;
    case 3: return Cash;
    case 4: return Executed;
    case 5: return Price;
    case 6: return Direction;
    case 7: return OrderExtId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Trace = (java.lang.CharSequence)value$; break;
    case 1: AgentName = (java.lang.CharSequence)value$; break;
    case 2: ObName = (java.lang.CharSequence)value$; break;
    case 3: Cash = (java.lang.Long)value$; break;
    case 4: Executed = (java.lang.Integer)value$; break;
    case 5: Price = (java.lang.Long)value$; break;
    case 6: Direction = (java.lang.CharSequence)value$; break;
    case 7: OrderExtId = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'Trace' field.
   */
  public java.lang.CharSequence getTrace() {
    return Trace;
  }

  /**
   * Sets the value of the 'Trace' field.
   * @param value the value to set.
   */
  public void setTrace(java.lang.CharSequence value) {
    this.Trace = value;
  }

  /**
   * Gets the value of the 'AgentName' field.
   */
  public java.lang.CharSequence getAgentName() {
    return AgentName;
  }

  /**
   * Sets the value of the 'AgentName' field.
   * @param value the value to set.
   */
  public void setAgentName(java.lang.CharSequence value) {
    this.AgentName = value;
  }

  /**
   * Gets the value of the 'ObName' field.
   */
  public java.lang.CharSequence getObName() {
    return ObName;
  }

  /**
   * Sets the value of the 'ObName' field.
   * @param value the value to set.
   */
  public void setObName(java.lang.CharSequence value) {
    this.ObName = value;
  }

  /**
   * Gets the value of the 'Cash' field.
   */
  public java.lang.Long getCash() {
    return Cash;
  }

  /**
   * Sets the value of the 'Cash' field.
   * @param value the value to set.
   */
  public void setCash(java.lang.Long value) {
    this.Cash = value;
  }

  /**
   * Gets the value of the 'Executed' field.
   */
  public java.lang.Integer getExecuted() {
    return Executed;
  }

  /**
   * Sets the value of the 'Executed' field.
   * @param value the value to set.
   */
  public void setExecuted(java.lang.Integer value) {
    this.Executed = value;
  }

  /**
   * Gets the value of the 'Price' field.
   */
  public java.lang.Long getPrice() {
    return Price;
  }

  /**
   * Sets the value of the 'Price' field.
   * @param value the value to set.
   */
  public void setPrice(java.lang.Long value) {
    this.Price = value;
  }

  /**
   * Gets the value of the 'Direction' field.
   */
  public java.lang.CharSequence getDirection() {
    return Direction;
  }

  /**
   * Sets the value of the 'Direction' field.
   * @param value the value to set.
   */
  public void setDirection(java.lang.CharSequence value) {
    this.Direction = value;
  }

  /**
   * Gets the value of the 'OrderExtId' field.
   */
  public java.lang.CharSequence getOrderExtId() {
    return OrderExtId;
  }

  /**
   * Sets the value of the 'OrderExtId' field.
   * @param value the value to set.
   */
  public void setOrderExtId(java.lang.CharSequence value) {
    this.OrderExtId = value;
  }

  /** Creates a new Agent RecordBuilder */
  public static fr.finaxys.tutorials.utils.avro.models.Agent.Builder newBuilder() {
    return new fr.finaxys.tutorials.utils.avro.models.Agent.Builder();
  }
  
  /** Creates a new Agent RecordBuilder by copying an existing Builder */
  public static fr.finaxys.tutorials.utils.avro.models.Agent.Builder newBuilder(fr.finaxys.tutorials.utils.avro.models.Agent.Builder other) {
    return new fr.finaxys.tutorials.utils.avro.models.Agent.Builder(other);
  }
  
  /** Creates a new Agent RecordBuilder by copying an existing Agent instance */
  public static fr.finaxys.tutorials.utils.avro.models.Agent.Builder newBuilder(fr.finaxys.tutorials.utils.avro.models.Agent other) {
    return new fr.finaxys.tutorials.utils.avro.models.Agent.Builder(other);
  }
  
  /**
   * RecordBuilder for Agent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Agent>
    implements org.apache.avro.data.RecordBuilder<Agent> {

    private java.lang.CharSequence Trace;
    private java.lang.CharSequence AgentName;
    private java.lang.CharSequence ObName;
    private long Cash;
    private int Executed;
    private long Price;
    private java.lang.CharSequence Direction;
    private java.lang.CharSequence OrderExtId;

    /** Creates a new Builder */
    private Builder() {
      super(fr.finaxys.tutorials.utils.avro.models.Agent.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(fr.finaxys.tutorials.utils.avro.models.Agent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Trace)) {
        this.Trace = data().deepCopy(fields()[0].schema(), other.Trace);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.AgentName)) {
        this.AgentName = data().deepCopy(fields()[1].schema(), other.AgentName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ObName)) {
        this.ObName = data().deepCopy(fields()[2].schema(), other.ObName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Cash)) {
        this.Cash = data().deepCopy(fields()[3].schema(), other.Cash);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.Executed)) {
        this.Executed = data().deepCopy(fields()[4].schema(), other.Executed);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Price)) {
        this.Price = data().deepCopy(fields()[5].schema(), other.Price);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.Direction)) {
        this.Direction = data().deepCopy(fields()[6].schema(), other.Direction);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.OrderExtId)) {
        this.OrderExtId = data().deepCopy(fields()[7].schema(), other.OrderExtId);
        fieldSetFlags()[7] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Agent instance */
    private Builder(fr.finaxys.tutorials.utils.avro.models.Agent other) {
            super(fr.finaxys.tutorials.utils.avro.models.Agent.SCHEMA$);
      if (isValidValue(fields()[0], other.Trace)) {
        this.Trace = data().deepCopy(fields()[0].schema(), other.Trace);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.AgentName)) {
        this.AgentName = data().deepCopy(fields()[1].schema(), other.AgentName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ObName)) {
        this.ObName = data().deepCopy(fields()[2].schema(), other.ObName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Cash)) {
        this.Cash = data().deepCopy(fields()[3].schema(), other.Cash);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.Executed)) {
        this.Executed = data().deepCopy(fields()[4].schema(), other.Executed);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Price)) {
        this.Price = data().deepCopy(fields()[5].schema(), other.Price);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.Direction)) {
        this.Direction = data().deepCopy(fields()[6].schema(), other.Direction);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.OrderExtId)) {
        this.OrderExtId = data().deepCopy(fields()[7].schema(), other.OrderExtId);
        fieldSetFlags()[7] = true;
      }
    }

    /** Gets the value of the 'Trace' field */
    public java.lang.CharSequence getTrace() {
      return Trace;
    }
    
    /** Sets the value of the 'Trace' field */
    public fr.finaxys.tutorials.utils.avro.models.Agent.Builder setTrace(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.Trace = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'Trace' field has been set */
    public boolean hasTrace() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'Trace' field */
    public fr.finaxys.tutorials.utils.avro.models.Agent.Builder clearTrace() {
      Trace = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'AgentName' field */
    public java.lang.CharSequence getAgentName() {
      return AgentName;
    }
    
    /** Sets the value of the 'AgentName' field */
    public fr.finaxys.tutorials.utils.avro.models.Agent.Builder setAgentName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.AgentName = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'AgentName' field has been set */
    public boolean hasAgentName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'AgentName' field */
    public fr.finaxys.tutorials.utils.avro.models.Agent.Builder clearAgentName() {
      AgentName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'ObName' field */
    public java.lang.CharSequence getObName() {
      return ObName;
    }
    
    /** Sets the value of the 'ObName' field */
    public fr.finaxys.tutorials.utils.avro.models.Agent.Builder setObName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.ObName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'ObName' field has been set */
    public boolean hasObName() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'ObName' field */
    public fr.finaxys.tutorials.utils.avro.models.Agent.Builder clearObName() {
      ObName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'Cash' field */
    public java.lang.Long getCash() {
      return Cash;
    }
    
    /** Sets the value of the 'Cash' field */
    public fr.finaxys.tutorials.utils.avro.models.Agent.Builder setCash(long value) {
      validate(fields()[3], value);
      this.Cash = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'Cash' field has been set */
    public boolean hasCash() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'Cash' field */
    public fr.finaxys.tutorials.utils.avro.models.Agent.Builder clearCash() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'Executed' field */
    public java.lang.Integer getExecuted() {
      return Executed;
    }
    
    /** Sets the value of the 'Executed' field */
    public fr.finaxys.tutorials.utils.avro.models.Agent.Builder setExecuted(int value) {
      validate(fields()[4], value);
      this.Executed = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'Executed' field has been set */
    public boolean hasExecuted() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'Executed' field */
    public fr.finaxys.tutorials.utils.avro.models.Agent.Builder clearExecuted() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'Price' field */
    public java.lang.Long getPrice() {
      return Price;
    }
    
    /** Sets the value of the 'Price' field */
    public fr.finaxys.tutorials.utils.avro.models.Agent.Builder setPrice(long value) {
      validate(fields()[5], value);
      this.Price = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'Price' field has been set */
    public boolean hasPrice() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'Price' field */
    public fr.finaxys.tutorials.utils.avro.models.Agent.Builder clearPrice() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'Direction' field */
    public java.lang.CharSequence getDirection() {
      return Direction;
    }
    
    /** Sets the value of the 'Direction' field */
    public fr.finaxys.tutorials.utils.avro.models.Agent.Builder setDirection(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.Direction = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'Direction' field has been set */
    public boolean hasDirection() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'Direction' field */
    public fr.finaxys.tutorials.utils.avro.models.Agent.Builder clearDirection() {
      Direction = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'OrderExtId' field */
    public java.lang.CharSequence getOrderExtId() {
      return OrderExtId;
    }
    
    /** Sets the value of the 'OrderExtId' field */
    public fr.finaxys.tutorials.utils.avro.models.Agent.Builder setOrderExtId(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.OrderExtId = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'OrderExtId' field has been set */
    public boolean hasOrderExtId() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'OrderExtId' field */
    public fr.finaxys.tutorials.utils.avro.models.Agent.Builder clearOrderExtId() {
      OrderExtId = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public Agent build() {
      try {
        Agent record = new Agent();
        record.Trace = fieldSetFlags()[0] ? this.Trace : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.AgentName = fieldSetFlags()[1] ? this.AgentName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.ObName = fieldSetFlags()[2] ? this.ObName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.Cash = fieldSetFlags()[3] ? this.Cash : (java.lang.Long) defaultValue(fields()[3]);
        record.Executed = fieldSetFlags()[4] ? this.Executed : (java.lang.Integer) defaultValue(fields()[4]);
        record.Price = fieldSetFlags()[5] ? this.Price : (java.lang.Long) defaultValue(fields()[5]);
        record.Direction = fieldSetFlags()[6] ? this.Direction : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.OrderExtId = fieldSetFlags()[7] ? this.OrderExtId : (java.lang.CharSequence) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
