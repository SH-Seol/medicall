package com.medicall.api.auth.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
@Schema(description = "설문 참여 요청")
public record AllowanceRequest(
        @NotBlank(message = "설문 참여 토큰이 존재하지 않습니다.")
        @Schema(description = "설문 참여 토큰")
        String token
) {
}
