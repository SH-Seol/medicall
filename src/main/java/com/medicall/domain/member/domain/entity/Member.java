package com.medicall.domain.member.domain.entity;

import com.medicall.common.domain.BaseEntity;
import com.medicall.common.enums.MemberRole;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public abstract class Member extends BaseEntity {
    private Long id;
    private String nickname;
    private String phone;
    private String email;
    private String profileImage;
    private Boolean allowance;
    private MemberRole role;


    private float locationX;
    private float locationY;

    @Builder
    public Member(Long memberId, String nickname, String email, String profileImage, MemberRole role,
                  Boolean allowance) {
        this.id = memberId;
        this.nickname = nickname;
        this.email = email;
        this.profileImage = profileImage;
        this.role = role;
        this.allowance = allowance;
    }

    public void updateAllowance() {
        this.allowance = true;
    }
}
