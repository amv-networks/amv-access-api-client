package org.amv.access.grpc.access;

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
    comments = "Source: access_api_access.proto")
public final class AccessServiceGrpc {

  private AccessServiceGrpc() {}

  public static final String SERVICE_NAME = "amv_access_api.AccessService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateAccessCertificateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.amv.access.grpc.access.CreateAccessCertificateRequest,
      org.amv.access.grpc.access.CreateAccessCertificateResponse> METHOD_CREATE_ACCESS_CERTIFICATE = getCreateAccessCertificateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.amv.access.grpc.access.CreateAccessCertificateRequest,
      org.amv.access.grpc.access.CreateAccessCertificateResponse> getCreateAccessCertificateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.amv.access.grpc.access.CreateAccessCertificateRequest,
      org.amv.access.grpc.access.CreateAccessCertificateResponse> getCreateAccessCertificateMethod() {
    return getCreateAccessCertificateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.amv.access.grpc.access.CreateAccessCertificateRequest,
      org.amv.access.grpc.access.CreateAccessCertificateResponse> getCreateAccessCertificateMethodHelper() {
    io.grpc.MethodDescriptor<org.amv.access.grpc.access.CreateAccessCertificateRequest, org.amv.access.grpc.access.CreateAccessCertificateResponse> getCreateAccessCertificateMethod;
    if ((getCreateAccessCertificateMethod = AccessServiceGrpc.getCreateAccessCertificateMethod) == null) {
      synchronized (AccessServiceGrpc.class) {
        if ((getCreateAccessCertificateMethod = AccessServiceGrpc.getCreateAccessCertificateMethod) == null) {
          AccessServiceGrpc.getCreateAccessCertificateMethod = getCreateAccessCertificateMethod = 
              io.grpc.MethodDescriptor.<org.amv.access.grpc.access.CreateAccessCertificateRequest, org.amv.access.grpc.access.CreateAccessCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "amv_access_api.AccessService", "createAccessCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.amv.access.grpc.access.CreateAccessCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.amv.access.grpc.access.CreateAccessCertificateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AccessServiceMethodDescriptorSupplier("createAccessCertificate"))
                  .build();
          }
        }
     }
     return getCreateAccessCertificateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSignAccessCertificateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.amv.access.grpc.access.UpdateAccessCertificateRequest,
      org.amv.access.grpc.access.CreateAccessCertificateResponse> METHOD_SIGN_ACCESS_CERTIFICATE = getSignAccessCertificateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.amv.access.grpc.access.UpdateAccessCertificateRequest,
      org.amv.access.grpc.access.CreateAccessCertificateResponse> getSignAccessCertificateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.amv.access.grpc.access.UpdateAccessCertificateRequest,
      org.amv.access.grpc.access.CreateAccessCertificateResponse> getSignAccessCertificateMethod() {
    return getSignAccessCertificateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.amv.access.grpc.access.UpdateAccessCertificateRequest,
      org.amv.access.grpc.access.CreateAccessCertificateResponse> getSignAccessCertificateMethodHelper() {
    io.grpc.MethodDescriptor<org.amv.access.grpc.access.UpdateAccessCertificateRequest, org.amv.access.grpc.access.CreateAccessCertificateResponse> getSignAccessCertificateMethod;
    if ((getSignAccessCertificateMethod = AccessServiceGrpc.getSignAccessCertificateMethod) == null) {
      synchronized (AccessServiceGrpc.class) {
        if ((getSignAccessCertificateMethod = AccessServiceGrpc.getSignAccessCertificateMethod) == null) {
          AccessServiceGrpc.getSignAccessCertificateMethod = getSignAccessCertificateMethod = 
              io.grpc.MethodDescriptor.<org.amv.access.grpc.access.UpdateAccessCertificateRequest, org.amv.access.grpc.access.CreateAccessCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "amv_access_api.AccessService", "signAccessCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.amv.access.grpc.access.UpdateAccessCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.amv.access.grpc.access.CreateAccessCertificateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AccessServiceMethodDescriptorSupplier("signAccessCertificate"))
                  .build();
          }
        }
     }
     return getSignAccessCertificateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccessServiceStub newStub(io.grpc.Channel channel) {
    return new AccessServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AccessServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccessServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AccessServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AccessServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createAccessCertificate(org.amv.access.grpc.access.CreateAccessCertificateRequest request,
        io.grpc.stub.StreamObserver<org.amv.access.grpc.access.CreateAccessCertificateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAccessCertificateMethodHelper(), responseObserver);
    }

    /**
     */
    public void signAccessCertificate(org.amv.access.grpc.access.UpdateAccessCertificateRequest request,
        io.grpc.stub.StreamObserver<org.amv.access.grpc.access.CreateAccessCertificateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSignAccessCertificateMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateAccessCertificateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.amv.access.grpc.access.CreateAccessCertificateRequest,
                org.amv.access.grpc.access.CreateAccessCertificateResponse>(
                  this, METHODID_CREATE_ACCESS_CERTIFICATE)))
          .addMethod(
            getSignAccessCertificateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.amv.access.grpc.access.UpdateAccessCertificateRequest,
                org.amv.access.grpc.access.CreateAccessCertificateResponse>(
                  this, METHODID_SIGN_ACCESS_CERTIFICATE)))
          .build();
    }
  }

  /**
   */
  public static final class AccessServiceStub extends io.grpc.stub.AbstractStub<AccessServiceStub> {
    private AccessServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccessServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccessServiceStub(channel, callOptions);
    }

    /**
     */
    public void createAccessCertificate(org.amv.access.grpc.access.CreateAccessCertificateRequest request,
        io.grpc.stub.StreamObserver<org.amv.access.grpc.access.CreateAccessCertificateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAccessCertificateMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signAccessCertificate(org.amv.access.grpc.access.UpdateAccessCertificateRequest request,
        io.grpc.stub.StreamObserver<org.amv.access.grpc.access.CreateAccessCertificateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignAccessCertificateMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccessServiceBlockingStub extends io.grpc.stub.AbstractStub<AccessServiceBlockingStub> {
    private AccessServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccessServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccessServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.amv.access.grpc.access.CreateAccessCertificateResponse createAccessCertificate(org.amv.access.grpc.access.CreateAccessCertificateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateAccessCertificateMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public org.amv.access.grpc.access.CreateAccessCertificateResponse signAccessCertificate(org.amv.access.grpc.access.UpdateAccessCertificateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSignAccessCertificateMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccessServiceFutureStub extends io.grpc.stub.AbstractStub<AccessServiceFutureStub> {
    private AccessServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccessServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccessServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.amv.access.grpc.access.CreateAccessCertificateResponse> createAccessCertificate(
        org.amv.access.grpc.access.CreateAccessCertificateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAccessCertificateMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.amv.access.grpc.access.CreateAccessCertificateResponse> signAccessCertificate(
        org.amv.access.grpc.access.UpdateAccessCertificateRequest request) {
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
    private final AccessServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccessServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ACCESS_CERTIFICATE:
          serviceImpl.createAccessCertificate((org.amv.access.grpc.access.CreateAccessCertificateRequest) request,
              (io.grpc.stub.StreamObserver<org.amv.access.grpc.access.CreateAccessCertificateResponse>) responseObserver);
          break;
        case METHODID_SIGN_ACCESS_CERTIFICATE:
          serviceImpl.signAccessCertificate((org.amv.access.grpc.access.UpdateAccessCertificateRequest) request,
              (io.grpc.stub.StreamObserver<org.amv.access.grpc.access.CreateAccessCertificateResponse>) responseObserver);
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

  private static abstract class AccessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccessServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.amv.access.grpc.access.AccessProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccessService");
    }
  }

  private static final class AccessServiceFileDescriptorSupplier
      extends AccessServiceBaseDescriptorSupplier {
    AccessServiceFileDescriptorSupplier() {}
  }

  private static final class AccessServiceMethodDescriptorSupplier
      extends AccessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccessServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccessServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccessServiceFileDescriptorSupplier())
              .addMethod(getCreateAccessCertificateMethodHelper())
              .addMethod(getSignAccessCertificateMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
