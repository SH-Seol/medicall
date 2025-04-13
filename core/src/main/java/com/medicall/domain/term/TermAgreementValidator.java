package com.medicall.domain.term;

import com.medicall.domain.member.Member;
import com.medicall.support.error.CoreErrorType;
import com.medicall.support.error.CoreException;
import org.springframework.stereotype.Component;

@Component
public class TermAgreementValidator {
    private final TermAgreementRepository termAgreementRepository;

    public TermAgreementValidator(TermAgreementRepository termAgreementRepository) {
        this.termAgreementRepository = termAgreementRepository;
    }

    public boolean hasMemberAgreedToActiveTerms(long memberId) {
        return termAgreementRepository.hasMemberAgreedToActiveTerms(memberId);
    }

    public void validateTermsAgreement(Member member, NewTermAgreement newTermAgreement) {
        TermAgreementCheckResult checkResult = termAgreementRepository.findAgreementCheckInfo(
                        member.memberId(), newTermAgreement.termId(), newTermAgreement.termItemIds())
                .orElseThrow(() -> new CoreException(CoreErrorType.TERM_NOT_FOUND));
        if (!checkResult.isActive()) {
            throw new CoreException(CoreErrorType.ACTIVE_TERM_NOT_FOUND);
        }
        if (!checkResult.hasAgreed()) {
            throw new CoreException(CoreErrorType.TERMS_ALREADY_AGREED);
        }
        if (!checkResult.hasAllRequiredFields()) {
            throw new CoreException(CoreErrorType.REQUIRED_TERMS_NOT_AGREED);
        }
    }
}

