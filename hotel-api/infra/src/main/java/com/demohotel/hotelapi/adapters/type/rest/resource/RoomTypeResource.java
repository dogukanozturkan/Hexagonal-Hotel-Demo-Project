package com.demohotel.hotelapi.adapters.type.rest.resource;

import com.demohotel.hotelapi.adapters.type.RoomTypeController;
import com.demohotel.hotelapi.adapters.type.rest.dto.request.CreateRoomTypeRequest;
import com.demohotel.hotelapi.adapters.type.rest.dto.request.UpdateRoomTypeRequest;
import com.demohotel.hotelapi.adapters.type.rest.dto.response.GetRoomTypeDetailsResponse;
import com.demohotel.hotelapi.adapters.type.rest.dto.response.RoomTypeResponse;
import com.demohotel.hotelapi.common.rest.BaseController;
import com.demohotel.hotelapi.common.rest.Response;
import com.demohotel.hotelapi.type.RoomTypeFacade;
import com.demohotel.hotelapi.type.command.FindRoomType;
import com.demohotel.hotelapi.type.command.RemoveRoomType;
import com.demohotel.hotelapi.type.model.RoomType;
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
    public Response<RoomTypeResponse> addRoomType(Long hotelId, @Valid CreateRoomTypeRequest createRoomTypeRequest) throws URISyntaxException {
        return respond(RoomTypeResponse.fromModel(roomTypeFacade.create(CreateRoomTypeRequest.fromModel(hotelId, createRoomTypeRequest))));
    }

    @Override
    public Response<RoomTypeResponse> updateRoomType(Long hotelId, Long roomTypeId, @Valid UpdateRoomTypeRequest updateRoomTypeRequest) throws URISyntaxException {
        return respond(RoomTypeResponse.fromModel(roomTypeFacade.update(updateRoomTypeRequest.toModel(roomTypeId, hotelId))));
    }

    @Override
    public Response<GetRoomTypeDetailsResponse> getRoomType(Long hotelId, Long roomTypeId) {
        RoomType roomType = roomTypeFacade.find(FindRoomType.builder()
                .roomTypeId(roomTypeId)
                .hotelId(hotelId)
                .build());
        return respond(GetRoomTypeDetailsResponse.fromModel(roomType));
    }

    @Override
    public Response<RoomTypeResponse> removeRoomType(Long hotelId, Long roomTypeId) {
        Long removedRoomTypeId = roomTypeFacade.remove(RemoveRoomType.builder()
                .roomTypeId(roomTypeId)
                .hotelId(hotelId)
                .build());
        return respond(RoomTypeResponse.fromModel(removedRoomTypeId));
    }
}
