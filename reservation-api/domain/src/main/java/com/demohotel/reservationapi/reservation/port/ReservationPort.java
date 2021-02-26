package com.demohotel.reservationapi.reservation.port;


import com.demohotel.reservationapi.common.Port;
import com.demohotel.reservationapi.reservation.command.*;
import com.demohotel.reservationapi.reservation.model.Reservation;

/**
 * Port for managing {@link Reservation}.
 */
@Port
public interface ReservationPort {

    Long create(CreateReservation createReservation);

    Long updateTravelDates(UpdateTravelDates updateTravelDates);

    Long updatePrimaryGuest(UpdatePrimaryGuest updatePrimaryGuest);

    Long addGuest(AddGuest addGuest);

    Long cancel(CancelReservation cancelReservation);

    Reservation find(FindReservation findReservation);
}
