package com.demohotel.hotelapi.facility.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FindFacility {
    private String id;
    private String code;
}
