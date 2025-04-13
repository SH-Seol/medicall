package com.medicall.domain.term;

import com.medicall.domain.member.Member;
import org.springframework.stereotype.Service;

@Service
public class TermService {
    private final TermAgreementAppender termAgreementAppender;
    private final TermReader termReader;
    private final TermAgreementValidator termAgreementValidator;

    public TermService(TermAgreementAppender termAgreementAppender, TermReader termReader,
                       TermAgreementValidator termAgreementValidator) {
        this.termAgreementAppender = termAgreementAppender;
        this.termReader = termReader;
        this.termAgreementValidator = termAgreementValidator;
    }

    public TermAgreement agreeToActiveTerms(Member member, NewTermAgreement newTermsAgreement) {
        termAgreementValidator.validateTermsAgreement(member, newTermsAgreement);
        return termAgreementAppender.agreeToActiveTerms(member, newTermsAgreement);
    }

    public Term getActiveTerms() {
        return termReader.readActive();
    }

    public boolean hasMemberAgreedToActiveTerms(long memberId) {
        return termAgreementValidator.hasMemberAgreedToActiveTerms(memberId);
    }
}
