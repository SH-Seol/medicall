package com.medicall.domain.location.domain.repository;

import com.medicall.domain.location.domain.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
}
