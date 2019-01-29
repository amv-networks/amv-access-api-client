package org.amv.access.client.model;

import com.google.common.collect.ImmutableList;
import org.apache.commons.lang3.RandomUtils;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class GetAccessCertificatesResponseDtoMother {

    private GetAccessCertificatesResponseDtoMother() {
        throw new UnsupportedOperationException();
    }

    public static GetAccessCertificatesResponseDto random() {
        return GetAccessCertificatesResponseDto.builder()
                .accessCertificates(ImmutableList.<AccessCertificateDto>builder()
                        .add(AccessCertificateDtoObjectMother.random())
                        .add(AccessCertificateDtoObjectMother.random())
                        .add(AccessCertificateDtoObjectMother.random())
                        .build())
                .build();
    }

    public static GetAccessCertificatesResponseDto randomV0() {
        return randomWithVersion(0);
    }

    public static GetAccessCertificatesResponseDto randomV1() {
        return randomWithVersion(1);
    }

    private static GetAccessCertificatesResponseDto randomWithVersion(int version) {
        return GetAccessCertificatesResponseDto.builder()
                .accessCertificates(IntStream.range(0, RandomUtils.nextInt(3, 10))
                        .boxed()
                        .map(foo -> AccessCertificateDtoObjectMother.randomBuilder().version(version).build())
                        .collect(Collectors.toList()))
                .build();
    }
}
