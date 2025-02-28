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
public class PrescriptionMedicine extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prescription_id", nullable = false)
    private Prescription prescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medicine_id", nullable = false)
    private Medicine medicine;

    protected PrescriptionMedicine() {}

    // 복용량
    @Column(nullable = false)
    private Integer dosage;

    public PrescriptionMedicine(Prescription prescription, Medicine medicine, Integer dosage) {
        this.prescription = prescription;
        this.medicine = medicine;
        this.dosage = dosage;
    }
}
