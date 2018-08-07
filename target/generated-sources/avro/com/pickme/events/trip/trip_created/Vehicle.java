/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.pickme.events.trip.trip_created;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Vehicle extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4808396606128335594L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Vehicle\",\"namespace\":\"com.pickme.events.trip.trip_created\",\"fields\":[{\"name\":\"company_id\",\"type\":\"int\"},{\"name\":\"brand_id\",\"type\":\"int\"},{\"name\":\"color_id\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Vehicle> ENCODER =
      new BinaryMessageEncoder<Vehicle>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Vehicle> DECODER =
      new BinaryMessageDecoder<Vehicle>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Vehicle> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Vehicle> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Vehicle>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Vehicle to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Vehicle from a ByteBuffer. */
  public static Vehicle fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int company_id;
  @Deprecated public int brand_id;
  @Deprecated public int color_id;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Vehicle() {}

  /**
   * All-args constructor.
   * @param company_id The new value for company_id
   * @param brand_id The new value for brand_id
   * @param color_id The new value for color_id
   */
  public Vehicle(java.lang.Integer company_id, java.lang.Integer brand_id, java.lang.Integer color_id) {
    this.company_id = company_id;
    this.brand_id = brand_id;
    this.color_id = color_id;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return company_id;
    case 1: return brand_id;
    case 2: return color_id;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: company_id = (java.lang.Integer)value$; break;
    case 1: brand_id = (java.lang.Integer)value$; break;
    case 2: color_id = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'company_id' field.
   * @return The value of the 'company_id' field.
   */
  public java.lang.Integer getCompanyId() {
    return company_id;
  }

  /**
   * Sets the value of the 'company_id' field.
   * @param value the value to set.
   */
  public void setCompanyId(java.lang.Integer value) {
    this.company_id = value;
  }

  /**
   * Gets the value of the 'brand_id' field.
   * @return The value of the 'brand_id' field.
   */
  public java.lang.Integer getBrandId() {
    return brand_id;
  }

  /**
   * Sets the value of the 'brand_id' field.
   * @param value the value to set.
   */
  public void setBrandId(java.lang.Integer value) {
    this.brand_id = value;
  }

  /**
   * Gets the value of the 'color_id' field.
   * @return The value of the 'color_id' field.
   */
  public java.lang.Integer getColorId() {
    return color_id;
  }

  /**
   * Sets the value of the 'color_id' field.
   * @param value the value to set.
   */
  public void setColorId(java.lang.Integer value) {
    this.color_id = value;
  }

  /**
   * Creates a new Vehicle RecordBuilder.
   * @return A new Vehicle RecordBuilder
   */
  public static com.pickme.events.trip.trip_created.Vehicle.Builder newBuilder() {
    return new com.pickme.events.trip.trip_created.Vehicle.Builder();
  }

  /**
   * Creates a new Vehicle RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Vehicle RecordBuilder
   */
  public static com.pickme.events.trip.trip_created.Vehicle.Builder newBuilder(com.pickme.events.trip.trip_created.Vehicle.Builder other) {
    return new com.pickme.events.trip.trip_created.Vehicle.Builder(other);
  }

  /**
   * Creates a new Vehicle RecordBuilder by copying an existing Vehicle instance.
   * @param other The existing instance to copy.
   * @return A new Vehicle RecordBuilder
   */
  public static com.pickme.events.trip.trip_created.Vehicle.Builder newBuilder(com.pickme.events.trip.trip_created.Vehicle other) {
    return new com.pickme.events.trip.trip_created.Vehicle.Builder(other);
  }

  /**
   * RecordBuilder for Vehicle instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Vehicle>
    implements org.apache.avro.data.RecordBuilder<Vehicle> {

    private int company_id;
    private int brand_id;
    private int color_id;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pickme.events.trip.trip_created.Vehicle.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.company_id)) {
        this.company_id = data().deepCopy(fields()[0].schema(), other.company_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.brand_id)) {
        this.brand_id = data().deepCopy(fields()[1].schema(), other.brand_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.color_id)) {
        this.color_id = data().deepCopy(fields()[2].schema(), other.color_id);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Vehicle instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pickme.events.trip.trip_created.Vehicle other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.company_id)) {
        this.company_id = data().deepCopy(fields()[0].schema(), other.company_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.brand_id)) {
        this.brand_id = data().deepCopy(fields()[1].schema(), other.brand_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.color_id)) {
        this.color_id = data().deepCopy(fields()[2].schema(), other.color_id);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'company_id' field.
      * @return The value.
      */
    public java.lang.Integer getCompanyId() {
      return company_id;
    }

    /**
      * Sets the value of the 'company_id' field.
      * @param value The value of 'company_id'.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_created.Vehicle.Builder setCompanyId(int value) {
      validate(fields()[0], value);
      this.company_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'company_id' field has been set.
      * @return True if the 'company_id' field has been set, false otherwise.
      */
    public boolean hasCompanyId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'company_id' field.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_created.Vehicle.Builder clearCompanyId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'brand_id' field.
      * @return The value.
      */
    public java.lang.Integer getBrandId() {
      return brand_id;
    }

    /**
      * Sets the value of the 'brand_id' field.
      * @param value The value of 'brand_id'.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_created.Vehicle.Builder setBrandId(int value) {
      validate(fields()[1], value);
      this.brand_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'brand_id' field has been set.
      * @return True if the 'brand_id' field has been set, false otherwise.
      */
    public boolean hasBrandId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'brand_id' field.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_created.Vehicle.Builder clearBrandId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'color_id' field.
      * @return The value.
      */
    public java.lang.Integer getColorId() {
      return color_id;
    }

    /**
      * Sets the value of the 'color_id' field.
      * @param value The value of 'color_id'.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_created.Vehicle.Builder setColorId(int value) {
      validate(fields()[2], value);
      this.color_id = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'color_id' field has been set.
      * @return True if the 'color_id' field has been set, false otherwise.
      */
    public boolean hasColorId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'color_id' field.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_created.Vehicle.Builder clearColorId() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Vehicle build() {
      try {
        Vehicle record = new Vehicle();
        record.company_id = fieldSetFlags()[0] ? this.company_id : (java.lang.Integer) defaultValue(fields()[0]);
        record.brand_id = fieldSetFlags()[1] ? this.brand_id : (java.lang.Integer) defaultValue(fields()[1]);
        record.color_id = fieldSetFlags()[2] ? this.color_id : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Vehicle>
    WRITER$ = (org.apache.avro.io.DatumWriter<Vehicle>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Vehicle>
    READER$ = (org.apache.avro.io.DatumReader<Vehicle>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
