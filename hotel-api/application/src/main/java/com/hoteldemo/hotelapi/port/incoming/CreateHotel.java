package com.hoteldemo.hotelapi.port.incoming;

import com.hoteldemo.hotelapi.dto.CreateHotelDto;
import com.hoteldemo.domain.model.Hotel;
import com.hoteldemo.domain.port.outgoing.HotelRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateHotel implements ICreateHotel {

    private final HotelRepository hotelRepository;

    @Override
    public Long execute(CreateHotelDto createHotelDto) {
        return hotelRepository.save(Hotel.builder()
                .country(createHotelDto.getCountry())
                .build()).getId();
    }
}
