package com.medicall.domain.location.dto.response;

import java.util.List;

public record HospitalResponse(
        Long id,
        String title,
        List<String> specialities,
        Long doctors
) {
}
