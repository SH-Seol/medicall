package com.medicall.storage.db.core.treatment;

import com.medicall.storage.db.core.common.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity
@Getter
public class PrescriptionMedicineEntity extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prescription_id", nullable = false)
    private PrescriptionEntity prescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medicine_id", nullable = false)
    private MedicineEntity medicine;

    protected PrescriptionMedicineEntity() {}

    // 복용량
    @Column(nullable = false)
    private Integer dosage;

    public PrescriptionMedicineEntity(PrescriptionEntity prescription, MedicineEntity medicine, Integer dosage) {
        this.prescription = prescription;
        this.medicine = medicine;
        this.dosage = dosage;
    }
}
