package com.demohotel.reservationapi.adapters.reservation.jpa;

import com.demohotel.reservationapi.adapters.reservation.jpa.entity.CustomerEntity;
import com.demohotel.reservationapi.adapters.reservation.jpa.entity.GuestEntity;
import com.demohotel.reservationapi.adapters.reservation.jpa.entity.ReservationEntity;
import com.demohotel.reservationapi.adapters.reservation.jpa.repository.ReservationJpaRepository;
import com.demohotel.reservationapi.common.config.StringToLocalDateConverter;
import com.demohotel.reservationapi.reservation.command.*;
import com.demohotel.reservationapi.reservation.model.Reservation;
import com.demohotel.reservationapi.reservation.port.ReservationPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * Adapter Implementation for managing {@link ReservationEntity}.
 */
@Service
@RequiredArgsConstructor
public class ReservationAdapter implements ReservationPort {

    private final ReservationJpaRepository reservationJpaRepository;
    private final StringToLocalDateConverter localDateConverter;

    @Override
    public String create(CreateReservation reservation) {
        ReservationEntity reservationEntity = ReservationEntity.builder()
                .hotelId(reservation.getHotelId())
                .roomId(reservation.getRoomId())
                .checkIn(reservation.getCheckIn())
                .checkOut(reservation.getCheckOut())
                .currency(reservation.getCurrency())
                .amount(reservation.getAmount())
                .adult(reservation.getAdult())
                .children(reservation.getChildren())
                .infant(reservation.getInfant())
                .customer(CustomerEntity.builder()
                        .name(reservation.getCustomer().getName())
                        .lastName(reservation.getCustomer().getLastName())
                        .title(reservation.getCustomer().getTitle())
                        .birthDate(localDateConverter.convert(reservation.getCustomer().getBirthDate()))
                        .passportNo(reservation.getCustomer().getPassportNo())
                        .country(reservation.getCustomer().getCountry())
                        .phoneNumber(reservation.getCustomer().getPhoneNumber())
                        .email(reservation.getCustomer().getEmail())
                        .build())
                .guests(reservation.getGuests().stream().map(guest -> GuestEntity.builder()
                        .name(guest.getName())
                        .lastName(guest.getLastName())
                        .title(guest.getTitle())
                        .birthDate(localDateConverter.convert(guest.getBirthDate()))
                        .passportNo(guest.getPassportNo())
                        .country(guest.getCountry())
                        .phoneNumber(guest.getPhoneNumber())
                        .email(guest.getEmail())
                        .build()).collect(Collectors.toList()))
                .build();

        return reservationJpaRepository.save(reservationEntity).getId().toString();
    }

    @Override
    public String updateTravelDates(UpdateTravelDates updateTravelDates) {
        return reservationJpaRepository.findById(Long.getLong(updateTravelDates.getReservationId())).get().toModel().getId();
    }

    @Override
    public String updatePrimaryGuest(UpdatePrimaryGuest primaryGuest) {
        return reservationJpaRepository.findById(Long.getLong(primaryGuest.getReservation().getId())).get().toModel().getId();
    }

    @Override
    public String addGuest(AddGuest guest) {
        return reservationJpaRepository.findById(Long.getLong(guest.getReservation().getId())).get().toModel().getId();
    }

    @Override
    public String cancel(CancelReservation cancelReservation) {
        reservationJpaRepository.deleteById(Long.getLong(cancelReservation.getReservationId()));
        return cancelReservation.getReservationId();
    }

    @Override
    public Reservation find(FindReservation findReservation) {
        return reservationJpaRepository.findById(Long.getLong(findReservation.getReservationId())).get().toModel();
    }
}
