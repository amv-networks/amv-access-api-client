package org.amv.access.client.model;

public final class CreateDeviceCertificateResponseDtoMother {

    private CreateDeviceCertificateResponseDtoMother() {
        throw new UnsupportedOperationException();
    }

    public static CreateDeviceCertificateResponseDto random() {
        return CreateDeviceCertificateResponseDto.builder()
                .deviceCertificate(DeviceCertificateDtoMother.random())
                .build();
    }
}
