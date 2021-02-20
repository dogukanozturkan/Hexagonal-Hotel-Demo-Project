package com.hoteldemo.domain.port.outgoing;

import com.hoteldemo.domain.model.Hotel;
import com.hoteldemo.domain.model.HotelIdentifier;

import java.util.Optional;

public interface HotelRepository {

    HotelIdentifier save(Hotel hotel);
    Optional<Hotel> getHotelById(String id);

}
