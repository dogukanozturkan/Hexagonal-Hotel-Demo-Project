package com.demohotel.hotelapi.facility.port;

import com.demohotel.hotelapi.common.Port;
import com.demohotel.hotelapi.facility.command.CreateFacility;
import com.demohotel.hotelapi.facility.command.FindFacility;
import com.demohotel.hotelapi.facility.command.RemoveFacility;
import com.demohotel.hotelapi.facility.command.UpdateFacility;
import com.demohotel.hotelapi.facility.model.Facility;

@Port
public interface FacilityPort {

    Long create(CreateFacility createFacility);

    Long update(UpdateFacility createFacility);

    Long remove(RemoveFacility createFacility);

    Facility find(FindFacility createFacility);
}
