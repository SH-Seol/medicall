package com.medicall.domain.medical.domain.entity;

import com.medicall.common.domain.BaseEntity;
import com.medicall.domain.member.domain.entity.Member;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Diagnosis extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor; // 진단을 내린 의사

    @ManyToOne(optional = false)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member; // 진단을 받은 환자

    @Column(nullable = false)
    private String diagnosisDetails;
}
