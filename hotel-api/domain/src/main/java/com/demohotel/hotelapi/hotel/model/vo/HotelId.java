package com.demohotel.hotelapi.hotel.model.vo;

import com.demohotel.hotelapi.common.ValueObject;
import com.demohotel.hotelapi.common.aggregate.AggregateIdentifier;

import java.util.UUID;

@ValueObject
public class HotelId extends AggregateIdentifier {

    public HotelId(UUID identifier) {
        super(identifier);
    }
}