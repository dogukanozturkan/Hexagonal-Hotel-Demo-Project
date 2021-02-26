package com.demohotel.hotelapi.adapters.room.event.in;

import com.demohotel.hotelapi.common.event.Event;
import com.demohotel.hotelapi.occupancy.command.CreateOccupancy;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.time.LocalDate;

public class ReservationCreatedEvent implements Event {

    private final Long reservationId;
    private final Long hotelId;
    private final Long roomId;
    private final LocalDate startDate;
    private final LocalDate endDate;

    @JsonCreator
    public ReservationCreatedEvent(Long reservationId, Long hotelId, Long roomId, LocalDate startDate, LocalDate endDate) {
        this.reservationId = reservationId;
        this.hotelId = hotelId;
        this.roomId = roomId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public CreateOccupancy fromModel() {
        return CreateOccupancy.builder()
                .reservationId(reservationId)
                .hotelId(hotelId)
                .roomId(roomId)
                .startDate(startDate)
                .endDate(endDate)
                .build();
    }
}
