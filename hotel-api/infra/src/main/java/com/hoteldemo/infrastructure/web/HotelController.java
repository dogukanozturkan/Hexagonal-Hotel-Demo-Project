package com.hoteldemo.infrastructure.web;

import com.hoteldemo.hotelapi.HotelFacade;
import com.hoteldemo.hotelapi.dto.CreateHotelDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HotelController {

    private final HotelFacade hotelFacade;

    public void createHotel() {
        hotelFacade.create(CreateHotelDto.builder().build());
    }
}
