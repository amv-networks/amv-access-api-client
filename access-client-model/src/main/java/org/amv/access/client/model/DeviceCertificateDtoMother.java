package org.amv.access.client.model;

import org.apache.commons.lang3.RandomStringUtils;

public final class DeviceCertificateDtoMother {

    private DeviceCertificateDtoMother() {
        throw new UnsupportedOperationException();
    }

    public static DeviceCertificateDto random() {
        return DeviceCertificateDto.builder()
                .deviceCertificate(RandomStringUtils.randomAlphanumeric(10))
                .issuerPublicKey(RandomStringUtils.randomAlphanumeric(10))
                .build();
    }
}
