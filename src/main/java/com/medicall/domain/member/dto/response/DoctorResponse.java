package com.medicall.domain.member.dto.response;

public record DoctorResponse(
        Long id,
        String name,
        String major,
        String hospital
) {
}
