package com.demohotel.hotelapi.rate.model;


import com.demohotel.hotelapi.hotel.model.Hotel;
import com.demohotel.hotelapi.room.model.Room;
import com.demohotel.hotelapi.type.model.RoomType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Rate {

    private Long id;
    private Hotel hotel;
    private Room room;
    private RoomType roomType;
    private String code;
    private String name;
    private String amount;
}
