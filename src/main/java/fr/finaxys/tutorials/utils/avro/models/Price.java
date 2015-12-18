/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package fr.finaxys.tutorials.utils.avro.models;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Price extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Price\",\"namespace\":\"fr.finaxys.tutorials.utils.avro.models\",\"fields\":[{\"name\":\"Trace\",\"type\":\"string\"},{\"name\":\"ObName\",\"type\":\"string\"},{\"name\":\"Price\",\"type\":\"long\"},{\"name\":\"Executed\",\"type\":\"int\"},{\"name\":\"Order1\",\"type\":\"string\"},{\"name\":\"Order2\",\"type\":\"string\"},{\"name\":\"BestAsk\",\"type\":\"long\"},{\"name\":\"BestBid\",\"type\":\"long\"},{\"name\":\"Dir\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence Trace;
  @Deprecated public java.lang.CharSequence ObName;
  @Deprecated public long Price;
  @Deprecated public int Executed;
  @Deprecated public java.lang.CharSequence Order1;
  @Deprecated public java.lang.CharSequence Order2;
  @Deprecated public long BestAsk;
  @Deprecated public long BestBid;
  @Deprecated public java.lang.CharSequence Dir;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Price() {}

  /**
   * All-args constructor.
   */
  public Price(java.lang.CharSequence Trace, java.lang.CharSequence ObName, java.lang.Long Price, java.lang.Integer Executed, java.lang.CharSequence Order1, java.lang.CharSequence Order2, java.lang.Long BestAsk, java.lang.Long BestBid, java.lang.CharSequence Dir) {
    this.Trace = Trace;
    this.ObName = ObName;
    this.Price = Price;
    this.Executed = Executed;
    this.Order1 = Order1;
    this.Order2 = Order2;
    this.BestAsk = BestAsk;
    this.BestBid = BestBid;
    this.Dir = Dir;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Trace;
    case 1: return ObName;
    case 2: return Price;
    case 3: return Executed;
    case 4: return Order1;
    case 5: return Order2;
    case 6: return BestAsk;
    case 7: return BestBid;
    case 8: return Dir;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Trace = (java.lang.CharSequence)value$; break;
    case 1: ObName = (java.lang.CharSequence)value$; break;
    case 2: Price = (java.lang.Long)value$; break;
    case 3: Executed = (java.lang.Integer)value$; break;
    case 4: Order1 = (java.lang.CharSequence)value$; break;
    case 5: Order2 = (java.lang.CharSequence)value$; break;
    case 6: BestAsk = (java.lang.Long)value$; break;
    case 7: BestBid = (java.lang.Long)value$; break;
    case 8: Dir = (java.lang.CharSequence)value$; break;
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
   * Gets the value of the 'Order1' field.
   */
  public java.lang.CharSequence getOrder1() {
    return Order1;
  }

  /**
   * Sets the value of the 'Order1' field.
   * @param value the value to set.
   */
  public void setOrder1(java.lang.CharSequence value) {
    this.Order1 = value;
  }

  /**
   * Gets the value of the 'Order2' field.
   */
  public java.lang.CharSequence getOrder2() {
    return Order2;
  }

  /**
   * Sets the value of the 'Order2' field.
   * @param value the value to set.
   */
  public void setOrder2(java.lang.CharSequence value) {
    this.Order2 = value;
  }

  /**
   * Gets the value of the 'BestAsk' field.
   */
  public java.lang.Long getBestAsk() {
    return BestAsk;
  }

  /**
   * Sets the value of the 'BestAsk' field.
   * @param value the value to set.
   */
  public void setBestAsk(java.lang.Long value) {
    this.BestAsk = value;
  }

  /**
   * Gets the value of the 'BestBid' field.
   */
  public java.lang.Long getBestBid() {
    return BestBid;
  }

  /**
   * Sets the value of the 'BestBid' field.
   * @param value the value to set.
   */
  public void setBestBid(java.lang.Long value) {
    this.BestBid = value;
  }

  /**
   * Gets the value of the 'Dir' field.
   */
  public java.lang.CharSequence getDir() {
    return Dir;
  }

  /**
   * Sets the value of the 'Dir' field.
   * @param value the value to set.
   */
  public void setDir(java.lang.CharSequence value) {
    this.Dir = value;
  }

  /** Creates a new Price RecordBuilder */
  public static fr.finaxys.tutorials.utils.avro.models.Price.Builder newBuilder() {
    return new fr.finaxys.tutorials.utils.avro.models.Price.Builder();
  }
  
  /** Creates a new Price RecordBuilder by copying an existing Builder */
  public static fr.finaxys.tutorials.utils.avro.models.Price.Builder newBuilder(fr.finaxys.tutorials.utils.avro.models.Price.Builder other) {
    return new fr.finaxys.tutorials.utils.avro.models.Price.Builder(other);
  }
  
  /** Creates a new Price RecordBuilder by copying an existing Price instance */
  public static fr.finaxys.tutorials.utils.avro.models.Price.Builder newBuilder(fr.finaxys.tutorials.utils.avro.models.Price other) {
    return new fr.finaxys.tutorials.utils.avro.models.Price.Builder(other);
  }
  
  /**
   * RecordBuilder for Price instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Price>
    implements org.apache.avro.data.RecordBuilder<Price> {

    private java.lang.CharSequence Trace;
    private java.lang.CharSequence ObName;
    private long Price;
    private int Executed;
    private java.lang.CharSequence Order1;
    private java.lang.CharSequence Order2;
    private long BestAsk;
    private long BestBid;
    private java.lang.CharSequence Dir;

    /** Creates a new Builder */
    private Builder() {
      super(fr.finaxys.tutorials.utils.avro.models.Price.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(fr.finaxys.tutorials.utils.avro.models.Price.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Trace)) {
        this.Trace = data().deepCopy(fields()[0].schema(), other.Trace);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ObName)) {
        this.ObName = data().deepCopy(fields()[1].schema(), other.ObName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.Price)) {
        this.Price = data().deepCopy(fields()[2].schema(), other.Price);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Executed)) {
        this.Executed = data().deepCopy(fields()[3].schema(), other.Executed);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.Order1)) {
        this.Order1 = data().deepCopy(fields()[4].schema(), other.Order1);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Order2)) {
        this.Order2 = data().deepCopy(fields()[5].schema(), other.Order2);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.BestAsk)) {
        this.BestAsk = data().deepCopy(fields()[6].schema(), other.BestAsk);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.BestBid)) {
        this.BestBid = data().deepCopy(fields()[7].schema(), other.BestBid);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.Dir)) {
        this.Dir = data().deepCopy(fields()[8].schema(), other.Dir);
        fieldSetFlags()[8] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Price instance */
    private Builder(fr.finaxys.tutorials.utils.avro.models.Price other) {
            super(fr.finaxys.tutorials.utils.avro.models.Price.SCHEMA$);
      if (isValidValue(fields()[0], other.Trace)) {
        this.Trace = data().deepCopy(fields()[0].schema(), other.Trace);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ObName)) {
        this.ObName = data().deepCopy(fields()[1].schema(), other.ObName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.Price)) {
        this.Price = data().deepCopy(fields()[2].schema(), other.Price);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Executed)) {
        this.Executed = data().deepCopy(fields()[3].schema(), other.Executed);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.Order1)) {
        this.Order1 = data().deepCopy(fields()[4].schema(), other.Order1);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Order2)) {
        this.Order2 = data().deepCopy(fields()[5].schema(), other.Order2);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.BestAsk)) {
        this.BestAsk = data().deepCopy(fields()[6].schema(), other.BestAsk);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.BestBid)) {
        this.BestBid = data().deepCopy(fields()[7].schema(), other.BestBid);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.Dir)) {
        this.Dir = data().deepCopy(fields()[8].schema(), other.Dir);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'Trace' field */
    public java.lang.CharSequence getTrace() {
      return Trace;
    }
    
    /** Sets the value of the 'Trace' field */
    public fr.finaxys.tutorials.utils.avro.models.Price.Builder setTrace(java.lang.CharSequence value) {
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
    public fr.finaxys.tutorials.utils.avro.models.Price.Builder clearTrace() {
      Trace = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'ObName' field */
    public java.lang.CharSequence getObName() {
      return ObName;
    }
    
    /** Sets the value of the 'ObName' field */
    public fr.finaxys.tutorials.utils.avro.models.Price.Builder setObName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.ObName = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'ObName' field has been set */
    public boolean hasObName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'ObName' field */
    public fr.finaxys.tutorials.utils.avro.models.Price.Builder clearObName() {
      ObName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'Price' field */
    public java.lang.Long getPrice() {
      return Price;
    }
    
    /** Sets the value of the 'Price' field */
    public fr.finaxys.tutorials.utils.avro.models.Price.Builder setPrice(long value) {
      validate(fields()[2], value);
      this.Price = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'Price' field has been set */
    public boolean hasPrice() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'Price' field */
    public fr.finaxys.tutorials.utils.avro.models.Price.Builder clearPrice() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'Executed' field */
    public java.lang.Integer getExecuted() {
      return Executed;
    }
    
    /** Sets the value of the 'Executed' field */
    public fr.finaxys.tutorials.utils.avro.models.Price.Builder setExecuted(int value) {
      validate(fields()[3], value);
      this.Executed = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'Executed' field has been set */
    public boolean hasExecuted() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'Executed' field */
    public fr.finaxys.tutorials.utils.avro.models.Price.Builder clearExecuted() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'Order1' field */
    public java.lang.CharSequence getOrder1() {
      return Order1;
    }
    
    /** Sets the value of the 'Order1' field */
    public fr.finaxys.tutorials.utils.avro.models.Price.Builder setOrder1(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.Order1 = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'Order1' field has been set */
    public boolean hasOrder1() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'Order1' field */
    public fr.finaxys.tutorials.utils.avro.models.Price.Builder clearOrder1() {
      Order1 = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'Order2' field */
    public java.lang.CharSequence getOrder2() {
      return Order2;
    }
    
    /** Sets the value of the 'Order2' field */
    public fr.finaxys.tutorials.utils.avro.models.Price.Builder setOrder2(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.Order2 = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'Order2' field has been set */
    public boolean hasOrder2() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'Order2' field */
    public fr.finaxys.tutorials.utils.avro.models.Price.Builder clearOrder2() {
      Order2 = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'BestAsk' field */
    public java.lang.Long getBestAsk() {
      return BestAsk;
    }
    
    /** Sets the value of the 'BestAsk' field */
    public fr.finaxys.tutorials.utils.avro.models.Price.Builder setBestAsk(long value) {
      validate(fields()[6], value);
      this.BestAsk = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'BestAsk' field has been set */
    public boolean hasBestAsk() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'BestAsk' field */
    public fr.finaxys.tutorials.utils.avro.models.Price.Builder clearBestAsk() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'BestBid' field */
    public java.lang.Long getBestBid() {
      return BestBid;
    }
    
    /** Sets the value of the 'BestBid' field */
    public fr.finaxys.tutorials.utils.avro.models.Price.Builder setBestBid(long value) {
      validate(fields()[7], value);
      this.BestBid = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'BestBid' field has been set */
    public boolean hasBestBid() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'BestBid' field */
    public fr.finaxys.tutorials.utils.avro.models.Price.Builder clearBestBid() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'Dir' field */
    public java.lang.CharSequence getDir() {
      return Dir;
    }
    
    /** Sets the value of the 'Dir' field */
    public fr.finaxys.tutorials.utils.avro.models.Price.Builder setDir(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.Dir = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'Dir' field has been set */
    public boolean hasDir() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'Dir' field */
    public fr.finaxys.tutorials.utils.avro.models.Price.Builder clearDir() {
      Dir = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public Price build() {
      try {
        Price record = new Price();
        record.Trace = fieldSetFlags()[0] ? this.Trace : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.ObName = fieldSetFlags()[1] ? this.ObName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.Price = fieldSetFlags()[2] ? this.Price : (java.lang.Long) defaultValue(fields()[2]);
        record.Executed = fieldSetFlags()[3] ? this.Executed : (java.lang.Integer) defaultValue(fields()[3]);
        record.Order1 = fieldSetFlags()[4] ? this.Order1 : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.Order2 = fieldSetFlags()[5] ? this.Order2 : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.BestAsk = fieldSetFlags()[6] ? this.BestAsk : (java.lang.Long) defaultValue(fields()[6]);
        record.BestBid = fieldSetFlags()[7] ? this.BestBid : (java.lang.Long) defaultValue(fields()[7]);
        record.Dir = fieldSetFlags()[8] ? this.Dir : (java.lang.CharSequence) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
