// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: access_api.proto

package org.amv.access.grpc;

public interface CreateVehicleResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:amv_access_api.CreateVehicleResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string vehicle_serial_number = 1;</code>
   */
  java.lang.String getVehicleSerialNumber();
  /**
   * <code>string vehicle_serial_number = 1;</code>
   */
  com.google.protobuf.ByteString
      getVehicleSerialNumberBytes();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string public_key_base64 = 4;</code>
   */
  java.lang.String getPublicKeyBase64();
  /**
   * <code>string public_key_base64 = 4;</code>
   */
  com.google.protobuf.ByteString
      getPublicKeyBase64Bytes();
}