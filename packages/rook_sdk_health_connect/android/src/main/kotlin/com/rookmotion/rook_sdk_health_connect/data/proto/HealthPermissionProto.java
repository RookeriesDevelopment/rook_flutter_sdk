// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos.proto

// Protobuf Java Version: 3.25.3
package com.rookmotion.rook_sdk_health_connect.data.proto;

/**
 * Protobuf enum {@code HealthPermissionProto}
 */
public enum HealthPermissionProto
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SLEEP = 0;</code>
   */
  SLEEP(0),
  /**
   * <code>PHYSICAL = 1;</code>
   */
  PHYSICAL(1),
  /**
   * <code>BODY = 2;</code>
   */
  BODY(2),
  /**
   * <code>ALL = 3;</code>
   */
  ALL(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SLEEP = 0;</code>
   */
  public static final int SLEEP_VALUE = 0;
  /**
   * <code>PHYSICAL = 1;</code>
   */
  public static final int PHYSICAL_VALUE = 1;
  /**
   * <code>BODY = 2;</code>
   */
  public static final int BODY_VALUE = 2;
  /**
   * <code>ALL = 3;</code>
   */
  public static final int ALL_VALUE = 3;


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
  public static HealthPermissionProto valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HealthPermissionProto forNumber(int value) {
    switch (value) {
      case 0: return SLEEP;
      case 1: return PHYSICAL;
      case 2: return BODY;
      case 3: return ALL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HealthPermissionProto>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HealthPermissionProto> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HealthPermissionProto>() {
          public HealthPermissionProto findValueByNumber(int number) {
            return HealthPermissionProto.forNumber(number);
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
    return com.rookmotion.rook_sdk_health_connect.data.proto.ProtobufModels.getDescriptor().getEnumTypes().get(2);
  }

  private static final HealthPermissionProto[] VALUES = values();

  public static HealthPermissionProto valueOf(
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

  private HealthPermissionProto(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:HealthPermissionProto)
}

