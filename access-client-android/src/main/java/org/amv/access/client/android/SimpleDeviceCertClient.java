package org.amv.access.client.android;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.Util;
import org.amv.access.client.android.model.CreateDeviceCertificateRequestDto;
import org.amv.access.client.android.model.CreateDeviceCertificateResponseDto;
import org.amv.access.client.android.model.DeviceCertificateResponseDto;

public class SimpleDeviceCertClient implements DeviceCertClient {

    private final OkHttpClient client = new OkHttpClient();

    private final String baseUrl;

    SimpleDeviceCertClient(String baseUrl) {
        if (baseUrl == null) {
            throw new IllegalArgumentException("`baseUrl` must not be null");
        }
        this.baseUrl = baseUrl;
    }

    @Override
    public Observable<CreateDeviceCertificateResponseDto> createDeviceCertificate(
            final String appId,
            final String apiKey,
            final CreateDeviceCertificateRequestDto request) {

        return Observable.just(1)
                .flatMap(new Function<Integer, Observable<CreateDeviceCertificateResponseDto>>() {

                    @Override
                    public Observable<CreateDeviceCertificateResponseDto> apply(@NonNull Integer foo) throws Exception {
                        String url = String.format("%s/api/v1/device_certificates", baseUrl);

                        String json = Clients.defaultObjectMapper.toJson(request);
                        RequestBody requestBody = RequestBody.create(Clients.JSON, json);

                        String authHeaderValue = String.format("%s:%s", appId, apiKey);
                        Request request = new Request.Builder()
                                .addHeader("Authorization", authHeaderValue)
                                .url(url)
                                .post(requestBody)
                                .build();

                        Response response = null;
                        try {
                            response = client.newCall(request).execute();
                            return ResponseHelper.parse(response, CreateDeviceCertificateResponseDto.class);
                        } catch (Exception e) {
                            return Observable.error(e);
                        } finally {
                            Util.closeQuietly(response);
                        }
                    }
                });
    }

    @Override
    public Observable<DeviceCertificateResponseDto> fetchDeviceCertificate(final String nonce,
                                                                            final String signedNonce,
                                                                            final String deviceSerialNumber) {
        return Observable.just(1)
                .flatMap(new Function<Integer, Observable<DeviceCertificateResponseDto>>() {
                    @Override
                    public Observable<DeviceCertificateResponseDto> apply(@NonNull Integer foo) throws Exception {
                        String url = String.format("%s/api/v1/device/%s/device_certificate", baseUrl, deviceSerialNumber);

                        Request request = new Request.Builder()
                                .addHeader(MoreHttpHeaders.AMV_NONCE, nonce)
                                .addHeader(MoreHttpHeaders.AMV_SIGNATURE, signedNonce)
                                .url(url)
                                .build();

                        Response response = null;
                        try {
                            response = client.newCall(request).execute();
                            return ResponseHelper.parse(response, DeviceCertificateResponseDto.class);
                        } catch (Exception e) {
                            return Observable.error(e);
                        } finally {
                            Util.closeQuietly(response);
                        }
                    }
                });
    }
}
