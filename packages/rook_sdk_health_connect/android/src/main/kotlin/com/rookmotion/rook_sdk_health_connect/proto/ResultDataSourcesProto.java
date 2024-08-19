// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos.proto

// Protobuf Java Version: 3.25.3
package com.rookmotion.rook_sdk_health_connect.proto;

/**
 * Protobuf type {@code ResultDataSourcesProto}
 */
public final class ResultDataSourcesProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ResultDataSourcesProto)
    ResultDataSourcesProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResultDataSourcesProto.newBuilder() to construct.
  private ResultDataSourcesProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResultDataSourcesProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResultDataSourcesProto();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.rookmotion.rook_sdk_health_connect.proto.ProtobufModels.internal_static_ResultDataSourcesProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rookmotion.rook_sdk_health_connect.proto.ProtobufModels.internal_static_ResultDataSourcesProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto.class, com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto.Builder.class);
  }

  private int resultCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object result_;
  public enum ResultCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    DATASOURCESPROTOLISTWRAPPER(1),
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
        case 1: return DATASOURCESPROTOLISTWRAPPER;
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

  public static final int DATASOURCESPROTOLISTWRAPPER_FIELD_NUMBER = 1;
  /**
   * <code>.DataSourcesProtoListWrapper dataSourcesProtoListWrapper = 1;</code>
   * @return Whether the dataSourcesProtoListWrapper field is set.
   */
  @java.lang.Override
  public boolean hasDataSourcesProtoListWrapper() {
    return resultCase_ == 1;
  }
  /**
   * <code>.DataSourcesProtoListWrapper dataSourcesProtoListWrapper = 1;</code>
   * @return The dataSourcesProtoListWrapper.
   */
  @java.lang.Override
  public com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper getDataSourcesProtoListWrapper() {
    if (resultCase_ == 1) {
       return (com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper) result_;
    }
    return com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper.getDefaultInstance();
  }
  /**
   * <code>.DataSourcesProtoListWrapper dataSourcesProtoListWrapper = 1;</code>
   */
  @java.lang.Override
  public com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapperOrBuilder getDataSourcesProtoListWrapperOrBuilder() {
    if (resultCase_ == 1) {
       return (com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper) result_;
    }
    return com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper.getDefaultInstance();
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
  public com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto getPluginExceptionProto() {
    if (resultCase_ == 2) {
       return (com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto) result_;
    }
    return com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto.getDefaultInstance();
  }
  /**
   * <code>.PluginExceptionProto pluginExceptionProto = 2;</code>
   */
  @java.lang.Override
  public com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProtoOrBuilder getPluginExceptionProtoOrBuilder() {
    if (resultCase_ == 2) {
       return (com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto) result_;
    }
    return com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto.getDefaultInstance();
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
      output.writeMessage(1, (com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper) result_);
    }
    if (resultCase_ == 2) {
      output.writeMessage(2, (com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto) result_);
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
        .computeMessageSize(1, (com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper) result_);
    }
    if (resultCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto) result_);
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
    if (!(obj instanceof com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto)) {
      return super.equals(obj);
    }
    com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto other = (com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto) obj;

    if (!getResultCase().equals(other.getResultCase())) return false;
    switch (resultCase_) {
      case 1:
        if (!getDataSourcesProtoListWrapper()
            .equals(other.getDataSourcesProtoListWrapper())) return false;
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
        hash = (37 * hash) + DATASOURCESPROTOLISTWRAPPER_FIELD_NUMBER;
        hash = (53 * hash) + getDataSourcesProtoListWrapper().hashCode();
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

  public static com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto parseFrom(
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
  public static Builder newBuilder(com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto prototype) {
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
   * Protobuf type {@code ResultDataSourcesProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ResultDataSourcesProto)
      com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rookmotion.rook_sdk_health_connect.proto.ProtobufModels.internal_static_ResultDataSourcesProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rookmotion.rook_sdk_health_connect.proto.ProtobufModels.internal_static_ResultDataSourcesProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto.class, com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto.Builder.class);
    }

    // Construct using com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto.newBuilder()
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
      if (dataSourcesProtoListWrapperBuilder_ != null) {
        dataSourcesProtoListWrapperBuilder_.clear();
      }
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
      return com.rookmotion.rook_sdk_health_connect.proto.ProtobufModels.internal_static_ResultDataSourcesProto_descriptor;
    }

    @java.lang.Override
    public com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto getDefaultInstanceForType() {
      return com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto.getDefaultInstance();
    }

    @java.lang.Override
    public com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto build() {
      com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto buildPartial() {
      com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto result = new com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto result) {
      result.resultCase_ = resultCase_;
      result.result_ = this.result_;
      if (resultCase_ == 1 &&
          dataSourcesProtoListWrapperBuilder_ != null) {
        result.result_ = dataSourcesProtoListWrapperBuilder_.build();
      }
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
      if (other instanceof com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto) {
        return mergeFrom((com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto other) {
      if (other == com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto.getDefaultInstance()) return this;
      switch (other.getResultCase()) {
        case DATASOURCESPROTOLISTWRAPPER: {
          mergeDataSourcesProtoListWrapper(other.getDataSourcesProtoListWrapper());
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
            case 10: {
              input.readMessage(
                  getDataSourcesProtoListWrapperFieldBuilder().getBuilder(),
                  extensionRegistry);
              resultCase_ = 1;
              break;
            } // case 10
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

    private com.google.protobuf.SingleFieldBuilderV3<
        com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper, com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper.Builder, com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapperOrBuilder> dataSourcesProtoListWrapperBuilder_;
    /**
     * <code>.DataSourcesProtoListWrapper dataSourcesProtoListWrapper = 1;</code>
     * @return Whether the dataSourcesProtoListWrapper field is set.
     */
    @java.lang.Override
    public boolean hasDataSourcesProtoListWrapper() {
      return resultCase_ == 1;
    }
    /**
     * <code>.DataSourcesProtoListWrapper dataSourcesProtoListWrapper = 1;</code>
     * @return The dataSourcesProtoListWrapper.
     */
    @java.lang.Override
    public com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper getDataSourcesProtoListWrapper() {
      if (dataSourcesProtoListWrapperBuilder_ == null) {
        if (resultCase_ == 1) {
          return (com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper) result_;
        }
        return com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper.getDefaultInstance();
      } else {
        if (resultCase_ == 1) {
          return dataSourcesProtoListWrapperBuilder_.getMessage();
        }
        return com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper.getDefaultInstance();
      }
    }
    /**
     * <code>.DataSourcesProtoListWrapper dataSourcesProtoListWrapper = 1;</code>
     */
    public Builder setDataSourcesProtoListWrapper(com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper value) {
      if (dataSourcesProtoListWrapperBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        dataSourcesProtoListWrapperBuilder_.setMessage(value);
      }
      resultCase_ = 1;
      return this;
    }
    /**
     * <code>.DataSourcesProtoListWrapper dataSourcesProtoListWrapper = 1;</code>
     */
    public Builder setDataSourcesProtoListWrapper(
        com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper.Builder builderForValue) {
      if (dataSourcesProtoListWrapperBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        dataSourcesProtoListWrapperBuilder_.setMessage(builderForValue.build());
      }
      resultCase_ = 1;
      return this;
    }
    /**
     * <code>.DataSourcesProtoListWrapper dataSourcesProtoListWrapper = 1;</code>
     */
    public Builder mergeDataSourcesProtoListWrapper(com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper value) {
      if (dataSourcesProtoListWrapperBuilder_ == null) {
        if (resultCase_ == 1 &&
            result_ != com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper.getDefaultInstance()) {
          result_ = com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper.newBuilder((com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper) result_)
              .mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        if (resultCase_ == 1) {
          dataSourcesProtoListWrapperBuilder_.mergeFrom(value);
        } else {
          dataSourcesProtoListWrapperBuilder_.setMessage(value);
        }
      }
      resultCase_ = 1;
      return this;
    }
    /**
     * <code>.DataSourcesProtoListWrapper dataSourcesProtoListWrapper = 1;</code>
     */
    public Builder clearDataSourcesProtoListWrapper() {
      if (dataSourcesProtoListWrapperBuilder_ == null) {
        if (resultCase_ == 1) {
          resultCase_ = 0;
          result_ = null;
          onChanged();
        }
      } else {
        if (resultCase_ == 1) {
          resultCase_ = 0;
          result_ = null;
        }
        dataSourcesProtoListWrapperBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.DataSourcesProtoListWrapper dataSourcesProtoListWrapper = 1;</code>
     */
    public com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper.Builder getDataSourcesProtoListWrapperBuilder() {
      return getDataSourcesProtoListWrapperFieldBuilder().getBuilder();
    }
    /**
     * <code>.DataSourcesProtoListWrapper dataSourcesProtoListWrapper = 1;</code>
     */
    @java.lang.Override
    public com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapperOrBuilder getDataSourcesProtoListWrapperOrBuilder() {
      if ((resultCase_ == 1) && (dataSourcesProtoListWrapperBuilder_ != null)) {
        return dataSourcesProtoListWrapperBuilder_.getMessageOrBuilder();
      } else {
        if (resultCase_ == 1) {
          return (com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper) result_;
        }
        return com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper.getDefaultInstance();
      }
    }
    /**
     * <code>.DataSourcesProtoListWrapper dataSourcesProtoListWrapper = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper, com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper.Builder, com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapperOrBuilder> 
        getDataSourcesProtoListWrapperFieldBuilder() {
      if (dataSourcesProtoListWrapperBuilder_ == null) {
        if (!(resultCase_ == 1)) {
          result_ = com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper.getDefaultInstance();
        }
        dataSourcesProtoListWrapperBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper, com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper.Builder, com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapperOrBuilder>(
                (com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper) result_,
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      resultCase_ = 1;
      onChanged();
      return dataSourcesProtoListWrapperBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto, com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto.Builder, com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProtoOrBuilder> pluginExceptionProtoBuilder_;
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
    public com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto getPluginExceptionProto() {
      if (pluginExceptionProtoBuilder_ == null) {
        if (resultCase_ == 2) {
          return (com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto) result_;
        }
        return com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto.getDefaultInstance();
      } else {
        if (resultCase_ == 2) {
          return pluginExceptionProtoBuilder_.getMessage();
        }
        return com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto.getDefaultInstance();
      }
    }
    /**
     * <code>.PluginExceptionProto pluginExceptionProto = 2;</code>
     */
    public Builder setPluginExceptionProto(com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto value) {
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
        com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto.Builder builderForValue) {
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
    public Builder mergePluginExceptionProto(com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto value) {
      if (pluginExceptionProtoBuilder_ == null) {
        if (resultCase_ == 2 &&
            result_ != com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto.getDefaultInstance()) {
          result_ = com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto.newBuilder((com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto) result_)
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
    public com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto.Builder getPluginExceptionProtoBuilder() {
      return getPluginExceptionProtoFieldBuilder().getBuilder();
    }
    /**
     * <code>.PluginExceptionProto pluginExceptionProto = 2;</code>
     */
    @java.lang.Override
    public com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProtoOrBuilder getPluginExceptionProtoOrBuilder() {
      if ((resultCase_ == 2) && (pluginExceptionProtoBuilder_ != null)) {
        return pluginExceptionProtoBuilder_.getMessageOrBuilder();
      } else {
        if (resultCase_ == 2) {
          return (com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto) result_;
        }
        return com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto.getDefaultInstance();
      }
    }
    /**
     * <code>.PluginExceptionProto pluginExceptionProto = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto, com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto.Builder, com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProtoOrBuilder> 
        getPluginExceptionProtoFieldBuilder() {
      if (pluginExceptionProtoBuilder_ == null) {
        if (!(resultCase_ == 2)) {
          result_ = com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto.getDefaultInstance();
        }
        pluginExceptionProtoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto, com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto.Builder, com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProtoOrBuilder>(
                (com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto) result_,
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


    // @@protoc_insertion_point(builder_scope:ResultDataSourcesProto)
  }

  // @@protoc_insertion_point(class_scope:ResultDataSourcesProto)
  private static final com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto();
  }

  public static com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResultDataSourcesProto>
      PARSER = new com.google.protobuf.AbstractParser<ResultDataSourcesProto>() {
    @java.lang.Override
    public ResultDataSourcesProto parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResultDataSourcesProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResultDataSourcesProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

