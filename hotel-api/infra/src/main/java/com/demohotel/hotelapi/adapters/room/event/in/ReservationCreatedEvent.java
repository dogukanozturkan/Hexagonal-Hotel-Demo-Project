package com.demohotel.hotelapi.adapters.room.event.in;

import com.demohotel.hotelapi.common.event.Event;
import com.demohotel.hotelapi.occupancy.command.CreateOccupancy;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.time.LocalDate;

public class ReservationCreatedEvent implements Event {

    private final String reservationId;
    private final String hotelId;
    private final String roomId;
    private final LocalDate startDate;
    private final LocalDate endDate;

    @JsonCreator
    public ReservationCreatedEvent(String reservationId, String hotelId, String roomId, LocalDate startDate, LocalDate endDate) {
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