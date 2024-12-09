package com.medicall.auth.security.oauth2.service;


import com.medicall.auth.security.oauth2.dto.CustomOAuth2User;
import com.medicall.auth.security.oauth2.dto.OAuth2Attributes;
import com.medicall.auth.security.oauth2.dto.OAuth2UserDTO;
import com.medicall.auth.security.oauth2.enums.SocialType;
import com.medicall.common.enums.MedicalRole;
import com.medicall.common.enums.MemberRole;
import com.medicall.domain.member.domain.entity.Member;
import com.medicall.domain.member.domain.repository.MemberRepository;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

    private final MemberRepository memberRepository;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest request) throws OAuth2AuthenticationException {
        OAuth2User oAuth2User = super.loadUser(request);

        // Oauth2 서비스명
        String registrationId = request.getClientRegistration()
                .getRegistrationId();
        // 인증된 사용자 정보
        Map<String, Object> attributes = oAuth2User.getAttributes();
        // 소셜 로그인 종류
        SocialType socialType = SocialType.from(registrationId);
        // 소셜 로그인 attributes
        OAuth2Attributes oAuth2Attributes = OAuth2Attributes.of(socialType, attributes);

        Member member = memberRepository.findByEmail(oAuth2Attributes.email())
                .orElseGet(() -> {
                    // 사용자가 없다면 생성
                    Member newMember = Member.builder()
                            .nickname(oAuth2Attributes.nickname())
                            .email(oAuth2Attributes.email())
                            .profileImage(oAuth2Attributes.profileImage())
                            .memberRole(MemberRole.USER)
                            .medicalRole(MedicalRole.PATIENT)
                            .allowance(false)
                            .build();

                    return memberRepository.save(newMember);
                });
        OAuth2UserDTO oauth2UserDTO = OAuth2UserDTO.from(member);

        // SecurityContext 에 저장
        return new CustomOAuth2User(oauth2UserDTO);
    }
}


