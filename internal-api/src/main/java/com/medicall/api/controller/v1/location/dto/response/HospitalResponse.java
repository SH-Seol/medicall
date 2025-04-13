package com.medicall.api.controller.v1.location.dto.response;

import java.util.List;

public record HospitalResponse(
        Long id,
        String title,
        List<String> specialities,
        Long doctors
) {
}
