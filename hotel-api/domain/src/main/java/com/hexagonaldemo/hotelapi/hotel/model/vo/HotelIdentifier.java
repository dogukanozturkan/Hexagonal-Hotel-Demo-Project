package com.hexagonaldemo.hotelapi.hotel.model.vo;

import com.hexagonaldemo.hotelapi.common.ValueObject;
import lombok.Getter;
import lombok.Builder;
import lombok.RequiredArgsConstructor;


@Builder
@RequiredArgsConstructor
@ValueObject
public class HotelIdentifier {

    @Getter
    private final Long id;
    @Getter
    private final String name;
    @Getter
    private final Status status;
}
