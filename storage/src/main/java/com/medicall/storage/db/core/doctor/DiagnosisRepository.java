package com.medicall.storage.db.core.doctor;

import com.medicall.domain.medical.domain.entity.Diagnosis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnosisRepository extends JpaRepository<Diagnosis, Long> {
}
