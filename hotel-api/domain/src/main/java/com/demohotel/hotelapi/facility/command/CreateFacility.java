package com.demohotel.hotelapi.facility.command;


import com.demohotel.hotelapi.hotel.model.Hotel;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CreateFacility {

    private String code;
    private String name;
    private List<Hotel> hotels;
}
