package com.demohotel.hotelapi.facility.command;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RemoveFacility {

    private String id;
    private String code;
}
