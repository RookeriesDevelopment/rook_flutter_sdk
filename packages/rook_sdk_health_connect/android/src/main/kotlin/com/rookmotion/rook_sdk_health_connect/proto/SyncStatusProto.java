// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: protos.proto
// Protobuf Java Version: 4.28.1

package com.rookmotion.rook_sdk_health_connect.proto;

/**
 * Protobuf enum {@code SyncStatusProto}
 */
public enum SyncStatusProto
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SYNCED = 0;</code>
   */
  SYNCED(0),
  /**
   * <code>RECORDS_NOT_FOUND = 1;</code>
   */
  RECORDS_NOT_FOUND(1),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      SyncStatusProto.class.getName());
  }
  /**
   * <code>SYNCED = 0;</code>
   */
  public static final int SYNCED_VALUE = 0;
  /**
   * <code>RECORDS_NOT_FOUND = 1;</code>
   */
  public static final int RECORDS_NOT_FOUND_VALUE = 1;


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
  public static SyncStatusProto valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SyncStatusProto forNumber(int value) {
    switch (value) {
      case 0: return SYNCED;
      case 1: return RECORDS_NOT_FOUND;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SyncStatusProto>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SyncStatusProto> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SyncStatusProto>() {
          public SyncStatusProto findValueByNumber(int number) {
            return SyncStatusProto.forNumber(number);
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
    return com.rookmotion.rook_sdk_health_connect.proto.ProtobufModels.getDescriptor().getEnumTypes().get(2);
  }

  private static final SyncStatusProto[] VALUES = values();

  public static SyncStatusProto valueOf(
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

  private SyncStatusProto(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:SyncStatusProto)
}

