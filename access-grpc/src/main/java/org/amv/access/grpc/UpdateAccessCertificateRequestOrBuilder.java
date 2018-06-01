// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: access_api.proto

package org.amv.access.grpc;

public interface UpdateAccessCertificateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:amv_access_api.UpdateAccessCertificateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.amv_access_api.IssuerAuth issuer_auth = 1;</code>
   */
  boolean hasIssuerAuth();
  /**
   * <code>.amv_access_api.IssuerAuth issuer_auth = 1;</code>
   */
  org.amv.access.grpc.IssuerAuth getIssuerAuth();
  /**
   * <code>.amv_access_api.IssuerAuth issuer_auth = 1;</code>
   */
  org.amv.access.grpc.IssuerAuthOrBuilder getIssuerAuthOrBuilder();

  /**
   * <code>string access_certificate_id = 2;</code>
   */
  java.lang.String getAccessCertificateId();
  /**
   * <code>string access_certificate_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getAccessCertificateIdBytes();

  /**
   * <code>string vehicle_access_certificate_signature_base64 = 3;</code>
   */
  java.lang.String getVehicleAccessCertificateSignatureBase64();
  /**
   * <code>string vehicle_access_certificate_signature_base64 = 3;</code>
   */
  com.google.protobuf.ByteString
      getVehicleAccessCertificateSignatureBase64Bytes();

  /**
   * <code>string signed_vehicle_access_certificate_base64 = 4;</code>
   */
  java.lang.String getSignedVehicleAccessCertificateBase64();
  /**
   * <code>string signed_vehicle_access_certificate_base64 = 4;</code>
   */
  com.google.protobuf.ByteString
      getSignedVehicleAccessCertificateBase64Bytes();

  /**
   * <code>string device_access_certificate_signature_base64 = 5;</code>
   */
  java.lang.String getDeviceAccessCertificateSignatureBase64();
  /**
   * <code>string device_access_certificate_signature_base64 = 5;</code>
   */
  com.google.protobuf.ByteString
      getDeviceAccessCertificateSignatureBase64Bytes();

  /**
   * <code>string signed_device_access_certificate_base64 = 6;</code>
   */
  java.lang.String getSignedDeviceAccessCertificateBase64();
  /**
   * <code>string signed_device_access_certificate_base64 = 6;</code>
   */
  com.google.protobuf.ByteString
      getSignedDeviceAccessCertificateBase64Bytes();
}
