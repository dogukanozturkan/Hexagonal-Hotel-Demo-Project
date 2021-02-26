package com.demohotel.hotelapi.adapters.hotel.rest.resource;

import com.demohotel.hotelapi.adapters.hotel.rest.HotelController;
import com.demohotel.hotelapi.adapters.hotel.rest.dto.request.CreateHotelRequest;
import com.demohotel.hotelapi.adapters.hotel.rest.dto.request.UpdateHotelRequest;
import com.demohotel.hotelapi.adapters.hotel.rest.dto.response.AvailableHotelResponse;
import com.demohotel.hotelapi.adapters.hotel.rest.dto.response.HotelAvailabilityResponse;
import com.demohotel.hotelapi.adapters.hotel.rest.dto.response.HotelResponse;
import com.demohotel.hotelapi.common.rest.BaseController;
import com.demohotel.hotelapi.common.rest.Response;
import com.demohotel.hotelapi.hotel.HotelFacade;
import com.demohotel.hotelapi.hotel.command.CloseHotel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
public class HotelResource extends BaseController implements HotelController {

    private final HotelFacade hotelFacade;

    @Override
    public Response<HotelResponse> addHotel(@Valid CreateHotelRequest createHotelRequest) {
        return respond(HotelResponse.fromModel(hotelFacade.create(createHotelRequest.toModel())));
    }

    @Override
    public Response<HotelResponse> updateHotel(@Valid Long hotelId, UpdateHotelRequest updateHotelRequest) {
        return respond(HotelResponse.fromModel(hotelFacade.update(updateHotelRequest.toModel())));
    }

    @Override
    public Response<HotelResponse> getHotelById(Long hotelId) {
        return null;
    }

    @Override
    public Response<HotelResponse> closeHotel(@Valid Long hotelId) {
        return respond(HotelResponse.fromModel(
                hotelFacade.close(CloseHotel.builder()
                        .id(hotelId)
                        .build())));
    }

    @Override
    public Response<AvailableHotelResponse> findAvailability(
            Integer adults,
            Integer children,
            Integer infant,
            String checkIn,
            String checkOut,
            @Valid Long hotelId) {
        return null;
    }

    @Override
    public Response<HotelAvailabilityResponse> getHotelAvailability(
            String city,
            Integer adults,
            Integer children,
            Integer infant,
            String checkIn,
            String checkOut,
            @Valid Long hotelId) {
        return null;
    }
}
