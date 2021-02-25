package com.demohotel.reservationapi.reservation.port;


import com.demohotel.reservationapi.common.Port;
import com.demohotel.reservationapi.reservation.command.*;
import com.demohotel.reservationapi.reservation.model.Reservation;

/**
 * Port for managing {@link Reservation}.
 */
@Port
public interface ReservationPort {

    String create(CreateReservation createReservation);

    String update(UpdateReservation updateReservation);

    String updateTravelDates(UpdateTravelDates updateTravelDates);

    String updatePrimaryGuest(UpdatePrimaryGuest updatePrimaryGuest);

    String addGuest(AddGuest addGuest);

    String cancel(CancelReservation cancelReservation);

    Reservation find(FindReservation findReservation);
}
