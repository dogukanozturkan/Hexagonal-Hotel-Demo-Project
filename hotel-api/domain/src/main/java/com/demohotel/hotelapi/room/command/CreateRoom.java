package com.demohotel.hotelapi.room.command;

import com.demohotel.hotelapi.hotel.model.Hotel;
import com.demohotel.hotelapi.occupancy.model.Occupancy;
import com.demohotel.hotelapi.type.model.RoomType;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CreateRoom {

    private Hotel hotel;
    private RoomType roomType;
    private String description;
    private String imageUrl;
    private List<Occupancy> occupancies;
}
