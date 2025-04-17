package com.medicall.storage.db.core.department;

import com.medicall.storage.db.core.common.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class MedicalDepartmentEntity extends BaseEntity {
    /*
    전공명
    ex. 외과, 내과, 등등
     */
    @Column(nullable = false)
    private String title;

    protected MedicalDepartmentEntity() {}

    public MedicalDepartmentEntity(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
