// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: protos.proto
// Protobuf Java Version: 4.28.1

package com.rookmotion.rook_sdk_health_connect.proto;

/**
 * Protobuf enum {@code DataSourceTypeProto}
 */
public enum DataSourceTypeProto
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>GARMIN = 0;</code>
   */
  GARMIN(0),
  /**
   * <code>OURA = 1;</code>
   */
  OURA(1),
  /**
   * <code>POLAR = 2;</code>
   */
  POLAR(2),
  /**
   * <code>FITBIT = 3;</code>
   */
  FITBIT(3),
  /**
   * <code>WITHINGS = 4;</code>
   */
  WITHINGS(4),
  /**
   * <code>WHOOP = 5;</code>
   */
  WHOOP(5),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      DataSourceTypeProto.class.getName());
  }
  /**
   * <code>GARMIN = 0;</code>
   */
  public static final int GARMIN_VALUE = 0;
  /**
   * <code>OURA = 1;</code>
   */
  public static final int OURA_VALUE = 1;
  /**
   * <code>POLAR = 2;</code>
   */
  public static final int POLAR_VALUE = 2;
  /**
   * <code>FITBIT = 3;</code>
   */
  public static final int FITBIT_VALUE = 3;
  /**
   * <code>WITHINGS = 4;</code>
   */
  public static final int WITHINGS_VALUE = 4;
  /**
   * <code>WHOOP = 5;</code>
   */
  public static final int WHOOP_VALUE = 5;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static DataSourceTypeProto valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DataSourceTypeProto forNumber(int value) {
    switch (value) {
      case 0: return GARMIN;
      case 1: return OURA;
      case 2: return POLAR;
      case 3: return FITBIT;
      case 4: return WITHINGS;
      case 5: return WHOOP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DataSourceTypeProto>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DataSourceTypeProto> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DataSourceTypeProto>() {
          public DataSourceTypeProto findValueByNumber(int number) {
            return DataSourceTypeProto.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.rookmotion.rook_sdk_health_connect.proto.ProtobufModels.getDescriptor().getEnumTypes().get(6);
  }

  private static final DataSourceTypeProto[] VALUES = values();

  public static DataSourceTypeProto valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DataSourceTypeProto(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:DataSourceTypeProto)
}
