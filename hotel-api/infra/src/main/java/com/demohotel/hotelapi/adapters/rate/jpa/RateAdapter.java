package com.demohotel.hotelapi.adapters.rate.jpa;

import com.demohotel.hotelapi.adapters.rate.jpa.entity.RateEntity;
import com.demohotel.hotelapi.adapters.rate.jpa.repository.RateJpaRepository;
import com.demohotel.hotelapi.rate.command.CreateRate;
import com.demohotel.hotelapi.rate.command.FindRate;
import com.demohotel.hotelapi.rate.command.RemoveRate;
import com.demohotel.hotelapi.rate.command.UpdateRate;
import com.demohotel.hotelapi.rate.model.Rate;
import com.demohotel.hotelapi.rate.port.RatePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Adapter Implementation for managing {@link RateEntity}.
 */
@Service
@RequiredArgsConstructor
public class RateAdapter implements RatePort {

    private final RateJpaRepository rateJpaRepository;

    @Override
    public Long create(CreateRate createRate) {
        return null;
    }

    @Override
    public Long update(UpdateRate updateRate) {
        return null;
    }

    @Override
    public Long remove(RemoveRate removeRate) {
        return null;
    }

    @Override
    public Rate find(FindRate removeRate) {
        return null;
    }
}
