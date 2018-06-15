package org.amv.access.grpc;

import io.grpc.*;
import lombok.extern.slf4j.Slf4j;
import org.amv.access.grpc.access.AccessServiceGrpc;
import org.amv.access.grpc.vehicle.CreateVehicleRequest;
import org.amv.access.grpc.vehicle.CreateVehicleResponse;
import org.amv.access.grpc.vehicle.VehicleServiceGrpc;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Slf4j
public class AccessApiClient extends AccessServiceGrpc.AccessServiceImplBase {

    private final ManagedChannel channel;
    private final VehicleServiceGrpc.VehicleServiceBlockingStub blockingStub;

    public AccessApiClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build());
    }

    AccessApiClient(ManagedChannel channel) {
        this.channel = channel;
        blockingStub = VehicleServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void createVehicle(String name) {
        log.info("Will try to create vehicle " + name + " ...");
        CreateVehicleRequest request = CreateVehicleRequest.newBuilder()
                .setName(name)
                .build();
        CreateVehicleResponse response;
        try {
            response = blockingStub.createVehicle(request);
        } catch (StatusRuntimeException e) {
            log.warn("RPC failed: {0}", e.getStatus());
            return;
        }
        log.info("Created vehicle: " + response.toString());
    }

    public static void main(String[] args) throws Exception {
        AccessApiClient client = new AccessApiClient("localhost", 50051);
        try {
            String name = RandomStringUtils.randomAlphabetic(10);
            client.createVehicle(name);
        } finally {
            client.shutdown();
        }
    }
}
