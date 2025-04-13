package com.medicall.support.error;

public enum CoreErrorType {
    HOSPITAL_NOT_FOUND(CoreErrorCode.HOSPITAL001, CoreErrorKind.NOT_FOUND, "존재하지 않는 병원입니다.", CoreErrorLevel.WARN),
    MEMBER_NOT_FOUND(CoreErrorCode.MEMBER001, CoreErrorKind.NOT_FOUND, "존재하지 않는 사용자입니다.", CoreErrorLevel.WARN),
    ACTIVE_TERM_NOT_FOUND(CoreErrorCode.TERM001, CoreErrorKind.NOT_FOUND, "존재하지 않는 약관입니다.", CoreErrorLevel.WARN),
    TERM_NOT_FOUND(CoreErrorCode.TERM002, CoreErrorKind.NOT_FOUND, "존재하지 않는 약관입니다.", CoreErrorLevel.WARN),
    TERMS_ALREADY_AGREED(CoreErrorCode.TERM003, CoreErrorKind.BAD_REQUEST, "이미 동의한 약관입니다.", CoreErrorLevel.WARN),
    REQUIRED_TERMS_NOT_AGREED(CoreErrorCode.TERM004, CoreErrorKind.BAD_REQUEST, "필수 약관에 동의하지 않았습니다.", CoreErrorLevel.WARN),
    ;

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
