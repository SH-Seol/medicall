package com.medicall.domain.member.domain.repository;

import com.medicall.domain.member.domain.entity.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NurseRepository extends JpaRepository<Nurse, Integer> {
}
