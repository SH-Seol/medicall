package com.medicall.storage.db.core.major;

import com.medicall.storage.db.core.common.domain.BaseEntity;
import com.medicall.storage.db.core.hospital.HospitalEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class SpecialityEntity extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "major_id", nullable = false)
    private MajorEntity major;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hospital_id", nullable = false)
    private HospitalEntity hospital;
}
