package org.amv.access.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.base.Charsets;
import com.netflix.hystrix.HystrixCommand;
import feign.Response;
import feign.Target;
import feign.mock.HttpMethod;
import feign.mock.MockClient;
import feign.mock.MockTarget;
import org.amv.access.client.model.GetAccessCertificatesResponseDto;
import org.amv.access.client.model.GetAccessCertificatesResponseDtoMother;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;

import java.util.Collection;
import java.util.Collections;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class AccessCertClientTest {

    private static final String RANDOM_DEVICE_SERIAL = RandomStringUtils.randomAlphanumeric(10);

    private static final GetAccessCertificatesResponseDto accessCertificatesResponseDtoV0 = GetAccessCertificatesResponseDtoMother.randomV0();
    private static final GetAccessCertificatesResponseDto accessCertificatesResponseDtoV1 = GetAccessCertificatesResponseDtoMother.randomV1();

    private AccessCertClient sut;

    @Before
    public void setUp() throws JsonProcessingException {
        String accessCertificatesResponseDtoAsJsonV0 = Clients.defaultObjectMapper.writeValueAsString(accessCertificatesResponseDtoV0);
        String accessCertificatesResponseDtoAsJsonV1 = Clients.defaultObjectMapper.writeValueAsString(accessCertificatesResponseDtoV1);

        MockClient mockClient = new MockClient()
                .add(HttpMethod.GET, String.format("/api/v1/device/%s/access_certificates?certificate_version=0", RANDOM_DEVICE_SERIAL), Response.builder()
                        .status(HttpStatus.OK.value())
                        .reason(HttpStatus.OK.getReasonPhrase())
                        .headers(Collections.<String, Collection<String>>emptyMap())
                        .body(accessCertificatesResponseDtoAsJsonV0, Charsets.UTF_8))
                .add(HttpMethod.GET, String.format("/api/v1/device/%s/access_certificates?certificate_version=1", RANDOM_DEVICE_SERIAL), Response.builder()
                        .status(HttpStatus.OK.value())
                        .reason(HttpStatus.OK.getReasonPhrase())
                        .headers(Collections.<String, Collection<String>>emptyMap())
                        .body(accessCertificatesResponseDtoAsJsonV1, Charsets.UTF_8));

        Target<AccessCertClient> mockTarget = new MockTarget<>(AccessCertClient.class);

        this.sut = Clients.simpleFeignBuilder()
                .client(mockClient)
                .build()
                .newInstance(mockTarget);
    }

    @Test
    public void itShouldFetchAccessCertificatesSuccessfullyV0() {
        HystrixCommand<GetAccessCertificatesResponseDto> accessCertificatesRequest = sut
                .fetchAccessCertificates("", "", RANDOM_DEVICE_SERIAL, 0);

        GetAccessCertificatesResponseDto accessCertificatesResponse = accessCertificatesRequest.execute();

        assertThat(accessCertificatesResponse, is(accessCertificatesResponseDtoV0));
        assertThat(accessCertificatesResponse.getAccessCertificates(), hasSize(accessCertificatesResponseDtoV0.getAccessCertificates().size()));
    }


    @Test
    public void itShouldFetchAccessCertificatesSuccessfullyV1() {
        HystrixCommand<GetAccessCertificatesResponseDto> accessCertificatesRequest = sut
                .fetchAccessCertificates("", "", RANDOM_DEVICE_SERIAL, 1);

        GetAccessCertificatesResponseDto accessCertificatesResponse = accessCertificatesRequest.execute();

        assertThat(accessCertificatesResponse, is(accessCertificatesResponseDtoV1));
        assertThat(accessCertificatesResponse.getAccessCertificates(), hasSize(accessCertificatesResponseDtoV1.getAccessCertificates().size()));
    }
}
