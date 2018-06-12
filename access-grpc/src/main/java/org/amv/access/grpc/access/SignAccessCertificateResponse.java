// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: access_api_access.proto

package org.amv.access.grpc.access;

/**
 * Protobuf type {@code amv_access_api.SignAccessCertificateResponse}
 */
public  final class SignAccessCertificateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:amv_access_api.SignAccessCertificateResponse)
    SignAccessCertificateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SignAccessCertificateResponse.newBuilder() to construct.
  private SignAccessCertificateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SignAccessCertificateResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SignAccessCertificateResponse(
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
            org.amv.access.grpc.access.AccessCertificate.Builder subBuilder = null;
            if (accessCertificate_ != null) {
              subBuilder = accessCertificate_.toBuilder();
            }
            accessCertificate_ = input.readMessage(org.amv.access.grpc.access.AccessCertificate.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(accessCertificate_);
              accessCertificate_ = subBuilder.buildPartial();
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
    return org.amv.access.grpc.access.AccessProto.internal_static_amv_access_api_SignAccessCertificateResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.amv.access.grpc.access.AccessProto.internal_static_amv_access_api_SignAccessCertificateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.amv.access.grpc.access.SignAccessCertificateResponse.class, org.amv.access.grpc.access.SignAccessCertificateResponse.Builder.class);
  }

  public static final int ACCESS_CERTIFICATE_FIELD_NUMBER = 1;
  private org.amv.access.grpc.access.AccessCertificate accessCertificate_;
  /**
   * <code>.amv_access_api.AccessCertificate access_certificate = 1;</code>
   */
  public boolean hasAccessCertificate() {
    return accessCertificate_ != null;
  }
  /**
   * <code>.amv_access_api.AccessCertificate access_certificate = 1;</code>
   */
  public org.amv.access.grpc.access.AccessCertificate getAccessCertificate() {
    return accessCertificate_ == null ? org.amv.access.grpc.access.AccessCertificate.getDefaultInstance() : accessCertificate_;
  }
  /**
   * <code>.amv_access_api.AccessCertificate access_certificate = 1;</code>
   */
  public org.amv.access.grpc.access.AccessCertificateOrBuilder getAccessCertificateOrBuilder() {
    return getAccessCertificate();
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
    if (accessCertificate_ != null) {
      output.writeMessage(1, getAccessCertificate());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accessCertificate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAccessCertificate());
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
    if (!(obj instanceof org.amv.access.grpc.access.SignAccessCertificateResponse)) {
      return super.equals(obj);
    }
    org.amv.access.grpc.access.SignAccessCertificateResponse other = (org.amv.access.grpc.access.SignAccessCertificateResponse) obj;

    boolean result = true;
    result = result && (hasAccessCertificate() == other.hasAccessCertificate());
    if (hasAccessCertificate()) {
      result = result && getAccessCertificate()
          .equals(other.getAccessCertificate());
    }
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
    if (hasAccessCertificate()) {
      hash = (37 * hash) + ACCESS_CERTIFICATE_FIELD_NUMBER;
      hash = (53 * hash) + getAccessCertificate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.amv.access.grpc.access.SignAccessCertificateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.amv.access.grpc.access.SignAccessCertificateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.amv.access.grpc.access.SignAccessCertificateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.amv.access.grpc.access.SignAccessCertificateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.amv.access.grpc.access.SignAccessCertificateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.amv.access.grpc.access.SignAccessCertificateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.amv.access.grpc.access.SignAccessCertificateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.amv.access.grpc.access.SignAccessCertificateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.amv.access.grpc.access.SignAccessCertificateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.amv.access.grpc.access.SignAccessCertificateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.amv.access.grpc.access.SignAccessCertificateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.amv.access.grpc.access.SignAccessCertificateResponse parseFrom(
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
  public static Builder newBuilder(org.amv.access.grpc.access.SignAccessCertificateResponse prototype) {
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
   * Protobuf type {@code amv_access_api.SignAccessCertificateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:amv_access_api.SignAccessCertificateResponse)
      org.amv.access.grpc.access.SignAccessCertificateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.amv.access.grpc.access.AccessProto.internal_static_amv_access_api_SignAccessCertificateResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.amv.access.grpc.access.AccessProto.internal_static_amv_access_api_SignAccessCertificateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.amv.access.grpc.access.SignAccessCertificateResponse.class, org.amv.access.grpc.access.SignAccessCertificateResponse.Builder.class);
    }

    // Construct using org.amv.access.grpc.access.SignAccessCertificateResponse.newBuilder()
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
      if (accessCertificateBuilder_ == null) {
        accessCertificate_ = null;
      } else {
        accessCertificate_ = null;
        accessCertificateBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.amv.access.grpc.access.AccessProto.internal_static_amv_access_api_SignAccessCertificateResponse_descriptor;
    }

    public org.amv.access.grpc.access.SignAccessCertificateResponse getDefaultInstanceForType() {
      return org.amv.access.grpc.access.SignAccessCertificateResponse.getDefaultInstance();
    }

    public org.amv.access.grpc.access.SignAccessCertificateResponse build() {
      org.amv.access.grpc.access.SignAccessCertificateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.amv.access.grpc.access.SignAccessCertificateResponse buildPartial() {
      org.amv.access.grpc.access.SignAccessCertificateResponse result = new org.amv.access.grpc.access.SignAccessCertificateResponse(this);
      if (accessCertificateBuilder_ == null) {
        result.accessCertificate_ = accessCertificate_;
      } else {
        result.accessCertificate_ = accessCertificateBuilder_.build();
      }
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
      if (other instanceof org.amv.access.grpc.access.SignAccessCertificateResponse) {
        return mergeFrom((org.amv.access.grpc.access.SignAccessCertificateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.amv.access.grpc.access.SignAccessCertificateResponse other) {
      if (other == org.amv.access.grpc.access.SignAccessCertificateResponse.getDefaultInstance()) return this;
      if (other.hasAccessCertificate()) {
        mergeAccessCertificate(other.getAccessCertificate());
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
      org.amv.access.grpc.access.SignAccessCertificateResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.amv.access.grpc.access.SignAccessCertificateResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.amv.access.grpc.access.AccessCertificate accessCertificate_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.amv.access.grpc.access.AccessCertificate, org.amv.access.grpc.access.AccessCertificate.Builder, org.amv.access.grpc.access.AccessCertificateOrBuilder> accessCertificateBuilder_;
    /**
     * <code>.amv_access_api.AccessCertificate access_certificate = 1;</code>
     */
    public boolean hasAccessCertificate() {
      return accessCertificateBuilder_ != null || accessCertificate_ != null;
    }
    /**
     * <code>.amv_access_api.AccessCertificate access_certificate = 1;</code>
     */
    public org.amv.access.grpc.access.AccessCertificate getAccessCertificate() {
      if (accessCertificateBuilder_ == null) {
        return accessCertificate_ == null ? org.amv.access.grpc.access.AccessCertificate.getDefaultInstance() : accessCertificate_;
      } else {
        return accessCertificateBuilder_.getMessage();
      }
    }
    /**
     * <code>.amv_access_api.AccessCertificate access_certificate = 1;</code>
     */
    public Builder setAccessCertificate(org.amv.access.grpc.access.AccessCertificate value) {
      if (accessCertificateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accessCertificate_ = value;
        onChanged();
      } else {
        accessCertificateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.amv_access_api.AccessCertificate access_certificate = 1;</code>
     */
    public Builder setAccessCertificate(
        org.amv.access.grpc.access.AccessCertificate.Builder builderForValue) {
      if (accessCertificateBuilder_ == null) {
        accessCertificate_ = builderForValue.build();
        onChanged();
      } else {
        accessCertificateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.amv_access_api.AccessCertificate access_certificate = 1;</code>
     */
    public Builder mergeAccessCertificate(org.amv.access.grpc.access.AccessCertificate value) {
      if (accessCertificateBuilder_ == null) {
        if (accessCertificate_ != null) {
          accessCertificate_ =
            org.amv.access.grpc.access.AccessCertificate.newBuilder(accessCertificate_).mergeFrom(value).buildPartial();
        } else {
          accessCertificate_ = value;
        }
        onChanged();
      } else {
        accessCertificateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.amv_access_api.AccessCertificate access_certificate = 1;</code>
     */
    public Builder clearAccessCertificate() {
      if (accessCertificateBuilder_ == null) {
        accessCertificate_ = null;
        onChanged();
      } else {
        accessCertificate_ = null;
        accessCertificateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.amv_access_api.AccessCertificate access_certificate = 1;</code>
     */
    public org.amv.access.grpc.access.AccessCertificate.Builder getAccessCertificateBuilder() {
      
      onChanged();
      return getAccessCertificateFieldBuilder().getBuilder();
    }
    /**
     * <code>.amv_access_api.AccessCertificate access_certificate = 1;</code>
     */
    public org.amv.access.grpc.access.AccessCertificateOrBuilder getAccessCertificateOrBuilder() {
      if (accessCertificateBuilder_ != null) {
        return accessCertificateBuilder_.getMessageOrBuilder();
      } else {
        return accessCertificate_ == null ?
            org.amv.access.grpc.access.AccessCertificate.getDefaultInstance() : accessCertificate_;
      }
    }
    /**
     * <code>.amv_access_api.AccessCertificate access_certificate = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.amv.access.grpc.access.AccessCertificate, org.amv.access.grpc.access.AccessCertificate.Builder, org.amv.access.grpc.access.AccessCertificateOrBuilder> 
        getAccessCertificateFieldBuilder() {
      if (accessCertificateBuilder_ == null) {
        accessCertificateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.amv.access.grpc.access.AccessCertificate, org.amv.access.grpc.access.AccessCertificate.Builder, org.amv.access.grpc.access.AccessCertificateOrBuilder>(
                getAccessCertificate(),
                getParentForChildren(),
                isClean());
        accessCertificate_ = null;
      }
      return accessCertificateBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:amv_access_api.SignAccessCertificateResponse)
  }

  // @@protoc_insertion_point(class_scope:amv_access_api.SignAccessCertificateResponse)
  private static final org.amv.access.grpc.access.SignAccessCertificateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.amv.access.grpc.access.SignAccessCertificateResponse();
  }

  public static org.amv.access.grpc.access.SignAccessCertificateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SignAccessCertificateResponse>
      PARSER = new com.google.protobuf.AbstractParser<SignAccessCertificateResponse>() {
    public SignAccessCertificateResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SignAccessCertificateResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SignAccessCertificateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SignAccessCertificateResponse> getParserForType() {
    return PARSER;
  }

  public org.amv.access.grpc.access.SignAccessCertificateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
