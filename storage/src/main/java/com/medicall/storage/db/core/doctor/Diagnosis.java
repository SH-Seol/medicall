package com.medicall.storage.db.core.doctor;

import com.medicall.storage.db.core.common.domain.BaseEntity;
import com.medicall.storage.db.core.member.Member;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity
@Getter
public class Diagnosis extends BaseEntity {
    @ManyToOne(optional = false)
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

    @ManyToOne(optional = false)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Column(nullable = false)
    private String diagnosisDetails;

    protected Diagnosis() {}

    public Diagnosis(Doctor doctor, Member member, String diagnosisDetails) {
        this.doctor = doctor;
        this.member = member;
        this.diagnosisDetails = diagnosisDetails;
    }
}
