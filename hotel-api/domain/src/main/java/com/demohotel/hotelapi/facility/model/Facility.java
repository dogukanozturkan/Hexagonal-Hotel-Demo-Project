package com.demohotel.hotelapi.facility.model;

import com.demohotel.hotelapi.hotel.model.Hotel;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Facility {

    private String id;
    private String category;
    private String name;
    private List<Hotel> hotels;
}
