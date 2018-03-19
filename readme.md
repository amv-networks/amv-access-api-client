[![Build Status](https://travis-ci.org/amv-networks/amv-access-api-client.svg?branch=master)](https://travis-ci.org/amv-networks/amv-access-api-client)
[![Download](https://api.bintray.com/packages/amv-networks/amv-access-api-client/client/images/download.svg) ](https://bintray.com/amv-networks/amv-access-api-client/client/_latestVersion)
[![License](https://img.shields.io/github/license/amv-networks/amv-access-api-client.svg?maxAge=2592000)](https://github.com/amv-networks/amv-access-api-client/blob/master/LICENSE)

amv-access-api-client
========
amv-access-api-client contains rest clients to interact with the AMV Access API.
amv-access-api-client requires Java version 1.8 or greater.

# setup
## gradle
```groovy
compile 'org.amv.access:client:${amvAccessVersion}'
```

# usage
## device certificate client
```java
String baseUrl = "https://www.example.com";
DeviceCertClient deviceCertClient = Clients.deviceCertClient(Clients.simpleFeign(), baseUrl);
```

## create device certificates
```
String appId = "...";
String apiKey = "...";
String publicKeyBase64 = "...";

CreateDeviceCertificateRequestDto body = CreateDeviceCertificateRequestDto.builder()
        .devicePublicKey(publicKeyBase64)
        .build();

CreateDeviceCertificateResponseDto response = deviceCertClient
        .createDeviceCertificate(appId, apiKey, body)
        .execute();
```

# build
Build a snapshot from a clean working directory
```bash
$ ./gradlew releaseCheck clean build -Prelease.stage=SNAPSHOT -Prelease.scope=patch
```

When a parameter `minimal` is provided, certain tasks will be skipped to make the build faster.
e.g. `findbugs`, `checkstyle`, `javadoc` - tasks which results are not essential for a working build.
```bash
./gradlew clean build -Pminimal
```

## create a release
```bash
./gradlew final -Prelease.scope=patch
```

## release to bintray
```bash
./gradlew clean build final bintrayUpload
  -Prelease.useLastTag=true
  -PreleaseToBintray
  -PbintrayUser=${username}
  -PbintrayApiKey=${apiKey}
```

# license
The project is licensed under the Apache License. See [LICENSE](LICENSE) for details.
