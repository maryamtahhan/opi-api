// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * List interface response
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.ListInterfacesResponse}
 */
public final class ListInterfacesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.ListInterfacesResponse)
    ListInterfacesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListInterfacesResponse.newBuilder() to construct.
  private ListInterfacesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListInterfacesResponse() {
    interface_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListInterfacesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListInterfacesResponse(
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
              interface_ = new java.util.ArrayList<opi_api.network.cloud.v1alpha1.Interface>();
              mutable_bitField0_ |= 0x00000001;
            }
            interface_.add(
                input.readMessage(opi_api.network.cloud.v1alpha1.Interface.parser(), extensionRegistry));
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        interface_ = java.util.Collections.unmodifiableList(interface_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListInterfacesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListInterfacesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.ListInterfacesResponse.class, opi_api.network.cloud.v1alpha1.ListInterfacesResponse.Builder.class);
  }

  public static final int INTERFACE_FIELD_NUMBER = 1;
  private java.util.List<opi_api.network.cloud.v1alpha1.Interface> interface_;
  /**
   * <pre>
   * list of interfaces
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.network.cloud.v1alpha1.Interface> getInterfaceList() {
    return interface_;
  }
  /**
   * <pre>
   * list of interfaces
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.network.cloud.v1alpha1.InterfaceOrBuilder> 
      getInterfaceOrBuilderList() {
    return interface_;
  }
  /**
   * <pre>
   * list of interfaces
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
   */
  @java.lang.Override
  public int getInterfaceCount() {
    return interface_.size();
  }
  /**
   * <pre>
   * list of interfaces
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.Interface getInterface(int index) {
    return interface_.get(index);
  }
  /**
   * <pre>
   * list of interfaces
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.InterfaceOrBuilder getInterfaceOrBuilder(
      int index) {
    return interface_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * next page token
   * </pre>
   *
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
   * <pre>
   * next page token
   * </pre>
   *
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
    for (int i = 0; i < interface_.size(); i++) {
      output.writeMessage(1, interface_.get(i));
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
    for (int i = 0; i < interface_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, interface_.get(i));
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.ListInterfacesResponse)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.ListInterfacesResponse other = (opi_api.network.cloud.v1alpha1.ListInterfacesResponse) obj;

    if (!getInterfaceList()
        .equals(other.getInterfaceList())) return false;
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
    if (getInterfaceCount() > 0) {
      hash = (37 * hash) + INTERFACE_FIELD_NUMBER;
      hash = (53 * hash) + getInterfaceList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.ListInterfacesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListInterfacesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListInterfacesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListInterfacesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListInterfacesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListInterfacesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListInterfacesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListInterfacesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListInterfacesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListInterfacesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListInterfacesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListInterfacesResponse parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.ListInterfacesResponse prototype) {
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
   * <pre>
   * List interface response
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.ListInterfacesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.ListInterfacesResponse)
      opi_api.network.cloud.v1alpha1.ListInterfacesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListInterfacesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListInterfacesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.ListInterfacesResponse.class, opi_api.network.cloud.v1alpha1.ListInterfacesResponse.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.ListInterfacesResponse.newBuilder()
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
        getInterfaceFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (interfaceBuilder_ == null) {
        interface_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        interfaceBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListInterfacesResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListInterfacesResponse getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.ListInterfacesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListInterfacesResponse build() {
      opi_api.network.cloud.v1alpha1.ListInterfacesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListInterfacesResponse buildPartial() {
      opi_api.network.cloud.v1alpha1.ListInterfacesResponse result = new opi_api.network.cloud.v1alpha1.ListInterfacesResponse(this);
      int from_bitField0_ = bitField0_;
      if (interfaceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          interface_ = java.util.Collections.unmodifiableList(interface_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.interface_ = interface_;
      } else {
        result.interface_ = interfaceBuilder_.build();
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
      if (other instanceof opi_api.network.cloud.v1alpha1.ListInterfacesResponse) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.ListInterfacesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.ListInterfacesResponse other) {
      if (other == opi_api.network.cloud.v1alpha1.ListInterfacesResponse.getDefaultInstance()) return this;
      if (interfaceBuilder_ == null) {
        if (!other.interface_.isEmpty()) {
          if (interface_.isEmpty()) {
            interface_ = other.interface_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInterfaceIsMutable();
            interface_.addAll(other.interface_);
          }
          onChanged();
        }
      } else {
        if (!other.interface_.isEmpty()) {
          if (interfaceBuilder_.isEmpty()) {
            interfaceBuilder_.dispose();
            interfaceBuilder_ = null;
            interface_ = other.interface_;
            bitField0_ = (bitField0_ & ~0x00000001);
            interfaceBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInterfaceFieldBuilder() : null;
          } else {
            interfaceBuilder_.addAllMessages(other.interface_);
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
      opi_api.network.cloud.v1alpha1.ListInterfacesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.ListInterfacesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.network.cloud.v1alpha1.Interface> interface_ =
      java.util.Collections.emptyList();
    private void ensureInterfaceIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        interface_ = new java.util.ArrayList<opi_api.network.cloud.v1alpha1.Interface>(interface_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.Interface, opi_api.network.cloud.v1alpha1.Interface.Builder, opi_api.network.cloud.v1alpha1.InterfaceOrBuilder> interfaceBuilder_;

    /**
     * <pre>
     * list of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
     */
    public java.util.List<opi_api.network.cloud.v1alpha1.Interface> getInterfaceList() {
      if (interfaceBuilder_ == null) {
        return java.util.Collections.unmodifiableList(interface_);
      } else {
        return interfaceBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * list of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
     */
    public int getInterfaceCount() {
      if (interfaceBuilder_ == null) {
        return interface_.size();
      } else {
        return interfaceBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * list of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.Interface getInterface(int index) {
      if (interfaceBuilder_ == null) {
        return interface_.get(index);
      } else {
        return interfaceBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * list of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
     */
    public Builder setInterface(
        int index, opi_api.network.cloud.v1alpha1.Interface value) {
      if (interfaceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInterfaceIsMutable();
        interface_.set(index, value);
        onChanged();
      } else {
        interfaceBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
     */
    public Builder setInterface(
        int index, opi_api.network.cloud.v1alpha1.Interface.Builder builderForValue) {
      if (interfaceBuilder_ == null) {
        ensureInterfaceIsMutable();
        interface_.set(index, builderForValue.build());
        onChanged();
      } else {
        interfaceBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
     */
    public Builder addInterface(opi_api.network.cloud.v1alpha1.Interface value) {
      if (interfaceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInterfaceIsMutable();
        interface_.add(value);
        onChanged();
      } else {
        interfaceBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * list of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
     */
    public Builder addInterface(
        int index, opi_api.network.cloud.v1alpha1.Interface value) {
      if (interfaceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInterfaceIsMutable();
        interface_.add(index, value);
        onChanged();
      } else {
        interfaceBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
     */
    public Builder addInterface(
        opi_api.network.cloud.v1alpha1.Interface.Builder builderForValue) {
      if (interfaceBuilder_ == null) {
        ensureInterfaceIsMutable();
        interface_.add(builderForValue.build());
        onChanged();
      } else {
        interfaceBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
     */
    public Builder addInterface(
        int index, opi_api.network.cloud.v1alpha1.Interface.Builder builderForValue) {
      if (interfaceBuilder_ == null) {
        ensureInterfaceIsMutable();
        interface_.add(index, builderForValue.build());
        onChanged();
      } else {
        interfaceBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
     */
    public Builder addAllInterface(
        java.lang.Iterable<? extends opi_api.network.cloud.v1alpha1.Interface> values) {
      if (interfaceBuilder_ == null) {
        ensureInterfaceIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, interface_);
        onChanged();
      } else {
        interfaceBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * list of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
     */
    public Builder clearInterface() {
      if (interfaceBuilder_ == null) {
        interface_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        interfaceBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * list of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
     */
    public Builder removeInterface(int index) {
      if (interfaceBuilder_ == null) {
        ensureInterfaceIsMutable();
        interface_.remove(index);
        onChanged();
      } else {
        interfaceBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * list of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.Interface.Builder getInterfaceBuilder(
        int index) {
      return getInterfaceFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * list of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.InterfaceOrBuilder getInterfaceOrBuilder(
        int index) {
      if (interfaceBuilder_ == null) {
        return interface_.get(index);  } else {
        return interfaceBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * list of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
     */
    public java.util.List<? extends opi_api.network.cloud.v1alpha1.InterfaceOrBuilder> 
         getInterfaceOrBuilderList() {
      if (interfaceBuilder_ != null) {
        return interfaceBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(interface_);
      }
    }
    /**
     * <pre>
     * list of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.Interface.Builder addInterfaceBuilder() {
      return getInterfaceFieldBuilder().addBuilder(
          opi_api.network.cloud.v1alpha1.Interface.getDefaultInstance());
    }
    /**
     * <pre>
     * list of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.Interface.Builder addInterfaceBuilder(
        int index) {
      return getInterfaceFieldBuilder().addBuilder(
          index, opi_api.network.cloud.v1alpha1.Interface.getDefaultInstance());
    }
    /**
     * <pre>
     * list of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Interface interface = 1;</code>
     */
    public java.util.List<opi_api.network.cloud.v1alpha1.Interface.Builder> 
         getInterfaceBuilderList() {
      return getInterfaceFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.Interface, opi_api.network.cloud.v1alpha1.Interface.Builder, opi_api.network.cloud.v1alpha1.InterfaceOrBuilder> 
        getInterfaceFieldBuilder() {
      if (interfaceBuilder_ == null) {
        interfaceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.Interface, opi_api.network.cloud.v1alpha1.Interface.Builder, opi_api.network.cloud.v1alpha1.InterfaceOrBuilder>(
                interface_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        interface_ = null;
      }
      return interfaceBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * next page token
     * </pre>
     *
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
     * <pre>
     * next page token
     * </pre>
     *
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
     * <pre>
     * next page token
     * </pre>
     *
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
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.ListInterfacesResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.ListInterfacesResponse)
  private static final opi_api.network.cloud.v1alpha1.ListInterfacesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.ListInterfacesResponse();
  }

  public static opi_api.network.cloud.v1alpha1.ListInterfacesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListInterfacesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListInterfacesResponse>() {
    @java.lang.Override
    public ListInterfacesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListInterfacesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListInterfacesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListInterfacesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.ListInterfacesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

