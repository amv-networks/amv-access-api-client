// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: access_api.proto

package org.amv.access.grpc;

/**
 * Protobuf type {@code amv_access_api.DeviceCertificate}
 */
public  final class DeviceCertificate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:amv_access_api.DeviceCertificate)
    DeviceCertificateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceCertificate.newBuilder() to construct.
  private DeviceCertificate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceCertificate() {
    deviceCertificate_ = "";
    issuerPublicKey_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeviceCertificate(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            deviceCertificate_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            issuerPublicKey_ = s;
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
    return org.amv.access.grpc.AccessApi.internal_static_amv_access_api_DeviceCertificate_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.amv.access.grpc.AccessApi.internal_static_amv_access_api_DeviceCertificate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.amv.access.grpc.DeviceCertificate.class, org.amv.access.grpc.DeviceCertificate.Builder.class);
  }

  public static final int DEVICE_CERTIFICATE_FIELD_NUMBER = 1;
  private volatile java.lang.Object deviceCertificate_;
  /**
   * <code>string device_certificate = 1;</code>
   */
  public java.lang.String getDeviceCertificate() {
    java.lang.Object ref = deviceCertificate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceCertificate_ = s;
      return s;
    }
  }
  /**
   * <code>string device_certificate = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDeviceCertificateBytes() {
    java.lang.Object ref = deviceCertificate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deviceCertificate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISSUER_PUBLIC_KEY_FIELD_NUMBER = 2;
  private volatile java.lang.Object issuerPublicKey_;
  /**
   * <code>string issuer_public_key = 2;</code>
   */
  public java.lang.String getIssuerPublicKey() {
    java.lang.Object ref = issuerPublicKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      issuerPublicKey_ = s;
      return s;
    }
  }
  /**
   * <code>string issuer_public_key = 2;</code>
   */
  public com.google.protobuf.ByteString
      getIssuerPublicKeyBytes() {
    java.lang.Object ref = issuerPublicKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      issuerPublicKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getDeviceCertificateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, deviceCertificate_);
    }
    if (!getIssuerPublicKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, issuerPublicKey_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDeviceCertificateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, deviceCertificate_);
    }
    if (!getIssuerPublicKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, issuerPublicKey_);
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
    if (!(obj instanceof org.amv.access.grpc.DeviceCertificate)) {
      return super.equals(obj);
    }
    org.amv.access.grpc.DeviceCertificate other = (org.amv.access.grpc.DeviceCertificate) obj;

    boolean result = true;
    result = result && getDeviceCertificate()
        .equals(other.getDeviceCertificate());
    result = result && getIssuerPublicKey()
        .equals(other.getIssuerPublicKey());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DEVICE_CERTIFICATE_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceCertificate().hashCode();
    hash = (37 * hash) + ISSUER_PUBLIC_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getIssuerPublicKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.amv.access.grpc.DeviceCertificate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.amv.access.grpc.DeviceCertificate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.amv.access.grpc.DeviceCertificate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.amv.access.grpc.DeviceCertificate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.amv.access.grpc.DeviceCertificate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.amv.access.grpc.DeviceCertificate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.amv.access.grpc.DeviceCertificate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.amv.access.grpc.DeviceCertificate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.amv.access.grpc.DeviceCertificate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.amv.access.grpc.DeviceCertificate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.amv.access.grpc.DeviceCertificate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.amv.access.grpc.DeviceCertificate parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.amv.access.grpc.DeviceCertificate prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code amv_access_api.DeviceCertificate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:amv_access_api.DeviceCertificate)
      org.amv.access.grpc.DeviceCertificateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.amv.access.grpc.AccessApi.internal_static_amv_access_api_DeviceCertificate_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.amv.access.grpc.AccessApi.internal_static_amv_access_api_DeviceCertificate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.amv.access.grpc.DeviceCertificate.class, org.amv.access.grpc.DeviceCertificate.Builder.class);
    }

    // Construct using org.amv.access.grpc.DeviceCertificate.newBuilder()
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
    public Builder clear() {
      super.clear();
      deviceCertificate_ = "";

      issuerPublicKey_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.amv.access.grpc.AccessApi.internal_static_amv_access_api_DeviceCertificate_descriptor;
    }

    public org.amv.access.grpc.DeviceCertificate getDefaultInstanceForType() {
      return org.amv.access.grpc.DeviceCertificate.getDefaultInstance();
    }

    public org.amv.access.grpc.DeviceCertificate build() {
      org.amv.access.grpc.DeviceCertificate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.amv.access.grpc.DeviceCertificate buildPartial() {
      org.amv.access.grpc.DeviceCertificate result = new org.amv.access.grpc.DeviceCertificate(this);
      result.deviceCertificate_ = deviceCertificate_;
      result.issuerPublicKey_ = issuerPublicKey_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.amv.access.grpc.DeviceCertificate) {
        return mergeFrom((org.amv.access.grpc.DeviceCertificate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.amv.access.grpc.DeviceCertificate other) {
      if (other == org.amv.access.grpc.DeviceCertificate.getDefaultInstance()) return this;
      if (!other.getDeviceCertificate().isEmpty()) {
        deviceCertificate_ = other.deviceCertificate_;
        onChanged();
      }
      if (!other.getIssuerPublicKey().isEmpty()) {
        issuerPublicKey_ = other.issuerPublicKey_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.amv.access.grpc.DeviceCertificate parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.amv.access.grpc.DeviceCertificate) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object deviceCertificate_ = "";
    /**
     * <code>string device_certificate = 1;</code>
     */
    public java.lang.String getDeviceCertificate() {
      java.lang.Object ref = deviceCertificate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceCertificate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string device_certificate = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDeviceCertificateBytes() {
      java.lang.Object ref = deviceCertificate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceCertificate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string device_certificate = 1;</code>
     */
    public Builder setDeviceCertificate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deviceCertificate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string device_certificate = 1;</code>
     */
    public Builder clearDeviceCertificate() {
      
      deviceCertificate_ = getDefaultInstance().getDeviceCertificate();
      onChanged();
      return this;
    }
    /**
     * <code>string device_certificate = 1;</code>
     */
    public Builder setDeviceCertificateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deviceCertificate_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object issuerPublicKey_ = "";
    /**
     * <code>string issuer_public_key = 2;</code>
     */
    public java.lang.String getIssuerPublicKey() {
      java.lang.Object ref = issuerPublicKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        issuerPublicKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string issuer_public_key = 2;</code>
     */
    public com.google.protobuf.ByteString
        getIssuerPublicKeyBytes() {
      java.lang.Object ref = issuerPublicKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        issuerPublicKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string issuer_public_key = 2;</code>
     */
    public Builder setIssuerPublicKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      issuerPublicKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string issuer_public_key = 2;</code>
     */
    public Builder clearIssuerPublicKey() {
      
      issuerPublicKey_ = getDefaultInstance().getIssuerPublicKey();
      onChanged();
      return this;
    }
    /**
     * <code>string issuer_public_key = 2;</code>
     */
    public Builder setIssuerPublicKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      issuerPublicKey_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:amv_access_api.DeviceCertificate)
  }

  // @@protoc_insertion_point(class_scope:amv_access_api.DeviceCertificate)
  private static final org.amv.access.grpc.DeviceCertificate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.amv.access.grpc.DeviceCertificate();
  }

  public static org.amv.access.grpc.DeviceCertificate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceCertificate>
      PARSER = new com.google.protobuf.AbstractParser<DeviceCertificate>() {
    public DeviceCertificate parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeviceCertificate(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeviceCertificate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceCertificate> getParserForType() {
    return PARSER;
  }

  public org.amv.access.grpc.DeviceCertificate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

