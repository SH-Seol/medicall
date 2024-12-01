package com.medicall.domain.location.domain.repository;

import com.medicall.domain.location.domain.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
