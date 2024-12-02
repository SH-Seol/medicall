package com.medicall.domain.treatment.repository;

import com.medicall.domain.treatment.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {
}
