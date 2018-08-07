/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.pickme.events.trip.trip_ended;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class FareDetails extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5425632283271056400L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FareDetails\",\"namespace\":\"com.pickme.events.trip.trip_ended\",\"fields\":[{\"name\":\"distance_fare\",\"type\":\"float\"},{\"name\":\"waiting_fare\",\"type\":\"float\"},{\"name\":\"night_fare\",\"type\":\"float\"},{\"name\":\"day_night_switching_cost\",\"type\":\"float\"},{\"name\":\"meter_total_fare\",\"type\":\"float\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<FareDetails> ENCODER =
      new BinaryMessageEncoder<FareDetails>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<FareDetails> DECODER =
      new BinaryMessageDecoder<FareDetails>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<FareDetails> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<FareDetails> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<FareDetails>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this FareDetails to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a FareDetails from a ByteBuffer. */
  public static FareDetails fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public float distance_fare;
  @Deprecated public float waiting_fare;
  @Deprecated public float night_fare;
  @Deprecated public float day_night_switching_cost;
  @Deprecated public float meter_total_fare;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FareDetails() {}

  /**
   * All-args constructor.
   * @param distance_fare The new value for distance_fare
   * @param waiting_fare The new value for waiting_fare
   * @param night_fare The new value for night_fare
   * @param day_night_switching_cost The new value for day_night_switching_cost
   * @param meter_total_fare The new value for meter_total_fare
   */
  public FareDetails(java.lang.Float distance_fare, java.lang.Float waiting_fare, java.lang.Float night_fare, java.lang.Float day_night_switching_cost, java.lang.Float meter_total_fare) {
    this.distance_fare = distance_fare;
    this.waiting_fare = waiting_fare;
    this.night_fare = night_fare;
    this.day_night_switching_cost = day_night_switching_cost;
    this.meter_total_fare = meter_total_fare;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return distance_fare;
    case 1: return waiting_fare;
    case 2: return night_fare;
    case 3: return day_night_switching_cost;
    case 4: return meter_total_fare;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: distance_fare = (java.lang.Float)value$; break;
    case 1: waiting_fare = (java.lang.Float)value$; break;
    case 2: night_fare = (java.lang.Float)value$; break;
    case 3: day_night_switching_cost = (java.lang.Float)value$; break;
    case 4: meter_total_fare = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'distance_fare' field.
   * @return The value of the 'distance_fare' field.
   */
  public java.lang.Float getDistanceFare() {
    return distance_fare;
  }

  /**
   * Sets the value of the 'distance_fare' field.
   * @param value the value to set.
   */
  public void setDistanceFare(java.lang.Float value) {
    this.distance_fare = value;
  }

  /**
   * Gets the value of the 'waiting_fare' field.
   * @return The value of the 'waiting_fare' field.
   */
  public java.lang.Float getWaitingFare() {
    return waiting_fare;
  }

  /**
   * Sets the value of the 'waiting_fare' field.
   * @param value the value to set.
   */
  public void setWaitingFare(java.lang.Float value) {
    this.waiting_fare = value;
  }

  /**
   * Gets the value of the 'night_fare' field.
   * @return The value of the 'night_fare' field.
   */
  public java.lang.Float getNightFare() {
    return night_fare;
  }

  /**
   * Sets the value of the 'night_fare' field.
   * @param value the value to set.
   */
  public void setNightFare(java.lang.Float value) {
    this.night_fare = value;
  }

  /**
   * Gets the value of the 'day_night_switching_cost' field.
   * @return The value of the 'day_night_switching_cost' field.
   */
  public java.lang.Float getDayNightSwitchingCost() {
    return day_night_switching_cost;
  }

  /**
   * Sets the value of the 'day_night_switching_cost' field.
   * @param value the value to set.
   */
  public void setDayNightSwitchingCost(java.lang.Float value) {
    this.day_night_switching_cost = value;
  }

  /**
   * Gets the value of the 'meter_total_fare' field.
   * @return The value of the 'meter_total_fare' field.
   */
  public java.lang.Float getMeterTotalFare() {
    return meter_total_fare;
  }

  /**
   * Sets the value of the 'meter_total_fare' field.
   * @param value the value to set.
   */
  public void setMeterTotalFare(java.lang.Float value) {
    this.meter_total_fare = value;
  }

  /**
   * Creates a new FareDetails RecordBuilder.
   * @return A new FareDetails RecordBuilder
   */
  public static com.pickme.events.trip.trip_ended.FareDetails.Builder newBuilder() {
    return new com.pickme.events.trip.trip_ended.FareDetails.Builder();
  }

  /**
   * Creates a new FareDetails RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new FareDetails RecordBuilder
   */
  public static com.pickme.events.trip.trip_ended.FareDetails.Builder newBuilder(com.pickme.events.trip.trip_ended.FareDetails.Builder other) {
    return new com.pickme.events.trip.trip_ended.FareDetails.Builder(other);
  }

  /**
   * Creates a new FareDetails RecordBuilder by copying an existing FareDetails instance.
   * @param other The existing instance to copy.
   * @return A new FareDetails RecordBuilder
   */
  public static com.pickme.events.trip.trip_ended.FareDetails.Builder newBuilder(com.pickme.events.trip.trip_ended.FareDetails other) {
    return new com.pickme.events.trip.trip_ended.FareDetails.Builder(other);
  }

  /**
   * RecordBuilder for FareDetails instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FareDetails>
    implements org.apache.avro.data.RecordBuilder<FareDetails> {

    private float distance_fare;
    private float waiting_fare;
    private float night_fare;
    private float day_night_switching_cost;
    private float meter_total_fare;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pickme.events.trip.trip_ended.FareDetails.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.distance_fare)) {
        this.distance_fare = data().deepCopy(fields()[0].schema(), other.distance_fare);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.waiting_fare)) {
        this.waiting_fare = data().deepCopy(fields()[1].schema(), other.waiting_fare);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.night_fare)) {
        this.night_fare = data().deepCopy(fields()[2].schema(), other.night_fare);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.day_night_switching_cost)) {
        this.day_night_switching_cost = data().deepCopy(fields()[3].schema(), other.day_night_switching_cost);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.meter_total_fare)) {
        this.meter_total_fare = data().deepCopy(fields()[4].schema(), other.meter_total_fare);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing FareDetails instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pickme.events.trip.trip_ended.FareDetails other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.distance_fare)) {
        this.distance_fare = data().deepCopy(fields()[0].schema(), other.distance_fare);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.waiting_fare)) {
        this.waiting_fare = data().deepCopy(fields()[1].schema(), other.waiting_fare);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.night_fare)) {
        this.night_fare = data().deepCopy(fields()[2].schema(), other.night_fare);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.day_night_switching_cost)) {
        this.day_night_switching_cost = data().deepCopy(fields()[3].schema(), other.day_night_switching_cost);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.meter_total_fare)) {
        this.meter_total_fare = data().deepCopy(fields()[4].schema(), other.meter_total_fare);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'distance_fare' field.
      * @return The value.
      */
    public java.lang.Float getDistanceFare() {
      return distance_fare;
    }

    /**
      * Sets the value of the 'distance_fare' field.
      * @param value The value of 'distance_fare'.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_ended.FareDetails.Builder setDistanceFare(float value) {
      validate(fields()[0], value);
      this.distance_fare = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'distance_fare' field has been set.
      * @return True if the 'distance_fare' field has been set, false otherwise.
      */
    public boolean hasDistanceFare() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'distance_fare' field.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_ended.FareDetails.Builder clearDistanceFare() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'waiting_fare' field.
      * @return The value.
      */
    public java.lang.Float getWaitingFare() {
      return waiting_fare;
    }

    /**
      * Sets the value of the 'waiting_fare' field.
      * @param value The value of 'waiting_fare'.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_ended.FareDetails.Builder setWaitingFare(float value) {
      validate(fields()[1], value);
      this.waiting_fare = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'waiting_fare' field has been set.
      * @return True if the 'waiting_fare' field has been set, false otherwise.
      */
    public boolean hasWaitingFare() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'waiting_fare' field.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_ended.FareDetails.Builder clearWaitingFare() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'night_fare' field.
      * @return The value.
      */
    public java.lang.Float getNightFare() {
      return night_fare;
    }

    /**
      * Sets the value of the 'night_fare' field.
      * @param value The value of 'night_fare'.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_ended.FareDetails.Builder setNightFare(float value) {
      validate(fields()[2], value);
      this.night_fare = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'night_fare' field has been set.
      * @return True if the 'night_fare' field has been set, false otherwise.
      */
    public boolean hasNightFare() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'night_fare' field.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_ended.FareDetails.Builder clearNightFare() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'day_night_switching_cost' field.
      * @return The value.
      */
    public java.lang.Float getDayNightSwitchingCost() {
      return day_night_switching_cost;
    }

    /**
      * Sets the value of the 'day_night_switching_cost' field.
      * @param value The value of 'day_night_switching_cost'.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_ended.FareDetails.Builder setDayNightSwitchingCost(float value) {
      validate(fields()[3], value);
      this.day_night_switching_cost = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'day_night_switching_cost' field has been set.
      * @return True if the 'day_night_switching_cost' field has been set, false otherwise.
      */
    public boolean hasDayNightSwitchingCost() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'day_night_switching_cost' field.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_ended.FareDetails.Builder clearDayNightSwitchingCost() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'meter_total_fare' field.
      * @return The value.
      */
    public java.lang.Float getMeterTotalFare() {
      return meter_total_fare;
    }

    /**
      * Sets the value of the 'meter_total_fare' field.
      * @param value The value of 'meter_total_fare'.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_ended.FareDetails.Builder setMeterTotalFare(float value) {
      validate(fields()[4], value);
      this.meter_total_fare = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'meter_total_fare' field has been set.
      * @return True if the 'meter_total_fare' field has been set, false otherwise.
      */
    public boolean hasMeterTotalFare() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'meter_total_fare' field.
      * @return This builder.
      */
    public com.pickme.events.trip.trip_ended.FareDetails.Builder clearMeterTotalFare() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public FareDetails build() {
      try {
        FareDetails record = new FareDetails();
        record.distance_fare = fieldSetFlags()[0] ? this.distance_fare : (java.lang.Float) defaultValue(fields()[0]);
        record.waiting_fare = fieldSetFlags()[1] ? this.waiting_fare : (java.lang.Float) defaultValue(fields()[1]);
        record.night_fare = fieldSetFlags()[2] ? this.night_fare : (java.lang.Float) defaultValue(fields()[2]);
        record.day_night_switching_cost = fieldSetFlags()[3] ? this.day_night_switching_cost : (java.lang.Float) defaultValue(fields()[3]);
        record.meter_total_fare = fieldSetFlags()[4] ? this.meter_total_fare : (java.lang.Float) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<FareDetails>
    WRITER$ = (org.apache.avro.io.DatumWriter<FareDetails>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<FareDetails>
    READER$ = (org.apache.avro.io.DatumReader<FareDetails>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
