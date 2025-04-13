package com.medicall.api.controller.v1.treatment.dto.response;

import java.time.LocalDateTime;

public record RequirementResponse(
        String symptom,
        String description,
        LocalDateTime date
) {
}
