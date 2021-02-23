package com.demohotel.hotelapi.adapters.hotel.jpa.repository;

import com.demohotel.hotelapi.adapters.hotel.jpa.entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelJpaRepository extends JpaRepository<HotelEntity, String> {

}
