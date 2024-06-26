// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos.proto

// Protobuf Java Version: 3.25.3
package com.rookmotion.rook_sdk_health_connect.data.proto;

/**
 * Protobuf type {@code DataSourceProtoListWrapper}
 */
public final class DataSourceProtoListWrapper extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:DataSourceProtoListWrapper)
    DataSourceProtoListWrapperOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DataSourceProtoListWrapper.newBuilder() to construct.
  private DataSourceProtoListWrapper(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DataSourceProtoListWrapper() {
    dataSources_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DataSourceProtoListWrapper();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.rookmotion.rook_sdk_health_connect.data.proto.ProtobufModels.internal_static_DataSourceProtoListWrapper_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rookmotion.rook_sdk_health_connect.data.proto.ProtobufModels.internal_static_DataSourceProtoListWrapper_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper.class, com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper.Builder.class);
  }

  public static final int DATASOURCES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto> dataSources_;
  /**
   * <code>repeated .DataSourceProto dataSources = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto> getDataSourcesList() {
    return dataSources_;
  }
  /**
   * <code>repeated .DataSourceProto dataSources = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoOrBuilder> 
      getDataSourcesOrBuilderList() {
    return dataSources_;
  }
  /**
   * <code>repeated .DataSourceProto dataSources = 1;</code>
   */
  @java.lang.Override
  public int getDataSourcesCount() {
    return dataSources_.size();
  }
  /**
   * <code>repeated .DataSourceProto dataSources = 1;</code>
   */
  @java.lang.Override
  public com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto getDataSources(int index) {
    return dataSources_.get(index);
  }
  /**
   * <code>repeated .DataSourceProto dataSources = 1;</code>
   */
  @java.lang.Override
  public com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoOrBuilder getDataSourcesOrBuilder(
      int index) {
    return dataSources_.get(index);
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
    for (int i = 0; i < dataSources_.size(); i++) {
      output.writeMessage(1, dataSources_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dataSources_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, dataSources_.get(i));
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
    if (!(obj instanceof com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper)) {
      return super.equals(obj);
    }
    com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper other = (com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper) obj;

    if (!getDataSourcesList()
        .equals(other.getDataSourcesList())) return false;
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
    if (getDataSourcesCount() > 0) {
      hash = (37 * hash) + DATASOURCES_FIELD_NUMBER;
      hash = (53 * hash) + getDataSourcesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper parseFrom(
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
  public static Builder newBuilder(com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper prototype) {
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
   * Protobuf type {@code DataSourceProtoListWrapper}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:DataSourceProtoListWrapper)
      com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapperOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rookmotion.rook_sdk_health_connect.data.proto.ProtobufModels.internal_static_DataSourceProtoListWrapper_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rookmotion.rook_sdk_health_connect.data.proto.ProtobufModels.internal_static_DataSourceProtoListWrapper_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper.class, com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper.Builder.class);
    }

    // Construct using com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper.newBuilder()
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
      if (dataSourcesBuilder_ == null) {
        dataSources_ = java.util.Collections.emptyList();
      } else {
        dataSources_ = null;
        dataSourcesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.rookmotion.rook_sdk_health_connect.data.proto.ProtobufModels.internal_static_DataSourceProtoListWrapper_descriptor;
    }

    @java.lang.Override
    public com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper getDefaultInstanceForType() {
      return com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper.getDefaultInstance();
    }

    @java.lang.Override
    public com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper build() {
      com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper buildPartial() {
      com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper result = new com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper result) {
      if (dataSourcesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dataSources_ = java.util.Collections.unmodifiableList(dataSources_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dataSources_ = dataSources_;
      } else {
        result.dataSources_ = dataSourcesBuilder_.build();
      }
    }

    private void buildPartial0(com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper) {
        return mergeFrom((com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper other) {
      if (other == com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper.getDefaultInstance()) return this;
      if (dataSourcesBuilder_ == null) {
        if (!other.dataSources_.isEmpty()) {
          if (dataSources_.isEmpty()) {
            dataSources_ = other.dataSources_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataSourcesIsMutable();
            dataSources_.addAll(other.dataSources_);
          }
          onChanged();
        }
      } else {
        if (!other.dataSources_.isEmpty()) {
          if (dataSourcesBuilder_.isEmpty()) {
            dataSourcesBuilder_.dispose();
            dataSourcesBuilder_ = null;
            dataSources_ = other.dataSources_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataSourcesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDataSourcesFieldBuilder() : null;
          } else {
            dataSourcesBuilder_.addAllMessages(other.dataSources_);
          }
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
              com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto m =
                  input.readMessage(
                      com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto.parser(),
                      extensionRegistry);
              if (dataSourcesBuilder_ == null) {
                ensureDataSourcesIsMutable();
                dataSources_.add(m);
              } else {
                dataSourcesBuilder_.addMessage(m);
              }
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

    private java.util.List<com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto> dataSources_ =
      java.util.Collections.emptyList();
    private void ensureDataSourcesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dataSources_ = new java.util.ArrayList<com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto>(dataSources_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto, com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto.Builder, com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoOrBuilder> dataSourcesBuilder_;

    /**
     * <code>repeated .DataSourceProto dataSources = 1;</code>
     */
    public java.util.List<com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto> getDataSourcesList() {
      if (dataSourcesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dataSources_);
      } else {
        return dataSourcesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .DataSourceProto dataSources = 1;</code>
     */
    public int getDataSourcesCount() {
      if (dataSourcesBuilder_ == null) {
        return dataSources_.size();
      } else {
        return dataSourcesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .DataSourceProto dataSources = 1;</code>
     */
    public com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto getDataSources(int index) {
      if (dataSourcesBuilder_ == null) {
        return dataSources_.get(index);
      } else {
        return dataSourcesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .DataSourceProto dataSources = 1;</code>
     */
    public Builder setDataSources(
        int index, com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto value) {
      if (dataSourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataSourcesIsMutable();
        dataSources_.set(index, value);
        onChanged();
      } else {
        dataSourcesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .DataSourceProto dataSources = 1;</code>
     */
    public Builder setDataSources(
        int index, com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto.Builder builderForValue) {
      if (dataSourcesBuilder_ == null) {
        ensureDataSourcesIsMutable();
        dataSources_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataSourcesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .DataSourceProto dataSources = 1;</code>
     */
    public Builder addDataSources(com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto value) {
      if (dataSourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataSourcesIsMutable();
        dataSources_.add(value);
        onChanged();
      } else {
        dataSourcesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .DataSourceProto dataSources = 1;</code>
     */
    public Builder addDataSources(
        int index, com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto value) {
      if (dataSourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataSourcesIsMutable();
        dataSources_.add(index, value);
        onChanged();
      } else {
        dataSourcesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .DataSourceProto dataSources = 1;</code>
     */
    public Builder addDataSources(
        com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto.Builder builderForValue) {
      if (dataSourcesBuilder_ == null) {
        ensureDataSourcesIsMutable();
        dataSources_.add(builderForValue.build());
        onChanged();
      } else {
        dataSourcesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .DataSourceProto dataSources = 1;</code>
     */
    public Builder addDataSources(
        int index, com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto.Builder builderForValue) {
      if (dataSourcesBuilder_ == null) {
        ensureDataSourcesIsMutable();
        dataSources_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataSourcesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .DataSourceProto dataSources = 1;</code>
     */
    public Builder addAllDataSources(
        java.lang.Iterable<? extends com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto> values) {
      if (dataSourcesBuilder_ == null) {
        ensureDataSourcesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dataSources_);
        onChanged();
      } else {
        dataSourcesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .DataSourceProto dataSources = 1;</code>
     */
    public Builder clearDataSources() {
      if (dataSourcesBuilder_ == null) {
        dataSources_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataSourcesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .DataSourceProto dataSources = 1;</code>
     */
    public Builder removeDataSources(int index) {
      if (dataSourcesBuilder_ == null) {
        ensureDataSourcesIsMutable();
        dataSources_.remove(index);
        onChanged();
      } else {
        dataSourcesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .DataSourceProto dataSources = 1;</code>
     */
    public com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto.Builder getDataSourcesBuilder(
        int index) {
      return getDataSourcesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .DataSourceProto dataSources = 1;</code>
     */
    public com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoOrBuilder getDataSourcesOrBuilder(
        int index) {
      if (dataSourcesBuilder_ == null) {
        return dataSources_.get(index);  } else {
        return dataSourcesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .DataSourceProto dataSources = 1;</code>
     */
    public java.util.List<? extends com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoOrBuilder> 
         getDataSourcesOrBuilderList() {
      if (dataSourcesBuilder_ != null) {
        return dataSourcesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dataSources_);
      }
    }
    /**
     * <code>repeated .DataSourceProto dataSources = 1;</code>
     */
    public com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto.Builder addDataSourcesBuilder() {
      return getDataSourcesFieldBuilder().addBuilder(
          com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto.getDefaultInstance());
    }
    /**
     * <code>repeated .DataSourceProto dataSources = 1;</code>
     */
    public com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto.Builder addDataSourcesBuilder(
        int index) {
      return getDataSourcesFieldBuilder().addBuilder(
          index, com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto.getDefaultInstance());
    }
    /**
     * <code>repeated .DataSourceProto dataSources = 1;</code>
     */
    public java.util.List<com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto.Builder> 
         getDataSourcesBuilderList() {
      return getDataSourcesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto, com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto.Builder, com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoOrBuilder> 
        getDataSourcesFieldBuilder() {
      if (dataSourcesBuilder_ == null) {
        dataSourcesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto, com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProto.Builder, com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoOrBuilder>(
                dataSources_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dataSources_ = null;
      }
      return dataSourcesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:DataSourceProtoListWrapper)
  }

  // @@protoc_insertion_point(class_scope:DataSourceProtoListWrapper)
  private static final com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper();
  }

  public static com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataSourceProtoListWrapper>
      PARSER = new com.google.protobuf.AbstractParser<DataSourceProtoListWrapper>() {
    @java.lang.Override
    public DataSourceProtoListWrapper parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataSourceProtoListWrapper> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataSourceProtoListWrapper> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.rookmotion.rook_sdk_health_connect.data.proto.DataSourceProtoListWrapper getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

