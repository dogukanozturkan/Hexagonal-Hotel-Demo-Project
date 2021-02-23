package com.hexagonaldemo.hotelapi.hotel.model.vo;

import com.hexagonaldemo.hotelapi.common.aggregate.AggregateIdentifier;
import com.hexagonaldemo.hotelapi.common.ValueObject;

import java.util.UUID;

@ValueObject
public class HotelId extends AggregateIdentifier {

    public HotelId(UUID identifier) {
        super(identifier);
    }
}