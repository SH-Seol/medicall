package com.medicall.support.error;

public enum CoreErrorCode {
    HOSPITAL001("HOSPITAL-001");
    private final String code;

    CoreErrorCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
