package com.demohotel.hotelapi.occupancy;


import com.demohotel.hotelapi.occupancy.command.CreateOccupancy;
import com.demohotel.hotelapi.occupancy.command.FindOccupancy;
import com.demohotel.hotelapi.occupancy.command.RemoveOccupancy;
import com.demohotel.hotelapi.occupancy.command.UpdateOccupancy;
import com.demohotel.hotelapi.occupancy.model.Occupancy;
import com.demohotel.hotelapi.occupancy.port.OccupancyPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OccupancyFacade {

    private OccupancyPort occupancyPort;

    public Long create(CreateOccupancy createOccupancy) {
        return occupancyPort.create(createOccupancy);
    }

    public Long update(UpdateOccupancy updateOccupancy) {
        return occupancyPort.update(updateOccupancy);
    }

    public Long remove(RemoveOccupancy removeOccupancy) {
        return occupancyPort.remove(removeOccupancy);
    }

    public Occupancy find(FindOccupancy findOccupancy) {
        return occupancyPort.find(findOccupancy);
    }
}
