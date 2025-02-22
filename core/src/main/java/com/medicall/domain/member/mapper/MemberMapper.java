package com.medicall.domain.member.mapper;

import com.medicall.domain.member.domain.entity.Member;
import com.medicall.domain.member.dto.response.ProfileResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    ProfileResponse toProfileResponse(Member member);
}
