package com.medicall.storage.db.core.doctor;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DoctorEntityRepository extends JpaRepository<DoctorEntity, Long> {
    @Query("SELECT DISTINCT d.doctor " +
            "FROM DiagnosisEntity d " +
            "WHERE d.member.id = :memberId")
    List<DoctorEntity> findDoctorsByMemberId(@Param("memberId") Long memberId);

}
