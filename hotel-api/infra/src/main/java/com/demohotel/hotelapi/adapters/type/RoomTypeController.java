package com.demohotel.hotelapi.adapters.type;

import com.demohotel.hotelapi.adapters.type.jpa.entity.RoomTypeEntity;
import com.demohotel.hotelapi.adapters.type.rest.dto.request.CreateRoomTypeRequest;
import com.demohotel.hotelapi.adapters.type.rest.dto.request.UpdateRoomTypeRequest;
import com.demohotel.hotelapi.adapters.type.rest.dto.response.GetRoomTypeDetailsResponse;
import com.demohotel.hotelapi.adapters.type.rest.dto.response.RoomTypeResponse;
import com.demohotel.hotelapi.common.rest.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URISyntaxException;

/**
 * REST controller for managing {@link RoomTypeEntity}.
 */
@RequestMapping("/api/v1/hotels")
public interface RoomTypeController {

    /**
     * {@code POST  /:id/room-types} : Create a new roomType.
     *
     * @param hotelId the roomType to create.
     * @return the {@link Response} with status {@code 201 (Created)} and with body the new roomType, or with status {@code 400 (Bad Request)} if the roomType has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/{hotelId}/room-types")
    @ResponseStatus(HttpStatus.CREATED)
    Response<RoomTypeResponse> addRoomType(@PathVariable Long hotelId,
                                           @Valid @RequestBody CreateRoomTypeRequest createRoomTypeRequest) throws URISyntaxException;


    /**
     * {@code PUT  /:id/room-types/:room_type_id} : Updates an existing roomType.
     *
     * @param hotelId    the roomType to update.
     * @param roomTypeId the roomType to update.
     * @return the {@link Response} with status {@code 200 (OK)} and with body the updated roomType,
     * or with status {@code 400 (Bad Request)} if the roomType is not valid,
     * or with status {@code 500 (Internal Server Error)} if the roomType couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/{hotelId}/room-types/{roomTypeId}")
    Response<RoomTypeResponse> updateRoomType(@PathVariable Long hotelId, @PathVariable Long roomTypeId,
                                              @Valid @RequestBody UpdateRoomTypeRequest updateRoomTypeRequest) throws URISyntaxException;


    /**
     * {@code GET  /:id/room-types/:room_type_id} : get the "id" roomType.
     *
     * @param hotelId    the id of the roomType to retrieve.
     * @param roomTypeId the id of the roomType to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the roomType, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/{hotelId}/room-types/{roomTypeId}")
    Response<GetRoomTypeDetailsResponse> getRoomType(@PathVariable Long hotelId, @PathVariable Long roomTypeId);

    /**
     * {@code DELETE  /:id/room-types/:room_type_id} : delete the "id" roomType.
     *
     * @param hotelId    the id of the roomType to delete.
     * @param roomTypeId the id of the roomType to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/{hotelId}/room-types/{roomTypeId}")
    Response<RoomTypeResponse> removeRoomType(@PathVariable Long hotelId, @PathVariable Long roomTypeId);
}
