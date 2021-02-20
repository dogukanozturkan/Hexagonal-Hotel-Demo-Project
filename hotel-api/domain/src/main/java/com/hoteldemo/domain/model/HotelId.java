package com.hoteldemo.domain.model;

import java.util.UUID;

public class HotelId extends AggregateIdentifier {

    protected HotelId(UUID identifier) {
        super(identifier);
    }
}