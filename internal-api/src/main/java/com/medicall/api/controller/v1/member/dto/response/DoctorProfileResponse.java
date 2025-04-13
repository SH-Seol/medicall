package com.medicall.api.controller.v1.member.dto.response;

public record DoctorProfileResponse(
        Long id,
        String name,
        String major,
        String hospital,
        String description,
        Integer years
) {
}
