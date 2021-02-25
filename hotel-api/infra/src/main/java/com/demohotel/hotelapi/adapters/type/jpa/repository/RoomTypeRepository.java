package com.demohotel.hotelapi.adapters.type.jpa.repository;

import com.demohotel.hotelapi.adapters.type.jpa.entity.RoomTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data repository for the RoomTypeEntity entity.
 */
@Repository
public interface RoomTypeRepository extends JpaRepository<RoomTypeEntity, Long> {
}
