package com.medicall.storage.db.core.treatment;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PrescriptionEntityRepository extends JpaRepository<PrescriptionEntity, Long> {
    @Query("SELECT p FROM PrescriptionEntity p WHERE p.member.id = :memberId")
    List<PrescriptionEntity> findAllByMemberId(@Param("memberId") Long memberId);
}
