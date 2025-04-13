package com.medicall.domain.term;

import java.util.Optional;

public interface TermRepository {
    Optional<Term> findActiveTerm();
}
