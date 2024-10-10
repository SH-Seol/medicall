package com.medicall.member.domain.entity;

import com.medicall.common.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public abstract class Member extends BaseEntity {
    private String name;
    private String phone;
    private String email;
    private String profileImage;

    private float locationX;
    private float locationY;
}
