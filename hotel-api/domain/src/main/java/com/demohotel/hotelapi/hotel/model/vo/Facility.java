package com.demohotel.hotelapi.hotel.model.vo;

import com.demohotel.hotelapi.common.ValueObject;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@Builder
@Value
@ValueObject
public class Facility {

    String category;
    String name;
}
