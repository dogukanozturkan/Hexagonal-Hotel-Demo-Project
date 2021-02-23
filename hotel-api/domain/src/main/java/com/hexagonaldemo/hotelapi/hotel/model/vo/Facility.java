package com.hexagonaldemo.hotelapi.hotel.model.vo;

import com.hexagonaldemo.hotelapi.common.ValueObject;
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
