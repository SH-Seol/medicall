package com.medicall.storage.db.core.hospital;

import com.medicall.storage.db.core.common.domain.BaseEntity;
import com.medicall.storage.db.core.doctor.DoctorEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DoctorHospitalEntity extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", nullable = false)
    private DoctorEntity doctor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hospital_id", nullable = false)
    private HospitalEntity hospital;

    protected DoctorHospitalEntity() {}

    public DoctorHospitalEntity(DoctorEntity doctor, HospitalEntity hospital) {
        this.doctor = doctor;
        this.hospital = hospital;
    }

    public DoctorEntity getDoctor() {
        return doctor;
    }

    public HospitalEntity getHospital() {
        return hospital;
    }
}
