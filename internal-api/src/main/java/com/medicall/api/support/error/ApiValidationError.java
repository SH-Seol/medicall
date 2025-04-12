package com.medicall.api.support.error;

public record ApiValidationError(
        String field,
        String message
) {
}
