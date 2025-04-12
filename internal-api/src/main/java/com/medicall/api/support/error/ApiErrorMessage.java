package com.medicall.api.support.error;

import com.medicall.api.security.error.AuthErrorType;
import com.medicall.support.error.CoreErrorType;

public record ApiErrorMessage(
        String code,
        String message,
        Object data
) {
    public ApiErrorMessage(ApiErrorType errorType) {
        this(errorType.getCode(), errorType.getMessage(), null);
    }

    public ApiErrorMessage(ApiErrorType errorType, Object data) {
        this(errorType.getCode(), errorType.getMessage(), data);
    }

    public ApiErrorMessage(CoreErrorType errorType) {
        this(errorType.getCode(), errorType.getMessage(), null);
    }

    public ApiErrorMessage(CoreErrorType errorType, Object data) {
        this(errorType.getCode(), errorType.getMessage(), data);
    }

    public ApiErrorMessage(AuthErrorType errorType) {
        this(errorType.getCode(), errorType.getMessage(), null);
    }
}

