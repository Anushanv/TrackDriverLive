/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.pickme.events.driver;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TraceInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6933686673789700012L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TraceInfo\",\"namespace\":\"com.pickme.events.driver\",\"fields\":[{\"name\":\"trace_id\",\"type\":{\"type\":\"record\",\"name\":\"TraceId\",\"fields\":[{\"name\":\"high\",\"type\":\"long\",\"default\":0},{\"name\":\"low\",\"type\":\"long\",\"default\":0}]}},{\"name\":\"span_id\",\"type\":\"long\",\"default\":0},{\"name\":\"parent_id\",\"type\":\"long\",\"default\":0},{\"name\":\"sampled\",\"type\":\"boolean\",\"default\":false}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TraceInfo> ENCODER =
      new BinaryMessageEncoder<TraceInfo>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TraceInfo> DECODER =
      new BinaryMessageDecoder<TraceInfo>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<TraceInfo> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<TraceInfo> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TraceInfo>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this TraceInfo to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a TraceInfo from a ByteBuffer. */
  public static TraceInfo fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public com.pickme.events.driver.TraceId trace_id;
  @Deprecated public long span_id;
  @Deprecated public long parent_id;
  @Deprecated public boolean sampled;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TraceInfo() {}

  /**
   * All-args constructor.
   * @param trace_id The new value for trace_id
   * @param span_id The new value for span_id
   * @param parent_id The new value for parent_id
   * @param sampled The new value for sampled
   */
  public TraceInfo(com.pickme.events.driver.TraceId trace_id, java.lang.Long span_id, java.lang.Long parent_id, java.lang.Boolean sampled) {
    this.trace_id = trace_id;
    this.span_id = span_id;
    this.parent_id = parent_id;
    this.sampled = sampled;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return trace_id;
    case 1: return span_id;
    case 2: return parent_id;
    case 3: return sampled;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: trace_id = (com.pickme.events.driver.TraceId)value$; break;
    case 1: span_id = (java.lang.Long)value$; break;
    case 2: parent_id = (java.lang.Long)value$; break;
    case 3: sampled = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'trace_id' field.
   * @return The value of the 'trace_id' field.
   */
  public com.pickme.events.driver.TraceId getTraceId() {
    return trace_id;
  }

  /**
   * Sets the value of the 'trace_id' field.
   * @param value the value to set.
   */
  public void setTraceId(com.pickme.events.driver.TraceId value) {
    this.trace_id = value;
  }

  /**
   * Gets the value of the 'span_id' field.
   * @return The value of the 'span_id' field.
   */
  public java.lang.Long getSpanId() {
    return span_id;
  }

  /**
   * Sets the value of the 'span_id' field.
   * @param value the value to set.
   */
  public void setSpanId(java.lang.Long value) {
    this.span_id = value;
  }

  /**
   * Gets the value of the 'parent_id' field.
   * @return The value of the 'parent_id' field.
   */
  public java.lang.Long getParentId() {
    return parent_id;
  }

  /**
   * Sets the value of the 'parent_id' field.
   * @param value the value to set.
   */
  public void setParentId(java.lang.Long value) {
    this.parent_id = value;
  }

  /**
   * Gets the value of the 'sampled' field.
   * @return The value of the 'sampled' field.
   */
  public java.lang.Boolean getSampled() {
    return sampled;
  }

  /**
   * Sets the value of the 'sampled' field.
   * @param value the value to set.
   */
  public void setSampled(java.lang.Boolean value) {
    this.sampled = value;
  }

  /**
   * Creates a new TraceInfo RecordBuilder.
   * @return A new TraceInfo RecordBuilder
   */
  public static com.pickme.events.driver.TraceInfo.Builder newBuilder() {
    return new com.pickme.events.driver.TraceInfo.Builder();
  }

  /**
   * Creates a new TraceInfo RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TraceInfo RecordBuilder
   */
  public static com.pickme.events.driver.TraceInfo.Builder newBuilder(com.pickme.events.driver.TraceInfo.Builder other) {
    return new com.pickme.events.driver.TraceInfo.Builder(other);
  }

  /**
   * Creates a new TraceInfo RecordBuilder by copying an existing TraceInfo instance.
   * @param other The existing instance to copy.
   * @return A new TraceInfo RecordBuilder
   */
  public static com.pickme.events.driver.TraceInfo.Builder newBuilder(com.pickme.events.driver.TraceInfo other) {
    return new com.pickme.events.driver.TraceInfo.Builder(other);
  }

  /**
   * RecordBuilder for TraceInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TraceInfo>
    implements org.apache.avro.data.RecordBuilder<TraceInfo> {

    private com.pickme.events.driver.TraceId trace_id;
    private com.pickme.events.driver.TraceId.Builder trace_idBuilder;
    private long span_id;
    private long parent_id;
    private boolean sampled;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pickme.events.driver.TraceInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.trace_id)) {
        this.trace_id = data().deepCopy(fields()[0].schema(), other.trace_id);
        fieldSetFlags()[0] = true;
      }
      if (other.hasTraceIdBuilder()) {
        this.trace_idBuilder = com.pickme.events.driver.TraceId.newBuilder(other.getTraceIdBuilder());
      }
      if (isValidValue(fields()[1], other.span_id)) {
        this.span_id = data().deepCopy(fields()[1].schema(), other.span_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.parent_id)) {
        this.parent_id = data().deepCopy(fields()[2].schema(), other.parent_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.sampled)) {
        this.sampled = data().deepCopy(fields()[3].schema(), other.sampled);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing TraceInfo instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pickme.events.driver.TraceInfo other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.trace_id)) {
        this.trace_id = data().deepCopy(fields()[0].schema(), other.trace_id);
        fieldSetFlags()[0] = true;
      }
      this.trace_idBuilder = null;
      if (isValidValue(fields()[1], other.span_id)) {
        this.span_id = data().deepCopy(fields()[1].schema(), other.span_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.parent_id)) {
        this.parent_id = data().deepCopy(fields()[2].schema(), other.parent_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.sampled)) {
        this.sampled = data().deepCopy(fields()[3].schema(), other.sampled);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'trace_id' field.
      * @return The value.
      */
    public com.pickme.events.driver.TraceId getTraceId() {
      return trace_id;
    }

    /**
      * Sets the value of the 'trace_id' field.
      * @param value The value of 'trace_id'.
      * @return This builder.
      */
    public com.pickme.events.driver.TraceInfo.Builder setTraceId(com.pickme.events.driver.TraceId value) {
      validate(fields()[0], value);
      this.trace_idBuilder = null;
      this.trace_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'trace_id' field has been set.
      * @return True if the 'trace_id' field has been set, false otherwise.
      */
    public boolean hasTraceId() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'trace_id' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.pickme.events.driver.TraceId.Builder getTraceIdBuilder() {
      if (trace_idBuilder == null) {
        if (hasTraceId()) {
          setTraceIdBuilder(com.pickme.events.driver.TraceId.newBuilder(trace_id));
        } else {
          setTraceIdBuilder(com.pickme.events.driver.TraceId.newBuilder());
        }
      }
      return trace_idBuilder;
    }

    /**
     * Sets the Builder instance for the 'trace_id' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.pickme.events.driver.TraceInfo.Builder setTraceIdBuilder(com.pickme.events.driver.TraceId.Builder value) {
      clearTraceId();
      trace_idBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'trace_id' field has an active Builder instance
     * @return True if the 'trace_id' field has an active Builder instance
     */
    public boolean hasTraceIdBuilder() {
      return trace_idBuilder != null;
    }

    /**
      * Clears the value of the 'trace_id' field.
      * @return This builder.
      */
    public com.pickme.events.driver.TraceInfo.Builder clearTraceId() {
      trace_id = null;
      trace_idBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'span_id' field.
      * @return The value.
      */
    public java.lang.Long getSpanId() {
      return span_id;
    }

    /**
      * Sets the value of the 'span_id' field.
      * @param value The value of 'span_id'.
      * @return This builder.
      */
    public com.pickme.events.driver.TraceInfo.Builder setSpanId(long value) {
      validate(fields()[1], value);
      this.span_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'span_id' field has been set.
      * @return True if the 'span_id' field has been set, false otherwise.
      */
    public boolean hasSpanId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'span_id' field.
      * @return This builder.
      */
    public com.pickme.events.driver.TraceInfo.Builder clearSpanId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'parent_id' field.
      * @return The value.
      */
    public java.lang.Long getParentId() {
      return parent_id;
    }

    /**
      * Sets the value of the 'parent_id' field.
      * @param value The value of 'parent_id'.
      * @return This builder.
      */
    public com.pickme.events.driver.TraceInfo.Builder setParentId(long value) {
      validate(fields()[2], value);
      this.parent_id = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'parent_id' field has been set.
      * @return True if the 'parent_id' field has been set, false otherwise.
      */
    public boolean hasParentId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'parent_id' field.
      * @return This builder.
      */
    public com.pickme.events.driver.TraceInfo.Builder clearParentId() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'sampled' field.
      * @return The value.
      */
    public java.lang.Boolean getSampled() {
      return sampled;
    }

    /**
      * Sets the value of the 'sampled' field.
      * @param value The value of 'sampled'.
      * @return This builder.
      */
    public com.pickme.events.driver.TraceInfo.Builder setSampled(boolean value) {
      validate(fields()[3], value);
      this.sampled = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'sampled' field has been set.
      * @return True if the 'sampled' field has been set, false otherwise.
      */
    public boolean hasSampled() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'sampled' field.
      * @return This builder.
      */
    public com.pickme.events.driver.TraceInfo.Builder clearSampled() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TraceInfo build() {
      try {
        TraceInfo record = new TraceInfo();
        if (trace_idBuilder != null) {
          record.trace_id = this.trace_idBuilder.build();
        } else {
          record.trace_id = fieldSetFlags()[0] ? this.trace_id : (com.pickme.events.driver.TraceId) defaultValue(fields()[0]);
        }
        record.span_id = fieldSetFlags()[1] ? this.span_id : (java.lang.Long) defaultValue(fields()[1]);
        record.parent_id = fieldSetFlags()[2] ? this.parent_id : (java.lang.Long) defaultValue(fields()[2]);
        record.sampled = fieldSetFlags()[3] ? this.sampled : (java.lang.Boolean) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TraceInfo>
    WRITER$ = (org.apache.avro.io.DatumWriter<TraceInfo>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TraceInfo>
    READER$ = (org.apache.avro.io.DatumReader<TraceInfo>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
