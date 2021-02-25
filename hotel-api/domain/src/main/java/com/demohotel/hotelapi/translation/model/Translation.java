package com.demohotel.hotelapi.translation.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Translation {
    private String id;
    private String locale;
    private String name;
    private String description;
}