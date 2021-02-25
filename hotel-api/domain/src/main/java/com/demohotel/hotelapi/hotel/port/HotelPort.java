package com.demohotel.hotelapi.hotel.port;


import com.demohotel.hotelapi.common.Port;
import com.demohotel.hotelapi.hotel.command.CloseHotel;
import com.demohotel.hotelapi.hotel.command.CreateHotel;
import com.demohotel.hotelapi.hotel.command.FindHotel;
import com.demohotel.hotelapi.hotel.command.UpdateHotel;
import com.demohotel.hotelapi.hotel.model.Hotel;

/**
 * Port for managing {@link Hotel}.
 */
@Port
public interface HotelPort {

    /**
     * Create a hotel.
     *
     * @param createHotel the domain to create.
     * @return the persisted hotelId.
     */
    String create(CreateHotel createHotel);

    /**
     * Update a hotel.
     *
     * @param updateHotel the domain to save.
     * @return the persisted hotelId.
     */
    String update(UpdateHotel updateHotel);

    /**
     * Close the hotel by id.
     *
     * @param removeHotel includes id of the entity.
     */
    String close(CloseHotel removeHotel);

    /**
     * Get one hotel by id.
     *
     * @param findHotel includes id of the domain.
     * @return the Hotel domain.
     */
    Hotel find(FindHotel findHotel);

}
