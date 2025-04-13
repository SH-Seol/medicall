package com.medicall.domain.term;

import com.medicall.domain.member.Member;
import org.springframework.stereotype.Component;

@Component
public class TermAgreementAppender {
    private final TermAgreementRepository termAgreementRepository;

    public TermAgreementAppender(TermAgreementRepository termAgreementRepository) {
        this.termAgreementRepository = termAgreementRepository;
    }

    public TermAgreement agreeToActiveTerms(Member member, NewTermAgreement newTermsAgreement) {
        return termAgreementRepository.agreeToActiveTerms(member.memberId(), newTermsAgreement.termId(),
                newTermsAgreement.termItemIds());
    }
}
