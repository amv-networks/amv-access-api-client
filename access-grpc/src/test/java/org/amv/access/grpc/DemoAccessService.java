package org.amv.access.grpc;

import io.grpc.stub.StreamObserver;
import org.amv.access.grpc.access.*;
import org.apache.commons.lang3.RandomStringUtils;

public class DemoAccessService extends AccessServiceGrpc.AccessServiceImplBase {

    @Override
    public void getAccessCertificates(GetAccessCertificatesRequest request,
                                      StreamObserver<GetAccessCertificatesResponse> responseObserver) {

        responseObserver.onNext(GetAccessCertificatesResponse.newBuilder()
                .addAccessCertificates(AccessCertificate.newBuilder()
                        .setId(RandomStringUtils.random(10))
                        .setName(RandomStringUtils.random(10))
                        .setDeviceAccessCertificate(RandomStringUtils.random(10))
                        .setVehicleAccessCertificate(RandomStringUtils.random(10))
                        .build())
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void createAccessCertificate(CreateAccessCertificateRequest request,
                                        StreamObserver<CreateAccessCertificateResponse> responseObserver) {
        responseObserver.onNext(CreateAccessCertificateResponse.newBuilder()
                .setAccessCertificateSigningRequest(AccessCertificateSigningRequest.newBuilder()
                        .setId(RandomStringUtils.random(10))
                        .setDeviceAccessCertificate(RandomStringUtils.random(10))
                        .setVehicleAccessCertificate(RandomStringUtils.random(10))
                        .build())
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void signAccessCertificate(SignAccessCertificateRequest request,
                                      StreamObserver<SignAccessCertificateResponse> responseObserver) {
        responseObserver.onNext(SignAccessCertificateResponse.newBuilder()
                .setAccessCertificate(AccessCertificate.newBuilder()
                        .setId(request.getAccessCertificateId())
                        .setName(RandomStringUtils.random(10))
                        .setDeviceAccessCertificate(RandomStringUtils.random(10))
                        .setVehicleAccessCertificate(RandomStringUtils.random(10))
                        .build())
                .build());
        responseObserver.onCompleted();
    }
}
