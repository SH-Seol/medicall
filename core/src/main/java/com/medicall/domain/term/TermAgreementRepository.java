package com.medicall.domain.term;

import java.util.List;
import java.util.Optional;

public interface TermAgreementRepository {
    boolean hasMemberAgreedToActiveTerms(long memberId);

    TermAgreement agreeToActiveTerms(long memberId, long termsId,
                                      List<Long> termsItemIds);

    Optional<TermAgreementCheckResult> findAgreementCheckInfo(long memberId, long termsId,
                                                               List<Long> termsItemIds);
}