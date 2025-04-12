package com.medicall.storage.db.core.doctor;

import com.medicall.storage.db.core.common.domain.BaseEntity;
import com.medicall.storage.db.core.member.MemberEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import lombok.Getter;

@Entity
@Getter
public class AppointmentEntity extends BaseEntity {
    @Column(nullable = false)
    LocalDate appointmentDate;

    @ManyToOne(optional = false)
    @JoinColumn(name = "doctor_id", nullable = false)
    private DoctorEntity doctor;

    @ManyToOne(optional = false)
    @JoinColumn(name = "member_id", nullable = false)
    private MemberEntity member;

    protected AppointmentEntity() {}

    public AppointmentEntity(LocalDate appointmentDate, DoctorEntity doctor, MemberEntity member) {
        this.appointmentDate = appointmentDate;
        this.doctor = doctor;
        this.member = member;
    }
}
