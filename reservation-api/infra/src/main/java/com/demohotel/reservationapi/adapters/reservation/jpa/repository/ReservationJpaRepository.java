package com.demohotel.reservationapi.adapters.reservation.jpa.repository;

import com.demohotel.reservationapi.adapters.reservation.jpa.entity.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationJpaRepository extends JpaRepository<ReservationEntity, Long> {
}
