package com.demohotel.hotelapi.rate.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateRate {

    private long id;
    private String hotelId;
    private String roomTypeId;
    private String code;
    private String name;
    private String amount;
}
