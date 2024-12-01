package com.medicall.domain.location.domain.repository;

import com.medicall.domain.location.domain.entity.VisitedHospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitedHospitalRepository extends JpaRepository<VisitedHospital, Integer> {
}
