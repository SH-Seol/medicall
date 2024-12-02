package com.medicall.domain.treatment.dto.response;

import java.time.LocalDateTime;

public record RequirementResponse(
        String symptom,
        String description,
        LocalDateTime date
) {
}
