package com.medicall.storage.db.core.member;

import com.medicall.storage.db.core.common.domain.BaseEntity;
import com.medicall.storage.db.core.common.enums.MemberRole;
import com.medicall.storage.db.core.doctor.Appointment;
import com.medicall.storage.db.core.doctor.Diagnosis;
import com.medicall.storage.db.core.treatment.Prescription;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
public class Member extends BaseEntity {
    private String nickname;
    private String phone;
    private String email;
    private String profileImage;
    private Boolean allowance;

    @Enumerated(EnumType.STRING)
    private MemberRole memberRole;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Diagnosis> diagnoses;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Prescription> prescriptions;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Appointment> appointments;

    protected Member() {}

    public Member(String nickname, String phone, String email) {
        this.nickname = nickname;
        this.phone = phone;
        this.email = email;
    }

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

