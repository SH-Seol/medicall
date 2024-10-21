package com.medicall.member.domain.repository;

import com.medicall.member.domain.entity.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NurseRepository extends JpaRepository<Nurse, Integer> {
}
