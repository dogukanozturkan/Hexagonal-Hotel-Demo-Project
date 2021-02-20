package com.hoteldemo.hotelapi.port.incoming;

import com.hoteldemo.hotelapi.commond.Base;
import com.hoteldemo.hotelapi.dto.CreateHotelDto;

public interface ICreateHotel extends Base<CreateHotelDto, Long> {
    Long execute(CreateHotelDto createHotelDto);
}
