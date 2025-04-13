package com.medicall.domain.term;

import java.time.LocalDateTime;

public record TermAgreement(
        long agreementId,
        long memberId,
        long termId,
        LocalDateTime agreeAt
) {
}
