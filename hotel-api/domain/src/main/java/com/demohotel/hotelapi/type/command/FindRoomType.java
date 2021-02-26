package com.demohotel.hotelapi.type.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FindRoomType {

    private String code;
    private String name;
    private Long hotelId;
    private Long roomTypeId;
    private Boolean freeBreakfast;
    private Boolean freeWifi;
    private Boolean freeParking;
    private Integer adult;
    private Integer children;
    private Integer infant;
    private Integer bed;
}
