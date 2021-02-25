package com.demohotel.reservationapi.adapters.reservation.jpa;

import com.demohotel.reservationapi.adapters.reservation.jpa.entity.ReservationEntity;
import com.demohotel.reservationapi.adapters.reservation.jpa.repository.ReservationJpaRepository;
import com.demohotel.reservationapi.reservation.command.*;
import com.demohotel.reservationapi.reservation.model.Reservation;
import com.demohotel.reservationapi.reservation.port.ReservationPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Adapter Implementation for managing {@link ReservationEntity}.
 */
@Service
@RequiredArgsConstructor
public class ReservationAdapter implements ReservationPort {

    private final ReservationJpaRepository reservationJpaRepository;

    @Override
    public String create(CreateReservation createReservation) {
        return null;
    }

    @Override
    public String update(UpdateReservation updateReservation) {
        return null;
    }

    @Override
    public String updateTravelDates(UpdateTravelDates updateTravelDates) {
        return null;
    }

    @Override
    public String updatePrimaryGuest(UpdatePrimaryGuest updatePrimaryGuest) {
        return null;
    }

    @Override
    public String addGuest(AddGuest addGuest) {
        return null;
    }

    @Override
    public String cancel(CancelReservation cancelReservation) {
        return null;
    }

    @Override
    public Reservation find(FindReservation findReservation) {
        return null;
    }
}
