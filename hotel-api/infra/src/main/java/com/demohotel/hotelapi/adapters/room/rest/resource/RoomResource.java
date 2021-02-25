package com.demohotel.hotelapi.adapters.room.rest.resource;

import com.demohotel.hotelapi.adapters.room.rest.RoomController;
import com.demohotel.hotelapi.adapters.room.rest.dto.request.CreateRoomRequest;
import com.demohotel.hotelapi.adapters.room.rest.dto.request.UpdateRoomRequest;
import com.demohotel.hotelapi.adapters.room.rest.dto.response.RoomResponse;
import com.demohotel.hotelapi.common.rest.BaseController;
import com.demohotel.hotelapi.common.rest.Response;
import com.demohotel.hotelapi.room.RoomFacade;
import com.demohotel.hotelapi.type.model.RoomType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URISyntaxException;


@Slf4j
@RestController
@RequiredArgsConstructor
public class RoomResource extends BaseController implements RoomController {

    private final RoomFacade roomFacade;
    private final RoomType roomType;

    @Override
    public Response<RoomResponse> addRoom(String hotelId, @Valid CreateRoomRequest createRoomRequest) throws URISyntaxException {
        return null;
    }

    @Override
    public Response<RoomResponse> updateRoom(String hotelId, String roomId, @Valid UpdateRoomRequest updateRoomRequest) throws URISyntaxException {
        return null;
    }

    @Override
    public Response<RoomResponse> getRoom(String hotelId, String roomId) {
        return null;
    }

    @Override
    public Response<RoomResponse> removeRoom(String hotelId, String roomId) {
        return null;
    }
}
