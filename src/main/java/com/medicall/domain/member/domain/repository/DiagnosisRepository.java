package com.medicall.domain.member.domain.repository;

import com.medicall.domain.member.domain.entity.Diagnosis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnosisRepository extends JpaRepository<Diagnosis, Integer> {
}
