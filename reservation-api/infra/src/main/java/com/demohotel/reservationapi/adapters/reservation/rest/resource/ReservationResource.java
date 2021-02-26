package com.demohotel.reservationapi.adapters.reservation.rest.resource;

import com.demohotel.reservationapi.adapters.reservation.rest.ReservationController;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.request.AddGuestRequest;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.request.CreateReservationRequest;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.request.UpdatePrimaryGuestRequest;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.request.UpdateTravelDatesRequest;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.response.GetReservationDetailsResponse;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.response.ReservationResponse;
import com.demohotel.reservationapi.common.rest.BaseController;
import com.demohotel.reservationapi.common.rest.Response;
import com.demohotel.reservationapi.reservation.ReservationFacade;
import com.demohotel.reservationapi.reservation.command.CancelReservation;
import com.demohotel.reservationapi.reservation.command.FindReservation;
import com.demohotel.reservationapi.reservation.model.Reservation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ReservationResource extends BaseController implements ReservationController {

    private final ReservationFacade reservationFacade;

    @Override
    public Response<ReservationResponse> createReservation(CreateReservationRequest reservation) {

        Long reservationId = reservationFacade.create(reservation.toModel());
        return respond(ReservationResponse.fromModel(reservationId));
    }

    @Override
    public Response<ReservationResponse> updatePrimaryGuest(Long reservationId, @Valid UpdatePrimaryGuestRequest primaryGuest) {
        Long updatedId = reservationFacade.updatePrimaryGuest(primaryGuest.toModel(reservationId));
        return respond(ReservationResponse.fromModel(updatedId));
    }

    @Override
    public Response<ReservationResponse> updateTravelDates(Long reservationId, UpdateTravelDatesRequest travelDates) {
        Long updatedId = reservationFacade.updateTravelDates(travelDates.toModel(reservationId));
        return respond(ReservationResponse.fromModel(updatedId));
    }

    @Override
    public Response<ReservationResponse> addGuest(Long reservationId, AddGuestRequest addGuest) {
        Long updatedId = reservationFacade.addGuest(AddGuestRequest.toModel(reservationId, addGuest));
        return respond(ReservationResponse.fromModel(updatedId));
    }

    @Override
    public Response<GetReservationDetailsResponse> getReservation(Long reservationId) {
        Reservation reservation = reservationFacade.find(FindReservation.builder()
                .reservationId(reservationId)
                .build());
        return respond(GetReservationDetailsResponse.fromModel(reservation));
    }

    @Override
    public Response<ReservationResponse> cancelReservation(Long reservationId) {
        return respond(ReservationResponse.fromModel(reservationFacade.cancel(CancelReservation.builder()
                .reservationId(reservationId)
                .build())));
    }
}
