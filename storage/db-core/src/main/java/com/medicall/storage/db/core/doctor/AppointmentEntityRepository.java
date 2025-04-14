package com.medicall.storage.db.core.doctor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentEntityRepository extends JpaRepository<AppointmentEntity, Integer> {
}
