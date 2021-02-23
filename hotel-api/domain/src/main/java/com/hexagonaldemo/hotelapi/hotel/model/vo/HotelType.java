package com.hexagonaldemo.hotelapi.hotel.model.vo;

import com.hexagonaldemo.hotelapi.common.ValueObject;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@Value
@ValueObject
public class HotelType {

    private String name;
}
