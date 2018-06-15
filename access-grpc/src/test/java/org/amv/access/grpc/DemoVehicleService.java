package org.amv.access.grpc;

import io.grpc.stub.StreamObserver;
import org.amv.access.grpc.vehicle.CreateVehicleRequest;
import org.amv.access.grpc.vehicle.CreateVehicleResponse;
import org.amv.access.grpc.vehicle.VehicleServiceGrpc;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Base64;

public class DemoVehicleService extends VehicleServiceGrpc.VehicleServiceImplBase {

    @Override
    public void createVehicle(CreateVehicleRequest request,
                              StreamObserver<CreateVehicleResponse> responseObserver) {
        responseObserver.onNext(CreateVehicleResponse.newBuilder()
                .setVehicleSerialNumber(RandomStringUtils.randomNumeric(16))
                .setName(request.getName())
                .setDescription(request.getDescription())
                .setPublicKeyBase64(Base64.getEncoder().encodeToString(
                        RandomStringUtils.random(10).getBytes()))
                .build());
        responseObserver.onCompleted();
    }
}
