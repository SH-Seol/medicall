package com.medicall.auth.security.oauth2.dto;

import com.medicall.auth.security.oauth2.enums.SocialType;
import java.util.Map;

public record OAuth2Attributes(
        Map<String, Object> attributes,
        String email,
        String nickname,
        String profileImage
) {

    public static OAuth2Attributes of(SocialType socialType, Map<String, Object> attributes) {
        return switch (socialType) {
            case KAKAO -> ofKakao(attributes);
            case NAVER -> ofNaver(attributes);
        };
    }

    private static OAuth2Attributes ofKakao(Map<String, Object> attributes) {
        Map<String, Object> kakaoAccount = (Map<String, Object>) attributes.get("kakao_account");
        Map<String, String> profile = (Map<String, String>) kakaoAccount.get("profile");
        return new OAuth2Attributes(
                attributes,
                String.valueOf(kakaoAccount.get("email")),
                profile.get("nickname"),
                profile.get("profile_image_url")
        );
    }

    private static OAuth2Attributes ofNaver(Map<String, Object> attributes) {
        Map<String, String> response = (Map<String, String>) attributes.get("response");
        return new OAuth2Attributes(
                attributes,
                response.get("email"),
                response.get("nickname"),
                response.get("profile_image")
        );
    }
}
