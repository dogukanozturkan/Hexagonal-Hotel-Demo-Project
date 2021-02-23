package com.hexagonaldemo.hotelapi.adapters.hotel.jpa;

import com.hexagonaldemo.hotelapi.adapters.hotel.jpa.entity.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationJpaRepository extends JpaRepository<LocationEntity, String> {

}
