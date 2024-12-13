package com.medicall.domain.member.dto.response;

import java.time.LocalDateTime;

public record PrescriptionResponse(
        Long id,
        String specialty,
        LocalDateTime createdAt
) {
}
