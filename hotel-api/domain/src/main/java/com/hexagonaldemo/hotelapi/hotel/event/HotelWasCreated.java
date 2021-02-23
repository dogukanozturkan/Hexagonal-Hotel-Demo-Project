package com.hexagonaldemo.hotelapi.hotel.event;

import com.hexagonaldemo.hotelapi.common.event.DomainEvent;
import com.hexagonaldemo.hotelapi.common.model.Image;
import com.hexagonaldemo.hotelapi.hotel.model.Hotel;
import com.hexagonaldemo.hotelapi.hotel.model.vo.*;
import com.hexagonaldemo.hotelapi.room.model.Room;
import lombok.Value;

import java.time.Instant;
import java.util.List;

@Value(staticConstructor = "from")
public class HotelWasCreated implements DomainEvent {

    Instant occurredOn;
    HotelId hotelId;
    String name;
    HotelType hotelType;
    Address address;
    String postCode;
    String country;
    String phoneNumber;
    String email;
    String currency;
    HotelRate rate;
    List<Image> images;
    List<Facility> facilities;
    List<Room> rooms;

    public static HotelWasCreated from(Hotel hotel) {
        return new HotelWasCreated(Instant.now(), hotel.getId(), hotel.getName(), hotel.getHotelType(),
                                    hotel.getAddress(), hotel.getPostCode(), hotel.getCountry(), hotel.getPhoneNumber(),
                                    hotel.getEmail(), hotel.getCurrency(), hotel.getRate(), hotel.getImages(),
                                    hotel.getFacilities(), hotel.getRooms());
    }

}