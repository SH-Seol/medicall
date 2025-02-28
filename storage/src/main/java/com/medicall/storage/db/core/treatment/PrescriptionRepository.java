package com.medicall.storage.db.core.treatment;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
    @Query("SELECT p FROM Prescription p WHERE p.member.id = :memberId")
    List<Prescription> findAllByMemberId(@Param("memberId") Long memberId);
}
