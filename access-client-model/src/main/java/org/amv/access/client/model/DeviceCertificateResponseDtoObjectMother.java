package org.amv.access.client.model;

public final class DeviceCertificateResponseDtoObjectMother {

    private DeviceCertificateResponseDtoObjectMother() {
        throw new UnsupportedOperationException();
    }

    public static DeviceCertificateResponseDto random() {
        return DeviceCertificateResponseDto.builder()
                .deviceCertificate(DeviceCertificateDtoObjectMother.random())
                .build();
    }
}
