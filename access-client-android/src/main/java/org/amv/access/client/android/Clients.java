package org.amv.access.client.android;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.MediaType;

public final class Clients {
    static {
        Package clazzPackage = Clients.class.getPackage();
        String implementationVersion = clazzPackage.getImplementationVersion();
        String implementationTitle = clazzPackage.getImplementationTitle();
        CLIENT_VERSION = implementationVersion != null ? implementationVersion : "unknown";
        CLIENT_NAME = implementationTitle != null ? implementationTitle : "org.amv.access#access-client-android";
    }

    static final String CLIENT_VERSION;
    static final String CLIENT_NAME;

    static final MediaType JSON = MediaType.parse("application/json;charset=utf-8");

    static final Gson defaultObjectMapper = new GsonBuilder().create();

    private Clients() {
        throw new UnsupportedOperationException();
    }

    public static DeviceCertClient simpleDeviceCertClient(String baseUrl) {
        if (baseUrl == null) {
            throw new IllegalArgumentException("`baseUrl` must not be null");
        }

        return new SimpleDeviceCertClient(baseUrl);
    }

    public static AccessCertClient simpleAccessCertClient(String baseUrl) {
        if (baseUrl == null) {
            throw new IllegalArgumentException("`baseUrl` must not be null");
        }

        return new SimpleAccessCertClient(baseUrl);
    }
}
