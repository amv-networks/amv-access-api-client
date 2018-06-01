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
public final class AccessCertServiceGrpc {

  private AccessCertServiceGrpc() {}

  public static final String SERVICE_NAME = "amv_access_api.AccessCertService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateAccessCertificateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.amv.access.grpc.CreateAccessCertificateRequest,
      org.amv.access.grpc.CreateAccessCertificateResponse> METHOD_CREATE_ACCESS_CERTIFICATE = getCreateAccessCertificateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.amv.access.grpc.CreateAccessCertificateRequest,
      org.amv.access.grpc.CreateAccessCertificateResponse> getCreateAccessCertificateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.amv.access.grpc.CreateAccessCertificateRequest,
      org.amv.access.grpc.CreateAccessCertificateResponse> getCreateAccessCertificateMethod() {
    return getCreateAccessCertificateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.amv.access.grpc.CreateAccessCertificateRequest,
      org.amv.access.grpc.CreateAccessCertificateResponse> getCreateAccessCertificateMethodHelper() {
    io.grpc.MethodDescriptor<org.amv.access.grpc.CreateAccessCertificateRequest, org.amv.access.grpc.CreateAccessCertificateResponse> getCreateAccessCertificateMethod;
    if ((getCreateAccessCertificateMethod = AccessCertServiceGrpc.getCreateAccessCertificateMethod) == null) {
      synchronized (AccessCertServiceGrpc.class) {
        if ((getCreateAccessCertificateMethod = AccessCertServiceGrpc.getCreateAccessCertificateMethod) == null) {
          AccessCertServiceGrpc.getCreateAccessCertificateMethod = getCreateAccessCertificateMethod = 
              io.grpc.MethodDescriptor.<org.amv.access.grpc.CreateAccessCertificateRequest, org.amv.access.grpc.CreateAccessCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "amv_access_api.AccessCertService", "createAccessCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.amv.access.grpc.CreateAccessCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.amv.access.grpc.CreateAccessCertificateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AccessCertServiceMethodDescriptorSupplier("createAccessCertificate"))
                  .build();
          }
        }
     }
     return getCreateAccessCertificateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSignAccessCertificateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.amv.access.grpc.UpdateAccessCertificateRequest,
      org.amv.access.grpc.CreateAccessCertificateResponse> METHOD_SIGN_ACCESS_CERTIFICATE = getSignAccessCertificateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.amv.access.grpc.UpdateAccessCertificateRequest,
      org.amv.access.grpc.CreateAccessCertificateResponse> getSignAccessCertificateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.amv.access.grpc.UpdateAccessCertificateRequest,
      org.amv.access.grpc.CreateAccessCertificateResponse> getSignAccessCertificateMethod() {
    return getSignAccessCertificateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.amv.access.grpc.UpdateAccessCertificateRequest,
      org.amv.access.grpc.CreateAccessCertificateResponse> getSignAccessCertificateMethodHelper() {
    io.grpc.MethodDescriptor<org.amv.access.grpc.UpdateAccessCertificateRequest, org.amv.access.grpc.CreateAccessCertificateResponse> getSignAccessCertificateMethod;
    if ((getSignAccessCertificateMethod = AccessCertServiceGrpc.getSignAccessCertificateMethod) == null) {
      synchronized (AccessCertServiceGrpc.class) {
        if ((getSignAccessCertificateMethod = AccessCertServiceGrpc.getSignAccessCertificateMethod) == null) {
          AccessCertServiceGrpc.getSignAccessCertificateMethod = getSignAccessCertificateMethod = 
              io.grpc.MethodDescriptor.<org.amv.access.grpc.UpdateAccessCertificateRequest, org.amv.access.grpc.CreateAccessCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "amv_access_api.AccessCertService", "signAccessCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.amv.access.grpc.UpdateAccessCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.amv.access.grpc.CreateAccessCertificateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AccessCertServiceMethodDescriptorSupplier("signAccessCertificate"))
                  .build();
          }
        }
     }
     return getSignAccessCertificateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccessCertServiceStub newStub(io.grpc.Channel channel) {
    return new AccessCertServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessCertServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AccessCertServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccessCertServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AccessCertServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AccessCertServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createAccessCertificate(org.amv.access.grpc.CreateAccessCertificateRequest request,
        io.grpc.stub.StreamObserver<org.amv.access.grpc.CreateAccessCertificateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAccessCertificateMethodHelper(), responseObserver);
    }

    /**
     */
    public void signAccessCertificate(org.amv.access.grpc.UpdateAccessCertificateRequest request,
        io.grpc.stub.StreamObserver<org.amv.access.grpc.CreateAccessCertificateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSignAccessCertificateMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateAccessCertificateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.amv.access.grpc.CreateAccessCertificateRequest,
                org.amv.access.grpc.CreateAccessCertificateResponse>(
                  this, METHODID_CREATE_ACCESS_CERTIFICATE)))
          .addMethod(
            getSignAccessCertificateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.amv.access.grpc.UpdateAccessCertificateRequest,
                org.amv.access.grpc.CreateAccessCertificateResponse>(
                  this, METHODID_SIGN_ACCESS_CERTIFICATE)))
          .build();
    }
  }

  /**
   */
  public static final class AccessCertServiceStub extends io.grpc.stub.AbstractStub<AccessCertServiceStub> {
    private AccessCertServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccessCertServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessCertServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccessCertServiceStub(channel, callOptions);
    }

    /**
     */
    public void createAccessCertificate(org.amv.access.grpc.CreateAccessCertificateRequest request,
        io.grpc.stub.StreamObserver<org.amv.access.grpc.CreateAccessCertificateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAccessCertificateMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signAccessCertificate(org.amv.access.grpc.UpdateAccessCertificateRequest request,
        io.grpc.stub.StreamObserver<org.amv.access.grpc.CreateAccessCertificateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignAccessCertificateMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccessCertServiceBlockingStub extends io.grpc.stub.AbstractStub<AccessCertServiceBlockingStub> {
    private AccessCertServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccessCertServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessCertServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccessCertServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.amv.access.grpc.CreateAccessCertificateResponse createAccessCertificate(org.amv.access.grpc.CreateAccessCertificateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateAccessCertificateMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public org.amv.access.grpc.CreateAccessCertificateResponse signAccessCertificate(org.amv.access.grpc.UpdateAccessCertificateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSignAccessCertificateMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccessCertServiceFutureStub extends io.grpc.stub.AbstractStub<AccessCertServiceFutureStub> {
    private AccessCertServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccessCertServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessCertServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccessCertServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.amv.access.grpc.CreateAccessCertificateResponse> createAccessCertificate(
        org.amv.access.grpc.CreateAccessCertificateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAccessCertificateMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.amv.access.grpc.CreateAccessCertificateResponse> signAccessCertificate(
        org.amv.access.grpc.UpdateAccessCertificateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSignAccessCertificateMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ACCESS_CERTIFICATE = 0;
  private static final int METHODID_SIGN_ACCESS_CERTIFICATE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccessCertServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccessCertServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ACCESS_CERTIFICATE:
          serviceImpl.createAccessCertificate((org.amv.access.grpc.CreateAccessCertificateRequest) request,
              (io.grpc.stub.StreamObserver<org.amv.access.grpc.CreateAccessCertificateResponse>) responseObserver);
          break;
        case METHODID_SIGN_ACCESS_CERTIFICATE:
          serviceImpl.signAccessCertificate((org.amv.access.grpc.UpdateAccessCertificateRequest) request,
              (io.grpc.stub.StreamObserver<org.amv.access.grpc.CreateAccessCertificateResponse>) responseObserver);
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

  private static abstract class AccessCertServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccessCertServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.amv.access.grpc.AccessApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccessCertService");
    }
  }

  private static final class AccessCertServiceFileDescriptorSupplier
      extends AccessCertServiceBaseDescriptorSupplier {
    AccessCertServiceFileDescriptorSupplier() {}
  }

  private static final class AccessCertServiceMethodDescriptorSupplier
      extends AccessCertServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccessCertServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccessCertServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccessCertServiceFileDescriptorSupplier())
              .addMethod(getCreateAccessCertificateMethodHelper())
              .addMethod(getSignAccessCertificateMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}