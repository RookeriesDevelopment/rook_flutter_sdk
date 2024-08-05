// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos.proto

// Protobuf Java Version: 3.25.3
package com.rookmotion.rook_sdk_health_connect.data.proto;

/**
 * Protobuf type {@code ResultBooleanProto}
 */
public final class ResultBooleanProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ResultBooleanProto)
    ResultBooleanProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResultBooleanProto.newBuilder() to construct.
  private ResultBooleanProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResultBooleanProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResultBooleanProto();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.rookmotion.rook_sdk_health_connect.data.proto.ProtobufModels.internal_static_ResultBooleanProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rookmotion.rook_sdk_health_connect.data.proto.ProtobufModels.internal_static_ResultBooleanProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto.class, com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto.Builder.class);
  }

  private int resultCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object result_;
  public enum ResultCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SUCCESS(1),
    PLUGINEXCEPTIONPROTO(2),
    RESULT_NOT_SET(0);
    private final int value;
    private ResultCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResultCase valueOf(int value) {
      return forNumber(value);
    }

    public static ResultCase forNumber(int value) {
      switch (value) {
        case 1: return SUCCESS;
        case 2: return PLUGINEXCEPTIONPROTO;
        case 0: return RESULT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ResultCase
  getResultCase() {
    return ResultCase.forNumber(
        resultCase_);
  }

  public static final int SUCCESS_FIELD_NUMBER = 1;
  /**
   * <code>bool success = 1;</code>
   * @return Whether the success field is set.
   */
  @java.lang.Override
  public boolean hasSuccess() {
    return resultCase_ == 1;
  }
  /**
   * <code>bool success = 1;</code>
   * @return The success.
   */
  @java.lang.Override
  public boolean getSuccess() {
    if (resultCase_ == 1) {
      return (java.lang.Boolean) result_;
    }
    return false;
  }

  public static final int PLUGINEXCEPTIONPROTO_FIELD_NUMBER = 2;
  /**
   * <code>.PluginExceptionProto pluginExceptionProto = 2;</code>
   * @return Whether the pluginExceptionProto field is set.
   */
  @java.lang.Override
  public boolean hasPluginExceptionProto() {
    return resultCase_ == 2;
  }
  /**
   * <code>.PluginExceptionProto pluginExceptionProto = 2;</code>
   * @return The pluginExceptionProto.
   */
  @java.lang.Override
  public com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto getPluginExceptionProto() {
    if (resultCase_ == 2) {
       return (com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto) result_;
    }
    return com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto.getDefaultInstance();
  }
  /**
   * <code>.PluginExceptionProto pluginExceptionProto = 2;</code>
   */
  @java.lang.Override
  public com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProtoOrBuilder getPluginExceptionProtoOrBuilder() {
    if (resultCase_ == 2) {
       return (com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto) result_;
    }
    return com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto.getDefaultInstance();
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
    if (resultCase_ == 1) {
      output.writeBool(
          1, (boolean)((java.lang.Boolean) result_));
    }
    if (resultCase_ == 2) {
      output.writeMessage(2, (com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto) result_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resultCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            1, (boolean)((java.lang.Boolean) result_));
    }
    if (resultCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto) result_);
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
    if (!(obj instanceof com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto)) {
      return super.equals(obj);
    }
    com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto other = (com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto) obj;

    if (!getResultCase().equals(other.getResultCase())) return false;
    switch (resultCase_) {
      case 1:
        if (getSuccess()
            != other.getSuccess()) return false;
        break;
      case 2:
        if (!getPluginExceptionProto()
            .equals(other.getPluginExceptionProto())) return false;
        break;
      case 0:
      default:
    }
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
    switch (resultCase_) {
      case 1:
        hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getSuccess());
        break;
      case 2:
        hash = (37 * hash) + PLUGINEXCEPTIONPROTO_FIELD_NUMBER;
        hash = (53 * hash) + getPluginExceptionProto().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto parseFrom(
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
  public static Builder newBuilder(com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto prototype) {
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
   * Protobuf type {@code ResultBooleanProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ResultBooleanProto)
      com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rookmotion.rook_sdk_health_connect.data.proto.ProtobufModels.internal_static_ResultBooleanProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rookmotion.rook_sdk_health_connect.data.proto.ProtobufModels.internal_static_ResultBooleanProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto.class, com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto.Builder.class);
    }

    // Construct using com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto.newBuilder()
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
      if (pluginExceptionProtoBuilder_ != null) {
        pluginExceptionProtoBuilder_.clear();
      }
      resultCase_ = 0;
      result_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.rookmotion.rook_sdk_health_connect.data.proto.ProtobufModels.internal_static_ResultBooleanProto_descriptor;
    }

    @java.lang.Override
    public com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto getDefaultInstanceForType() {
      return com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto.getDefaultInstance();
    }

    @java.lang.Override
    public com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto build() {
      com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto buildPartial() {
      com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto result = new com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto result) {
      result.resultCase_ = resultCase_;
      result.result_ = this.result_;
      if (resultCase_ == 2 &&
          pluginExceptionProtoBuilder_ != null) {
        result.result_ = pluginExceptionProtoBuilder_.build();
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
      if (other instanceof com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto) {
        return mergeFrom((com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto other) {
      if (other == com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto.getDefaultInstance()) return this;
      switch (other.getResultCase()) {
        case SUCCESS: {
          setSuccess(other.getSuccess());
          break;
        }
        case PLUGINEXCEPTIONPROTO: {
          mergePluginExceptionProto(other.getPluginExceptionProto());
          break;
        }
        case RESULT_NOT_SET: {
          break;
        }
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
            case 8: {
              result_ = input.readBool();
              resultCase_ = 1;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getPluginExceptionProtoFieldBuilder().getBuilder(),
                  extensionRegistry);
              resultCase_ = 2;
              break;
            } // case 18
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
    private int resultCase_ = 0;
    private java.lang.Object result_;
    public ResultCase
        getResultCase() {
      return ResultCase.forNumber(
          resultCase_);
    }

    public Builder clearResult() {
      resultCase_ = 0;
      result_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <code>bool success = 1;</code>
     * @return Whether the success field is set.
     */
    public boolean hasSuccess() {
      return resultCase_ == 1;
    }
    /**
     * <code>bool success = 1;</code>
     * @return The success.
     */
    public boolean getSuccess() {
      if (resultCase_ == 1) {
        return (java.lang.Boolean) result_;
      }
      return false;
    }
    /**
     * <code>bool success = 1;</code>
     * @param value The success to set.
     * @return This builder for chaining.
     */
    public Builder setSuccess(boolean value) {

      resultCase_ = 1;
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool success = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccess() {
      if (resultCase_ == 1) {
        resultCase_ = 0;
        result_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto, com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto.Builder, com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProtoOrBuilder> pluginExceptionProtoBuilder_;
    /**
     * <code>.PluginExceptionProto pluginExceptionProto = 2;</code>
     * @return Whether the pluginExceptionProto field is set.
     */
    @java.lang.Override
    public boolean hasPluginExceptionProto() {
      return resultCase_ == 2;
    }
    /**
     * <code>.PluginExceptionProto pluginExceptionProto = 2;</code>
     * @return The pluginExceptionProto.
     */
    @java.lang.Override
    public com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto getPluginExceptionProto() {
      if (pluginExceptionProtoBuilder_ == null) {
        if (resultCase_ == 2) {
          return (com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto) result_;
        }
        return com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto.getDefaultInstance();
      } else {
        if (resultCase_ == 2) {
          return pluginExceptionProtoBuilder_.getMessage();
        }
        return com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto.getDefaultInstance();
      }
    }
    /**
     * <code>.PluginExceptionProto pluginExceptionProto = 2;</code>
     */
    public Builder setPluginExceptionProto(com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto value) {
      if (pluginExceptionProtoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        pluginExceptionProtoBuilder_.setMessage(value);
      }
      resultCase_ = 2;
      return this;
    }
    /**
     * <code>.PluginExceptionProto pluginExceptionProto = 2;</code>
     */
    public Builder setPluginExceptionProto(
        com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto.Builder builderForValue) {
      if (pluginExceptionProtoBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        pluginExceptionProtoBuilder_.setMessage(builderForValue.build());
      }
      resultCase_ = 2;
      return this;
    }
    /**
     * <code>.PluginExceptionProto pluginExceptionProto = 2;</code>
     */
    public Builder mergePluginExceptionProto(com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto value) {
      if (pluginExceptionProtoBuilder_ == null) {
        if (resultCase_ == 2 &&
            result_ != com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto.getDefaultInstance()) {
          result_ = com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto.newBuilder((com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto) result_)
              .mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        if (resultCase_ == 2) {
          pluginExceptionProtoBuilder_.mergeFrom(value);
        } else {
          pluginExceptionProtoBuilder_.setMessage(value);
        }
      }
      resultCase_ = 2;
      return this;
    }
    /**
     * <code>.PluginExceptionProto pluginExceptionProto = 2;</code>
     */
    public Builder clearPluginExceptionProto() {
      if (pluginExceptionProtoBuilder_ == null) {
        if (resultCase_ == 2) {
          resultCase_ = 0;
          result_ = null;
          onChanged();
        }
      } else {
        if (resultCase_ == 2) {
          resultCase_ = 0;
          result_ = null;
        }
        pluginExceptionProtoBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.PluginExceptionProto pluginExceptionProto = 2;</code>
     */
    public com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto.Builder getPluginExceptionProtoBuilder() {
      return getPluginExceptionProtoFieldBuilder().getBuilder();
    }
    /**
     * <code>.PluginExceptionProto pluginExceptionProto = 2;</code>
     */
    @java.lang.Override
    public com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProtoOrBuilder getPluginExceptionProtoOrBuilder() {
      if ((resultCase_ == 2) && (pluginExceptionProtoBuilder_ != null)) {
        return pluginExceptionProtoBuilder_.getMessageOrBuilder();
      } else {
        if (resultCase_ == 2) {
          return (com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto) result_;
        }
        return com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto.getDefaultInstance();
      }
    }
    /**
     * <code>.PluginExceptionProto pluginExceptionProto = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto, com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto.Builder, com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProtoOrBuilder> 
        getPluginExceptionProtoFieldBuilder() {
      if (pluginExceptionProtoBuilder_ == null) {
        if (!(resultCase_ == 2)) {
          result_ = com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto.getDefaultInstance();
        }
        pluginExceptionProtoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto, com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto.Builder, com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProtoOrBuilder>(
                (com.rookmotion.rook_sdk_health_connect.data.proto.PluginExceptionProto) result_,
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      resultCase_ = 2;
      onChanged();
      return pluginExceptionProtoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ResultBooleanProto)
  }

  // @@protoc_insertion_point(class_scope:ResultBooleanProto)
  private static final com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto();
  }

  public static com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResultBooleanProto>
      PARSER = new com.google.protobuf.AbstractParser<ResultBooleanProto>() {
    @java.lang.Override
    public ResultBooleanProto parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResultBooleanProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResultBooleanProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.rookmotion.rook_sdk_health_connect.data.proto.ResultBooleanProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

