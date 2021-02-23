package com.hexagonaldemo.hotelapi.hotel.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CloseHotel {

    private String hotelId;
}
