package com.demohotel.hotelapi.hotel;

import com.demohotel.hotelapi.hotel.command.CloseHotel;
import com.demohotel.hotelapi.hotel.command.CreateHotel;
import com.demohotel.hotelapi.hotel.command.UpdateHotel;
import com.demohotel.hotelapi.hotel.model.vo.HotelIdentifier;
import com.demohotel.hotelapi.hotel.port.HotelPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class HotelFacade {

    private final HotelPort hotelPort;

    public HotelIdentifier create(CreateHotel createHotel) {
        return hotelPort.create(createHotel);
    }

    public HotelIdentifier update(UpdateHotel updateHotel) {
        return hotelPort.update(updateHotel);
    }

    public HotelIdentifier close(CloseHotel closeHotel) {
        return hotelPort.close(closeHotel);
    }
}
