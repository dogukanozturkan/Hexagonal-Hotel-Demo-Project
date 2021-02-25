package com.demohotel.hotelapi.adapters.rate.rest.resource;

import com.demohotel.hotelapi.adapters.hotel.rest.dto.request.UpdateHotelRequest;
import com.demohotel.hotelapi.adapters.rate.rest.RateController;
import com.demohotel.hotelapi.adapters.rate.rest.dto.request.CreateRatePlanRequest;
import com.demohotel.hotelapi.adapters.rate.rest.dto.response.RatePlanResponse;
import com.demohotel.hotelapi.common.rest.BaseController;
import com.demohotel.hotelapi.common.rest.Response;
import com.demohotel.hotelapi.rate.RateFacade;
import com.demohotel.hotelapi.room.RoomFacade;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URISyntaxException;


@Slf4j
@RestController
@RequiredArgsConstructor
public class RateResource extends BaseController implements RateController {

    private final RateFacade rateFacade;
    private final RoomFacade roomFacade;

    @Override
    public Response<RatePlanResponse> addRate(String hotelId, @Valid CreateRatePlanRequest ratePlanRequest)
            throws URISyntaxException {
        return null;
    }

    @Override
    public Response<RatePlanResponse> updateRate(String hotelId, String ratePlanId,
                                                 @Valid UpdateHotelRequest updateHotelRequest) throws URISyntaxException {
        return null;
    }

    @Override
    public Response<RatePlanResponse> getRate(String hotelId, String ratePlanId) {
        return null;
    }

    @Override
    public Response<RatePlanResponse> removeRate(String hotelId, String ratePlanId) {
        return null;
    }
}
