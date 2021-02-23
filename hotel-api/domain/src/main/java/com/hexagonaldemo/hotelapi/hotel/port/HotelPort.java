package com.hexagonaldemo.hotelapi.hotel.port;

import com.hexagonaldemo.hotelapi.hotel.model.vo.HotelIdentifier;
import com.hexagonaldemo.hotelapi.common.Port;
import com.hexagonaldemo.hotelapi.hotel.command.CloseHotel;
import com.hexagonaldemo.hotelapi.hotel.command.CreateHotel;
import com.hexagonaldemo.hotelapi.hotel.command.UpdateHotel;

@Port
public interface HotelPort {

    HotelIdentifier create(CreateHotel createHotel);

    HotelIdentifier close(CloseHotel removeHotel);

    HotelIdentifier update(UpdateHotel updateHotel);

}
