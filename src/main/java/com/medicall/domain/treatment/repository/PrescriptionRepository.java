package com.medicall.domain.treatment.repository;

import com.medicall.domain.treatment.entity.Prescription;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
    @Query("SELECT p FROM Prescription p WHERE p.member.id = :memberId")
    List<Prescription> findAllByMemberId(@Param("memberId") Long memberId);

}
