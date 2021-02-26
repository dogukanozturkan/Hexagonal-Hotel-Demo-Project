package com.demohotel.hotelapi.rate.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RemoveRate {

    private Long id;
    private Long hotelId;
    private Long roomTypeId;
    private Long roomId;
    private String code;
}
