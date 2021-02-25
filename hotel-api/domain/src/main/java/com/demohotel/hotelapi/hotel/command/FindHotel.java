package com.demohotel.hotelapi.hotel.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FindHotel {

    private Long id;
    private String name;
    private String country;
    private String city;
}
