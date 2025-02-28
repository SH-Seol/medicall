package com.medicall.storage.db.core.doctor;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    @Query("SELECT DISTINCT d.doctor " +
            "FROM Diagnosis d " +
            "WHERE d.member.id = :memberId")
    List<Doctor> findDoctorsByMemberId(@Param("memberId") Long memberId);

}
