// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: access_api.proto

package org.amv.access.grpc;

public final class AccessApi {
  private AccessApi() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020access_api.proto\022\016amv_access_api\032\027acce" +
      "ss_api_access.proto\032\025access_api_auth.pro" +
      "to\032\027access_api_device.proto\032\030access_api_" +
      "vehicle.protoB\027\n\023org.amv.access.grpcP\001b\006" +
      "proto3"
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
          org.amv.access.grpc.access.AccessProto.getDescriptor(),
          org.amv.access.grpc.auth.AccessAuthProto.getDescriptor(),
          org.amv.access.grpc.device.AccessDeviceProto.getDescriptor(),
          org.amv.access.grpc.vehicle.AccessVehicleProto.getDescriptor(),
        }, assigner);
    org.amv.access.grpc.access.AccessProto.getDescriptor();
    org.amv.access.grpc.auth.AccessAuthProto.getDescriptor();
    org.amv.access.grpc.device.AccessDeviceProto.getDescriptor();
    org.amv.access.grpc.vehicle.AccessVehicleProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
