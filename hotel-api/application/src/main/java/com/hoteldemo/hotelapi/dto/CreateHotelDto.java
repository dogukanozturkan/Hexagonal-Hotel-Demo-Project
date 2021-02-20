package com.hoteldemo.hotelapi.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CreateHotelDto {

    private String name;
    private String hotelType;
    private LocationDto location;
    private String postCode;
    private String country;
    private String phoneNumber;
    private String email;
    private String currency;
    private String imageUrl;
}
