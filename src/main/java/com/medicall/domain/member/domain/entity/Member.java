package com.medicall.domain.member.domain.entity;

import com.medicall.common.domain.BaseEntity;
import com.medicall.common.enums.MedicalRole;
import com.medicall.common.enums.MemberRole;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickname;
    private String phone;
    private String email;
    private String profileImage;
    private Boolean allowance;

    @Enumerated(EnumType.STRING)
    private MemberRole memberRole;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MedicalRole medicalRole; // patient or doctor

    @OneToOne(mappedBy = "member", cascade = CascadeType.ALL)
    private Patient patient;

    @OneToOne(mappedBy = "member", cascade = CascadeType.ALL)
    private Doctor doctor;


    private float locationX;
    private float locationY;

    @Builder
    public Member(Long memberId, String nickname, String email, String profileImage, MemberRole memberRole,
                  Boolean allowance) {
        this.id = memberId;
        this.nickname = nickname;
        this.email = email;
        this.profileImage = profileImage;
        this.memberRole = memberRole;
        this.allowance = allowance;
    }

    public void updateAllowance() {
        this.allowance = true;
    }
}
