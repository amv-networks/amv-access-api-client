package org.amv.access.grpc.device;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: access_api_device.proto")
public final class DeviceServiceGrpc {

  private DeviceServiceGrpc() {}

  public static final String SERVICE_NAME = "amv_access_api.DeviceService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateDeviceCertificateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.amv.access.grpc.device.CreateDeviceCertificateRequest,
      org.amv.access.grpc.device.CreateDeviceCertificateResponse> METHOD_CREATE_DEVICE_CERTIFICATE = getCreateDeviceCertificateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.amv.access.grpc.device.CreateDeviceCertificateRequest,
      org.amv.access.grpc.device.CreateDeviceCertificateResponse> getCreateDeviceCertificateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.amv.access.grpc.device.CreateDeviceCertificateRequest,
      org.amv.access.grpc.device.CreateDeviceCertificateResponse> getCreateDeviceCertificateMethod() {
    return getCreateDeviceCertificateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.amv.access.grpc.device.CreateDeviceCertificateRequest,
      org.amv.access.grpc.device.CreateDeviceCertificateResponse> getCreateDeviceCertificateMethodHelper() {
    io.grpc.MethodDescriptor<org.amv.access.grpc.device.CreateDeviceCertificateRequest, org.amv.access.grpc.device.CreateDeviceCertificateResponse> getCreateDeviceCertificateMethod;
    if ((getCreateDeviceCertificateMethod = DeviceServiceGrpc.getCreateDeviceCertificateMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getCreateDeviceCertificateMethod = DeviceServiceGrpc.getCreateDeviceCertificateMethod) == null) {
          DeviceServiceGrpc.getCreateDeviceCertificateMethod = getCreateDeviceCertificateMethod = 
              io.grpc.MethodDescriptor.<org.amv.access.grpc.device.CreateDeviceCertificateRequest, org.amv.access.grpc.device.CreateDeviceCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "amv_access_api.DeviceService", "createDeviceCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.amv.access.grpc.device.CreateDeviceCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.amv.access.grpc.device.CreateDeviceCertificateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("createDeviceCertificate"))
                  .build();
          }
        }
     }
     return getCreateDeviceCertificateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeviceServiceStub newStub(io.grpc.Channel channel) {
    return new DeviceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeviceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeviceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeviceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeviceServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DeviceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createDeviceCertificate(org.amv.access.grpc.device.CreateDeviceCertificateRequest request,
        io.grpc.stub.StreamObserver<org.amv.access.grpc.device.CreateDeviceCertificateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateDeviceCertificateMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateDeviceCertificateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.amv.access.grpc.device.CreateDeviceCertificateRequest,
                org.amv.access.grpc.device.CreateDeviceCertificateResponse>(
                  this, METHODID_CREATE_DEVICE_CERTIFICATE)))
          .build();
    }
  }

  /**
   */
  public static final class DeviceServiceStub extends io.grpc.stub.AbstractStub<DeviceServiceStub> {
    private DeviceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceServiceStub(channel, callOptions);
    }

    /**
     */
    public void createDeviceCertificate(org.amv.access.grpc.device.CreateDeviceCertificateRequest request,
        io.grpc.stub.StreamObserver<org.amv.access.grpc.device.CreateDeviceCertificateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateDeviceCertificateMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeviceServiceBlockingStub extends io.grpc.stub.AbstractStub<DeviceServiceBlockingStub> {
    private DeviceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.amv.access.grpc.device.CreateDeviceCertificateResponse createDeviceCertificate(org.amv.access.grpc.device.CreateDeviceCertificateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateDeviceCertificateMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeviceServiceFutureStub extends io.grpc.stub.AbstractStub<DeviceServiceFutureStub> {
    private DeviceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.amv.access.grpc.device.CreateDeviceCertificateResponse> createDeviceCertificate(
        org.amv.access.grpc.device.CreateDeviceCertificateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateDeviceCertificateMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DEVICE_CERTIFICATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeviceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeviceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_DEVICE_CERTIFICATE:
          serviceImpl.createDeviceCertificate((org.amv.access.grpc.device.CreateDeviceCertificateRequest) request,
              (io.grpc.stub.StreamObserver<org.amv.access.grpc.device.CreateDeviceCertificateResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DeviceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeviceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.amv.access.grpc.device.AccessDeviceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeviceService");
    }
  }

  private static final class DeviceServiceFileDescriptorSupplier
      extends DeviceServiceBaseDescriptorSupplier {
    DeviceServiceFileDescriptorSupplier() {}
  }

  private static final class DeviceServiceMethodDescriptorSupplier
      extends DeviceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeviceServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DeviceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeviceServiceFileDescriptorSupplier())
              .addMethod(getCreateDeviceCertificateMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
