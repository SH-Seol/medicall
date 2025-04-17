package com.medicall.storage.db.core.department;

import com.medicall.storage.db.core.common.domain.BaseEntity;
import com.medicall.storage.db.core.doctor.DoctorEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DoctorMedicalDepartmentEntity extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", nullable = false)
    private DoctorEntity doctor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    private MedicalDepartmentEntity medicalDepartment;

    protected DoctorMedicalDepartmentEntity() {}

    public DoctorMedicalDepartmentEntity(DoctorEntity doctor, MedicalDepartmentEntity medicalDepartment) {
        this.doctor = doctor;
        this.medicalDepartment = medicalDepartment;
    }

    public DoctorEntity getDoctor() {
        return doctor;
    }

    public MedicalDepartmentEntity getMedicalDepartment() {
        return medicalDepartment;
    }
}
