package com.medicall.domain.treatment.dto.response;

import java.time.LocalDateTime;
import java.util.List;

public record PrescriptionQrResponse(
        Long id,
        String patientName,
        List<MedicineInfo> medicines
) {
    public record MedicineInfo(
            String medicineName,
            Integer dosage
    ) {}
}
