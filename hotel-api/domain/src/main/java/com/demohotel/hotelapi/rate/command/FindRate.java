package com.demohotel.hotelapi.rate.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FindRate {

    private long id;
    private String hotelId;
    private String roomTypeId;
    private String roomId;
    private String code;
    private String minAmount;
    private String maxAmount;
}
