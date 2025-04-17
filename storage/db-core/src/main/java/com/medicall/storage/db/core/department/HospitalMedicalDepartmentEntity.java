package com.medicall.storage.db.core.department;

import com.medicall.storage.db.core.common.domain.BaseEntity;
import com.medicall.storage.db.core.hospital.HospitalEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class HospitalMedicalDepartmentEntity extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "major_id", nullable = false)
    private MedicalDepartmentEntity medicalDepartment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hospital_id", nullable = false)
    private HospitalEntity hospital;

    protected HospitalMedicalDepartmentEntity() {}

    public HospitalMedicalDepartmentEntity(HospitalEntity hospital, MedicalDepartmentEntity medicalDepartment) {
        this.hospital = hospital;
        this.medicalDepartment = medicalDepartment;
    }

    public MedicalDepartmentEntity getMedicalDepartment() {
        return medicalDepartment;
    }

    public HospitalEntity getHospital() {
        return hospital;
    }
}
