package com.medicall.storage.db.core.treatment;

import com.medicall.common.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Medicine extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //약 이름
    @Column(nullable = false)
    private String medicineName;

    //약품 번호
    @Column(nullable = false)
    private String medicineCode;

    //제약회사
    @Column(nullable = false)
    private String manufacturer;

    @Builder
    public Medicine(String medicineName, String medicineCode, String manufacturer) {
        this.medicineName = medicineName;
        this.medicineCode = medicineCode;
        this.manufacturer = manufacturer;
    }
}
