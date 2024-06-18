// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos.proto

// Protobuf Java Version: 3.25.3
package com.rookmotion.rook_sdk_health_connect.data.proto;

/**
 * Protobuf type {@code SDKNotAuthorizedExceptionProto}
 */
public final class SDKNotAuthorizedExceptionProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SDKNotAuthorizedExceptionProto)
    SDKNotAuthorizedExceptionProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SDKNotAuthorizedExceptionProto.newBuilder() to construct.
  private SDKNotAuthorizedExceptionProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SDKNotAuthorizedExceptionProto() {
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SDKNotAuthorizedExceptionProto();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.rookmotion.rook_sdk_health_connect.data.proto.ProtobufModels.internal_static_SDKNotAuthorizedExceptionProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rookmotion.rook_sdk_health_connect.data.proto.ProtobufModels.internal_static_SDKNotAuthorizedExceptionProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto.class, com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <code>string message = 1;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 1;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto)) {
      return super.equals(obj);
    }
    com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto other = (com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto) obj;

    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code SDKNotAuthorizedExceptionProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SDKNotAuthorizedExceptionProto)
      com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rookmotion.rook_sdk_health_connect.data.proto.ProtobufModels.internal_static_SDKNotAuthorizedExceptionProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rookmotion.rook_sdk_health_connect.data.proto.ProtobufModels.internal_static_SDKNotAuthorizedExceptionProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto.class, com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto.Builder.class);
    }

    // Construct using com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      message_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.rookmotion.rook_sdk_health_connect.data.proto.ProtobufModels.internal_static_SDKNotAuthorizedExceptionProto_descriptor;
    }

    @java.lang.Override
    public com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto getDefaultInstanceForType() {
      return com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto.getDefaultInstance();
    }

    @java.lang.Override
    public com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto build() {
      com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto buildPartial() {
      com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto result = new com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.message_ = message_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto) {
        return mergeFrom((com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto other) {
      if (other == com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto.getDefaultInstance()) return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 1;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 1;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 1;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string message = 1;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:SDKNotAuthorizedExceptionProto)
  }

  // @@protoc_insertion_point(class_scope:SDKNotAuthorizedExceptionProto)
  private static final com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto();
  }

  public static com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SDKNotAuthorizedExceptionProto>
      PARSER = new com.google.protobuf.AbstractParser<SDKNotAuthorizedExceptionProto>() {
    @java.lang.Override
    public SDKNotAuthorizedExceptionProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<SDKNotAuthorizedExceptionProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SDKNotAuthorizedExceptionProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.rookmotion.rook_sdk_health_connect.data.proto.SDKNotAuthorizedExceptionProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

