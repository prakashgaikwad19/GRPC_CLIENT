package pkg;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import stubFiles.Userms.LoginReq;
import stubFiles.Userms.LoginResp;
import stubFiles.usermsGrpc;
import stubFiles.usermsGrpc.usermsBlockingStub;

public class GrpcClientMain {

	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder
									.forAddress("localhost", 9090)
									.usePlaintext()
									.build();
		
		usermsBlockingStub userStub = usermsGrpc.newBlockingStub(channel);

		LoginReq lr = LoginReq.newBuilder().setUsername("abc.gmail.com")
										.setPassword("abcdefghi").build();
		
		LoginResp loginResponse = userStub.login(lr);
		
		System.out.println(loginResponse.getResponseMessage());

		System.out.println(loginResponse.getResponseCode());

	}

}
