package com.demohotel.hotelapi.hotel.event;

import com.demohotel.hotelapi.common.event.DomainEvent;
import com.demohotel.hotelapi.facility.model.Facility;
import com.demohotel.hotelapi.hotel.model.Hotel;
import com.demohotel.hotelapi.hotel.model.vo.Address;
import com.demohotel.hotelapi.hotel.model.vo.HotelId;
import com.demohotel.hotelapi.hotel.model.vo.HotelRate;
import com.demohotel.hotelapi.hotel.model.vo.HotelType;
import com.demohotel.hotelapi.image.model.Image;
import com.demohotel.hotelapi.room.model.Room;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@RequiredArgsConstructor
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
        return  HotelWasCreated.builder()
                    .occurredOn(Instant.now())
                    .hotelId(HotelId.from(hotel.getId()))
                .address(Address.of(
                        hotel.getAddressLine1(),
                        hotel.getAddressLine1(),
                        hotel.getLatitude(),
                        hotel.getLongitude()))
                .postCode(hotel.getPostCode())
                .country(hotel.getCountry())
                .phoneNumber(hotel.getPhoneNumber())
                .email(hotel.getEmail())
                .currency(hotel.getCurrency())
                .images(hotel.getImages())
                .facilities(hotel.getFacilities())
                .rooms(hotel.getRooms())
                .build();
    }

}