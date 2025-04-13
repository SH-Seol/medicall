package com.medicall.storage.db.core.hospital;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface HospitalEntityRepository extends JpaRepository<HospitalEntity, Long> {
    @Query("SELECT DISTINCT h FROM HospitalEntity h " +
            "LEFT JOIN h.specialities s " +
            "LEFT JOIN s.major m " +
            "WHERE h.title LIKE %:keyword% " +
            "OR m.title LIKE %:keyword%")
    List<HospitalEntity> searchByTitleOrSpeciality(@Param("keyword") String keyword);

}
