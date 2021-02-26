package com.demohotel.hotelapi.rate;

import com.demohotel.hotelapi.rate.command.CreateRate;
import com.demohotel.hotelapi.rate.command.FindRate;
import com.demohotel.hotelapi.rate.command.RemoveRate;
import com.demohotel.hotelapi.rate.command.UpdateRate;
import com.demohotel.hotelapi.rate.model.Rate;
import com.demohotel.hotelapi.rate.port.RatePort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Facade for managing Hotels via RatePort {@link Rate}.
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class RateFacade {

    private final RatePort ratePort;

    public Long create(CreateRate createRate) {
        return ratePort.create(createRate);
    }

    public Long update(UpdateRate updateRate) {
        return ratePort.update(updateRate);
    }

    public Long remove(RemoveRate removeRate) {
        return ratePort.remove(removeRate);
    }

    public Rate find(FindRate findRate) {
        return ratePort.find(findRate);
    }
}
