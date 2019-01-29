package org.amv.access.client.model;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public final class AccessCertificateDtoObjectMother {

    private AccessCertificateDtoObjectMother() {
        throw new UnsupportedOperationException();
    }

    public static AccessCertificateDto random() {
        return randomBuilder().build();
    }

    public static AccessCertificateDto.Builder randomBuilder() {
        return AccessCertificateDto.builder()
                .id(RandomStringUtils.randomAlphanumeric(10))
                .version(RandomUtils.nextBoolean() ? 0 : 1)
                .deviceAccessCertificate(RandomStringUtils.randomAlphanumeric(10))
                .vehicleAccessCertificate(RandomStringUtils.randomAlphanumeric(10))
                .name(RandomStringUtils.randomAlphanumeric(10));
    }
}
