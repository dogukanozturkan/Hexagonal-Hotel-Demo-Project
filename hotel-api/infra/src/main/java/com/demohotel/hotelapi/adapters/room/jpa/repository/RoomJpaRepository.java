package com.demohotel.hotelapi.adapters.room.jpa.repository;

import com.demohotel.hotelapi.adapters.room.jpa.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data repository for the RoomEntity entity.
 */
@Repository
public interface RoomJpaRepository extends JpaRepository<RoomEntity, Long> {
}
