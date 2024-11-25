package com.medicall.auth.security.oauth2.dto;

import com.medicall.common.enums.MemberRole;
import com.medicall.member.domain.entity.Member;
import lombok.Builder;

@Builder
public record OAuth2UserDTO(
        Long memberId,
        String nickname,
        String email,
        String profileImage,
        Boolean allowance,
        MemberRole memberRole
) {
    public static OAuth2UserDTO from(Member member) {
        return new OAuth2UserDTO(
                member.getId(),
                member.getNickname(),
                member.getEmail(),
                member.getProfileImage(),
                member.getAllowance(),
                member.getRole()
        );
    }
}
