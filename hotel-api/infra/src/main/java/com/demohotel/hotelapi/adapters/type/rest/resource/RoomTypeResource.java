package com.demohotel.hotelapi.adapters.type.rest.resource;

import com.demohotel.hotelapi.adapters.type.RoomTypeController;
import com.demohotel.hotelapi.adapters.type.rest.dto.request.CreateRoomTypeRequest;
import com.demohotel.hotelapi.adapters.type.rest.dto.request.UpdateRoomTypeRequest;
import com.demohotel.hotelapi.adapters.type.rest.dto.response.RoomTypeResponse;
import com.demohotel.hotelapi.common.rest.BaseController;
import com.demohotel.hotelapi.common.rest.Response;
import com.demohotel.hotelapi.type.RoomTypeFacade;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URISyntaxException;


@Slf4j
@RestController
@RequiredArgsConstructor
public class RoomTypeResource extends BaseController implements RoomTypeController {

    private final RoomTypeFacade roomTypeFacade;

    @Override
    public Response<RoomTypeResponse> addRoomType(String hotelId, @Valid CreateRoomTypeRequest createRoomTypeRequest) throws URISyntaxException {
        return null;
    }

    @Override
    public Response<RoomTypeResponse> updateRoomType(String hotelId, String roomTypeId, @Valid UpdateRoomTypeRequest updateRoomTypeRequest) throws URISyntaxException {
        return null;
    }

    @Override
    public Response<RoomTypeResponse> getRoomType(String hotelId, String roomTypeId) {
        return null;
    }

    @Override
    public Response<RoomTypeResponse> removeRoomType(String hotelId, String roomTypeId) {
        return null;
    }
}
