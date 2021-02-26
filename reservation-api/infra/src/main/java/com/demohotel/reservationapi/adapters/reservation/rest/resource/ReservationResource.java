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

        String reservationId = reservationFacade.create(reservation.toModel());
        return respond(ReservationResponse.fromModel(reservationId));
    }

    @Override
    public Response<ReservationResponse> updatePrimaryGuest(String reservationId, @Valid UpdatePrimaryGuestRequest primaryGuest) {
        String updatedId = reservationFacade.updatePrimaryGuest(primaryGuest.toModel(reservationId));
        return respond(ReservationResponse.fromModel(updatedId));
    }

    @Override
    public Response<ReservationResponse> updateTravelDates(String reservationId, UpdateTravelDatesRequest travelDates) {
        String updatedId = reservationFacade.updateTravelDates(travelDates.toModel(reservationId));
        return respond(ReservationResponse.fromModel(updatedId));
    }

    @Override
    public Response<ReservationResponse> addGuest(String reservationId, AddGuestRequest addGuest) {
        String updatedId = reservationFacade.addGuest(addGuest.toModel(reservationId));
        return respond(ReservationResponse.fromModel(updatedId));
    }

    @Override
    public Response<GetReservationDetailsResponse> getReservation(String reservationId) {
        Reservation reservation = reservationFacade.find(FindReservation.builder()
                .reservationId(reservationId)
                .build());
        return respond(GetReservationDetailsResponse.fromModel(reservation));
    }

    @Override
    public Response<ReservationResponse> cancelReservation(String reservationId) {
        String canceledId = reservationFacade.cancel(CancelReservation.builder()
                .reservationId(reservationId)
                .build());
        return respond(ReservationResponse.fromModel(canceledId));
    }
}
