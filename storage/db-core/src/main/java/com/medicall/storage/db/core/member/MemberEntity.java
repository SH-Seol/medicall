package com.medicall.storage.db.core.member;

import com.medicall.storage.db.core.common.domain.BaseEntity;
import com.medicall.storage.db.core.common.enums.MedicalRole;
import com.medicall.storage.db.core.common.enums.MemberRole;
import com.medicall.storage.db.core.doctor.AppointmentEntity;
import com.medicall.storage.db.core.doctor.DiagnosisEntity;
import com.medicall.storage.db.core.treatment.PrescriptionEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
public class MemberEntity extends BaseEntity {
    //환자와 의사가 공통적으로 취급하는 것들
    //소셜 로그인으로 얻는 정보들

    private String nickname;
    private String phone;
    private String email;
    private String profileImage;
    private Boolean allowance;

    @Enumerated(EnumType.STRING)
    private MemberRole memberRole;

    @Enumerated(EnumType.STRING)
    private MedicalRole medicalRole;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DiagnosisEntity> diagnoses;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PrescriptionEntity> prescriptions;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AppointmentEntity> appointments;

    protected MemberEntity() {}

    public MemberEntity(String nickname, String phone, String email) {
        this.nickname = nickname;
        this.phone = phone;
        this.email = email;
    }

    @Builder
    public MemberEntity(Long memberId, String nickname, String email, String profileImage, MemberRole memberRole,
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

