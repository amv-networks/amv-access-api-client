package org.amv.access.grpc;

import io.grpc.ManagedChannel;
import io.grpc.Server;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.stub.StreamObserver;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

public class VehicleServiceGrpcDemo {

    @Test
    public void itShouldCreateVehicle() throws IOException {
        VehicleServiceDemo vehicleServiceDemo = new VehicleServiceDemo();

        String uniqueName = InProcessServerBuilder.generateName();
        Server server = InProcessServerBuilder.forName(uniqueName)
                .directExecutor()
                .addService(vehicleServiceDemo)
                .build()
                .start();

        ManagedChannel channel = InProcessChannelBuilder.forName(uniqueName)
                .directExecutor()
                .build();

        VehicleServiceGrpc.VehicleServiceBlockingStub stub = VehicleServiceGrpc.newBlockingStub(channel);

        String vehicleName = RandomStringUtils.randomAlphabetic(10);
        CreateVehicleRequest request = CreateVehicleRequest.newBuilder()
                .setName(vehicleName)
                .build();
        CreateVehicleResponse vehicle = stub.createVehicle(request);
        assertThat(vehicle, is(notNullValue()));
        assertThat(vehicle.getName(), is(vehicleName));
        assertThat(vehicle.getVehicleSerialNumber(), is(notNullValue()));
    }

    public class VehicleServiceDemo extends VehicleServiceGrpc.VehicleServiceImplBase {

        @Override
        public void createVehicle(CreateVehicleRequest request,
                                  StreamObserver<CreateVehicleResponse> responseObserver) {
            responseObserver.onNext(CreateVehicleResponse.newBuilder()
                    .setName(request.getName())
                    .setDescription(request.getDescription())
                    .setVehicleSerialNumber(RandomStringUtils.random(10))
                    .build());
            responseObserver.onCompleted();
        }
    }
}