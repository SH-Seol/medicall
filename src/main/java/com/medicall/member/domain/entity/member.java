package com.medicall.member.domain.entity;

import com.medicall.common.enums.MemberType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 255)
    private String email;

    private String profileImage;

    @Column(nullable = false)
    private MemberType memberType;

    @Builder
    public member(String name, String email, String profileImage, MemberType memberType) {
        this.name = name;
        this.email = email;
        this.profileImage = profileImage;
        this.memberType = memberType;
    }
}
