package com.hexagonaldemo.hotelapi.hotel.command;

import com.hexagonaldemo.hotelapi.common.model.Image;
import com.hexagonaldemo.hotelapi.hotel.model.vo.*;
import com.hexagonaldemo.hotelapi.room.model.Room;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UpdateHotel {

    private String name;
    private String description;
    private Address address;
    private String postCode;
    private String city;
    private String country;
    private String phoneNumber;
    private String email;
    private String currency;
    private List<Image> images;
    private List<Facility> facilities;
    private List<Translation> translations;
    private List<Room> rooms;
    private HotelRate rate;
}
