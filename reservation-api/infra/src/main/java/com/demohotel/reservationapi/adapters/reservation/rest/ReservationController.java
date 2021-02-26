package com.demohotel.reservationapi.adapters.reservation.rest;

import com.demohotel.reservationapi.adapters.reservation.jpa.entity.ReservationEntity;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.request.AddGuestRequest;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.request.CreateReservationRequest;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.request.UpdatePrimaryGuestRequest;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.request.UpdateTravelDatesRequest;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.response.GetReservationDetailsResponse;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.response.ReservationResponse;
import com.demohotel.reservationapi.common.rest.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URISyntaxException;

/**
 * REST controller for managing {@link ReservationEntity}.
 */
@RequestMapping("/api/v1/reservations")
public interface ReservationController {

    /**
     * {@code POST} : Create a new reservation.
     *
     * @param reservation the reservation to create.
     * @return the {@link Response} with status {@code 201 (Created)} and with body the new reservation, or with status {@code 400 (Bad Request)} if the reservation has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Response<ReservationResponse> createReservation(@RequestBody CreateReservationRequest reservation) throws URISyntaxException;

    /**
     * {@code PUT  /reservations/:reservation_id/primary-guest} : Updates an existing reservation.
     *
     * @param primaryGuest the reservation to update.
     * @return the {@link Response} with status {@code 200 (OK)} and with body the updated reservation,
     * or with status {@code 400 (Bad Request)} if the reservation is not valid,
     * or with status {@code 500 (Internal Server Error)} if the reservation couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/reservations/{reservationId}/primary-guest")
    Response<ReservationResponse> updatePrimaryGuest(
            @PathVariable Long reservationId,
            @Valid @RequestBody UpdatePrimaryGuestRequest primaryGuest
    ) throws URISyntaxException;

    /**
     * {@code PUT  /reservations/{reservationId}/travel-dates} : Updates primary guest an existing reservation.
     *
     * @param travelDates the reservation to update.
     * @return the {@link Response} with status {@code 200 (OK)} and with body the updated reservation,
     * or with status {@code 400 (Bad Request)} if the reservation is not valid,
     * or with status {@code 500 (Internal Server Error)} if the reservation couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/reservations/{reservationId}/travel-dates")
    Response<ReservationResponse> updateTravelDates(
            @PathVariable Long reservationId,
            @RequestBody UpdateTravelDatesRequest travelDates
    ) throws URISyntaxException;

    /**
     * {@code PUT  /reservations/:reservation_id}/add-guest} : Updates travel dates for an existing reservation.
     *
     * @param addGuest the reservation to update.
     * @return the {@link Response} with status {@code 200 (OK)} and with body the updated reservation,
     * or with status {@code 400 (Bad Request)} if the reservation is not valid,
     * or with status {@code 500 (Internal Server Error)} if the reservation couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/reservations/{reservationId}/add-guest")
    Response<ReservationResponse> addGuest(
            @PathVariable Long reservationId,
            @RequestBody AddGuestRequest addGuest
    ) throws URISyntaxException;


    /**
     * {@code GET  /reservations/:reservationId} : get the "id" reservation.
     *
     * @param reservationId the id of the reservation to retrieve.
     * @return the {@link Response} with status {@code 200 (OK)} and with body the reservation, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/reservations/{reservationId}")
    Response<GetReservationDetailsResponse> getReservation(@PathVariable Long reservationId) throws URISyntaxException;

    /**
     * {@code DELETE  /reservations/:reservationId} : delete the "id" reservation.
     *
     * @param reservationId the id of the reservation to delete.
     * @return the {@link Response} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/reservations/{reservationId}")
    Response<ReservationResponse> cancelReservation(@PathVariable Long reservationId) throws URISyntaxException;
}
