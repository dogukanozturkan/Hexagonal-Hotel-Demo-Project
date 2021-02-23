package com.demohotel.hotelapi.adapters.hotel.rest;

import com.demohotel.hotelapi.adapters.hotel.rest.dto.request.CreateHotelRequest;
import com.demohotel.hotelapi.adapters.hotel.rest.dto.request.UpdateHotelRequest;
import com.demohotel.hotelapi.adapters.hotel.rest.dto.response.HotelResponse;
import com.demohotel.hotelapi.common.rest.Response;
import com.demohotel.hotelapi.hotel.model.Hotel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/api/v1/hotels")
public interface HotelController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Response<HotelResponse> addHotel(@Valid @RequestBody CreateHotelRequest createHotelRequest);

    @PutMapping("/{hotelId}")
    Response<HotelResponse> updateHotel(@PathVariable String hotelId,
                                        @Valid @RequestBody UpdateHotelRequest updateHotelRequest);

    @DeleteMapping("/{hotelId}")
    Response<HotelResponse> closeHotel(@Valid @PathVariable String hotelId);

    @GetMapping("/{hotelId}/availability")
    Response<Hotel> getHotelById(@Valid @PathVariable String hotelId);

    @GetMapping("/{hotelId}/availability")
    Response<Hotel> getHotelAvailability(@RequestParam("city") String city,
                                         @RequestParam("adults") Integer adults,
                                         @RequestParam("check_in") String checkIn,
                                         @RequestParam("check_out") String checkOut,
                                         @Valid @PathVariable String hotelId);
}
