package com.medicall.domain.member.domain.repository;

import com.medicall.domain.member.domain.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
