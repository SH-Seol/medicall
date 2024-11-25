package com.medicall.domain.member.domain.repository;

import com.medicall.domain.member.domain.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}
