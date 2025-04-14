package com.medicall.storage.db.core.treatment;

import com.medicall.storage.db.core.common.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class MedicineEntity extends BaseEntity {
    //약 이름
    @Column(nullable = false)
    private String medicineName;

    //약품 번호
    @Column(nullable = false)
    private String medicineCode;

    //제약회사
    @Column(nullable = false)
    private String manufacturer;

    public MedicineEntity(String medicineName, String medicineCode, String manufacturer) {
        this.medicineName = medicineName;
        this.medicineCode = medicineCode;
        this.manufacturer = manufacturer;
    }

    protected MedicineEntity() {}
}
