package com.medicall.domain.member.dto.response;

public record DoctorProfileResponse(
        Long id,
        String name,
        String major,
        String hospital,
        String description,
        Integer years
) {
}
