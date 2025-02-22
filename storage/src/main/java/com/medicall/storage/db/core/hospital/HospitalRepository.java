package com.medicall.storage.db.core.hospital;

import java.util.List;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
    @Query("SELECT DISTINCT h FROM Hospital h " +
            "LEFT JOIN h.specialities s " +
            "LEFT JOIN s.major m " +
            "WHERE h.title LIKE %:keyword% " +
            "OR m.title LIKE %:keyword%")
    List<Hospital> searchByTitleOrSpeciality(@Param("keyword") String keyword);

}
