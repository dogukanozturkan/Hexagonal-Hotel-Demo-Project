package com.demohotel.hotelapi.rate.port;

import com.demohotel.hotelapi.common.Port;
import com.demohotel.hotelapi.rate.command.CreateRate;
import com.demohotel.hotelapi.rate.command.FindRate;
import com.demohotel.hotelapi.rate.command.RemoveRate;
import com.demohotel.hotelapi.rate.command.UpdateRate;
import com.demohotel.hotelapi.rate.model.Rate;

/**
 * Port for managing {@link Rate}.
 */
@Port
public interface RatePort {

    Long create(CreateRate createRate);

    Long update(UpdateRate updateRate);

    Long remove(RemoveRate removeRate);

    Rate find(FindRate removeRate);
}
