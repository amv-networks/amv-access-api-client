package org.amv.access.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.base.Charsets;
import com.netflix.hystrix.HystrixCommand;
import feign.FeignException;
import feign.Response;
import feign.Target;
import feign.mock.HttpMethod;
import feign.mock.MockClient;
import feign.mock.MockTarget;
import org.amv.access.client.model.*;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpStatus;

import java.util.Collection;
import java.util.Collections;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class DeviceCertClientTest {

    private static final String RANDOM_APP_ID = RandomStringUtils.randomNumeric(24);
    private static final String RANDOM_API_KEY = RandomStringUtils.randomAlphanumeric(10);
    private static final String RANDOM_DEVICE_SERIAL = org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric(10);

    @Test
    public void itShouldCreateDeviceCertificateSuccessfully() throws JsonProcessingException {
        CreateDeviceCertificateResponseDto deviceCertificate = CreateDeviceCertificateResponseDtoMother.random();
        String deviceCertificateAsJson = Clients.defaultObjectMapper.writeValueAsString(deviceCertificate);

        MockClient mockClient = new MockClient()
                .add(HttpMethod.POST, "/api/v1/device_certificates", Response.builder()
                        .status(HttpStatus.CREATED.value())
                        .reason(HttpStatus.CREATED.getReasonPhrase())
                        .headers(Collections.<String, Collection<String>>emptyMap())
                        .body(deviceCertificateAsJson, Charsets.UTF_8));

        Target<DeviceCertClient> mockTarget = new MockTarget<DeviceCertClient>(DeviceCertClient.class);

        DeviceCertClient sut = Clients.simpleFeignBuilder()
                .client(mockClient)
                .build()
                .newInstance(mockTarget);

        CreateDeviceCertificateRequestDto request = CreateDeviceCertificateRequestDto.builder()
                .build();

        HystrixCommand<CreateDeviceCertificateResponseDto> deviceCertificateRequest = sut
                .createDeviceCertificate(RANDOM_APP_ID, RANDOM_API_KEY, request);

        CreateDeviceCertificateResponseDto deviceCertificateResponse = deviceCertificateRequest.execute();

        assertThat(deviceCertificateResponse, is(notNullValue()));
        assertThat(deviceCertificateResponse.getDeviceCertificate(), is(deviceCertificate.getDeviceCertificate()));
    }

    @Test
    public void itShouldFetchDeviceCertificateSuccessfully() throws JsonProcessingException {
        DeviceCertificateResponseDto deviceCertificate = DeviceCertificateResponseDtoMother.random();
        String deviceCertificateAsJson = Clients.defaultObjectMapper.writeValueAsString(deviceCertificate);

        MockClient mockClient = new MockClient()
                .add(HttpMethod.GET, String.format("/api/v1/device/%s/device_certificate", RANDOM_DEVICE_SERIAL),
                        Response.builder()
                                .status(HttpStatus.CREATED.value())
                                .reason(HttpStatus.CREATED.getReasonPhrase())
                                .headers(Collections.<String, Collection<String>>emptyMap())
                                .body(deviceCertificateAsJson, Charsets.UTF_8));

        Target<DeviceCertClient> mockTarget = new MockTarget<DeviceCertClient>(DeviceCertClient.class);

        DeviceCertClient sut = Clients.simpleFeignBuilder()
                .client(mockClient)
                .build()
                .newInstance(mockTarget);


        HystrixCommand<DeviceCertificateResponseDto> deviceCertificateRequest = sut
                .fetchDeviceCertificate("", "", RANDOM_DEVICE_SERIAL);

        DeviceCertificateResponseDto deviceCertificateResponse = deviceCertificateRequest.execute();

        assertThat(deviceCertificateResponse, is(notNullValue()));
        assertThat(deviceCertificateResponse.getDeviceCertificate(), is(deviceCertificate.getDeviceCertificate()));
    }


    @Test
    public void itShouldReturnDeserializedErrorTransferObjectOnFailure() throws JsonProcessingException {
        ErrorResponseDto errorDto = ErrorResponseDtoMother.random();

        String errorDtoAsJson = Clients.defaultObjectMapper.writeValueAsString(errorDto);

        MockClient mockClient = new MockClient()
                .add(HttpMethod.POST, "/api/v1/device_certificates", Response.builder()
                        .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                        .reason(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase())
                        .headers(Collections.<String, Collection<String>>emptyMap())
                        .body(errorDtoAsJson, Charsets.UTF_8));

        Target<DeviceCertClient> mockTarget = new MockTarget<DeviceCertClient>(DeviceCertClient.class);

        DeviceCertClient sut = Clients.simpleFeignBuilder()
                .client(mockClient)
                .build()
                .newInstance(mockTarget);

        CreateDeviceCertificateRequestDto request = CreateDeviceCertificateRequestDto.builder()
                .build();
        HystrixCommand<CreateDeviceCertificateResponseDto> deviceCertificateRequest = sut
                .createDeviceCertificate(RANDOM_APP_ID, RANDOM_API_KEY, request);

        try {
            deviceCertificateRequest.execute();
            Assert.fail("Should have thrown exception");
        } catch (Exception e) {
            assertThat(e, is(notNullValue()));
            assertThat(e.getCause(), is(notNullValue()));

            Throwable cause = e.getCause();
            assertThat(cause, is(instanceOf(FeignException.class)));
            FeignException feignException = (FeignException) cause;

            assertThat(feignException.getCause(), is(instanceOf(AccessApiException.class)));
            AccessApiException accessApiException = (AccessApiException) feignException.getCause();

            ErrorResponseDto error = accessApiException.getError();
            assertThat(error, is(errorDto));
            assertThat(error.getErrors(), hasSize(errorDto.getErrors().size()));
        }
    }
}
