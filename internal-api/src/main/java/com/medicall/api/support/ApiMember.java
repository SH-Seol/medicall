package com.medicall.api.support;

import com.medicall.domain.member.Member;
import com.medicall.domain.member.ProfileInfo;
import com.medicall.domain.member.SocialInfo;

public record ApiMember(
        Long memberId,
        SocialInfo socialInfo,
        ProfileInfo profileInfo
) {
    public Member toMember() {
        return new Member(
                memberId,
                profileInfo,
                socialInfo
        );
    }
}