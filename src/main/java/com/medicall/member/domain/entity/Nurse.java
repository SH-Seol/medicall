package com.medicall.member.domain.entity;

import com.medicall.common.domain.BaseEntity;
import com.medicall.common.enums.MedicalStatus;
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
public class Nurse extends Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private MedicalStatus status;

    @Builder
    public Nurse(MedicalStatus status) {
        this.status = status;
    }
}
