package com.hoteldemo.infrastructure.jpa;

import com.hoteldemo.infrastructure.jpa.entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelJpaRepository extends JpaRepository<HotelEntity, Long> {

}
