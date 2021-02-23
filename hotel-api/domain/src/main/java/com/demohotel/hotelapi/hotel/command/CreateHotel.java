package com.demohotel.hotelapi.hotel.command;

import com.demohotel.hotelapi.common.model.Image;
import com.demohotel.hotelapi.hotel.model.vo.*;
import com.demohotel.hotelapi.room.model.Room;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CreateHotel {

    private String name;
    private HotelType hotelType;
    private Address address;
    private String description;
    private String postCode;
    private String city;
    private String country;
    private String phoneNumber;
    private String email;
    private String currency;
    private Integer starRating;
    private List<Image> images;
    private List<Facility> facilities;
    private List<Translation> translations;
    private List<Room> rooms;
    private HotelRate rate;
}