package com.medicall.api.controller.v1.member.dto.response;

public record DoctorResponse(
        Long id,
        String name,
        String major,
        String hospital
) {
}
