package com.medicall.api.controller.v1.treatment.dto.request;


import java.time.LocalDateTime;
import lombok.Builder;

/*
환자가 병원에 예약 요청할 때 보내는 요청
 */
@Builder
public record RequirementRequest(
        String symptom,
        String description,
        LocalDateTime date
) {
}
