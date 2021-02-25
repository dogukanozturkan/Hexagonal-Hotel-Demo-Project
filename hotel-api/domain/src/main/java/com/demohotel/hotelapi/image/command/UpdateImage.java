package com.demohotel.hotelapi.image.command;

import com.demohotel.hotelapi.hotel.model.Hotel;
import com.demohotel.hotelapi.room.model.Room;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateImage {

    private String url;
    private String tag;
    private String width;
    private String height;
    private Room room;
    private Hotel hotel;
}
