// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_aio.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.ListAioControllerResponse}
 */
public final class ListAioControllerResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.ListAioControllerResponse)
    ListAioControllerResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAioControllerResponse.newBuilder() to construct.
  private ListAioControllerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAioControllerResponse() {
    devices_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAioControllerResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListAioControllerResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              devices_ = new java.util.ArrayList<opi_api.storage.v1.AioController>();
              mutable_bitField0_ |= 0x00000001;
            }
            devices_.add(
                input.readMessage(opi_api.storage.v1.AioController.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        devices_ = java.util.Collections.unmodifiableList(devices_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_ListAioControllerResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_ListAioControllerResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.ListAioControllerResponse.class, opi_api.storage.v1.ListAioControllerResponse.Builder.class);
  }

  public static final int DEVICES_FIELD_NUMBER = 1;
  private java.util.List<opi_api.storage.v1.AioController> devices_;
  /**
   * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.storage.v1.AioController> getDevicesList() {
    return devices_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.storage.v1.AioControllerOrBuilder> 
      getDevicesOrBuilderList() {
    return devices_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
   */
  @java.lang.Override
  public int getDevicesCount() {
    return devices_.size();
  }
  /**
   * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.AioController getDevices(int index) {
    return devices_.get(index);
  }
  /**
   * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.AioControllerOrBuilder getDevicesOrBuilder(
      int index) {
    return devices_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < devices_.size(); i++) {
      output.writeMessage(1, devices_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < devices_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, devices_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof opi_api.storage.v1.ListAioControllerResponse)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.ListAioControllerResponse other = (opi_api.storage.v1.ListAioControllerResponse) obj;

    if (!getDevicesList()
        .equals(other.getDevicesList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getDevicesCount() > 0) {
      hash = (37 * hash) + DEVICES_FIELD_NUMBER;
      hash = (53 * hash) + getDevicesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.ListAioControllerResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListAioControllerResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListAioControllerResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListAioControllerResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListAioControllerResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListAioControllerResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListAioControllerResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListAioControllerResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListAioControllerResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListAioControllerResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListAioControllerResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListAioControllerResponse parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.ListAioControllerResponse prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.ListAioControllerResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.ListAioControllerResponse)
      opi_api.storage.v1.ListAioControllerResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_ListAioControllerResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_ListAioControllerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.ListAioControllerResponse.class, opi_api.storage.v1.ListAioControllerResponse.Builder.class);
    }

    // Construct using opi_api.storage.v1.ListAioControllerResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getDevicesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (devicesBuilder_ == null) {
        devices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        devicesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_ListAioControllerResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListAioControllerResponse getDefaultInstanceForType() {
      return opi_api.storage.v1.ListAioControllerResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.ListAioControllerResponse build() {
      opi_api.storage.v1.ListAioControllerResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListAioControllerResponse buildPartial() {
      opi_api.storage.v1.ListAioControllerResponse result = new opi_api.storage.v1.ListAioControllerResponse(this);
      int from_bitField0_ = bitField0_;
      if (devicesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          devices_ = java.util.Collections.unmodifiableList(devices_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.devices_ = devices_;
      } else {
        result.devices_ = devicesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
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
      if (other instanceof opi_api.storage.v1.ListAioControllerResponse) {
        return mergeFrom((opi_api.storage.v1.ListAioControllerResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.ListAioControllerResponse other) {
      if (other == opi_api.storage.v1.ListAioControllerResponse.getDefaultInstance()) return this;
      if (devicesBuilder_ == null) {
        if (!other.devices_.isEmpty()) {
          if (devices_.isEmpty()) {
            devices_ = other.devices_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDevicesIsMutable();
            devices_.addAll(other.devices_);
          }
          onChanged();
        }
      } else {
        if (!other.devices_.isEmpty()) {
          if (devicesBuilder_.isEmpty()) {
            devicesBuilder_.dispose();
            devicesBuilder_ = null;
            devices_ = other.devices_;
            bitField0_ = (bitField0_ & ~0x00000001);
            devicesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDevicesFieldBuilder() : null;
          } else {
            devicesBuilder_.addAllMessages(other.devices_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      opi_api.storage.v1.ListAioControllerResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.ListAioControllerResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.storage.v1.AioController> devices_ =
      java.util.Collections.emptyList();
    private void ensureDevicesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        devices_ = new java.util.ArrayList<opi_api.storage.v1.AioController>(devices_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.AioController, opi_api.storage.v1.AioController.Builder, opi_api.storage.v1.AioControllerOrBuilder> devicesBuilder_;

    /**
     * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.AioController> getDevicesList() {
      if (devicesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(devices_);
      } else {
        return devicesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
     */
    public int getDevicesCount() {
      if (devicesBuilder_ == null) {
        return devices_.size();
      } else {
        return devicesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
     */
    public opi_api.storage.v1.AioController getDevices(int index) {
      if (devicesBuilder_ == null) {
        return devices_.get(index);
      } else {
        return devicesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
     */
    public Builder setDevices(
        int index, opi_api.storage.v1.AioController value) {
      if (devicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevicesIsMutable();
        devices_.set(index, value);
        onChanged();
      } else {
        devicesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
     */
    public Builder setDevices(
        int index, opi_api.storage.v1.AioController.Builder builderForValue) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.set(index, builderForValue.build());
        onChanged();
      } else {
        devicesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
     */
    public Builder addDevices(opi_api.storage.v1.AioController value) {
      if (devicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevicesIsMutable();
        devices_.add(value);
        onChanged();
      } else {
        devicesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
     */
    public Builder addDevices(
        int index, opi_api.storage.v1.AioController value) {
      if (devicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevicesIsMutable();
        devices_.add(index, value);
        onChanged();
      } else {
        devicesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
     */
    public Builder addDevices(
        opi_api.storage.v1.AioController.Builder builderForValue) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.add(builderForValue.build());
        onChanged();
      } else {
        devicesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
     */
    public Builder addDevices(
        int index, opi_api.storage.v1.AioController.Builder builderForValue) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.add(index, builderForValue.build());
        onChanged();
      } else {
        devicesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
     */
    public Builder addAllDevices(
        java.lang.Iterable<? extends opi_api.storage.v1.AioController> values) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, devices_);
        onChanged();
      } else {
        devicesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
     */
    public Builder clearDevices() {
      if (devicesBuilder_ == null) {
        devices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        devicesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
     */
    public Builder removeDevices(int index) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.remove(index);
        onChanged();
      } else {
        devicesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
     */
    public opi_api.storage.v1.AioController.Builder getDevicesBuilder(
        int index) {
      return getDevicesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
     */
    public opi_api.storage.v1.AioControllerOrBuilder getDevicesOrBuilder(
        int index) {
      if (devicesBuilder_ == null) {
        return devices_.get(index);  } else {
        return devicesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
     */
    public java.util.List<? extends opi_api.storage.v1.AioControllerOrBuilder> 
         getDevicesOrBuilderList() {
      if (devicesBuilder_ != null) {
        return devicesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(devices_);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
     */
    public opi_api.storage.v1.AioController.Builder addDevicesBuilder() {
      return getDevicesFieldBuilder().addBuilder(
          opi_api.storage.v1.AioController.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
     */
    public opi_api.storage.v1.AioController.Builder addDevicesBuilder(
        int index) {
      return getDevicesFieldBuilder().addBuilder(
          index, opi_api.storage.v1.AioController.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController devices = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.AioController.Builder> 
         getDevicesBuilderList() {
      return getDevicesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.AioController, opi_api.storage.v1.AioController.Builder, opi_api.storage.v1.AioControllerOrBuilder> 
        getDevicesFieldBuilder() {
      if (devicesBuilder_ == null) {
        devicesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.storage.v1.AioController, opi_api.storage.v1.AioController.Builder, opi_api.storage.v1.AioControllerOrBuilder>(
                devices_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        devices_ = null;
      }
      return devicesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.ListAioControllerResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListAioControllerResponse)
  private static final opi_api.storage.v1.ListAioControllerResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.ListAioControllerResponse();
  }

  public static opi_api.storage.v1.ListAioControllerResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAioControllerResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListAioControllerResponse>() {
    @java.lang.Override
    public ListAioControllerResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListAioControllerResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListAioControllerResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAioControllerResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.ListAioControllerResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
