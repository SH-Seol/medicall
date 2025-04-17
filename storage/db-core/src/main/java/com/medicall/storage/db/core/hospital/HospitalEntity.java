package com.medicall.storage.db.core.hospital;

import com.medicall.storage.db.core.common.domain.BaseEntity;
import com.medicall.storage.db.core.department.HospitalMedicalDepartmentEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class HospitalEntity extends BaseEntity {
    /*
    병원 이름
     */
    @Column(length = 200)
    private String title;

    /*
    병원에 속한 의사 목록
     */
    @OneToMany(mappedBy = "hospital", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DoctorHospitalEntity> doctors = new ArrayList<>();

    /*
    병원 진료과목
     */
    @OneToMany(mappedBy = "hospital", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HospitalMedicalDepartmentEntity> medicalDepartments = new ArrayList<>();

    @Column
    private String description;

    protected HospitalEntity() {}

    public HospitalEntity(String title, List<DoctorHospitalEntity> doctors) {
        this.title = title;
        this.doctors = doctors;
    }

    public String getTitle() {
        return title;
    }

    public List<DoctorHospitalEntity> getDoctors() {
        return doctors;
    }

    public List<HospitalMedicalDepartmentEntity> getMedicalDepartments() {
        return medicalDepartments;
    }
}
