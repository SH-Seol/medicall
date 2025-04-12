package com.medicall.domain.member;

public record Member(
        Long memberId,
        ProfileInfo profileInfo,
        SocialInfo socialInfo
) {
}
