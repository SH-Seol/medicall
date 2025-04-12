package com.medicall.support.error;

public enum CoreErrorType {
    HOSPITAL_NOT_FOUND(CoreErrorCode.HOSPITAL001, CoreErrorKind.NOT_FOUND, "존재하지 않는 병원입니다.", CoreErrorLevel.WARN);

    private final CoreErrorCode code;
    private final CoreErrorKind kind;
    private final String message;
    private final CoreErrorLevel level;

    CoreErrorType(CoreErrorCode code, CoreErrorKind kind, String message, CoreErrorLevel level) {
        this.code = code;
        this.kind = kind;
        this.message = message;
        this.level = level;
    }

    public String getCode() {
        return code.getCode();
    }

    public CoreErrorKind getKind() {
        return kind;
    }

    public String getMessage() {
        return message;
    }

    public CoreErrorLevel getErrorLevel() {
        return level;
    }
}
