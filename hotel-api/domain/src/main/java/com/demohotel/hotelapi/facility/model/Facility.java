package com.demohotel.hotelapi.facility.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Facility {

    private Long id;
    private String category;
    private String name;
    private Long parentId;

}
