package com.medicall.domain.term;

import com.medicall.support.error.CoreErrorType;
import com.medicall.support.error.CoreException;
import org.springframework.stereotype.Component;

@Component
public class TermReader {
    private final TermRepository termRepository;
    public TermReader(TermRepository termRepository) {
        this.termRepository = termRepository;
    }

    public Term readActive() {
        return termRepository.findActiveTerm()
                .orElseThrow(() -> new CoreException(CoreErrorType.ACTIVE_TERM_NOT_FOUND));
    }
}
