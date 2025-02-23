package com.medicall.api.controller.v1.member.dto.response;


public record MedicalRoleResponse(
    Long memberId,
    String role
) {
}
