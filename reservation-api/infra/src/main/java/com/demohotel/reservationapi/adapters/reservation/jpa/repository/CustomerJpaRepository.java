package com.demohotel.reservationapi.adapters.reservation.jpa.repository;

import com.demohotel.reservationapi.adapters.reservation.jpa.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerJpaRepository extends JpaRepository<CustomerEntity, Long> {
}
