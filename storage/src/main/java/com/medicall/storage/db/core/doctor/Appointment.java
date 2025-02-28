package com.medicall.storage.db.core.doctor;

import com.medicall.storage.db.core.common.domain.BaseEntity;
import com.medicall.storage.db.core.member.Member;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import lombok.Getter;

@Entity
@Getter
public class Appointment extends BaseEntity {
    @Column(nullable = false)
    LocalDate appointmentDate;

    @ManyToOne(optional = false)
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

    @ManyToOne(optional = false)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    protected Appointment() {}

    public Appointment(LocalDate appointmentDate, Doctor doctor, Member member) {
        this.appointmentDate = appointmentDate;
        this.doctor = doctor;
        this.member = member;
    }
}
