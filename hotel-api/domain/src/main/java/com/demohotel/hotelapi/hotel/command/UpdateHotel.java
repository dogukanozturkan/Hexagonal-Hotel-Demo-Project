package com.demohotel.hotelapi.hotel.command;

import com.demohotel.hotelapi.common.model.Image;
import com.demohotel.hotelapi.hotel.model.vo.Address;
import com.demohotel.hotelapi.hotel.model.vo.Facility;
import com.demohotel.hotelapi.hotel.model.vo.HotelRate;
import com.demohotel.hotelapi.hotel.model.vo.Translation;
import com.demohotel.hotelapi.room.model.Room;
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
