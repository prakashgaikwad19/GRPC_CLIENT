package stubFiles;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: userms.proto")
public final class usermsGrpc {

  private usermsGrpc() {}

  public static final String SERVICE_NAME = "userms";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stubFiles.Userms.LoginReq,
      stubFiles.Userms.LoginResp> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = stubFiles.Userms.LoginReq.class,
      responseType = stubFiles.Userms.LoginResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stubFiles.Userms.LoginReq,
      stubFiles.Userms.LoginResp> getLoginMethod() {
    io.grpc.MethodDescriptor<stubFiles.Userms.LoginReq, stubFiles.Userms.LoginResp> getLoginMethod;
    if ((getLoginMethod = usermsGrpc.getLoginMethod) == null) {
      synchronized (usermsGrpc.class) {
        if ((getLoginMethod = usermsGrpc.getLoginMethod) == null) {
          usermsGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<stubFiles.Userms.LoginReq, stubFiles.Userms.LoginResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userms", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stubFiles.Userms.LoginReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stubFiles.Userms.LoginResp.getDefaultInstance()))
                  .setSchemaDescriptor(new usermsMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static usermsStub newStub(io.grpc.Channel channel) {
    return new usermsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static usermsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new usermsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static usermsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new usermsFutureStub(channel);
  }

  /**
   */
  public static abstract class usermsImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(stubFiles.Userms.LoginReq request,
        io.grpc.stub.StreamObserver<stubFiles.Userms.LoginResp> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stubFiles.Userms.LoginReq,
                stubFiles.Userms.LoginResp>(
                  this, METHODID_LOGIN)))
          .build();
    }
  }

  /**
   */
  public static final class usermsStub extends io.grpc.stub.AbstractStub<usermsStub> {
    private usermsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private usermsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected usermsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new usermsStub(channel, callOptions);
    }

    /**
     */
    public void login(stubFiles.Userms.LoginReq request,
        io.grpc.stub.StreamObserver<stubFiles.Userms.LoginResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class usermsBlockingStub extends io.grpc.stub.AbstractStub<usermsBlockingStub> {
    private usermsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private usermsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected usermsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new usermsBlockingStub(channel, callOptions);
    }

    /**
     */
    public stubFiles.Userms.LoginResp login(stubFiles.Userms.LoginReq request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class usermsFutureStub extends io.grpc.stub.AbstractStub<usermsFutureStub> {
    private usermsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private usermsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected usermsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new usermsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stubFiles.Userms.LoginResp> login(
        stubFiles.Userms.LoginReq request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final usermsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(usermsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((stubFiles.Userms.LoginReq) request,
              (io.grpc.stub.StreamObserver<stubFiles.Userms.LoginResp>) responseObserver);
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

  private static abstract class usermsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    usermsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return stubFiles.Userms.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("userms");
    }
  }

  private static final class usermsFileDescriptorSupplier
      extends usermsBaseDescriptorSupplier {
    usermsFileDescriptorSupplier() {}
  }

  private static final class usermsMethodDescriptorSupplier
      extends usermsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    usermsMethodDescriptorSupplier(String methodName) {
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
      synchronized (usermsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new usermsFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .build();
        }
      }
    }
    return result;
  }
}
