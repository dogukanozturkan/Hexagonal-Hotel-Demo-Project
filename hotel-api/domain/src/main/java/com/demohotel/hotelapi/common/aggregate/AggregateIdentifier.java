package com.demohotel.hotelapi.common.aggregate;

import com.demohotel.hotelapi.hotel.model.vo.HotelId;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

@EqualsAndHashCode
public abstract class AggregateIdentifier {

    @Getter
    private final UUID identifier;

    protected AggregateIdentifier(UUID identifier) {
        this.identifier = identifier;
    }

    public static HotelId from(@NonNull String identifier) {
        return new HotelId(UUID.fromString(identifier));
    }

    public static HotelId create() {
        return new HotelId(UUID.randomUUID());
    }
}