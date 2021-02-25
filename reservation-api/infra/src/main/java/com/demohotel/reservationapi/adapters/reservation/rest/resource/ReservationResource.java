package com.demohotel.reservationapi.adapters.reservation.rest.resource;

import com.demohotel.reservationapi.adapters.reservation.jpa.entity.ReservationEntity;
import com.demohotel.reservationapi.adapters.reservation.rest.ReservationController;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.request.CreateReservationRequest;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.request.UpdatePrimaryGuestRequest;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.request.UpdateTravelDatesRequest;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.response.ReservationResponse;
import com.demohotel.reservationapi.common.rest.BaseController;
import com.demohotel.reservationapi.common.rest.Response;
import com.demohotel.reservationapi.reservation.ReservationFacade;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ReservationResource extends BaseController implements ReservationController {

    private static ReservationFacade reservationFacade;

    @Override
    public Response<ReservationResponse> createReservation(CreateReservationRequest reservation) {
        return null;
    }

    @Override
    public Response<ReservationEntity> updatePrimaryGuest(UpdatePrimaryGuestRequest reservation) {
        return null;
    }

    @Override
    public Response<ReservationEntity> updateTravelDates(UpdateTravelDatesRequest reservation) {
        return null;
    }

    @Override
    public Response<ReservationEntity> addGuest(ReservationEntity reservation) {
        return null;
    }

    @Override
    public ResponseEntity<ReservationEntity> getReservation(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteReservation(Long id) {
        return null;
    }
}
