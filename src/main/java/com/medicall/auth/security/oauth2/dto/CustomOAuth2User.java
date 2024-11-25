package com.medicall.auth.security.oauth2.dto;

import com.medicall.common.enums.MemberRole;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;

public record CustomOAuth2User(OAuth2UserDTO oauth2UserDTO) implements OAuth2User {

    @Override
    public <A> A getAttribute(String name) {
        return (A) getAttributes().get(name);
    }

    @Override
    public Map<String, Object> getAttributes() {
        return Map.of(
                "nickname", oauth2UserDTO.nickname(),
                "email", oauth2UserDTO.email(),
                "profileImage", oauth2UserDTO.profileImage(),
                "allowance", oauth2UserDTO.allowance()
        );
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of((GrantedAuthority) () -> oauth2UserDTO.memberRole().getRoleName());
    }

    @Override
    public String getName() {
        return oauth2UserDTO.email();
    }

    // 명시적인 getter 메서드
    public Long getMemberId() {
        return oauth2UserDTO.memberId();
    }

    public MemberRole getRole() {
        return oauth2UserDTO.memberRole();
    }

    public String getNickname() {
        return oauth2UserDTO.nickname();
    }

    public String getEmail() {
        return oauth2UserDTO.email();
    }

    public String getProfileImage() {
        return oauth2UserDTO.profileImage();
    }

    public Boolean getAllowance() {
        return oauth2UserDTO.allowance();
    }
}
