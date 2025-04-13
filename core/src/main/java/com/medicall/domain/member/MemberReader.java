package com.medicall.domain.member;

import com.medicall.support.error.CoreException;
import com.medicall.support.error.CoreErrorType;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class MemberReader {
    private final MemberRepository memberRepository;

    public MemberReader(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public boolean exist(String email) {
        return memberRepository.existByEmail(email);
    }

    public Member readEmail(String email) {
        return memberRepository.findByEmail(email)
                .orElseThrow(() -> new CoreException(CoreErrorType.MEMBER_NOT_FOUND));
    }

    public Member readId(Long memberId) {
        return memberRepository.findById(memberId)
                .orElseThrow(() -> new CoreException(CoreErrorType.MEMBER_NOT_FOUND));
    }

    public Optional<Member> find(String email) {
        return memberRepository.findByEmail(email);
    }
}
