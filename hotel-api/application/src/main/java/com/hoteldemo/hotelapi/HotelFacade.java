package com.hoteldemo.hotelapi;

import com.hoteldemo.hotelapi.dto.CreateHotelDto;
import com.hoteldemo.hotelapi.port.incoming.ICreateHotel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class HotelFacade {

    private final ICreateHotel createHotel;

    public Long create(CreateHotelDto hotel) {
        return createHotel.execute(hotel);
    }

}
