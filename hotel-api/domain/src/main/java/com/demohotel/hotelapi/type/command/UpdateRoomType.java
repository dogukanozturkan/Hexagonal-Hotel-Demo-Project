package com.demohotel.hotelapi.type.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateRoomType {

    private String code;
    private String name;
    private String description;
    private Boolean freeBreakfast;
    private Boolean freeWifi;
    private Boolean freeParking;
    private String adult;
    private String children;
}
