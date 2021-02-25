package com.demohotel.hotelapi.adapters.room.event;

import com.demohotel.hotelapi.adapters.room.event.in.ReservationCreatedEvent;
import com.demohotel.hotelapi.occupancy.OccupancyFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class CheckInEventListener {

    private final OccupancyFacade occupancyFacade;

    @JmsListener(destination = "reservation.created", selector = "type = 'ReservationCreatedEvent")
    void handle(ReservationCreatedEvent event) {
        occupancyFacade.create(event.fromModel());
    }
}
