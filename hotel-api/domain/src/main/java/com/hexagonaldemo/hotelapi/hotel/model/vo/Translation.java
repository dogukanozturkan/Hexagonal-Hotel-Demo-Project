package com.hexagonaldemo.hotelapi.hotel.model.vo;


import com.hexagonaldemo.hotelapi.common.ValueObject;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@Builder
@Value
@ValueObject
public class Translation {

    String description;
    String name;
    String locale;
}
