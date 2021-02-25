package com.demohotel.hotelapi.adapters.rate.rest;

import com.demohotel.hotelapi.adapters.hotel.rest.dto.request.UpdateHotelRequest;
import com.demohotel.hotelapi.adapters.rate.jpa.entity.RateEntity;
import com.demohotel.hotelapi.adapters.rate.rest.dto.request.CreateRatePlanRequest;
import com.demohotel.hotelapi.adapters.rate.rest.dto.response.RatePlanResponse;
import com.demohotel.hotelapi.common.rest.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URISyntaxException;


/**
 * REST controller for managing {@link RateEntity}.
 */
@RequestMapping("/api/v1/hotels")
public interface RateController {


    /**
     * {@code POST  /:id/rate-plans} : Create a new rate.
     *
     * @param hotelId         the hotelId related hotel.
     * @param ratePlanRequest the rate to create.
     * @return the {@link Response} with status {@code 201 (Created)} and with body the new rate, or with status {@code 400 (Bad Request)} if the rate has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/{hotelId}/rate-plans")
    @ResponseStatus(HttpStatus.CREATED)
    Response<RatePlanResponse> addRate(@PathVariable String hotelId,
                                       @Valid @RequestBody CreateRatePlanRequest ratePlanRequest) throws URISyntaxException;

    /**
     * {@code PUT  /:id/rate-plans/:rate-plan-id} : Updates an existing rate.
     *
     * @param hotelId            the hotelId related hotel.
     * @param ratePlanId         the ratePlanId related rate.
     * @param updateHotelRequest the rate to update.
     * @return the {@link Response} with status {@code 200 (OK)} and with body the updated rate,
     * or with status {@code 400 (Bad Request)} if the rate is not valid,
     * or with status {@code 500 (Internal Server Error)} if the rate couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/{hotelId}/rate-plans/{ratePlanId}")
    Response<RatePlanResponse> updateRate(@PathVariable String hotelId, @PathVariable String ratePlanId,
                                          @Valid @RequestBody UpdateHotelRequest updateHotelRequest) throws URISyntaxException;


    /**
     * {@code GET  /:id/rate-plans/:rate-plan-id} : get the "id" rate.
     *
     * @param hotelId    the id of the hotel to retrieve.
     * @param ratePlanId the id of the rate to retrieve.
     * @return the {@link Response} with status {@code 200 (OK)} and with body the rate, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/{hotelId}/rate-plans/{ratePlanId}")
    Response<RatePlanResponse> getRate(@PathVariable String hotelId, @PathVariable String ratePlanId);


    /**
     * {@code DELETE  /rates/:id} : delete the "id" rate.
     *
     * @param hotelId    the id of the hotel to retrieve.
     * @param ratePlanId the id of the rate to retrieve.
     * @return the {@link Response} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/{hotelId}/rate-plans/{ratePlanId}")
    Response<RatePlanResponse> removeRate(@PathVariable String hotelId, @PathVariable String ratePlanId);
}
