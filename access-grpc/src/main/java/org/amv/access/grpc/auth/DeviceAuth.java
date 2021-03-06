// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: access_api_auth.proto

package org.amv.access.grpc.auth;

/**
 * Protobuf type {@code amv_access_api.DeviceAuth}
 */
public  final class DeviceAuth extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:amv_access_api.DeviceAuth)
    DeviceAuthOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceAuth.newBuilder() to construct.
  private DeviceAuth(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceAuth() {
    deviceSerialNumber_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeviceAuth(
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
            org.amv.access.grpc.auth.NonceAuth.Builder subBuilder = null;
            if (nonceAuth_ != null) {
              subBuilder = nonceAuth_.toBuilder();
            }
            nonceAuth_ = input.readMessage(org.amv.access.grpc.auth.NonceAuth.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(nonceAuth_);
              nonceAuth_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            deviceSerialNumber_ = s;
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
    return org.amv.access.grpc.auth.AccessAuthProto.internal_static_amv_access_api_DeviceAuth_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.amv.access.grpc.auth.AccessAuthProto.internal_static_amv_access_api_DeviceAuth_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.amv.access.grpc.auth.DeviceAuth.class, org.amv.access.grpc.auth.DeviceAuth.Builder.class);
  }

  public static final int NONCE_AUTH_FIELD_NUMBER = 1;
  private org.amv.access.grpc.auth.NonceAuth nonceAuth_;
  /**
   * <code>.amv_access_api.NonceAuth nonce_auth = 1;</code>
   */
  public boolean hasNonceAuth() {
    return nonceAuth_ != null;
  }
  /**
   * <code>.amv_access_api.NonceAuth nonce_auth = 1;</code>
   */
  public org.amv.access.grpc.auth.NonceAuth getNonceAuth() {
    return nonceAuth_ == null ? org.amv.access.grpc.auth.NonceAuth.getDefaultInstance() : nonceAuth_;
  }
  /**
   * <code>.amv_access_api.NonceAuth nonce_auth = 1;</code>
   */
  public org.amv.access.grpc.auth.NonceAuthOrBuilder getNonceAuthOrBuilder() {
    return getNonceAuth();
  }

  public static final int DEVICE_SERIAL_NUMBER_FIELD_NUMBER = 2;
  private volatile java.lang.Object deviceSerialNumber_;
  /**
   * <code>string device_serial_number = 2;</code>
   */
  public java.lang.String getDeviceSerialNumber() {
    java.lang.Object ref = deviceSerialNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceSerialNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string device_serial_number = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDeviceSerialNumberBytes() {
    java.lang.Object ref = deviceSerialNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deviceSerialNumber_ = b;
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
    if (nonceAuth_ != null) {
      output.writeMessage(1, getNonceAuth());
    }
    if (!getDeviceSerialNumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deviceSerialNumber_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nonceAuth_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNonceAuth());
    }
    if (!getDeviceSerialNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deviceSerialNumber_);
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
    if (!(obj instanceof org.amv.access.grpc.auth.DeviceAuth)) {
      return super.equals(obj);
    }
    org.amv.access.grpc.auth.DeviceAuth other = (org.amv.access.grpc.auth.DeviceAuth) obj;

    boolean result = true;
    result = result && (hasNonceAuth() == other.hasNonceAuth());
    if (hasNonceAuth()) {
      result = result && getNonceAuth()
          .equals(other.getNonceAuth());
    }
    result = result && getDeviceSerialNumber()
        .equals(other.getDeviceSerialNumber());
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
    if (hasNonceAuth()) {
      hash = (37 * hash) + NONCE_AUTH_FIELD_NUMBER;
      hash = (53 * hash) + getNonceAuth().hashCode();
    }
    hash = (37 * hash) + DEVICE_SERIAL_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceSerialNumber().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.amv.access.grpc.auth.DeviceAuth parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.amv.access.grpc.auth.DeviceAuth parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.amv.access.grpc.auth.DeviceAuth parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.amv.access.grpc.auth.DeviceAuth parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.amv.access.grpc.auth.DeviceAuth parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.amv.access.grpc.auth.DeviceAuth parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.amv.access.grpc.auth.DeviceAuth parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.amv.access.grpc.auth.DeviceAuth parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.amv.access.grpc.auth.DeviceAuth parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.amv.access.grpc.auth.DeviceAuth parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.amv.access.grpc.auth.DeviceAuth parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.amv.access.grpc.auth.DeviceAuth parseFrom(
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
  public static Builder newBuilder(org.amv.access.grpc.auth.DeviceAuth prototype) {
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
   * Protobuf type {@code amv_access_api.DeviceAuth}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:amv_access_api.DeviceAuth)
      org.amv.access.grpc.auth.DeviceAuthOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.amv.access.grpc.auth.AccessAuthProto.internal_static_amv_access_api_DeviceAuth_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.amv.access.grpc.auth.AccessAuthProto.internal_static_amv_access_api_DeviceAuth_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.amv.access.grpc.auth.DeviceAuth.class, org.amv.access.grpc.auth.DeviceAuth.Builder.class);
    }

    // Construct using org.amv.access.grpc.auth.DeviceAuth.newBuilder()
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
      if (nonceAuthBuilder_ == null) {
        nonceAuth_ = null;
      } else {
        nonceAuth_ = null;
        nonceAuthBuilder_ = null;
      }
      deviceSerialNumber_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.amv.access.grpc.auth.AccessAuthProto.internal_static_amv_access_api_DeviceAuth_descriptor;
    }

    public org.amv.access.grpc.auth.DeviceAuth getDefaultInstanceForType() {
      return org.amv.access.grpc.auth.DeviceAuth.getDefaultInstance();
    }

    public org.amv.access.grpc.auth.DeviceAuth build() {
      org.amv.access.grpc.auth.DeviceAuth result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.amv.access.grpc.auth.DeviceAuth buildPartial() {
      org.amv.access.grpc.auth.DeviceAuth result = new org.amv.access.grpc.auth.DeviceAuth(this);
      if (nonceAuthBuilder_ == null) {
        result.nonceAuth_ = nonceAuth_;
      } else {
        result.nonceAuth_ = nonceAuthBuilder_.build();
      }
      result.deviceSerialNumber_ = deviceSerialNumber_;
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
      if (other instanceof org.amv.access.grpc.auth.DeviceAuth) {
        return mergeFrom((org.amv.access.grpc.auth.DeviceAuth)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.amv.access.grpc.auth.DeviceAuth other) {
      if (other == org.amv.access.grpc.auth.DeviceAuth.getDefaultInstance()) return this;
      if (other.hasNonceAuth()) {
        mergeNonceAuth(other.getNonceAuth());
      }
      if (!other.getDeviceSerialNumber().isEmpty()) {
        deviceSerialNumber_ = other.deviceSerialNumber_;
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
      org.amv.access.grpc.auth.DeviceAuth parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.amv.access.grpc.auth.DeviceAuth) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.amv.access.grpc.auth.NonceAuth nonceAuth_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.amv.access.grpc.auth.NonceAuth, org.amv.access.grpc.auth.NonceAuth.Builder, org.amv.access.grpc.auth.NonceAuthOrBuilder> nonceAuthBuilder_;
    /**
     * <code>.amv_access_api.NonceAuth nonce_auth = 1;</code>
     */
    public boolean hasNonceAuth() {
      return nonceAuthBuilder_ != null || nonceAuth_ != null;
    }
    /**
     * <code>.amv_access_api.NonceAuth nonce_auth = 1;</code>
     */
    public org.amv.access.grpc.auth.NonceAuth getNonceAuth() {
      if (nonceAuthBuilder_ == null) {
        return nonceAuth_ == null ? org.amv.access.grpc.auth.NonceAuth.getDefaultInstance() : nonceAuth_;
      } else {
        return nonceAuthBuilder_.getMessage();
      }
    }
    /**
     * <code>.amv_access_api.NonceAuth nonce_auth = 1;</code>
     */
    public Builder setNonceAuth(org.amv.access.grpc.auth.NonceAuth value) {
      if (nonceAuthBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nonceAuth_ = value;
        onChanged();
      } else {
        nonceAuthBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.amv_access_api.NonceAuth nonce_auth = 1;</code>
     */
    public Builder setNonceAuth(
        org.amv.access.grpc.auth.NonceAuth.Builder builderForValue) {
      if (nonceAuthBuilder_ == null) {
        nonceAuth_ = builderForValue.build();
        onChanged();
      } else {
        nonceAuthBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.amv_access_api.NonceAuth nonce_auth = 1;</code>
     */
    public Builder mergeNonceAuth(org.amv.access.grpc.auth.NonceAuth value) {
      if (nonceAuthBuilder_ == null) {
        if (nonceAuth_ != null) {
          nonceAuth_ =
            org.amv.access.grpc.auth.NonceAuth.newBuilder(nonceAuth_).mergeFrom(value).buildPartial();
        } else {
          nonceAuth_ = value;
        }
        onChanged();
      } else {
        nonceAuthBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.amv_access_api.NonceAuth nonce_auth = 1;</code>
     */
    public Builder clearNonceAuth() {
      if (nonceAuthBuilder_ == null) {
        nonceAuth_ = null;
        onChanged();
      } else {
        nonceAuth_ = null;
        nonceAuthBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.amv_access_api.NonceAuth nonce_auth = 1;</code>
     */
    public org.amv.access.grpc.auth.NonceAuth.Builder getNonceAuthBuilder() {
      
      onChanged();
      return getNonceAuthFieldBuilder().getBuilder();
    }
    /**
     * <code>.amv_access_api.NonceAuth nonce_auth = 1;</code>
     */
    public org.amv.access.grpc.auth.NonceAuthOrBuilder getNonceAuthOrBuilder() {
      if (nonceAuthBuilder_ != null) {
        return nonceAuthBuilder_.getMessageOrBuilder();
      } else {
        return nonceAuth_ == null ?
            org.amv.access.grpc.auth.NonceAuth.getDefaultInstance() : nonceAuth_;
      }
    }
    /**
     * <code>.amv_access_api.NonceAuth nonce_auth = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.amv.access.grpc.auth.NonceAuth, org.amv.access.grpc.auth.NonceAuth.Builder, org.amv.access.grpc.auth.NonceAuthOrBuilder> 
        getNonceAuthFieldBuilder() {
      if (nonceAuthBuilder_ == null) {
        nonceAuthBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.amv.access.grpc.auth.NonceAuth, org.amv.access.grpc.auth.NonceAuth.Builder, org.amv.access.grpc.auth.NonceAuthOrBuilder>(
                getNonceAuth(),
                getParentForChildren(),
                isClean());
        nonceAuth_ = null;
      }
      return nonceAuthBuilder_;
    }

    private java.lang.Object deviceSerialNumber_ = "";
    /**
     * <code>string device_serial_number = 2;</code>
     */
    public java.lang.String getDeviceSerialNumber() {
      java.lang.Object ref = deviceSerialNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceSerialNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string device_serial_number = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDeviceSerialNumberBytes() {
      java.lang.Object ref = deviceSerialNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceSerialNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string device_serial_number = 2;</code>
     */
    public Builder setDeviceSerialNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deviceSerialNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string device_serial_number = 2;</code>
     */
    public Builder clearDeviceSerialNumber() {
      
      deviceSerialNumber_ = getDefaultInstance().getDeviceSerialNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string device_serial_number = 2;</code>
     */
    public Builder setDeviceSerialNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deviceSerialNumber_ = value;
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


    // @@protoc_insertion_point(builder_scope:amv_access_api.DeviceAuth)
  }

  // @@protoc_insertion_point(class_scope:amv_access_api.DeviceAuth)
  private static final org.amv.access.grpc.auth.DeviceAuth DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.amv.access.grpc.auth.DeviceAuth();
  }

  public static org.amv.access.grpc.auth.DeviceAuth getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceAuth>
      PARSER = new com.google.protobuf.AbstractParser<DeviceAuth>() {
    public DeviceAuth parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeviceAuth(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeviceAuth> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceAuth> getParserForType() {
    return PARSER;
  }

  public org.amv.access.grpc.auth.DeviceAuth getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

