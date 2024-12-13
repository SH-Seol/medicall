package com.medicall.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MedicalStatus {
    ACTIVE("호출 가능"), ON_TREATMENT("진료 중"), OFFLINE("오프라인");

    private final String context;
}
