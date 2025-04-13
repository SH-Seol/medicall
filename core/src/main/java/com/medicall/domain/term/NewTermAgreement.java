package com.medicall.domain.term;

import java.util.List;

public record NewTermAgreement(
        long termId,
        List<Long> termItemIds
) {
}
