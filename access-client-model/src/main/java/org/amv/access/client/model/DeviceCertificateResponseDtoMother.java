package org.amv.access.client.model;

public final class DeviceCertificateResponseDtoMother {

    private DeviceCertificateResponseDtoMother() {
        throw new UnsupportedOperationException();
    }

    public static DeviceCertificateResponseDto random() {
        return DeviceCertificateResponseDto.builder()
                .deviceCertificate(DeviceCertificateDtoMother.random())
                .build();
    }
}
