package com.medicall.domain.term;

import java.util.List;

public record Term(
        Long termId,
        String name,
        int version,
        List<TermItem> termItems
) {
    public record TermItem(
            long termItemId,
            String title,
            String content,
            TermType termType
    ) {
    }
}
