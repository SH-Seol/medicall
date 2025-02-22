package com.medicall.domain.member.mapper;

import com.medicall.domain.member.domain.entity.Member;
import com.medicall.domain.member.dto.response.ProfileResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-13T19:02:32+0900",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.10.2.jar, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public ProfileResponse toProfileResponse(Member member) {
        if ( member == null ) {
            return null;
        }

        String nickname = null;
        String profileImage = null;

        nickname = member.getNickname();
        profileImage = member.getProfileImage();

        ProfileResponse profileResponse = new ProfileResponse( nickname, profileImage );

        return profileResponse;
    }
}
