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
    public Long create(CreateReservation reservation) {
        return reservationJpaRepository.save(ReservationEntity.fromModel(reservation)).getId();
    }

    @Override
    public Long updateTravelDates(UpdateTravelDates updateTravelDates) {
        return reservationJpaRepository.findById(updateTravelDates.getReservationId()).get().toModel().getId();
    }

    @Override
    public Long updatePrimaryGuest(UpdatePrimaryGuest primaryGuest) {
        return reservationJpaRepository.findById(primaryGuest.getReservation().getId()).get().toModel().getId();
    }

    @Override
    public Long addGuest(AddGuest guest) {
        return reservationJpaRepository.findById(guest.getReservationId()).get().toModel().getId();
    }

    @Override
    public Long cancel(CancelReservation cancelReservation) {
        reservationJpaRepository.deleteById(cancelReservation.getReservationId());
        return cancelReservation.getReservationId();
    }

    @Override
    public Reservation find(FindReservation findReservation) {
        return reservationJpaRepository.findById(findReservation.getReservationId()).get().toModel();
    }
}
