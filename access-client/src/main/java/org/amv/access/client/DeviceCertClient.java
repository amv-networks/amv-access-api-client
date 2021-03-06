package org.amv.access.client;

import com.netflix.hystrix.HystrixCommand;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.amv.access.client.model.CreateDeviceCertificateRequestDto;
import org.amv.access.client.model.CreateDeviceCertificateResponseDto;
import org.amv.access.client.model.DeviceCertificateResponseDto;

import static com.google.common.net.HttpHeaders.AUTHORIZATION;
import static com.google.common.net.HttpHeaders.CONTENT_TYPE;


/**
 * A client for accessing the <i>device_certificate</i> endpoint.
 *
 * @author Alois Leitner
 */
public interface DeviceCertClient extends AccessApiClient {

    @Headers({
            CONTENT_TYPE + ": " + "application/json;charset=UTF-8",
            AUTHORIZATION + ": " + "{appId}:{apiKey}"
    })
    @RequestLine("POST /api/v1/device_certificates")
    HystrixCommand<CreateDeviceCertificateResponseDto> createDeviceCertificate(
            @Param("appId") String appId,
            @Param("apiKey") String apiKey,
            CreateDeviceCertificateRequestDto createDeviceCertificateRequest);

    @Headers({
            MoreHttpHeaders.AMV_NONCE + ": " + "{nonce}",
            MoreHttpHeaders.AMV_SIGNATURE + ": " + "{signedNonce}"
    })
    @RequestLine("GET /api/v1/device/{deviceSerialNumber}/device_certificate")
    HystrixCommand<DeviceCertificateResponseDto> fetchDeviceCertificate(@Param("nonce") String nonce,
                                                                        @Param("signedNonce") String signedNonce,
                                                                        @Param("deviceSerialNumber") String deviceSerialNumber);

}
