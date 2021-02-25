package com.demohotel.hotelapi.room.model;

import com.demohotel.hotelapi.hotel.model.Hotel;
import com.demohotel.hotelapi.occupancy.model.Occupancy;
import com.demohotel.hotelapi.type.model.RoomType;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Room {

    private String id;
    private Hotel hotel;
    private RoomType roomType;
    private String description;
    private String imageUrl;
    private List<Occupancy> occupancies;
}
