package com.medicall.domain.member;

import java.time.LocalDateTime;

public record ProfileInfo(
        String nickname,
        String bio,
        String profileImage,
        LocalDateTime nicknameUpdatedAt
) {
}
