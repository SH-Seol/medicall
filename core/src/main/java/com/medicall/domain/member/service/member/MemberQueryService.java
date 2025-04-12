package com.medicall.domain.member.service.member;

import com.medicall.domain.member.domain.entity.Member;
import com.medicall.domain.member.domain.repository.MemberRepository;
import com.medicall.domain.member.dto.response.AppointmentResponse;
import com.medicall.domain.member.dto.response.ProfileResponse;
import com.medicall.domain.member.mapper.MemberMapper;
import com.medicall.support.error.exception.CustomException;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberQueryService {
    //추가할 것은 방문했던 병원 목록 조회
    private final MemberRepository memberRepository;
    private final MemberMapper memberMapper;

    public ProfileResponse getProfile(Long memberId) {
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new CustomException(MemberErrorCode.MEMBER_NOT_FOUND));
        return memberMapper.toProfileResponse(member);
    }

    public AppointmentResponse getAppointment(Long memberId) {
        return null; 
    }
}
