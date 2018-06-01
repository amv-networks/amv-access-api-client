// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: access_api.proto

package org.amv.access.grpc;

/**
 * Protobuf type {@code amv_access_api.CreateAccessCertificateResponse}
 */
public  final class CreateAccessCertificateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:amv_access_api.CreateAccessCertificateResponse)
    CreateAccessCertificateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAccessCertificateResponse.newBuilder() to construct.
  private CreateAccessCertificateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAccessCertificateResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateAccessCertificateResponse(
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
            org.amv.access.grpc.AccessCertificateSigningRequest.Builder subBuilder = null;
            if (accessCertificateSigningRequest_ != null) {
              subBuilder = accessCertificateSigningRequest_.toBuilder();
            }
            accessCertificateSigningRequest_ = input.readMessage(org.amv.access.grpc.AccessCertificateSigningRequest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(accessCertificateSigningRequest_);
              accessCertificateSigningRequest_ = subBuilder.buildPartial();
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
    return org.amv.access.grpc.AccessApi.internal_static_amv_access_api_CreateAccessCertificateResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.amv.access.grpc.AccessApi.internal_static_amv_access_api_CreateAccessCertificateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.amv.access.grpc.CreateAccessCertificateResponse.class, org.amv.access.grpc.CreateAccessCertificateResponse.Builder.class);
  }

  public static final int ACCESS_CERTIFICATE_SIGNING_REQUEST_FIELD_NUMBER = 1;
  private org.amv.access.grpc.AccessCertificateSigningRequest accessCertificateSigningRequest_;
  /**
   * <code>.amv_access_api.AccessCertificateSigningRequest access_certificate_signing_request = 1;</code>
   */
  public boolean hasAccessCertificateSigningRequest() {
    return accessCertificateSigningRequest_ != null;
  }
  /**
   * <code>.amv_access_api.AccessCertificateSigningRequest access_certificate_signing_request = 1;</code>
   */
  public org.amv.access.grpc.AccessCertificateSigningRequest getAccessCertificateSigningRequest() {
    return accessCertificateSigningRequest_ == null ? org.amv.access.grpc.AccessCertificateSigningRequest.getDefaultInstance() : accessCertificateSigningRequest_;
  }
  /**
   * <code>.amv_access_api.AccessCertificateSigningRequest access_certificate_signing_request = 1;</code>
   */
  public org.amv.access.grpc.AccessCertificateSigningRequestOrBuilder getAccessCertificateSigningRequestOrBuilder() {
    return getAccessCertificateSigningRequest();
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
    if (accessCertificateSigningRequest_ != null) {
      output.writeMessage(1, getAccessCertificateSigningRequest());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accessCertificateSigningRequest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAccessCertificateSigningRequest());
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
    if (!(obj instanceof org.amv.access.grpc.CreateAccessCertificateResponse)) {
      return super.equals(obj);
    }
    org.amv.access.grpc.CreateAccessCertificateResponse other = (org.amv.access.grpc.CreateAccessCertificateResponse) obj;

    boolean result = true;
    result = result && (hasAccessCertificateSigningRequest() == other.hasAccessCertificateSigningRequest());
    if (hasAccessCertificateSigningRequest()) {
      result = result && getAccessCertificateSigningRequest()
          .equals(other.getAccessCertificateSigningRequest());
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
    if (hasAccessCertificateSigningRequest()) {
      hash = (37 * hash) + ACCESS_CERTIFICATE_SIGNING_REQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getAccessCertificateSigningRequest().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.amv.access.grpc.CreateAccessCertificateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.amv.access.grpc.CreateAccessCertificateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.amv.access.grpc.CreateAccessCertificateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.amv.access.grpc.CreateAccessCertificateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.amv.access.grpc.CreateAccessCertificateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.amv.access.grpc.CreateAccessCertificateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.amv.access.grpc.CreateAccessCertificateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.amv.access.grpc.CreateAccessCertificateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.amv.access.grpc.CreateAccessCertificateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.amv.access.grpc.CreateAccessCertificateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.amv.access.grpc.CreateAccessCertificateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.amv.access.grpc.CreateAccessCertificateResponse parseFrom(
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
  public static Builder newBuilder(org.amv.access.grpc.CreateAccessCertificateResponse prototype) {
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
   * Protobuf type {@code amv_access_api.CreateAccessCertificateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:amv_access_api.CreateAccessCertificateResponse)
      org.amv.access.grpc.CreateAccessCertificateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.amv.access.grpc.AccessApi.internal_static_amv_access_api_CreateAccessCertificateResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.amv.access.grpc.AccessApi.internal_static_amv_access_api_CreateAccessCertificateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.amv.access.grpc.CreateAccessCertificateResponse.class, org.amv.access.grpc.CreateAccessCertificateResponse.Builder.class);
    }

    // Construct using org.amv.access.grpc.CreateAccessCertificateResponse.newBuilder()
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
      if (accessCertificateSigningRequestBuilder_ == null) {
        accessCertificateSigningRequest_ = null;
      } else {
        accessCertificateSigningRequest_ = null;
        accessCertificateSigningRequestBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.amv.access.grpc.AccessApi.internal_static_amv_access_api_CreateAccessCertificateResponse_descriptor;
    }

    public org.amv.access.grpc.CreateAccessCertificateResponse getDefaultInstanceForType() {
      return org.amv.access.grpc.CreateAccessCertificateResponse.getDefaultInstance();
    }

    public org.amv.access.grpc.CreateAccessCertificateResponse build() {
      org.amv.access.grpc.CreateAccessCertificateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.amv.access.grpc.CreateAccessCertificateResponse buildPartial() {
      org.amv.access.grpc.CreateAccessCertificateResponse result = new org.amv.access.grpc.CreateAccessCertificateResponse(this);
      if (accessCertificateSigningRequestBuilder_ == null) {
        result.accessCertificateSigningRequest_ = accessCertificateSigningRequest_;
      } else {
        result.accessCertificateSigningRequest_ = accessCertificateSigningRequestBuilder_.build();
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
      if (other instanceof org.amv.access.grpc.CreateAccessCertificateResponse) {
        return mergeFrom((org.amv.access.grpc.CreateAccessCertificateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.amv.access.grpc.CreateAccessCertificateResponse other) {
      if (other == org.amv.access.grpc.CreateAccessCertificateResponse.getDefaultInstance()) return this;
      if (other.hasAccessCertificateSigningRequest()) {
        mergeAccessCertificateSigningRequest(other.getAccessCertificateSigningRequest());
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
      org.amv.access.grpc.CreateAccessCertificateResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.amv.access.grpc.CreateAccessCertificateResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.amv.access.grpc.AccessCertificateSigningRequest accessCertificateSigningRequest_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.amv.access.grpc.AccessCertificateSigningRequest, org.amv.access.grpc.AccessCertificateSigningRequest.Builder, org.amv.access.grpc.AccessCertificateSigningRequestOrBuilder> accessCertificateSigningRequestBuilder_;
    /**
     * <code>.amv_access_api.AccessCertificateSigningRequest access_certificate_signing_request = 1;</code>
     */
    public boolean hasAccessCertificateSigningRequest() {
      return accessCertificateSigningRequestBuilder_ != null || accessCertificateSigningRequest_ != null;
    }
    /**
     * <code>.amv_access_api.AccessCertificateSigningRequest access_certificate_signing_request = 1;</code>
     */
    public org.amv.access.grpc.AccessCertificateSigningRequest getAccessCertificateSigningRequest() {
      if (accessCertificateSigningRequestBuilder_ == null) {
        return accessCertificateSigningRequest_ == null ? org.amv.access.grpc.AccessCertificateSigningRequest.getDefaultInstance() : accessCertificateSigningRequest_;
      } else {
        return accessCertificateSigningRequestBuilder_.getMessage();
      }
    }
    /**
     * <code>.amv_access_api.AccessCertificateSigningRequest access_certificate_signing_request = 1;</code>
     */
    public Builder setAccessCertificateSigningRequest(org.amv.access.grpc.AccessCertificateSigningRequest value) {
      if (accessCertificateSigningRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accessCertificateSigningRequest_ = value;
        onChanged();
      } else {
        accessCertificateSigningRequestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.amv_access_api.AccessCertificateSigningRequest access_certificate_signing_request = 1;</code>
     */
    public Builder setAccessCertificateSigningRequest(
        org.amv.access.grpc.AccessCertificateSigningRequest.Builder builderForValue) {
      if (accessCertificateSigningRequestBuilder_ == null) {
        accessCertificateSigningRequest_ = builderForValue.build();
        onChanged();
      } else {
        accessCertificateSigningRequestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.amv_access_api.AccessCertificateSigningRequest access_certificate_signing_request = 1;</code>
     */
    public Builder mergeAccessCertificateSigningRequest(org.amv.access.grpc.AccessCertificateSigningRequest value) {
      if (accessCertificateSigningRequestBuilder_ == null) {
        if (accessCertificateSigningRequest_ != null) {
          accessCertificateSigningRequest_ =
            org.amv.access.grpc.AccessCertificateSigningRequest.newBuilder(accessCertificateSigningRequest_).mergeFrom(value).buildPartial();
        } else {
          accessCertificateSigningRequest_ = value;
        }
        onChanged();
      } else {
        accessCertificateSigningRequestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.amv_access_api.AccessCertificateSigningRequest access_certificate_signing_request = 1;</code>
     */
    public Builder clearAccessCertificateSigningRequest() {
      if (accessCertificateSigningRequestBuilder_ == null) {
        accessCertificateSigningRequest_ = null;
        onChanged();
      } else {
        accessCertificateSigningRequest_ = null;
        accessCertificateSigningRequestBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.amv_access_api.AccessCertificateSigningRequest access_certificate_signing_request = 1;</code>
     */
    public org.amv.access.grpc.AccessCertificateSigningRequest.Builder getAccessCertificateSigningRequestBuilder() {
      
      onChanged();
      return getAccessCertificateSigningRequestFieldBuilder().getBuilder();
    }
    /**
     * <code>.amv_access_api.AccessCertificateSigningRequest access_certificate_signing_request = 1;</code>
     */
    public org.amv.access.grpc.AccessCertificateSigningRequestOrBuilder getAccessCertificateSigningRequestOrBuilder() {
      if (accessCertificateSigningRequestBuilder_ != null) {
        return accessCertificateSigningRequestBuilder_.getMessageOrBuilder();
      } else {
        return accessCertificateSigningRequest_ == null ?
            org.amv.access.grpc.AccessCertificateSigningRequest.getDefaultInstance() : accessCertificateSigningRequest_;
      }
    }
    /**
     * <code>.amv_access_api.AccessCertificateSigningRequest access_certificate_signing_request = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.amv.access.grpc.AccessCertificateSigningRequest, org.amv.access.grpc.AccessCertificateSigningRequest.Builder, org.amv.access.grpc.AccessCertificateSigningRequestOrBuilder> 
        getAccessCertificateSigningRequestFieldBuilder() {
      if (accessCertificateSigningRequestBuilder_ == null) {
        accessCertificateSigningRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.amv.access.grpc.AccessCertificateSigningRequest, org.amv.access.grpc.AccessCertificateSigningRequest.Builder, org.amv.access.grpc.AccessCertificateSigningRequestOrBuilder>(
                getAccessCertificateSigningRequest(),
                getParentForChildren(),
                isClean());
        accessCertificateSigningRequest_ = null;
      }
      return accessCertificateSigningRequestBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:amv_access_api.CreateAccessCertificateResponse)
  }

  // @@protoc_insertion_point(class_scope:amv_access_api.CreateAccessCertificateResponse)
  private static final org.amv.access.grpc.CreateAccessCertificateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.amv.access.grpc.CreateAccessCertificateResponse();
  }

  public static org.amv.access.grpc.CreateAccessCertificateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAccessCertificateResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateAccessCertificateResponse>() {
    public CreateAccessCertificateResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateAccessCertificateResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateAccessCertificateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAccessCertificateResponse> getParserForType() {
    return PARSER;
  }

  public org.amv.access.grpc.CreateAccessCertificateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

