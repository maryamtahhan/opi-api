// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_null.proto

package opi_api.storage.v1;

/**
 * <pre>
 * Represents a response to list all Null Volumes.
 * </pre>
 *
 * Protobuf type {@code opi_api.storage.v1.ListNullVolumesResponse}
 */
public final class ListNullVolumesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.ListNullVolumesResponse)
    ListNullVolumesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListNullVolumesResponse.newBuilder() to construct.
  private ListNullVolumesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListNullVolumesResponse() {
    nullVolumes_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListNullVolumesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListNullVolumesResponse(
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
              nullVolumes_ = new java.util.ArrayList<opi_api.storage.v1.NullVolume>();
              mutable_bitField0_ |= 0x00000001;
            }
            nullVolumes_.add(
                input.readMessage(opi_api.storage.v1.NullVolume.parser(), extensionRegistry));
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
        nullVolumes_ = java.util.Collections.unmodifiableList(nullVolumes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.BackendNullProto.internal_static_opi_api_storage_v1_ListNullVolumesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.BackendNullProto.internal_static_opi_api_storage_v1_ListNullVolumesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.ListNullVolumesResponse.class, opi_api.storage.v1.ListNullVolumesResponse.Builder.class);
  }

  public static final int NULL_VOLUMES_FIELD_NUMBER = 1;
  private java.util.List<opi_api.storage.v1.NullVolume> nullVolumes_;
  /**
   * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.storage.v1.NullVolume> getNullVolumesList() {
    return nullVolumes_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.storage.v1.NullVolumeOrBuilder> 
      getNullVolumesOrBuilderList() {
    return nullVolumes_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
   */
  @java.lang.Override
  public int getNullVolumesCount() {
    return nullVolumes_.size();
  }
  /**
   * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NullVolume getNullVolumes(int index) {
    return nullVolumes_.get(index);
  }
  /**
   * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NullVolumeOrBuilder getNullVolumesOrBuilder(
      int index) {
    return nullVolumes_.get(index);
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
    for (int i = 0; i < nullVolumes_.size(); i++) {
      output.writeMessage(1, nullVolumes_.get(i));
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
    for (int i = 0; i < nullVolumes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, nullVolumes_.get(i));
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
    if (!(obj instanceof opi_api.storage.v1.ListNullVolumesResponse)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.ListNullVolumesResponse other = (opi_api.storage.v1.ListNullVolumesResponse) obj;

    if (!getNullVolumesList()
        .equals(other.getNullVolumesList())) return false;
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
    if (getNullVolumesCount() > 0) {
      hash = (37 * hash) + NULL_VOLUMES_FIELD_NUMBER;
      hash = (53 * hash) + getNullVolumesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.ListNullVolumesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNullVolumesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNullVolumesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNullVolumesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNullVolumesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNullVolumesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNullVolumesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNullVolumesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNullVolumesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNullVolumesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNullVolumesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNullVolumesResponse parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.ListNullVolumesResponse prototype) {
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
   * Represents a response to list all Null Volumes.
   * </pre>
   *
   * Protobuf type {@code opi_api.storage.v1.ListNullVolumesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.ListNullVolumesResponse)
      opi_api.storage.v1.ListNullVolumesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.BackendNullProto.internal_static_opi_api_storage_v1_ListNullVolumesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.BackendNullProto.internal_static_opi_api_storage_v1_ListNullVolumesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.ListNullVolumesResponse.class, opi_api.storage.v1.ListNullVolumesResponse.Builder.class);
    }

    // Construct using opi_api.storage.v1.ListNullVolumesResponse.newBuilder()
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
        getNullVolumesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (nullVolumesBuilder_ == null) {
        nullVolumes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        nullVolumesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.BackendNullProto.internal_static_opi_api_storage_v1_ListNullVolumesResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNullVolumesResponse getDefaultInstanceForType() {
      return opi_api.storage.v1.ListNullVolumesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNullVolumesResponse build() {
      opi_api.storage.v1.ListNullVolumesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNullVolumesResponse buildPartial() {
      opi_api.storage.v1.ListNullVolumesResponse result = new opi_api.storage.v1.ListNullVolumesResponse(this);
      int from_bitField0_ = bitField0_;
      if (nullVolumesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          nullVolumes_ = java.util.Collections.unmodifiableList(nullVolumes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nullVolumes_ = nullVolumes_;
      } else {
        result.nullVolumes_ = nullVolumesBuilder_.build();
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
      if (other instanceof opi_api.storage.v1.ListNullVolumesResponse) {
        return mergeFrom((opi_api.storage.v1.ListNullVolumesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.ListNullVolumesResponse other) {
      if (other == opi_api.storage.v1.ListNullVolumesResponse.getDefaultInstance()) return this;
      if (nullVolumesBuilder_ == null) {
        if (!other.nullVolumes_.isEmpty()) {
          if (nullVolumes_.isEmpty()) {
            nullVolumes_ = other.nullVolumes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNullVolumesIsMutable();
            nullVolumes_.addAll(other.nullVolumes_);
          }
          onChanged();
        }
      } else {
        if (!other.nullVolumes_.isEmpty()) {
          if (nullVolumesBuilder_.isEmpty()) {
            nullVolumesBuilder_.dispose();
            nullVolumesBuilder_ = null;
            nullVolumes_ = other.nullVolumes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nullVolumesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNullVolumesFieldBuilder() : null;
          } else {
            nullVolumesBuilder_.addAllMessages(other.nullVolumes_);
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
      opi_api.storage.v1.ListNullVolumesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.ListNullVolumesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.storage.v1.NullVolume> nullVolumes_ =
      java.util.Collections.emptyList();
    private void ensureNullVolumesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nullVolumes_ = new java.util.ArrayList<opi_api.storage.v1.NullVolume>(nullVolumes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.NullVolume, opi_api.storage.v1.NullVolume.Builder, opi_api.storage.v1.NullVolumeOrBuilder> nullVolumesBuilder_;

    /**
     * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.NullVolume> getNullVolumesList() {
      if (nullVolumesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nullVolumes_);
      } else {
        return nullVolumesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
     */
    public int getNullVolumesCount() {
      if (nullVolumesBuilder_ == null) {
        return nullVolumes_.size();
      } else {
        return nullVolumesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
     */
    public opi_api.storage.v1.NullVolume getNullVolumes(int index) {
      if (nullVolumesBuilder_ == null) {
        return nullVolumes_.get(index);
      } else {
        return nullVolumesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
     */
    public Builder setNullVolumes(
        int index, opi_api.storage.v1.NullVolume value) {
      if (nullVolumesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNullVolumesIsMutable();
        nullVolumes_.set(index, value);
        onChanged();
      } else {
        nullVolumesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
     */
    public Builder setNullVolumes(
        int index, opi_api.storage.v1.NullVolume.Builder builderForValue) {
      if (nullVolumesBuilder_ == null) {
        ensureNullVolumesIsMutable();
        nullVolumes_.set(index, builderForValue.build());
        onChanged();
      } else {
        nullVolumesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
     */
    public Builder addNullVolumes(opi_api.storage.v1.NullVolume value) {
      if (nullVolumesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNullVolumesIsMutable();
        nullVolumes_.add(value);
        onChanged();
      } else {
        nullVolumesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
     */
    public Builder addNullVolumes(
        int index, opi_api.storage.v1.NullVolume value) {
      if (nullVolumesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNullVolumesIsMutable();
        nullVolumes_.add(index, value);
        onChanged();
      } else {
        nullVolumesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
     */
    public Builder addNullVolumes(
        opi_api.storage.v1.NullVolume.Builder builderForValue) {
      if (nullVolumesBuilder_ == null) {
        ensureNullVolumesIsMutable();
        nullVolumes_.add(builderForValue.build());
        onChanged();
      } else {
        nullVolumesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
     */
    public Builder addNullVolumes(
        int index, opi_api.storage.v1.NullVolume.Builder builderForValue) {
      if (nullVolumesBuilder_ == null) {
        ensureNullVolumesIsMutable();
        nullVolumes_.add(index, builderForValue.build());
        onChanged();
      } else {
        nullVolumesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
     */
    public Builder addAllNullVolumes(
        java.lang.Iterable<? extends opi_api.storage.v1.NullVolume> values) {
      if (nullVolumesBuilder_ == null) {
        ensureNullVolumesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nullVolumes_);
        onChanged();
      } else {
        nullVolumesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
     */
    public Builder clearNullVolumes() {
      if (nullVolumesBuilder_ == null) {
        nullVolumes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nullVolumesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
     */
    public Builder removeNullVolumes(int index) {
      if (nullVolumesBuilder_ == null) {
        ensureNullVolumesIsMutable();
        nullVolumes_.remove(index);
        onChanged();
      } else {
        nullVolumesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
     */
    public opi_api.storage.v1.NullVolume.Builder getNullVolumesBuilder(
        int index) {
      return getNullVolumesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
     */
    public opi_api.storage.v1.NullVolumeOrBuilder getNullVolumesOrBuilder(
        int index) {
      if (nullVolumesBuilder_ == null) {
        return nullVolumes_.get(index);  } else {
        return nullVolumesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
     */
    public java.util.List<? extends opi_api.storage.v1.NullVolumeOrBuilder> 
         getNullVolumesOrBuilderList() {
      if (nullVolumesBuilder_ != null) {
        return nullVolumesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nullVolumes_);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
     */
    public opi_api.storage.v1.NullVolume.Builder addNullVolumesBuilder() {
      return getNullVolumesFieldBuilder().addBuilder(
          opi_api.storage.v1.NullVolume.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
     */
    public opi_api.storage.v1.NullVolume.Builder addNullVolumesBuilder(
        int index) {
      return getNullVolumesFieldBuilder().addBuilder(
          index, opi_api.storage.v1.NullVolume.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.NullVolume null_volumes = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.NullVolume.Builder> 
         getNullVolumesBuilderList() {
      return getNullVolumesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.NullVolume, opi_api.storage.v1.NullVolume.Builder, opi_api.storage.v1.NullVolumeOrBuilder> 
        getNullVolumesFieldBuilder() {
      if (nullVolumesBuilder_ == null) {
        nullVolumesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.storage.v1.NullVolume, opi_api.storage.v1.NullVolume.Builder, opi_api.storage.v1.NullVolumeOrBuilder>(
                nullVolumes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        nullVolumes_ = null;
      }
      return nullVolumesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.ListNullVolumesResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNullVolumesResponse)
  private static final opi_api.storage.v1.ListNullVolumesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.ListNullVolumesResponse();
  }

  public static opi_api.storage.v1.ListNullVolumesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNullVolumesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListNullVolumesResponse>() {
    @java.lang.Override
    public ListNullVolumesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListNullVolumesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListNullVolumesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNullVolumesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.ListNullVolumesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

