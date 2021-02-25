package com.demohotel.hotelapi.rate.command;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UpdateRate {

    private long id;
    private String hotelId;
    private String roomTypeId;
    private String code;
    private String name;
    private String amount;
}
