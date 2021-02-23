package com.hexagonaldemo.hotelapi.hotel;

import com.hexagonaldemo.hotelapi.hotel.command.CreateHotel;
import com.hexagonaldemo.hotelapi.hotel.command.UpdateHotel;
import com.hexagonaldemo.hotelapi.hotel.model.vo.HotelIdentifier;
import com.hexagonaldemo.hotelapi.hotel.port.HotelPort;
import com.hexagonaldemo.hotelapi.hotel.command.CloseHotel;
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
