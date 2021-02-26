package com.demohotel.hotelapi.hotel;

import com.demohotel.hotelapi.hotel.command.CloseHotel;
import com.demohotel.hotelapi.hotel.command.CreateHotel;
import com.demohotel.hotelapi.hotel.command.FindHotel;
import com.demohotel.hotelapi.hotel.command.UpdateHotel;
import com.demohotel.hotelapi.hotel.model.Hotel;
import com.demohotel.hotelapi.hotel.port.HotelPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Facade for managing Hotels via HotelPort {@link Hotel}.
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class HotelFacade {

    private final HotelPort hotelPort;

    public Long create(CreateHotel createHotel) {
        return hotelPort.create(createHotel);
    }

    public Long update(UpdateHotel updateHotel) {
        return hotelPort.update(updateHotel);
    }

    public Long close(CloseHotel closeHotel) {
        return hotelPort.close(closeHotel);
    }

    public Hotel find(FindHotel findHotel) {
        return hotelPort.find(findHotel);
    }
}
