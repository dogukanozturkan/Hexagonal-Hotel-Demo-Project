package com.demohotel.reservationapi.adapters.reservation.jpa.repository;

import com.demohotel.reservationapi.adapters.reservation.jpa.entity.GuestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestJpaRepository extends JpaRepository<GuestEntity, Long> {
}
