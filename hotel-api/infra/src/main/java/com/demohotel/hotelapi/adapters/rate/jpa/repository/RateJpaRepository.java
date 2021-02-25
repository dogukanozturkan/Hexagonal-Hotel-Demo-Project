package com.demohotel.hotelapi.adapters.rate.jpa.repository;

import com.demohotel.hotelapi.adapters.rate.jpa.entity.RateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data repository for the RateEntity entity.
 */
@Repository
public interface RateJpaRepository extends JpaRepository<RateEntity, Long> {
}
