package com.medicall.storage.db.core.doctor;

import com.medicall.storage.db.core.common.domain.BaseEntity;
import com.medicall.storage.db.core.member.MemberEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DiagnosisEntity extends BaseEntity {
    @ManyToOne(optional = false)
    @JoinColumn(name = "doctor_id", nullable = false)
    private DoctorEntity doctor;

    @ManyToOne(optional = false)
    @JoinColumn(name = "member_id", nullable = false)
    private MemberEntity member;

    @Column(nullable = false)
    private String diagnosisDetails;

    protected DiagnosisEntity() {}

    public DiagnosisEntity(DoctorEntity doctor, MemberEntity member, String diagnosisDetails) {
        this.doctor = doctor;
        this.member = member;
        this.diagnosisDetails = diagnosisDetails;
    }

    public DoctorEntity getDoctor() {
        return doctor;
    }

    public MemberEntity getMember() {
        return member;
    }

    public String getDiagnosisDetails() {
        return diagnosisDetails;
    }
}
