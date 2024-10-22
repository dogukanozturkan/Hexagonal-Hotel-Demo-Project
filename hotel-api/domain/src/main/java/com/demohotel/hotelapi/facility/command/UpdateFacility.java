package com.demohotel.hotelapi.facility.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateFacility {

    private Long id;
    private String code;
    private String name;
}
