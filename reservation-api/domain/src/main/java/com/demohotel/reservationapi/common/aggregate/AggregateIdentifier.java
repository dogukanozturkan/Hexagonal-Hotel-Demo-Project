package com.demohotel.reservationapi.common.aggregate;

import com.demohotel.reservationapi.reservation.model.vo.ReservationId;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

@EqualsAndHashCode
abstract public class AggregateIdentifier {

    @Getter
    private final UUID identifier;

    protected AggregateIdentifier(UUID identifier) {
        this.identifier = identifier;
    }

    public static ReservationId from(@NonNull String identifier) {
        return new ReservationId(UUID.fromString(identifier));
    }

    public static ReservationId create() {
        return new ReservationId(UUID.randomUUID());
    }
}