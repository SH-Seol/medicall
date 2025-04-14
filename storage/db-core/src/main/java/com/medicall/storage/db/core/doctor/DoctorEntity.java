package com.medicall.storage.db.core.doctor;

import com.medicall.storage.db.core.common.domain.BaseEntity;
import com.medicall.storage.db.core.common.enums.MedicalStatus;
import com.medicall.storage.db.core.hospital.HospitalEntity;
import com.medicall.storage.db.core.major.MajorEntity;
import com.medicall.storage.db.core.treatment.PrescriptionEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class DoctorEntity extends BaseEntity {
    @Column(nullable = false)
    private String name;

    //전공
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "major_id")
    private MajorEntity major;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hospital_id")
    private HospitalEntity hospital;

    private String licenseNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private MedicalStatus status;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PrescriptionEntity> prescriptions;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DiagnosisEntity> diagnoses;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AppointmentEntity> appointments;

    @Column
    private String description;

    @Column
    private Integer years;

    protected DoctorEntity() {}

    public DoctorEntity(String name, MajorEntity major, HospitalEntity hospital) {
        this.name = name;
        this.major = major;
        this.hospital = hospital;
    }

    public String getName() {
        return name;
    }

    public MajorEntity getMajor() {
        return major;
    }

    public HospitalEntity getHospital() {
        return hospital;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public MedicalStatus getStatus() {
        return status;
    }

    public List<PrescriptionEntity> getPrescriptions() {
        return prescriptions;
    }

    public List<DiagnosisEntity> getDiagnoses() {
        return diagnoses;
    }

    public List<AppointmentEntity> getAppointments() {
        return appointments;
    }

    public String getDescription() {
        return description;
    }

    public Integer getYears() {
        return years;
    }
}
