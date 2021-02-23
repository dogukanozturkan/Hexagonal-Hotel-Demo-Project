package com.demohotel.hotelapi.hotel.port;

import com.demohotel.hotelapi.common.Port;
import com.demohotel.hotelapi.hotel.command.CloseHotel;
import com.demohotel.hotelapi.hotel.command.CreateHotel;
import com.demohotel.hotelapi.hotel.command.UpdateHotel;
import com.demohotel.hotelapi.hotel.model.vo.HotelIdentifier;

@Port
public interface HotelPort {

    HotelIdentifier create(CreateHotel createHotel);

    HotelIdentifier close(CloseHotel removeHotel);

    HotelIdentifier update(UpdateHotel updateHotel);

}
