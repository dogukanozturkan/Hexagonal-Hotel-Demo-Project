package com.demohotel.hotelapi.image.model;

import com.demohotel.hotelapi.hotel.model.Hotel;
import com.demohotel.hotelapi.room.model.Room;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Image {

    private String id;
    private String url;
    private String tag;
    private String width;
    private String height;
    private Room room;
    private Hotel hotel;
}
