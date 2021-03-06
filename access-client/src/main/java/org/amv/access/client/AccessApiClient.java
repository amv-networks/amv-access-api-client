package org.amv.access.client;

import feign.Headers;

import static com.google.common.net.HttpHeaders.ACCEPT;
import static com.google.common.net.HttpHeaders.USER_AGENT;

@Headers({
        ACCEPT + ": " + "application/json;charset=UTF-8",
        USER_AGENT + ": " + "access-api-rest-client v0.0.1-SNAPSHOT"
})
public interface AccessApiClient {

}
