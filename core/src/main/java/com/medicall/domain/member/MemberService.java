package com.medicall.domain.member;


import com.medicall.support.error.CoreErrorCode;
import com.medicall.support.error.CoreErrorType;
import com.medicall.support.error.CoreException;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
//    //추가할 것은 방문했던 병원 목록 조회
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Optional<Member> findByEmail(String email) {
        return memberRepository.findByEmail(email);
    }

    public Long create(ProfileInfo profileInfo, SocialInfo socialInfo) {
        return memberRepository.save(new NewMember(profileInfo, socialInfo));
    }
//
//    public ProfileResponse getProfile(Long memberId) {
//        Member member = memberRepository.findById(memberId)
//                .orElseThrow(() -> new CustomException(MemberErrorCode.MEMBER_NOT_FOUND));
//        return memberMapper.toProfileResponse(member);
//    }
//
//    public AppointmentResponse getAppointment(Long memberId) {
//        return null;
//    }
}
