package com.medicall.domain.member;

public record SocialInfo(
        String oauthId,
        String provider,
        String email
) {
}
