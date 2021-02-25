package com.demohotel.hotelapi.rate.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RemoveRate {

    private long id;
    private String hotelId;
    private String roomTypeId;
    private String roomId;
    private String code;
}
