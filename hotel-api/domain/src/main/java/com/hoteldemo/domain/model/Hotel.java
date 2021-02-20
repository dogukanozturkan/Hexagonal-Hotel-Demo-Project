package com.hoteldemo.domain.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;


@Data
@Builder
public class Hotel {

    @EqualsAndHashCode.Include
    @Getter
    private HotelId id;
    private String name;
    private String hotelType;
    private Location location;
    private String postCode;
    private String country;
    private String phoneNumber;
    private String email;
    private String currency;
    private String rating;
    private String imageUrl;
    private List<Facility> facilityList;


}
