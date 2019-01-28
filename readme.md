[![Build Status](https://travis-ci.org/amv-networks/amv-access-api-client.svg?branch=master)](https://travis-ci.org/amv-networks/amv-access-api-client)
[![Download](https://api.bintray.com/packages/amvnetworks/amv-access-api-client/access-client/images/download.svg) ](https://bintray.com/amvnetworks/amv-access-api-client/access-client/_latestVersion)
[![License](https://img.shields.io/github/license/amv-networks/amv-access-api-client.svg?maxAge=2592000)](https://github.com/amv-networks/amv-access-api-client/blob/master/LICENSE)

amv-access-api-client
========
amv-access-api-client contains rest clients to interact with the AMV Access API.
amv-access-api-client requires Java version 1.8 or greater.


## installation
Download the latest version from [Bintray](https://bintray.com/amv-networks/amv-access-api-client/access-client/_latestVersion).

```groovy
compile "org.amv.access:access-client:${amvAccessClientVersion}"
```

## basic usage

### device certificate client
```java
String baseUrl = "https://www.example.com";
DeviceCertClient deviceCertClient = Clients.simpleDeviceCertClient(baseUrl);
```

### create device certificates
```java
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

## build
```bash
$ ./gradlew releaseCheck clean build
```

## development

### create a release
```bash
./gradlew final -Prelease.scope=patch
```

### release to bintray
```bash
./gradlew clean build bintrayUpload
    -Prelease.useLastTag=true
    -PreleaseToBintray
    -PbintrayUser=${username}
    -PbintrayApiKey=${apiKey}
```
or (implicitly creating a new version)
```bash
./gradlew clean build bintrayUpload
    -Prelease.stage=final
    -Prelease.scope=patch
    -PreleaseToBintray
    -PbintrayUser=${username}
    -PbintrayApiKey=${apiKey}
```

### release to local repository
```bash
./gradlew clean build publishToMavenLocal
```

### ide
this library uses lombok. enable annotation processing in your ide.
```bash
./gradlew installLombok
```

## contributing
For information on how to contribute, please refer to our [contribution guide](https://github.com/amvnetworks/github-commons/blob/master/CONTRIBUTING.md).

## license
The project is licensed under the Apache License. See [LICENSE](LICENSE) for details.