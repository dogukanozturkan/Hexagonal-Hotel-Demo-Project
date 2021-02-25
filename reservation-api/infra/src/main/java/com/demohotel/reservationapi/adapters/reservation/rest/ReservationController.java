package com.demohotel.reservationapi.adapters.reservation.rest;

import com.demohotel.reservationapi.adapters.reservation.jpa.entity.ReservationEntity;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.request.CreateReservationRequest;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.request.UpdatePrimaryGuestRequest;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.request.UpdateTravelDatesRequest;
import com.demohotel.reservationapi.adapters.reservation.rest.dto.response.ReservationResponse;
import com.demohotel.reservationapi.common.rest.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/reservations")
    Response<ReservationResponse> createReservation(@RequestBody CreateReservationRequest reservation);

    /**
     * {@code PUT  /reservations/:reservation_id} : Updates an existing reservation.
     *
     * @param reservation the reservation to update.
     * @return the {@link Response} with status {@code 200 (OK)} and with body the updated reservation,
     * or with status {@code 400 (Bad Request)} if the reservation is not valid,
     * or with status {@code 500 (Internal Server Error)} if the reservation couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/reservations")
    Response<ReservationEntity> updatePrimaryGuest(@RequestBody UpdatePrimaryGuestRequest reservation);

    /**
     * {@code PUT  /reservations/:reservation_id/reservation-items/:reservation_item_id/primary-guest} : Updates primary guest an existing reservation.
     *
     * @param reservation the reservation to update.
     * @return the {@link Response} with status {@code 200 (OK)} and with body the updated reservation,
     * or with status {@code 400 (Bad Request)} if the reservation is not valid,
     * or with status {@code 500 (Internal Server Error)} if the reservation couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/reservations")
    Response<ReservationEntity> updateTravelDates(@RequestBody UpdateTravelDatesRequest reservation);

    /**
     * {@code PUT  /reservations/:reservation_id/reservation-items/:reservation_item_id/travel-dates} : Updates travel dates for an existing reservation.
     *
     * @param reservation the reservation to update.
     * @return the {@link Response} with status {@code 200 (OK)} and with body the updated reservation,
     * or with status {@code 400 (Bad Request)} if the reservation is not valid,
     * or with status {@code 500 (Internal Server Error)} if the reservation couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/reservations")
    Response<ReservationEntity> addGuest(@RequestBody ReservationEntity reservation);


    /**
     * {@code GET  /reservations/:id} : get the "id" reservation.
     *
     * @param id the id of the reservation to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the reservation, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/reservations/{id}")
    ResponseEntity<ReservationEntity> getReservation(@PathVariable Long id);

    /**
     * {@code DELETE  /reservations/:id} : delete the "id" reservation.
     *
     * @param id the id of the reservation to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/reservations/{id}")
    ResponseEntity<Void> deleteReservation(@PathVariable Long id);
}
