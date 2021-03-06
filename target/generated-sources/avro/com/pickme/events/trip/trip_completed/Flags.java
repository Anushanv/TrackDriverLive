/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.pickme.events.trip.trip_completed;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Flags extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8358314988854119589L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Flags\",\"namespace\":\"com.pickme.events.trip.trip_completed\",\"fields\":[{\"name\":\"itc\",\"type\":\"boolean\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Flags> ENCODER =
      new BinaryMessageEncoder<Flags>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Flags> DECODER =
      new BinaryMessageDecoder<Flags>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Flags> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Flags> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Flags>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Flags to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Flags from a ByteBuffer. */
  public static Flags fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public boolean itc;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Flags() {}

  /**
   * All-args constructor.
   * @param itc The new value for itc
   */
  public Flags(java.lang.Boolean itc) {
    this.itc = itc;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return itc;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: itc = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'itc' field.
   * @return The value of the 'itc' field.
   */
  public java.lang.Boolean getItc() {
    return itc;
  }

  /**
   * Sets the value of the 'itc' field.
   * @param value the value to set.
   */
  public void setItc(java.lang.Boolean value) {
    this.itc = value;
  }

  /**
   * Creates a new Flags RecordBuilder.
   * @return A new Flags RecordBuilder
   */
  public static com.pickme.events.trip.trip_completed.Flags.Builder newBuilder() {
    return new com.pickme.events.trip.trip_completed.Flags.Builder();
  }

  /**
   * Creates a new Flags RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Flags RecordBuilder
   */
  public static com.pickme.events.trip.trip_completed.Flags.Builder newBuilder(com.pickme.events.trip.trip_completed.Flags.Builder other) {
    return new com.pickme.events.trip.trip_completed.Flags.Builder(other);
  }

  /**
   * Creates a new Flags RecordBuilder by copying an existing Flags instance.
   * @param other The existing instance to copy.
   * @return A new Flags RecordBuilder
   */
  public static com.pickme.events.trip.trip_completed.Flags.Builder newBuilder(com.pickme.events.trip.trip_completed.Flags other) {
    return new com.pickme.events.trip.trip_completed.Flags.Builder(other);
  }

  /**
   * RecordBuilder for Flags instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Flags>
    implements org.apache.avro.data.RecordBuilder<Flags> {

    private boolean itc;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pickme.events.trip.trip_completed.Flags.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.itc)) {
        this.itc = data().deepCopy(fields()[0].schema(), other.itc);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Flags instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pickme.events.trip.trip_completed.Flags other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.itc)) {
        this.itc = data().deepCopy(fields()[0].schema(), other.itc);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'itc' field.
      * @return The value.
      */
    public java.lang.Boolean getItc() {
      return itc;
    }

    /**
      * Sets the value of the 'itc' field.
      * @param value The value of 'itc'.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_completed.Flags.Builder setItc(boolean value) {
      validate(fields()[0], value);
      this.itc = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'itc' field has been set.
      * @return True if the 'itc' field has been set, false otherwise.
      */
    public boolean hasItc() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'itc' field.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_completed.Flags.Builder clearItc() {
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Flags build() {
      try {
        Flags record = new Flags();
        record.itc = fieldSetFlags()[0] ? this.itc : (java.lang.Boolean) defaultValue(fields()[0]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Flags>
    WRITER$ = (org.apache.avro.io.DatumWriter<Flags>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Flags>
    READER$ = (org.apache.avro.io.DatumReader<Flags>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
