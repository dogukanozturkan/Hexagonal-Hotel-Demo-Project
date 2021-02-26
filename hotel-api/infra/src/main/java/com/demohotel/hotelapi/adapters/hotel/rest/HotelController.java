package com.demohotel.hotelapi.adapters.hotel.rest;

import com.demohotel.hotelapi.adapters.hotel.jpa.entity.HotelEntity;
import com.demohotel.hotelapi.adapters.hotel.rest.dto.request.CreateHotelRequest;
import com.demohotel.hotelapi.adapters.hotel.rest.dto.request.UpdateHotelRequest;
import com.demohotel.hotelapi.adapters.hotel.rest.dto.response.AvailableHotelResponse;
import com.demohotel.hotelapi.adapters.hotel.rest.dto.response.HotelAvailabilityResponse;
import com.demohotel.hotelapi.adapters.hotel.rest.dto.response.HotelResponse;
import com.demohotel.hotelapi.common.rest.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URISyntaxException;

/**
 * REST controller for managing {@link HotelEntity}.
 */
@RequestMapping("/api/v1/hotels")
public interface HotelController {

    /**
     * {@code POST} : Create a new hotel.
     *
     * @param createHotelRequest the hotel to create.
     * @return the {@link Response} with status {@code 201 (Created)} and with body the new hotel, or with status {@code 400 (Bad Request)} if the hotel has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Response<HotelResponse> addHotel(@Valid @RequestBody CreateHotelRequest createHotelRequest) throws URISyntaxException;

    /**
     * {@code PUT  /:id} : Updates an existing hotel.
     *
     * @param hotelId            existing hotelId to update.
     * @param updateHotelRequest param gives details for update
     * @return the {@link Response} with status {@code 200 (OK)} and with body the updated hotel,
     * or with status {@code 400 (Bad Request)} if the hotel is not valid,
     * or with status {@code 500 (Internal Server Error)} if the hotel couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/{hotelId}")
    Response<HotelResponse> updateHotel(
            @PathVariable Long hotelId,
            @Valid @RequestBody UpdateHotelRequest updateHotelRequest
    ) throws URISyntaxException;


    /**
     * {@code GET  /:id} : get the "id" hotel.
     *
     * @param hotelId the id of the hotel to retrieve.
     * @return the {@link Response} with status {@code 200 (OK)} and with body the hotel, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/{hotelId}")
    Response<HotelResponse> getHotelById(@PathVariable Long hotelId);


    /**
     * {@code DELETE  /:id} : delete the "id" hotel.
     *
     * @param hotelId the id of the hotel to delete.
     * @return the {@link Response} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/{hotelId}")
    Response<HotelResponse> closeHotel(@Valid @PathVariable Long hotelId);


    /**
     * {@code GET  /hotels/:id/availability} : get the "hotelId" hotel.
     *
     * @param hotelId  the id of the hotel to retrieve availability.
     * @param adults   the number of adults in the room
     * @param children the number of children in the room
     * @param infant   the number of children in the room
     * @param checkIn  the date of check in using the ISO 8601 format (YYYY-MM-DD)
     * @param checkOut the date of check out using the ISO 8601 format (YYYY-MM-DD)
     * @return the {@link Response} with status {@code 200 (OK)} and with body the hotel, or with status {@code 404 (Not Found)}.
     */
    // TODO Create Available Hotel Response according to Docs.
    @GetMapping
    Response<AvailableHotelResponse> findAvailability(
            @RequestParam("adults") Integer adults,
            @RequestParam("children") Integer children,
            @RequestParam("infant") Integer infant,
            @RequestParam("check_in") String checkIn,
            @RequestParam("check_out") String checkOut,
            @Valid @PathVariable Long hotelId
    );

    /**
     * {@code GET} : Get a list of hotels for a certain city-date-occupancy combination.
     *
     * @param hotelId  the id of the hotel to retrieve availability.
     * @param city     the city to search in (e.g. London)
     * @param adults   the number of adults in the room
     * @param children the number of children in the room
     * @param infant   the number of children in the room
     * @param checkIn  the date of check in using the ISO 8601 format (YYYY-MM-DD)
     * @param checkOut the date of check out using the ISO 8601 format (YYYY-MM-DD)
     * @return the {@link Response} with status {@code 200 (OK)} and with body the hotel, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/{hotelId}/availability")
    Response<HotelAvailabilityResponse> getHotelAvailability(
            @RequestParam("city") String city,
            @RequestParam("adults") Integer adults,
            @RequestParam("children") Integer children,
            @RequestParam("infant") Integer infant,
            @RequestParam("check_in") String checkIn,
            @RequestParam("check_out") String checkOut,
            @Valid @PathVariable Long hotelId
    );
}
