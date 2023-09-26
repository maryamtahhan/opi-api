// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

/**
 * <pre>
 * Represents Nvme Subsystem configuration
 * </pre>
 *
 * Protobuf type {@code opi_api.storage.v1.NvmeSubsystemSpec}
 */
public final class NvmeSubsystemSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.NvmeSubsystemSpec)
    NvmeSubsystemSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NvmeSubsystemSpec.newBuilder() to construct.
  private NvmeSubsystemSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NvmeSubsystemSpec() {
    nqn_ = "";
    serialNumber_ = "";
    modelNumber_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NvmeSubsystemSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NvmeSubsystemSpec(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            nqn_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            serialNumber_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            modelNumber_ = s;
            break;
          }
          case 32: {

            maxNamespaces_ = input.readInt64();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NvmeSubsystemSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NvmeSubsystemSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.NvmeSubsystemSpec.class, opi_api.storage.v1.NvmeSubsystemSpec.Builder.class);
  }

  public static final int NQN_FIELD_NUMBER = 1;
  private volatile java.lang.Object nqn_;
  /**
   * <pre>
   * Nvme subsystem NQN to which the controller belongs
   * Refer to the NQN format in the Nvme base specifications, must not
   * exceed 'NSV_NVME_SUBSYSTEM_NQN_LEN' bytes
   * </pre>
   *
   * <code>string nqn = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nqn.
   */
  @java.lang.Override
  public java.lang.String getNqn() {
    java.lang.Object ref = nqn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nqn_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Nvme subsystem NQN to which the controller belongs
   * Refer to the NQN format in the Nvme base specifications, must not
   * exceed 'NSV_NVME_SUBSYSTEM_NQN_LEN' bytes
   * </pre>
   *
   * <code>string nqn = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for nqn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNqnBytes() {
    java.lang.Object ref = nqn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nqn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERIAL_NUMBER_FIELD_NUMBER = 2;
  private volatile java.lang.Object serialNumber_;
  /**
   * <pre>
   * serial number must not exceed 'NSV_CTRLR_SERIAL_NO_LEN' bytes
   * </pre>
   *
   * <code>string serial_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The serialNumber.
   */
  @java.lang.Override
  public java.lang.String getSerialNumber() {
    java.lang.Object ref = serialNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serialNumber_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * serial number must not exceed 'NSV_CTRLR_SERIAL_NO_LEN' bytes
   * </pre>
   *
   * <code>string serial_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for serialNumber.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSerialNumberBytes() {
    java.lang.Object ref = serialNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serialNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODEL_NUMBER_FIELD_NUMBER = 3;
  private volatile java.lang.Object modelNumber_;
  /**
   * <pre>
   * model number, must not exceed 'NSV_CTRLR_MODEL_NO_LEN' bytes
   * </pre>
   *
   * <code>string model_number = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The modelNumber.
   */
  @java.lang.Override
  public java.lang.String getModelNumber() {
    java.lang.Object ref = modelNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      modelNumber_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * model number, must not exceed 'NSV_CTRLR_MODEL_NO_LEN' bytes
   * </pre>
   *
   * <code>string model_number = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for modelNumber.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelNumberBytes() {
    java.lang.Object ref = modelNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      modelNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAX_NAMESPACES_FIELD_NUMBER = 4;
  private long maxNamespaces_;
  /**
   * <pre>
   * maximum namespaces within a subsystem
   * </pre>
   *
   * <code>int64 max_namespaces = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The maxNamespaces.
   */
  @java.lang.Override
  public long getMaxNamespaces() {
    return maxNamespaces_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nqn_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nqn_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serialNumber_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serialNumber_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(modelNumber_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, modelNumber_);
    }
    if (maxNamespaces_ != 0L) {
      output.writeInt64(4, maxNamespaces_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nqn_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nqn_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serialNumber_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serialNumber_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(modelNumber_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, modelNumber_);
    }
    if (maxNamespaces_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, maxNamespaces_);
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
    if (!(obj instanceof opi_api.storage.v1.NvmeSubsystemSpec)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.NvmeSubsystemSpec other = (opi_api.storage.v1.NvmeSubsystemSpec) obj;

    if (!getNqn()
        .equals(other.getNqn())) return false;
    if (!getSerialNumber()
        .equals(other.getSerialNumber())) return false;
    if (!getModelNumber()
        .equals(other.getModelNumber())) return false;
    if (getMaxNamespaces()
        != other.getMaxNamespaces()) return false;
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
    hash = (37 * hash) + NQN_FIELD_NUMBER;
    hash = (53 * hash) + getNqn().hashCode();
    hash = (37 * hash) + SERIAL_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getSerialNumber().hashCode();
    hash = (37 * hash) + MODEL_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getModelNumber().hashCode();
    hash = (37 * hash) + MAX_NAMESPACES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaxNamespaces());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.NvmeSubsystemSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NvmeSubsystemSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeSubsystemSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NvmeSubsystemSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeSubsystemSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NvmeSubsystemSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeSubsystemSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NvmeSubsystemSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeSubsystemSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NvmeSubsystemSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeSubsystemSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NvmeSubsystemSpec parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.NvmeSubsystemSpec prototype) {
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
   * Represents Nvme Subsystem configuration
   * </pre>
   *
   * Protobuf type {@code opi_api.storage.v1.NvmeSubsystemSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.NvmeSubsystemSpec)
      opi_api.storage.v1.NvmeSubsystemSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NvmeSubsystemSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NvmeSubsystemSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.NvmeSubsystemSpec.class, opi_api.storage.v1.NvmeSubsystemSpec.Builder.class);
    }

    // Construct using opi_api.storage.v1.NvmeSubsystemSpec.newBuilder()
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
      nqn_ = "";

      serialNumber_ = "";

      modelNumber_ = "";

      maxNamespaces_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NvmeSubsystemSpec_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.NvmeSubsystemSpec getDefaultInstanceForType() {
      return opi_api.storage.v1.NvmeSubsystemSpec.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.NvmeSubsystemSpec build() {
      opi_api.storage.v1.NvmeSubsystemSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.NvmeSubsystemSpec buildPartial() {
      opi_api.storage.v1.NvmeSubsystemSpec result = new opi_api.storage.v1.NvmeSubsystemSpec(this);
      result.nqn_ = nqn_;
      result.serialNumber_ = serialNumber_;
      result.modelNumber_ = modelNumber_;
      result.maxNamespaces_ = maxNamespaces_;
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
      if (other instanceof opi_api.storage.v1.NvmeSubsystemSpec) {
        return mergeFrom((opi_api.storage.v1.NvmeSubsystemSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.NvmeSubsystemSpec other) {
      if (other == opi_api.storage.v1.NvmeSubsystemSpec.getDefaultInstance()) return this;
      if (!other.getNqn().isEmpty()) {
        nqn_ = other.nqn_;
        onChanged();
      }
      if (!other.getSerialNumber().isEmpty()) {
        serialNumber_ = other.serialNumber_;
        onChanged();
      }
      if (!other.getModelNumber().isEmpty()) {
        modelNumber_ = other.modelNumber_;
        onChanged();
      }
      if (other.getMaxNamespaces() != 0L) {
        setMaxNamespaces(other.getMaxNamespaces());
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
      opi_api.storage.v1.NvmeSubsystemSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.NvmeSubsystemSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object nqn_ = "";
    /**
     * <pre>
     * Nvme subsystem NQN to which the controller belongs
     * Refer to the NQN format in the Nvme base specifications, must not
     * exceed 'NSV_NVME_SUBSYSTEM_NQN_LEN' bytes
     * </pre>
     *
     * <code>string nqn = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The nqn.
     */
    public java.lang.String getNqn() {
      java.lang.Object ref = nqn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nqn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Nvme subsystem NQN to which the controller belongs
     * Refer to the NQN format in the Nvme base specifications, must not
     * exceed 'NSV_NVME_SUBSYSTEM_NQN_LEN' bytes
     * </pre>
     *
     * <code>string nqn = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for nqn.
     */
    public com.google.protobuf.ByteString
        getNqnBytes() {
      java.lang.Object ref = nqn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nqn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Nvme subsystem NQN to which the controller belongs
     * Refer to the NQN format in the Nvme base specifications, must not
     * exceed 'NSV_NVME_SUBSYSTEM_NQN_LEN' bytes
     * </pre>
     *
     * <code>string nqn = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The nqn to set.
     * @return This builder for chaining.
     */
    public Builder setNqn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nqn_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Nvme subsystem NQN to which the controller belongs
     * Refer to the NQN format in the Nvme base specifications, must not
     * exceed 'NSV_NVME_SUBSYSTEM_NQN_LEN' bytes
     * </pre>
     *
     * <code>string nqn = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearNqn() {
      
      nqn_ = getDefaultInstance().getNqn();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Nvme subsystem NQN to which the controller belongs
     * Refer to the NQN format in the Nvme base specifications, must not
     * exceed 'NSV_NVME_SUBSYSTEM_NQN_LEN' bytes
     * </pre>
     *
     * <code>string nqn = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for nqn to set.
     * @return This builder for chaining.
     */
    public Builder setNqnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nqn_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object serialNumber_ = "";
    /**
     * <pre>
     * serial number must not exceed 'NSV_CTRLR_SERIAL_NO_LEN' bytes
     * </pre>
     *
     * <code>string serial_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The serialNumber.
     */
    public java.lang.String getSerialNumber() {
      java.lang.Object ref = serialNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serialNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * serial number must not exceed 'NSV_CTRLR_SERIAL_NO_LEN' bytes
     * </pre>
     *
     * <code>string serial_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for serialNumber.
     */
    public com.google.protobuf.ByteString
        getSerialNumberBytes() {
      java.lang.Object ref = serialNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serialNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * serial number must not exceed 'NSV_CTRLR_SERIAL_NO_LEN' bytes
     * </pre>
     *
     * <code>string serial_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The serialNumber to set.
     * @return This builder for chaining.
     */
    public Builder setSerialNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serialNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * serial number must not exceed 'NSV_CTRLR_SERIAL_NO_LEN' bytes
     * </pre>
     *
     * <code>string serial_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearSerialNumber() {
      
      serialNumber_ = getDefaultInstance().getSerialNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * serial number must not exceed 'NSV_CTRLR_SERIAL_NO_LEN' bytes
     * </pre>
     *
     * <code>string serial_number = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for serialNumber to set.
     * @return This builder for chaining.
     */
    public Builder setSerialNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serialNumber_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object modelNumber_ = "";
    /**
     * <pre>
     * model number, must not exceed 'NSV_CTRLR_MODEL_NO_LEN' bytes
     * </pre>
     *
     * <code>string model_number = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The modelNumber.
     */
    public java.lang.String getModelNumber() {
      java.lang.Object ref = modelNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        modelNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * model number, must not exceed 'NSV_CTRLR_MODEL_NO_LEN' bytes
     * </pre>
     *
     * <code>string model_number = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for modelNumber.
     */
    public com.google.protobuf.ByteString
        getModelNumberBytes() {
      java.lang.Object ref = modelNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        modelNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * model number, must not exceed 'NSV_CTRLR_MODEL_NO_LEN' bytes
     * </pre>
     *
     * <code>string model_number = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The modelNumber to set.
     * @return This builder for chaining.
     */
    public Builder setModelNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      modelNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * model number, must not exceed 'NSV_CTRLR_MODEL_NO_LEN' bytes
     * </pre>
     *
     * <code>string model_number = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearModelNumber() {
      
      modelNumber_ = getDefaultInstance().getModelNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * model number, must not exceed 'NSV_CTRLR_MODEL_NO_LEN' bytes
     * </pre>
     *
     * <code>string model_number = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for modelNumber to set.
     * @return This builder for chaining.
     */
    public Builder setModelNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      modelNumber_ = value;
      onChanged();
      return this;
    }

    private long maxNamespaces_ ;
    /**
     * <pre>
     * maximum namespaces within a subsystem
     * </pre>
     *
     * <code>int64 max_namespaces = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The maxNamespaces.
     */
    @java.lang.Override
    public long getMaxNamespaces() {
      return maxNamespaces_;
    }
    /**
     * <pre>
     * maximum namespaces within a subsystem
     * </pre>
     *
     * <code>int64 max_namespaces = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The maxNamespaces to set.
     * @return This builder for chaining.
     */
    public Builder setMaxNamespaces(long value) {
      
      maxNamespaces_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * maximum namespaces within a subsystem
     * </pre>
     *
     * <code>int64 max_namespaces = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxNamespaces() {
      
      maxNamespaces_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.NvmeSubsystemSpec)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.NvmeSubsystemSpec)
  private static final opi_api.storage.v1.NvmeSubsystemSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.NvmeSubsystemSpec();
  }

  public static opi_api.storage.v1.NvmeSubsystemSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NvmeSubsystemSpec>
      PARSER = new com.google.protobuf.AbstractParser<NvmeSubsystemSpec>() {
    @java.lang.Override
    public NvmeSubsystemSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NvmeSubsystemSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NvmeSubsystemSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NvmeSubsystemSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.NvmeSubsystemSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

