package com.medicall.api.controller.v1.member.dto.response;

import java.time.LocalDateTime;

public record PrescriptionResponse(
        Long id,
        String specialty,
        LocalDateTime createdAt
) {
}
