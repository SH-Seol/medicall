package com.medicall.member.domain.repository;

import com.medicall.member.domain.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
