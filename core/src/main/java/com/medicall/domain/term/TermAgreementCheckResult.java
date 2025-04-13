package com.medicall.domain.term;

public record TermAgreementCheckResult(
        long termId,
        boolean isActive,
        boolean hasAgreed,
        boolean hasAllRequiredFields
) {
}
