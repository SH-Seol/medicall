package com.medicall.domain.treatment.repository;

import com.medicall.domain.treatment.entity.Requirement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequirementRepository extends JpaRepository<Requirement, Integer> {
}
