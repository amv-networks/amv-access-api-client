// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: access_api_access.proto

package org.amv.access.grpc.access;

public final class AccessProto {
  private AccessProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_amv_access_api_AccessCertificate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_amv_access_api_AccessCertificate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_amv_access_api_GetAccessCertificatesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_amv_access_api_GetAccessCertificatesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_amv_access_api_GetAccessCertificatesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_amv_access_api_GetAccessCertificatesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_amv_access_api_CreateAccessCertificateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_amv_access_api_CreateAccessCertificateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_amv_access_api_CreateAccessCertificateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_amv_access_api_CreateAccessCertificateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_amv_access_api_AccessCertificateSigningRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_amv_access_api_AccessCertificateSigningRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_amv_access_api_SignAccessCertificateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_amv_access_api_SignAccessCertificateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_amv_access_api_SignAccessCertificateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_amv_access_api_SignAccessCertificateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027access_api_access.proto\022\016amv_access_ap" +
      "i\032\025access_api_auth.proto\"t\n\021AccessCertif" +
      "icate\022\n\n\002id\030\001 \001(\t\022!\n\031device_access_certi" +
      "ficate\030\002 \001(\t\022\"\n\032vehicle_access_certifica" +
      "te\030\003 \001(\t\022\014\n\004name\030\004 \001(\t\"O\n\034GetAccessCerti" +
      "ficatesRequest\022/\n\013device_auth\030\001 \001(\0132\032.am" +
      "v_access_api.DeviceAuth\"_\n\035GetAccessCert" +
      "ificatesResponse\022>\n\023access_certificates\030" +
      "\001 \003(\0132!.amv_access_api.AccessCertificate" +
      "\"\314\001\n\036CreateAccessCertificateRequest\022/\n\013i" +
      "ssuer_auth\030\001 \001(\0132\032.amv_access_api.Issuer" +
      "Auth\022\016\n\006app_id\030\002 \001(\t\022\034\n\024device_serial_nu" +
      "mber\030\003 \001(\t\022\035\n\025vehicle_serial_number\030\004 \001(" +
      "\t\022\026\n\016validity_start\030\005 \001(\003\022\024\n\014validity_en" +
      "d\030\006 \001(\003\"~\n\037CreateAccessCertificateRespon" +
      "se\022[\n\"access_certificate_signing_request" +
      "\030\001 \001(\0132/.amv_access_api.AccessCertificat" +
      "eSigningRequest\"t\n\037AccessCertificateSign" +
      "ingRequest\022\n\n\002id\030\001 \001(\t\022!\n\031device_access_" +
      "certificate\030\002 \001(\t\022\"\n\032vehicle_access_cert" +
      "ificate\030\003 \001(\t\"\272\002\n\034SignAccessCertificateR" +
      "equest\022/\n\013issuer_auth\030\001 \001(\0132\032.amv_access" +
      "_api.IssuerAuth\022\035\n\025access_certificate_id" +
      "\030\002 \001(\t\0223\n+vehicle_access_certificate_sig" +
      "nature_base64\030\003 \001(\t\0220\n(signed_vehicle_ac" +
      "cess_certificate_base64\030\004 \001(\t\0222\n*device_" +
      "access_certificate_signature_base64\030\005 \001(" +
      "\t\022/\n\'signed_device_access_certificate_ba" +
      "se64\030\006 \001(\t\"^\n\035SignAccessCertificateRespo" +
      "nse\022=\n\022access_certificate\030\001 \001(\0132!.amv_ac" +
      "cess_api.AccessCertificate2\375\002\n\rAccessSer" +
      "vice\022v\n\025getAccessCertificates\022,.amv_acce" +
      "ss_api.GetAccessCertificatesRequest\032-.am" +
      "v_access_api.GetAccessCertificatesRespon" +
      "se\"\000\022|\n\027createAccessCertificate\022..amv_ac" +
      "cess_api.CreateAccessCertificateRequest\032" +
      "/.amv_access_api.CreateAccessCertificate" +
      "Response\"\000\022v\n\025signAccessCertificate\022,.am" +
      "v_access_api.SignAccessCertificateReques" +
      "t\032-.amv_access_api.SignAccessCertificate" +
      "Response\"\000B+\n\032org.amv.access.grpc.access" +
      "B\013AccessProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.amv.access.grpc.auth.AccessAuthProto.getDescriptor(),
        }, assigner);
    internal_static_amv_access_api_AccessCertificate_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_amv_access_api_AccessCertificate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_amv_access_api_AccessCertificate_descriptor,
        new java.lang.String[] { "Id", "DeviceAccessCertificate", "VehicleAccessCertificate", "Name", });
    internal_static_amv_access_api_GetAccessCertificatesRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_amv_access_api_GetAccessCertificatesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_amv_access_api_GetAccessCertificatesRequest_descriptor,
        new java.lang.String[] { "DeviceAuth", });
    internal_static_amv_access_api_GetAccessCertificatesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_amv_access_api_GetAccessCertificatesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_amv_access_api_GetAccessCertificatesResponse_descriptor,
        new java.lang.String[] { "AccessCertificates", });
    internal_static_amv_access_api_CreateAccessCertificateRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_amv_access_api_CreateAccessCertificateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_amv_access_api_CreateAccessCertificateRequest_descriptor,
        new java.lang.String[] { "IssuerAuth", "AppId", "DeviceSerialNumber", "VehicleSerialNumber", "ValidityStart", "ValidityEnd", });
    internal_static_amv_access_api_CreateAccessCertificateResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_amv_access_api_CreateAccessCertificateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_amv_access_api_CreateAccessCertificateResponse_descriptor,
        new java.lang.String[] { "AccessCertificateSigningRequest", });
    internal_static_amv_access_api_AccessCertificateSigningRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_amv_access_api_AccessCertificateSigningRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_amv_access_api_AccessCertificateSigningRequest_descriptor,
        new java.lang.String[] { "Id", "DeviceAccessCertificate", "VehicleAccessCertificate", });
    internal_static_amv_access_api_SignAccessCertificateRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_amv_access_api_SignAccessCertificateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_amv_access_api_SignAccessCertificateRequest_descriptor,
        new java.lang.String[] { "IssuerAuth", "AccessCertificateId", "VehicleAccessCertificateSignatureBase64", "SignedVehicleAccessCertificateBase64", "DeviceAccessCertificateSignatureBase64", "SignedDeviceAccessCertificateBase64", });
    internal_static_amv_access_api_SignAccessCertificateResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_amv_access_api_SignAccessCertificateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_amv_access_api_SignAccessCertificateResponse_descriptor,
        new java.lang.String[] { "AccessCertificate", });
    org.amv.access.grpc.auth.AccessAuthProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
