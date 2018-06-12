package org.amv.access.grpc;

import io.grpc.ManagedChannel;
import io.grpc.Server;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.stub.StreamObserver;
import org.amv.access.grpc.vehicle.CreateVehicleRequest;
import org.amv.access.grpc.vehicle.CreateVehicleResponse;
import org.amv.access.grpc.vehicle.VehicleServiceGrpc;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

public class VehicleServiceGrpcDemo {

    private ManagedChannel channel;
    private Server server;

    @Before
    public void setUp() throws IOException {
        VehicleServiceDemo vehicleServiceDemo = new VehicleServiceDemo();

        String uniqueName = InProcessServerBuilder.generateName();

        this.channel = InProcessChannelBuilder.forName(uniqueName)
                .directExecutor()
                .build();

        this.server = InProcessServerBuilder.forName(uniqueName)
                .directExecutor()
                .addService(vehicleServiceDemo)
                .build()
                .start();
    }

    @After
    public void tearDown() {
        this.server.shutdownNow();
    }

    @Test
    public void itShouldCreateVehicle() {
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