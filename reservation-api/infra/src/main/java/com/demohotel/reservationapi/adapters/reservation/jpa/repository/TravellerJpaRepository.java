package com.demohotel.reservationapi.adapters.reservation.jpa.repository;

import com.demohotel.reservationapi.adapters.reservation.jpa.entity.TravellerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravellerJpaRepository extends JpaRepository<TravellerEntity, Long> {
}
