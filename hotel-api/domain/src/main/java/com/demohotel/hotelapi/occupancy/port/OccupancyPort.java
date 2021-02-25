package com.demohotel.hotelapi.occupancy.port;

import com.demohotel.hotelapi.common.Port;
import com.demohotel.hotelapi.occupancy.command.CreateOccupancy;
import com.demohotel.hotelapi.occupancy.command.FindOccupancy;
import com.demohotel.hotelapi.occupancy.command.RemoveOccupancy;
import com.demohotel.hotelapi.occupancy.command.UpdateOccupancy;
import com.demohotel.hotelapi.occupancy.model.Occupancy;

@Port
public interface OccupancyPort {

    String create(CreateOccupancy createOccupancy);

    String update(UpdateOccupancy createOccupancy);

    String remove(RemoveOccupancy createOccupancy);

    Occupancy find(FindOccupancy createOccupancy);
}
