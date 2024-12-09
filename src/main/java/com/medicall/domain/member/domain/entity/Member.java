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

    // patient or doctor
    @Enumerated(EnumType.STRING)
    private MedicalRole medicalRole;

    //환자 id
    private Long patientId;

    //의사 id
    private Long doctorId;


    private float locationX;
    private float locationY;

    @Builder
    public Member(Long memberId, String nickname, String email, String profileImage, MemberRole memberRole,
                  MedicalRole medicalRole, Boolean allowance) {
        this.id = memberId;
        this.nickname = nickname;
        this.email = email;
        this.profileImage = profileImage;
        this.memberRole = memberRole;
        this.medicalRole = medicalRole;
        this.allowance = allowance;
    }

    public void updateAllowance() {
        this.allowance = true;
    }

    public void updateMedicalRole(MedicalRole medicalRole) {
        this.medicalRole = medicalRole;
    }
}

