package com.demohotel.hotelapi.rate.command;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UpdateRate {

    private Long id;
    private Long hotelId;
    private Long roomTypeId;
    private String code;
    private String name;
    private String amount;
}
