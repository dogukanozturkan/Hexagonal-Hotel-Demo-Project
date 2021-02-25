package com.demohotel.hotelapi.room.command;

import com.demohotel.hotelapi.hotel.model.Hotel;
import com.demohotel.hotelapi.type.model.RoomType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateRoom {

    private String id;
    private String hotelId;
    private Hotel hotel;
    private RoomType roomType;
    private String description;
    private String imageUrl;
}
