package com.medicall.domain.member;

import org.springframework.stereotype.Component;

@Component
public class MemberWriter {
    private final MemberRepository memberRepository;
    public MemberWriter(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void add(ProfileInfo profileInfo, SocialInfo socialInfo){
        memberRepository.save(new NewMember(profileInfo, socialInfo));
    }
}
