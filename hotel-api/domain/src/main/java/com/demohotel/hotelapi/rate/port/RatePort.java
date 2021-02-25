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

    String create(CreateRate createRate);

    String update(UpdateRate updateRate);

    String remove(RemoveRate removeRate);

    Rate find(FindRate removeRate);
}
