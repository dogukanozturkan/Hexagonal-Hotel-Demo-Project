package com.demohotel.reservationapi.reservation;

import com.demohotel.reservationapi.reservation.command.*;
import com.demohotel.reservationapi.reservation.model.Reservation;
import com.demohotel.reservationapi.reservation.port.ReservationPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Facade for managing Reservations via ReservationPort {@link ReservationFacade}.
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ReservationFacade {

    private final ReservationPort reservationPort;

    public String create(CreateReservation createReservation) {
        return reservationPort.create(createReservation);
    }

    public String updateTravelDates(UpdateTravelDates updateTravelDates) {
        return reservationPort.updateTravelDates(updateTravelDates);
    }
    public String updatePrimaryGuest(UpdatePrimaryGuest updatePrimaryGuest) {
        return reservationPort.updatePrimaryGuest(updatePrimaryGuest);
    }
    public String addGuest(AddGuest addGuest) {
        return reservationPort.addGuest(addGuest);
    }

    public String cancel(CancelReservation cancelReservation) {
        return reservationPort.cancel(cancelReservation);
    }

    public Reservation find(FindReservation findReservation) {
        return reservationPort.find(findReservation);
    }


}
