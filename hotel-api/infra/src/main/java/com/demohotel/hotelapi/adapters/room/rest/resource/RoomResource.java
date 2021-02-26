package com.demohotel.hotelapi.adapters.room.rest.resource;

import com.demohotel.hotelapi.adapters.room.rest.RoomController;
import com.demohotel.hotelapi.adapters.room.rest.dto.request.CreateRoomRequest;
import com.demohotel.hotelapi.adapters.room.rest.dto.request.UpdateRoomRequest;
import com.demohotel.hotelapi.adapters.room.rest.dto.response.GetRoomDetailsResponse;
import com.demohotel.hotelapi.adapters.room.rest.dto.response.RoomResponse;
import com.demohotel.hotelapi.common.rest.BaseController;
import com.demohotel.hotelapi.common.rest.Response;
import com.demohotel.hotelapi.occupancy.OccupancyFacade;
import com.demohotel.hotelapi.room.RoomFacade;
import com.demohotel.hotelapi.room.command.FindRoom;
import com.demohotel.hotelapi.room.command.RemoveRoom;
import com.demohotel.hotelapi.room.model.Room;
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
    private final OccupancyFacade occupancyFacade;

    @Override
    public Response<RoomResponse> addRoom(Long hotelId, @Valid CreateRoomRequest createRoomRequest) throws URISyntaxException {
        return respond(RoomResponse.fromModel(roomFacade.create(createRoomRequest.toModel())));
    }

    @Override
    public Response<RoomResponse> updateRoom(Long hotelId, Long roomId, @Valid UpdateRoomRequest updateRoomRequest) throws URISyntaxException {
        return respond(RoomResponse.fromModel(roomFacade.update(updateRoomRequest.toModel())));
    }

    @Override
    public Response<GetRoomDetailsResponse> getRoom(Long hotelId, Long roomId) {
        Room room = roomFacade.find(FindRoom.builder()
                .roomId(roomId)
                .hotelId(hotelId)
                .build());
        return respond(GetRoomDetailsResponse.fromModel(room));
    }

    @Override
    public Response<RoomResponse> removeRoom(Long hotelId, Long roomId) {
        Long removedId = roomFacade.delete(RemoveRoom.builder()
                .roomId(roomId)
                .hotelId(hotelId)
                .build());
        return respond(RoomResponse.fromModel(removedId));
    }
}
