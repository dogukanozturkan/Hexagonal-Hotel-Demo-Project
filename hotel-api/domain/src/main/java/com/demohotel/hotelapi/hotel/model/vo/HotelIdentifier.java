package com.demohotel.hotelapi.hotel.model.vo;

import com.demohotel.hotelapi.common.ValueObject;
import lombok.Builder;
import lombok.Getter;
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
