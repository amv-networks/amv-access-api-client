package org.amv.access.grpc;

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
    comments = "Source: access_api.proto")
public final class VehicleServiceGrpc {

  private VehicleServiceGrpc() {}

  public static final String SERVICE_NAME = "amv_access_api.VehicleService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateVehicleMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.amv.access.grpc.CreateVehicleRequest,
      org.amv.access.grpc.CreateVehicleResponse> METHOD_CREATE_VEHICLE = getCreateVehicleMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.amv.access.grpc.CreateVehicleRequest,
      org.amv.access.grpc.CreateVehicleResponse> getCreateVehicleMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.amv.access.grpc.CreateVehicleRequest,
      org.amv.access.grpc.CreateVehicleResponse> getCreateVehicleMethod() {
    return getCreateVehicleMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.amv.access.grpc.CreateVehicleRequest,
      org.amv.access.grpc.CreateVehicleResponse> getCreateVehicleMethodHelper() {
    io.grpc.MethodDescriptor<org.amv.access.grpc.CreateVehicleRequest, org.amv.access.grpc.CreateVehicleResponse> getCreateVehicleMethod;
    if ((getCreateVehicleMethod = VehicleServiceGrpc.getCreateVehicleMethod) == null) {
      synchronized (VehicleServiceGrpc.class) {
        if ((getCreateVehicleMethod = VehicleServiceGrpc.getCreateVehicleMethod) == null) {
          VehicleServiceGrpc.getCreateVehicleMethod = getCreateVehicleMethod = 
              io.grpc.MethodDescriptor.<org.amv.access.grpc.CreateVehicleRequest, org.amv.access.grpc.CreateVehicleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "amv_access_api.VehicleService", "createVehicle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.amv.access.grpc.CreateVehicleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.amv.access.grpc.CreateVehicleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VehicleServiceMethodDescriptorSupplier("createVehicle"))
                  .build();
          }
        }
     }
     return getCreateVehicleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VehicleServiceStub newStub(io.grpc.Channel channel) {
    return new VehicleServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VehicleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VehicleServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VehicleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VehicleServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class VehicleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createVehicle(org.amv.access.grpc.CreateVehicleRequest request,
        io.grpc.stub.StreamObserver<org.amv.access.grpc.CreateVehicleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateVehicleMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateVehicleMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.amv.access.grpc.CreateVehicleRequest,
                org.amv.access.grpc.CreateVehicleResponse>(
                  this, METHODID_CREATE_VEHICLE)))
          .build();
    }
  }

  /**
   */
  public static final class VehicleServiceStub extends io.grpc.stub.AbstractStub<VehicleServiceStub> {
    private VehicleServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VehicleServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VehicleServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VehicleServiceStub(channel, callOptions);
    }

    /**
     */
    public void createVehicle(org.amv.access.grpc.CreateVehicleRequest request,
        io.grpc.stub.StreamObserver<org.amv.access.grpc.CreateVehicleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateVehicleMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VehicleServiceBlockingStub extends io.grpc.stub.AbstractStub<VehicleServiceBlockingStub> {
    private VehicleServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VehicleServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VehicleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VehicleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.amv.access.grpc.CreateVehicleResponse createVehicle(org.amv.access.grpc.CreateVehicleRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateVehicleMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VehicleServiceFutureStub extends io.grpc.stub.AbstractStub<VehicleServiceFutureStub> {
    private VehicleServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VehicleServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VehicleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VehicleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.amv.access.grpc.CreateVehicleResponse> createVehicle(
        org.amv.access.grpc.CreateVehicleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateVehicleMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_VEHICLE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VehicleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VehicleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_VEHICLE:
          serviceImpl.createVehicle((org.amv.access.grpc.CreateVehicleRequest) request,
              (io.grpc.stub.StreamObserver<org.amv.access.grpc.CreateVehicleResponse>) responseObserver);
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

  private static abstract class VehicleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VehicleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.amv.access.grpc.AccessApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VehicleService");
    }
  }

  private static final class VehicleServiceFileDescriptorSupplier
      extends VehicleServiceBaseDescriptorSupplier {
    VehicleServiceFileDescriptorSupplier() {}
  }

  private static final class VehicleServiceMethodDescriptorSupplier
      extends VehicleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VehicleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VehicleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VehicleServiceFileDescriptorSupplier())
              .addMethod(getCreateVehicleMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
