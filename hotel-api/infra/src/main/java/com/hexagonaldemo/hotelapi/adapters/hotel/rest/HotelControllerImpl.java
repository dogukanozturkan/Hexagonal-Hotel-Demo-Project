package com.hexagonaldemo.hotelapi.adapters.hotel.rest;

import com.hexagonaldemo.hotelapi.adapters.hotel.rest.dto.request.CreateHotelRequest;
import com.hexagonaldemo.hotelapi.adapters.hotel.rest.dto.request.UpdateHotelRequest;
import com.hexagonaldemo.hotelapi.adapters.hotel.rest.dto.response.HotelResponse;
import com.hexagonaldemo.hotelapi.common.rest.BaseController;
import com.hexagonaldemo.hotelapi.common.rest.Response;
import com.hexagonaldemo.hotelapi.hotel.HotelFacade;
import com.hexagonaldemo.hotelapi.hotel.command.CloseHotel;
import com.hexagonaldemo.hotelapi.hotel.model.Hotel;
import com.hexagonaldemo.hotelapi.hotel.model.vo.HotelIdentifier;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@Slf4j
@RestController
@RequiredArgsConstructor
public class HotelControllerImpl extends BaseController implements HotelController  {

    private final HotelFacade hotelFacade;

    @Override
    public Response<HotelResponse> addHotel(@Valid CreateHotelRequest createHotelRequest) {
        HotelIdentifier result = hotelFacade.create(createHotelRequest.toModel());
        return respond(HotelResponse.fromModel(result));
    }

    @Override
    public Response<HotelResponse> updateHotel(@Valid String hotelId, UpdateHotelRequest updateHotelRequest) {
        HotelIdentifier result = hotelFacade.update(updateHotelRequest.toModel());
        return respond(HotelResponse.fromModel(result));
    }

    @Override
    public Response<HotelResponse> closeHotel(@Valid String hotelId) {
        HotelIdentifier result = hotelFacade.close(CloseHotel.builder().
                hotelId(hotelId)
                .build());
        return respond(HotelResponse.fromModel(result));
    }

    @Override
    public Response<Hotel> getHotelById(@Valid String hotelId) {
        // TODO
        return null;
    }

    @Override
    public Response<Hotel> getHotelAvailability(String city, Integer adults, String checkIn,
                                                    String checkOut, @Valid String hotelId) {
        // TODO
        return null;
    }
}
