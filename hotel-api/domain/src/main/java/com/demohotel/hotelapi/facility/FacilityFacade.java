package com.demohotel.hotelapi.facility;

import com.demohotel.hotelapi.facility.command.CreateFacility;
import com.demohotel.hotelapi.facility.command.FindFacility;
import com.demohotel.hotelapi.facility.command.RemoveFacility;
import com.demohotel.hotelapi.facility.command.UpdateFacility;
import com.demohotel.hotelapi.facility.model.Facility;
import com.demohotel.hotelapi.facility.port.FacilityPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FacilityFacade {

    private final FacilityPort facilityPort;

    private String create(CreateFacility createFacility) {
        return facilityPort.create(createFacility);
    }

    private String update(UpdateFacility updateFacility) {
        return facilityPort.update(updateFacility);
    }

    private String remove(RemoveFacility removeFacility) {
        return facilityPort.remove(removeFacility);
    }

    private Facility find(FindFacility findFacility) {
        return facilityPort.find(findFacility);
    }

}
