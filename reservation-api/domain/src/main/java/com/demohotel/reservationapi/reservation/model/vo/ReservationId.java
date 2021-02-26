package com.demohotel.reservationapi.reservation.model.vo;

import com.demohotel.reservationapi.common.ValueObject;
import com.demohotel.reservationapi.common.aggregate.AggregateIdentifier;

import java.util.UUID;

@ValueObject
public class ReservationId extends AggregateIdentifier {

    public ReservationId(UUID identifier) {
        super(identifier);
    }
}