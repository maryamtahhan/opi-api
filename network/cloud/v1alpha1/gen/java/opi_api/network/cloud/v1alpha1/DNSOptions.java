// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networkpolicy.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * DNS ALG specific options
 * these options are applicable to DNS request messages only
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.DNSOptions}
 */
public final class DNSOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.DNSOptions)
    DNSOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DNSOptions.newBuilder() to construct.
  private DNSOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DNSOptions() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DNSOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DNSOptions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            dropMultiQueryMessages_ = input.readBool();
            break;
          }
          case 16: {

            dropLargeDomainNameMessages_ = input.readBool();
            break;
          }
          case 24: {

            dropLongLabelMessages_ = input.readBool();
            break;
          }
          case 32: {

            dropMultiZoneMessages_ = input.readBool();
            break;
          }
          case 40: {

            responseTimeout_ = input.readInt32();
            break;
          }
          case 48: {

            maxMessageLength_ = input.readInt32();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.network.cloud.v1alpha1.NetworkPolicyProto.internal_static_opi_api_network_cloud_v1alpha1_DNSOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.NetworkPolicyProto.internal_static_opi_api_network_cloud_v1alpha1_DNSOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.DNSOptions.class, opi_api.network.cloud.v1alpha1.DNSOptions.Builder.class);
  }

  public static final int DROP_MULTI_QUERY_MESSAGES_FIELD_NUMBER = 1;
  private boolean dropMultiQueryMessages_;
  /**
   * <pre>
   *  when DropMultiQueryMessage is set, drop DNS query messages that contain
   *  more than one DNS query in same packet
   * </pre>
   *
   * <code>bool drop_multi_query_messages = 1;</code>
   * @return The dropMultiQueryMessages.
   */
  @java.lang.Override
  public boolean getDropMultiQueryMessages() {
    return dropMultiQueryMessages_;
  }

  public static final int DROP_LARGE_DOMAIN_NAME_MESSAGES_FIELD_NUMBER = 2;
  private boolean dropLargeDomainNameMessages_;
  /**
   * <pre>
   * when DropLargeDomainNameMessage is set, DNS mwessages containing domain
   * name exceeding 255 bytes are dropped
   * </pre>
   *
   * <code>bool drop_large_domain_name_messages = 2;</code>
   * @return The dropLargeDomainNameMessages.
   */
  @java.lang.Override
  public boolean getDropLargeDomainNameMessages() {
    return dropLargeDomainNameMessages_;
  }

  public static final int DROP_LONG_LABEL_MESSAGES_FIELD_NUMBER = 3;
  private boolean dropLongLabelMessages_;
  /**
   * <pre>
   * when DropLongLabelMessage is set, DNS messages containing labels
   * exceeding 63 bytes are dropped
   * </pre>
   *
   * <code>bool drop_long_label_messages = 3;</code>
   * @return The dropLongLabelMessages.
   */
  @java.lang.Override
  public boolean getDropLongLabelMessages() {
    return dropLongLabelMessages_;
  }

  public static final int DROP_MULTI_ZONE_MESSAGES_FIELD_NUMBER = 4;
  private boolean dropMultiZoneMessages_;
  /**
   * <pre>
   * when DropMultiZoneMessagesis set, DNS messages containing more than one
   * zone are dropped
   * </pre>
   *
   * <code>bool drop_multi_zone_messages = 4;</code>
   * @return The dropMultiZoneMessages.
   */
  @java.lang.Override
  public boolean getDropMultiZoneMessages() {
    return dropMultiZoneMessages_;
  }

  public static final int RESPONSE_TIMEOUT_FIELD_NUMBER = 5;
  private int responseTimeout_;
  /**
   * <pre>
   * DNS session will be closed if response is not seen for a DNS query within
   * ResponseTimeout seconds, default 60
   * </pre>
   *
   * <code>int32 response_timeout = 5;</code>
   * @return The responseTimeout.
   */
  @java.lang.Override
  public int getResponseTimeout() {
    return responseTimeout_;
  }

  public static final int MAX_MESSAGE_LENGTH_FIELD_NUMBER = 6;
  private int maxMessageLength_;
  /**
   * <pre>
   * MaxMessageLength defines the maximum length of the DNS query/response
   * message the ALG will handle range:512-8192,default=512
   * </pre>
   *
   * <code>int32 max_message_length = 6;</code>
   * @return The maxMessageLength.
   */
  @java.lang.Override
  public int getMaxMessageLength() {
    return maxMessageLength_;
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
    if (dropMultiQueryMessages_ != false) {
      output.writeBool(1, dropMultiQueryMessages_);
    }
    if (dropLargeDomainNameMessages_ != false) {
      output.writeBool(2, dropLargeDomainNameMessages_);
    }
    if (dropLongLabelMessages_ != false) {
      output.writeBool(3, dropLongLabelMessages_);
    }
    if (dropMultiZoneMessages_ != false) {
      output.writeBool(4, dropMultiZoneMessages_);
    }
    if (responseTimeout_ != 0) {
      output.writeInt32(5, responseTimeout_);
    }
    if (maxMessageLength_ != 0) {
      output.writeInt32(6, maxMessageLength_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dropMultiQueryMessages_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, dropMultiQueryMessages_);
    }
    if (dropLargeDomainNameMessages_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, dropLargeDomainNameMessages_);
    }
    if (dropLongLabelMessages_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, dropLongLabelMessages_);
    }
    if (dropMultiZoneMessages_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, dropMultiZoneMessages_);
    }
    if (responseTimeout_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, responseTimeout_);
    }
    if (maxMessageLength_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, maxMessageLength_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.DNSOptions)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.DNSOptions other = (opi_api.network.cloud.v1alpha1.DNSOptions) obj;

    if (getDropMultiQueryMessages()
        != other.getDropMultiQueryMessages()) return false;
    if (getDropLargeDomainNameMessages()
        != other.getDropLargeDomainNameMessages()) return false;
    if (getDropLongLabelMessages()
        != other.getDropLongLabelMessages()) return false;
    if (getDropMultiZoneMessages()
        != other.getDropMultiZoneMessages()) return false;
    if (getResponseTimeout()
        != other.getResponseTimeout()) return false;
    if (getMaxMessageLength()
        != other.getMaxMessageLength()) return false;
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
    hash = (37 * hash) + DROP_MULTI_QUERY_MESSAGES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDropMultiQueryMessages());
    hash = (37 * hash) + DROP_LARGE_DOMAIN_NAME_MESSAGES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDropLargeDomainNameMessages());
    hash = (37 * hash) + DROP_LONG_LABEL_MESSAGES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDropLongLabelMessages());
    hash = (37 * hash) + DROP_MULTI_ZONE_MESSAGES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDropMultiZoneMessages());
    hash = (37 * hash) + RESPONSE_TIMEOUT_FIELD_NUMBER;
    hash = (53 * hash) + getResponseTimeout();
    hash = (37 * hash) + MAX_MESSAGE_LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + getMaxMessageLength();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.DNSOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.DNSOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.DNSOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.DNSOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.DNSOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.DNSOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.DNSOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.DNSOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.DNSOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.DNSOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.DNSOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.DNSOptions parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.DNSOptions prototype) {
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
   * DNS ALG specific options
   * these options are applicable to DNS request messages only
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.DNSOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.DNSOptions)
      opi_api.network.cloud.v1alpha1.DNSOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.NetworkPolicyProto.internal_static_opi_api_network_cloud_v1alpha1_DNSOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.NetworkPolicyProto.internal_static_opi_api_network_cloud_v1alpha1_DNSOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.DNSOptions.class, opi_api.network.cloud.v1alpha1.DNSOptions.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.DNSOptions.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      dropMultiQueryMessages_ = false;

      dropLargeDomainNameMessages_ = false;

      dropLongLabelMessages_ = false;

      dropMultiZoneMessages_ = false;

      responseTimeout_ = 0;

      maxMessageLength_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.NetworkPolicyProto.internal_static_opi_api_network_cloud_v1alpha1_DNSOptions_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.DNSOptions getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.DNSOptions.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.DNSOptions build() {
      opi_api.network.cloud.v1alpha1.DNSOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.DNSOptions buildPartial() {
      opi_api.network.cloud.v1alpha1.DNSOptions result = new opi_api.network.cloud.v1alpha1.DNSOptions(this);
      result.dropMultiQueryMessages_ = dropMultiQueryMessages_;
      result.dropLargeDomainNameMessages_ = dropLargeDomainNameMessages_;
      result.dropLongLabelMessages_ = dropLongLabelMessages_;
      result.dropMultiZoneMessages_ = dropMultiZoneMessages_;
      result.responseTimeout_ = responseTimeout_;
      result.maxMessageLength_ = maxMessageLength_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.DNSOptions) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.DNSOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.DNSOptions other) {
      if (other == opi_api.network.cloud.v1alpha1.DNSOptions.getDefaultInstance()) return this;
      if (other.getDropMultiQueryMessages() != false) {
        setDropMultiQueryMessages(other.getDropMultiQueryMessages());
      }
      if (other.getDropLargeDomainNameMessages() != false) {
        setDropLargeDomainNameMessages(other.getDropLargeDomainNameMessages());
      }
      if (other.getDropLongLabelMessages() != false) {
        setDropLongLabelMessages(other.getDropLongLabelMessages());
      }
      if (other.getDropMultiZoneMessages() != false) {
        setDropMultiZoneMessages(other.getDropMultiZoneMessages());
      }
      if (other.getResponseTimeout() != 0) {
        setResponseTimeout(other.getResponseTimeout());
      }
      if (other.getMaxMessageLength() != 0) {
        setMaxMessageLength(other.getMaxMessageLength());
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
      opi_api.network.cloud.v1alpha1.DNSOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.DNSOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean dropMultiQueryMessages_ ;
    /**
     * <pre>
     *  when DropMultiQueryMessage is set, drop DNS query messages that contain
     *  more than one DNS query in same packet
     * </pre>
     *
     * <code>bool drop_multi_query_messages = 1;</code>
     * @return The dropMultiQueryMessages.
     */
    @java.lang.Override
    public boolean getDropMultiQueryMessages() {
      return dropMultiQueryMessages_;
    }
    /**
     * <pre>
     *  when DropMultiQueryMessage is set, drop DNS query messages that contain
     *  more than one DNS query in same packet
     * </pre>
     *
     * <code>bool drop_multi_query_messages = 1;</code>
     * @param value The dropMultiQueryMessages to set.
     * @return This builder for chaining.
     */
    public Builder setDropMultiQueryMessages(boolean value) {
      
      dropMultiQueryMessages_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *  when DropMultiQueryMessage is set, drop DNS query messages that contain
     *  more than one DNS query in same packet
     * </pre>
     *
     * <code>bool drop_multi_query_messages = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDropMultiQueryMessages() {
      
      dropMultiQueryMessages_ = false;
      onChanged();
      return this;
    }

    private boolean dropLargeDomainNameMessages_ ;
    /**
     * <pre>
     * when DropLargeDomainNameMessage is set, DNS mwessages containing domain
     * name exceeding 255 bytes are dropped
     * </pre>
     *
     * <code>bool drop_large_domain_name_messages = 2;</code>
     * @return The dropLargeDomainNameMessages.
     */
    @java.lang.Override
    public boolean getDropLargeDomainNameMessages() {
      return dropLargeDomainNameMessages_;
    }
    /**
     * <pre>
     * when DropLargeDomainNameMessage is set, DNS mwessages containing domain
     * name exceeding 255 bytes are dropped
     * </pre>
     *
     * <code>bool drop_large_domain_name_messages = 2;</code>
     * @param value The dropLargeDomainNameMessages to set.
     * @return This builder for chaining.
     */
    public Builder setDropLargeDomainNameMessages(boolean value) {
      
      dropLargeDomainNameMessages_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * when DropLargeDomainNameMessage is set, DNS mwessages containing domain
     * name exceeding 255 bytes are dropped
     * </pre>
     *
     * <code>bool drop_large_domain_name_messages = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDropLargeDomainNameMessages() {
      
      dropLargeDomainNameMessages_ = false;
      onChanged();
      return this;
    }

    private boolean dropLongLabelMessages_ ;
    /**
     * <pre>
     * when DropLongLabelMessage is set, DNS messages containing labels
     * exceeding 63 bytes are dropped
     * </pre>
     *
     * <code>bool drop_long_label_messages = 3;</code>
     * @return The dropLongLabelMessages.
     */
    @java.lang.Override
    public boolean getDropLongLabelMessages() {
      return dropLongLabelMessages_;
    }
    /**
     * <pre>
     * when DropLongLabelMessage is set, DNS messages containing labels
     * exceeding 63 bytes are dropped
     * </pre>
     *
     * <code>bool drop_long_label_messages = 3;</code>
     * @param value The dropLongLabelMessages to set.
     * @return This builder for chaining.
     */
    public Builder setDropLongLabelMessages(boolean value) {
      
      dropLongLabelMessages_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * when DropLongLabelMessage is set, DNS messages containing labels
     * exceeding 63 bytes are dropped
     * </pre>
     *
     * <code>bool drop_long_label_messages = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDropLongLabelMessages() {
      
      dropLongLabelMessages_ = false;
      onChanged();
      return this;
    }

    private boolean dropMultiZoneMessages_ ;
    /**
     * <pre>
     * when DropMultiZoneMessagesis set, DNS messages containing more than one
     * zone are dropped
     * </pre>
     *
     * <code>bool drop_multi_zone_messages = 4;</code>
     * @return The dropMultiZoneMessages.
     */
    @java.lang.Override
    public boolean getDropMultiZoneMessages() {
      return dropMultiZoneMessages_;
    }
    /**
     * <pre>
     * when DropMultiZoneMessagesis set, DNS messages containing more than one
     * zone are dropped
     * </pre>
     *
     * <code>bool drop_multi_zone_messages = 4;</code>
     * @param value The dropMultiZoneMessages to set.
     * @return This builder for chaining.
     */
    public Builder setDropMultiZoneMessages(boolean value) {
      
      dropMultiZoneMessages_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * when DropMultiZoneMessagesis set, DNS messages containing more than one
     * zone are dropped
     * </pre>
     *
     * <code>bool drop_multi_zone_messages = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDropMultiZoneMessages() {
      
      dropMultiZoneMessages_ = false;
      onChanged();
      return this;
    }

    private int responseTimeout_ ;
    /**
     * <pre>
     * DNS session will be closed if response is not seen for a DNS query within
     * ResponseTimeout seconds, default 60
     * </pre>
     *
     * <code>int32 response_timeout = 5;</code>
     * @return The responseTimeout.
     */
    @java.lang.Override
    public int getResponseTimeout() {
      return responseTimeout_;
    }
    /**
     * <pre>
     * DNS session will be closed if response is not seen for a DNS query within
     * ResponseTimeout seconds, default 60
     * </pre>
     *
     * <code>int32 response_timeout = 5;</code>
     * @param value The responseTimeout to set.
     * @return This builder for chaining.
     */
    public Builder setResponseTimeout(int value) {
      
      responseTimeout_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DNS session will be closed if response is not seen for a DNS query within
     * ResponseTimeout seconds, default 60
     * </pre>
     *
     * <code>int32 response_timeout = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearResponseTimeout() {
      
      responseTimeout_ = 0;
      onChanged();
      return this;
    }

    private int maxMessageLength_ ;
    /**
     * <pre>
     * MaxMessageLength defines the maximum length of the DNS query/response
     * message the ALG will handle range:512-8192,default=512
     * </pre>
     *
     * <code>int32 max_message_length = 6;</code>
     * @return The maxMessageLength.
     */
    @java.lang.Override
    public int getMaxMessageLength() {
      return maxMessageLength_;
    }
    /**
     * <pre>
     * MaxMessageLength defines the maximum length of the DNS query/response
     * message the ALG will handle range:512-8192,default=512
     * </pre>
     *
     * <code>int32 max_message_length = 6;</code>
     * @param value The maxMessageLength to set.
     * @return This builder for chaining.
     */
    public Builder setMaxMessageLength(int value) {
      
      maxMessageLength_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MaxMessageLength defines the maximum length of the DNS query/response
     * message the ALG will handle range:512-8192,default=512
     * </pre>
     *
     * <code>int32 max_message_length = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxMessageLength() {
      
      maxMessageLength_ = 0;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.DNSOptions)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.DNSOptions)
  private static final opi_api.network.cloud.v1alpha1.DNSOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.DNSOptions();
  }

  public static opi_api.network.cloud.v1alpha1.DNSOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DNSOptions>
      PARSER = new com.google.protobuf.AbstractParser<DNSOptions>() {
    @java.lang.Override
    public DNSOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DNSOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DNSOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DNSOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.DNSOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
