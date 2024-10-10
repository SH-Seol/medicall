package com.medicall.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MemberType {
    DOCTOR("의사"), NURSE("간호사"), PATIENT("환자");

    private final String roleName;
}
