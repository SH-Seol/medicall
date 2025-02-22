package com.medicall.error.code;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum HospitalErrorCode {
    HOSPITAL_NOT_FOUND(HttpStatus.NOT_FOUND, "HOSPITAL-001", "해당 병원은 존재하지 않습니다.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
}
