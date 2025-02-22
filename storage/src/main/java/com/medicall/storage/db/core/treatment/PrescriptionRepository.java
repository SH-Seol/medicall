package com.medicall.storage.db.core.treatment;

import java.util.List;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
    @Query("SELECT p FROM Prescription p WHERE p.member.id = :memberId")
    List<Prescription> findAllByMemberId(@Param("memberId") Long memberId);
}
