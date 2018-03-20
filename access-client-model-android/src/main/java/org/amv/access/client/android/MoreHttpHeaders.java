package org.amv.access.client.android;

public final class MoreHttpHeaders {
    public static final String AUTHORIZATION = "Authorization";
    public static final String X_REASON = "X-Reason";
    public static final String AMV_NONCE = "amv-api-nonce";
    public static final String AMV_SIGNATURE = "amv-api-signature";
    public static final String AMV_CLIENT_NAME = "amv-api-client-name";
    public static final String AMV_CLIENT_VERSION = "amv-api-client-version";

    private MoreHttpHeaders() {
        throw new UnsupportedOperationException();
    }
}
