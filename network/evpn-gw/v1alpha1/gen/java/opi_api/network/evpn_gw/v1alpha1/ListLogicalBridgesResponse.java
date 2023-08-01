// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l2_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

/**
 * <pre>
 * ListLogicalBridgesResponse structure
 * </pre>
 *
 * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse}
 */
public final class ListLogicalBridgesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse)
    ListLogicalBridgesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListLogicalBridgesResponse.newBuilder() to construct.
  private ListLogicalBridgesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListLogicalBridgesResponse() {
    logicalBridges_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListLogicalBridgesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListLogicalBridgesResponse(
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
              logicalBridges_ = new java.util.ArrayList<opi_api.network.evpn_gw.v1alpha1.LogicalBridge>();
              mutable_bitField0_ |= 0x00000001;
            }
            logicalBridges_.add(
                input.readMessage(opi_api.network.evpn_gw.v1alpha1.LogicalBridge.parser(), extensionRegistry));
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
        logicalBridges_ = java.util.Collections.unmodifiableList(logicalBridges_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_ListLogicalBridgesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_ListLogicalBridgesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse.class, opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse.Builder.class);
  }

  public static final int LOGICAL_BRIDGES_FIELD_NUMBER = 1;
  private java.util.List<opi_api.network.evpn_gw.v1alpha1.LogicalBridge> logicalBridges_;
  /**
   * <pre>
   * List of all the logical bridges
   * </pre>
   *
   * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.network.evpn_gw.v1alpha1.LogicalBridge> getLogicalBridgesList() {
    return logicalBridges_;
  }
  /**
   * <pre>
   * List of all the logical bridges
   * </pre>
   *
   * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.network.evpn_gw.v1alpha1.LogicalBridgeOrBuilder> 
      getLogicalBridgesOrBuilderList() {
    return logicalBridges_;
  }
  /**
   * <pre>
   * List of all the logical bridges
   * </pre>
   *
   * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
   */
  @java.lang.Override
  public int getLogicalBridgesCount() {
    return logicalBridges_.size();
  }
  /**
   * <pre>
   * List of all the logical bridges
   * </pre>
   *
   * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.LogicalBridge getLogicalBridges(int index) {
    return logicalBridges_.get(index);
  }
  /**
   * <pre>
   * List of all the logical bridges
   * </pre>
   *
   * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.LogicalBridgeOrBuilder getLogicalBridgesOrBuilder(
      int index) {
    return logicalBridges_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * Next page token of list response
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
   * Next page token of list response
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
    for (int i = 0; i < logicalBridges_.size(); i++) {
      output.writeMessage(1, logicalBridges_.get(i));
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
    for (int i = 0; i < logicalBridges_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, logicalBridges_.get(i));
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
    if (!(obj instanceof opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse)) {
      return super.equals(obj);
    }
    opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse other = (opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse) obj;

    if (!getLogicalBridgesList()
        .equals(other.getLogicalBridgesList())) return false;
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
    if (getLogicalBridgesCount() > 0) {
      hash = (37 * hash) + LOGICAL_BRIDGES_FIELD_NUMBER;
      hash = (53 * hash) + getLogicalBridgesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse parseFrom(
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
  public static Builder newBuilder(opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse prototype) {
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
   * ListLogicalBridgesResponse structure
   * </pre>
   *
   * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse)
      opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_ListLogicalBridgesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_ListLogicalBridgesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse.class, opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse.Builder.class);
    }

    // Construct using opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse.newBuilder()
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
        getLogicalBridgesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (logicalBridgesBuilder_ == null) {
        logicalBridges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        logicalBridgesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_ListLogicalBridgesResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse getDefaultInstanceForType() {
      return opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse build() {
      opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse buildPartial() {
      opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse result = new opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse(this);
      int from_bitField0_ = bitField0_;
      if (logicalBridgesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          logicalBridges_ = java.util.Collections.unmodifiableList(logicalBridges_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.logicalBridges_ = logicalBridges_;
      } else {
        result.logicalBridges_ = logicalBridgesBuilder_.build();
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
      if (other instanceof opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse) {
        return mergeFrom((opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse other) {
      if (other == opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse.getDefaultInstance()) return this;
      if (logicalBridgesBuilder_ == null) {
        if (!other.logicalBridges_.isEmpty()) {
          if (logicalBridges_.isEmpty()) {
            logicalBridges_ = other.logicalBridges_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLogicalBridgesIsMutable();
            logicalBridges_.addAll(other.logicalBridges_);
          }
          onChanged();
        }
      } else {
        if (!other.logicalBridges_.isEmpty()) {
          if (logicalBridgesBuilder_.isEmpty()) {
            logicalBridgesBuilder_.dispose();
            logicalBridgesBuilder_ = null;
            logicalBridges_ = other.logicalBridges_;
            bitField0_ = (bitField0_ & ~0x00000001);
            logicalBridgesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLogicalBridgesFieldBuilder() : null;
          } else {
            logicalBridgesBuilder_.addAllMessages(other.logicalBridges_);
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
      opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.network.evpn_gw.v1alpha1.LogicalBridge> logicalBridges_ =
      java.util.Collections.emptyList();
    private void ensureLogicalBridgesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        logicalBridges_ = new java.util.ArrayList<opi_api.network.evpn_gw.v1alpha1.LogicalBridge>(logicalBridges_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.evpn_gw.v1alpha1.LogicalBridge, opi_api.network.evpn_gw.v1alpha1.LogicalBridge.Builder, opi_api.network.evpn_gw.v1alpha1.LogicalBridgeOrBuilder> logicalBridgesBuilder_;

    /**
     * <pre>
     * List of all the logical bridges
     * </pre>
     *
     * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
     */
    public java.util.List<opi_api.network.evpn_gw.v1alpha1.LogicalBridge> getLogicalBridgesList() {
      if (logicalBridgesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(logicalBridges_);
      } else {
        return logicalBridgesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of all the logical bridges
     * </pre>
     *
     * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
     */
    public int getLogicalBridgesCount() {
      if (logicalBridgesBuilder_ == null) {
        return logicalBridges_.size();
      } else {
        return logicalBridgesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of all the logical bridges
     * </pre>
     *
     * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
     */
    public opi_api.network.evpn_gw.v1alpha1.LogicalBridge getLogicalBridges(int index) {
      if (logicalBridgesBuilder_ == null) {
        return logicalBridges_.get(index);
      } else {
        return logicalBridgesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of all the logical bridges
     * </pre>
     *
     * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
     */
    public Builder setLogicalBridges(
        int index, opi_api.network.evpn_gw.v1alpha1.LogicalBridge value) {
      if (logicalBridgesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLogicalBridgesIsMutable();
        logicalBridges_.set(index, value);
        onChanged();
      } else {
        logicalBridgesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of all the logical bridges
     * </pre>
     *
     * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
     */
    public Builder setLogicalBridges(
        int index, opi_api.network.evpn_gw.v1alpha1.LogicalBridge.Builder builderForValue) {
      if (logicalBridgesBuilder_ == null) {
        ensureLogicalBridgesIsMutable();
        logicalBridges_.set(index, builderForValue.build());
        onChanged();
      } else {
        logicalBridgesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of all the logical bridges
     * </pre>
     *
     * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
     */
    public Builder addLogicalBridges(opi_api.network.evpn_gw.v1alpha1.LogicalBridge value) {
      if (logicalBridgesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLogicalBridgesIsMutable();
        logicalBridges_.add(value);
        onChanged();
      } else {
        logicalBridgesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of all the logical bridges
     * </pre>
     *
     * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
     */
    public Builder addLogicalBridges(
        int index, opi_api.network.evpn_gw.v1alpha1.LogicalBridge value) {
      if (logicalBridgesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLogicalBridgesIsMutable();
        logicalBridges_.add(index, value);
        onChanged();
      } else {
        logicalBridgesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of all the logical bridges
     * </pre>
     *
     * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
     */
    public Builder addLogicalBridges(
        opi_api.network.evpn_gw.v1alpha1.LogicalBridge.Builder builderForValue) {
      if (logicalBridgesBuilder_ == null) {
        ensureLogicalBridgesIsMutable();
        logicalBridges_.add(builderForValue.build());
        onChanged();
      } else {
        logicalBridgesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of all the logical bridges
     * </pre>
     *
     * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
     */
    public Builder addLogicalBridges(
        int index, opi_api.network.evpn_gw.v1alpha1.LogicalBridge.Builder builderForValue) {
      if (logicalBridgesBuilder_ == null) {
        ensureLogicalBridgesIsMutable();
        logicalBridges_.add(index, builderForValue.build());
        onChanged();
      } else {
        logicalBridgesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of all the logical bridges
     * </pre>
     *
     * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
     */
    public Builder addAllLogicalBridges(
        java.lang.Iterable<? extends opi_api.network.evpn_gw.v1alpha1.LogicalBridge> values) {
      if (logicalBridgesBuilder_ == null) {
        ensureLogicalBridgesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, logicalBridges_);
        onChanged();
      } else {
        logicalBridgesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of all the logical bridges
     * </pre>
     *
     * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
     */
    public Builder clearLogicalBridges() {
      if (logicalBridgesBuilder_ == null) {
        logicalBridges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        logicalBridgesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of all the logical bridges
     * </pre>
     *
     * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
     */
    public Builder removeLogicalBridges(int index) {
      if (logicalBridgesBuilder_ == null) {
        ensureLogicalBridgesIsMutable();
        logicalBridges_.remove(index);
        onChanged();
      } else {
        logicalBridgesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of all the logical bridges
     * </pre>
     *
     * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
     */
    public opi_api.network.evpn_gw.v1alpha1.LogicalBridge.Builder getLogicalBridgesBuilder(
        int index) {
      return getLogicalBridgesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of all the logical bridges
     * </pre>
     *
     * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
     */
    public opi_api.network.evpn_gw.v1alpha1.LogicalBridgeOrBuilder getLogicalBridgesOrBuilder(
        int index) {
      if (logicalBridgesBuilder_ == null) {
        return logicalBridges_.get(index);  } else {
        return logicalBridgesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of all the logical bridges
     * </pre>
     *
     * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
     */
    public java.util.List<? extends opi_api.network.evpn_gw.v1alpha1.LogicalBridgeOrBuilder> 
         getLogicalBridgesOrBuilderList() {
      if (logicalBridgesBuilder_ != null) {
        return logicalBridgesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(logicalBridges_);
      }
    }
    /**
     * <pre>
     * List of all the logical bridges
     * </pre>
     *
     * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
     */
    public opi_api.network.evpn_gw.v1alpha1.LogicalBridge.Builder addLogicalBridgesBuilder() {
      return getLogicalBridgesFieldBuilder().addBuilder(
          opi_api.network.evpn_gw.v1alpha1.LogicalBridge.getDefaultInstance());
    }
    /**
     * <pre>
     * List of all the logical bridges
     * </pre>
     *
     * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
     */
    public opi_api.network.evpn_gw.v1alpha1.LogicalBridge.Builder addLogicalBridgesBuilder(
        int index) {
      return getLogicalBridgesFieldBuilder().addBuilder(
          index, opi_api.network.evpn_gw.v1alpha1.LogicalBridge.getDefaultInstance());
    }
    /**
     * <pre>
     * List of all the logical bridges
     * </pre>
     *
     * <code>repeated .opi_api.network.evpn_gw.v1alpha1.LogicalBridge logical_bridges = 1;</code>
     */
    public java.util.List<opi_api.network.evpn_gw.v1alpha1.LogicalBridge.Builder> 
         getLogicalBridgesBuilderList() {
      return getLogicalBridgesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.evpn_gw.v1alpha1.LogicalBridge, opi_api.network.evpn_gw.v1alpha1.LogicalBridge.Builder, opi_api.network.evpn_gw.v1alpha1.LogicalBridgeOrBuilder> 
        getLogicalBridgesFieldBuilder() {
      if (logicalBridgesBuilder_ == null) {
        logicalBridgesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.network.evpn_gw.v1alpha1.LogicalBridge, opi_api.network.evpn_gw.v1alpha1.LogicalBridge.Builder, opi_api.network.evpn_gw.v1alpha1.LogicalBridgeOrBuilder>(
                logicalBridges_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        logicalBridges_ = null;
      }
      return logicalBridgesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Next page token of list response
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
     * Next page token of list response
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
     * Next page token of list response
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
     * Next page token of list response
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
     * Next page token of list response
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse)
  private static final opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse();
  }

  public static opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListLogicalBridgesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListLogicalBridgesResponse>() {
    @java.lang.Override
    public ListLogicalBridgesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListLogicalBridgesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListLogicalBridgesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListLogicalBridgesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
