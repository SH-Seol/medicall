package com.medicall.support.error;

public enum CoreErrorCode {
    HOSPITAL001("HOSPITAL-001"),
    MEMBER001("MEMBER-001"),
    TERM001("TERM-001"),
    TERM002("TERM-002"),
    TERM003("TERM-003"),
    TERM004("TERM-004"),;

    private final String code;

    CoreErrorCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
