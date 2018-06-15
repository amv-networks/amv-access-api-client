package org.amv.access.grpc;

import io.grpc.ManagedChannel;
import io.grpc.Server;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import org.amv.access.grpc.access.*;
import org.amv.access.grpc.auth.IssuerAuth;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

public class DemoAccessServiceGrpcTest {

    private ManagedChannel channel;
    private Server server;

    @Before
    public void setUp() throws IOException {
        DemoAccessService accessServiceGrpcDemo = new DemoAccessService();

        String uniqueName = InProcessServerBuilder.generateName();

        this.channel = InProcessChannelBuilder.forName(uniqueName)
                .directExecutor()
                .build();

        this.server = InProcessServerBuilder.forName(uniqueName)
                .directExecutor()
                .addService(accessServiceGrpcDemo)
                .build()
                .start();
    }

    @After
    public void tearDown() {
        this.server.shutdownNow();
    }

    @Test
    public void itShouldCreateAccessCertificate() {
        AccessServiceGrpc.AccessServiceBlockingStub stub = AccessServiceGrpc.newBlockingStub(channel);

        CreateAccessCertificateRequest request = CreateAccessCertificateRequest.newBuilder()
                .setIssuerAuth(IssuerAuth.newBuilder()
                        .build())
                .setAppId(RandomStringUtils.random(10))
                .setDeviceSerialNumber(RandomStringUtils.random(10))
                .setVehicleSerialNumber(RandomStringUtils.random(10))
                .setValidityStart(13)
                .setValidityEnd(42)
                .build();

        CreateAccessCertificateResponse createResponse = stub.createAccessCertificate(request);
        assertThat(createResponse, is(notNullValue()));

        AccessCertificateSigningRequest signRequestResponse = createResponse.getAccessCertificateSigningRequest();
        assertThat(signRequestResponse.getId(), is(notNullValue()));

        SignAccessCertificateResponse signResponse = stub.signAccessCertificate(SignAccessCertificateRequest.newBuilder()
                .setAccessCertificateId(signRequestResponse.getId())
                .setDeviceAccessCertificateSignatureBase64(signRequestResponse.getDeviceAccessCertificate())
                .setSignedDeviceAccessCertificateBase64(signRequestResponse.getDeviceAccessCertificate() + RandomStringUtils.randomAlphanumeric(10))
                .setVehicleAccessCertificateSignatureBase64(signRequestResponse.getVehicleAccessCertificate())
                .setSignedVehicleAccessCertificateBase64(signRequestResponse.getVehicleAccessCertificate() + RandomStringUtils.randomAlphanumeric(10))
                .build());

        assertThat(signResponse, is(notNullValue()));
        AccessCertificate accessCertificate = signResponse.getAccessCertificate();

        assertThat(accessCertificate, is(notNullValue()));
        assertThat(accessCertificate.getId(), is(signRequestResponse.getId()));
    }
}