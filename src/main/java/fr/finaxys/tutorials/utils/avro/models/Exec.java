/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package fr.finaxys.tutorials.utils.avro.models;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Exec extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Exec\",\"namespace\":\"fr.finaxys.tutorials.utils.avro.models\",\"fields\":[{\"name\":\"Trace\",\"type\":\"string\"},{\"name\":\"Sender\",\"type\":\"string\"},{\"name\":\"ExtId\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence Trace;
  @Deprecated public java.lang.CharSequence Sender;
  @Deprecated public java.lang.CharSequence ExtId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Exec() {}

  /**
   * All-args constructor.
   */
  public Exec(java.lang.CharSequence Trace, java.lang.CharSequence Sender, java.lang.CharSequence ExtId) {
    this.Trace = Trace;
    this.Sender = Sender;
    this.ExtId = ExtId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Trace;
    case 1: return Sender;
    case 2: return ExtId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Trace = (java.lang.CharSequence)value$; break;
    case 1: Sender = (java.lang.CharSequence)value$; break;
    case 2: ExtId = (java.lang.CharSequence)value$; break;
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
   * Gets the value of the 'Sender' field.
   */
  public java.lang.CharSequence getSender() {
    return Sender;
  }

  /**
   * Sets the value of the 'Sender' field.
   * @param value the value to set.
   */
  public void setSender(java.lang.CharSequence value) {
    this.Sender = value;
  }

  /**
   * Gets the value of the 'ExtId' field.
   */
  public java.lang.CharSequence getExtId() {
    return ExtId;
  }

  /**
   * Sets the value of the 'ExtId' field.
   * @param value the value to set.
   */
  public void setExtId(java.lang.CharSequence value) {
    this.ExtId = value;
  }

  /** Creates a new Exec RecordBuilder */
  public static fr.finaxys.tutorials.utils.avro.models.Exec.Builder newBuilder() {
    return new fr.finaxys.tutorials.utils.avro.models.Exec.Builder();
  }
  
  /** Creates a new Exec RecordBuilder by copying an existing Builder */
  public static fr.finaxys.tutorials.utils.avro.models.Exec.Builder newBuilder(fr.finaxys.tutorials.utils.avro.models.Exec.Builder other) {
    return new fr.finaxys.tutorials.utils.avro.models.Exec.Builder(other);
  }
  
  /** Creates a new Exec RecordBuilder by copying an existing Exec instance */
  public static fr.finaxys.tutorials.utils.avro.models.Exec.Builder newBuilder(fr.finaxys.tutorials.utils.avro.models.Exec other) {
    return new fr.finaxys.tutorials.utils.avro.models.Exec.Builder(other);
  }
  
  /**
   * RecordBuilder for Exec instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Exec>
    implements org.apache.avro.data.RecordBuilder<Exec> {

    private java.lang.CharSequence Trace;
    private java.lang.CharSequence Sender;
    private java.lang.CharSequence ExtId;

    /** Creates a new Builder */
    private Builder() {
      super(fr.finaxys.tutorials.utils.avro.models.Exec.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(fr.finaxys.tutorials.utils.avro.models.Exec.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Trace)) {
        this.Trace = data().deepCopy(fields()[0].schema(), other.Trace);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Sender)) {
        this.Sender = data().deepCopy(fields()[1].schema(), other.Sender);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ExtId)) {
        this.ExtId = data().deepCopy(fields()[2].schema(), other.ExtId);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Exec instance */
    private Builder(fr.finaxys.tutorials.utils.avro.models.Exec other) {
            super(fr.finaxys.tutorials.utils.avro.models.Exec.SCHEMA$);
      if (isValidValue(fields()[0], other.Trace)) {
        this.Trace = data().deepCopy(fields()[0].schema(), other.Trace);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Sender)) {
        this.Sender = data().deepCopy(fields()[1].schema(), other.Sender);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ExtId)) {
        this.ExtId = data().deepCopy(fields()[2].schema(), other.ExtId);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'Trace' field */
    public java.lang.CharSequence getTrace() {
      return Trace;
    }
    
    /** Sets the value of the 'Trace' field */
    public fr.finaxys.tutorials.utils.avro.models.Exec.Builder setTrace(java.lang.CharSequence value) {
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
    public fr.finaxys.tutorials.utils.avro.models.Exec.Builder clearTrace() {
      Trace = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'Sender' field */
    public java.lang.CharSequence getSender() {
      return Sender;
    }
    
    /** Sets the value of the 'Sender' field */
    public fr.finaxys.tutorials.utils.avro.models.Exec.Builder setSender(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.Sender = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'Sender' field has been set */
    public boolean hasSender() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'Sender' field */
    public fr.finaxys.tutorials.utils.avro.models.Exec.Builder clearSender() {
      Sender = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'ExtId' field */
    public java.lang.CharSequence getExtId() {
      return ExtId;
    }
    
    /** Sets the value of the 'ExtId' field */
    public fr.finaxys.tutorials.utils.avro.models.Exec.Builder setExtId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.ExtId = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'ExtId' field has been set */
    public boolean hasExtId() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'ExtId' field */
    public fr.finaxys.tutorials.utils.avro.models.Exec.Builder clearExtId() {
      ExtId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Exec build() {
      try {
        Exec record = new Exec();
        record.Trace = fieldSetFlags()[0] ? this.Trace : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.Sender = fieldSetFlags()[1] ? this.Sender : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.ExtId = fieldSetFlags()[2] ? this.ExtId : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
