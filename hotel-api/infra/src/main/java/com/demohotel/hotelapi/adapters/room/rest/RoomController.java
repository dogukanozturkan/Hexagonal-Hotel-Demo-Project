package com.demohotel.hotelapi.adapters.room.rest;

import com.demohotel.hotelapi.adapters.room.jpa.entity.RoomEntity;
import com.demohotel.hotelapi.adapters.room.rest.dto.request.CreateRoomRequest;
import com.demohotel.hotelapi.adapters.room.rest.dto.request.UpdateRoomRequest;
import com.demohotel.hotelapi.adapters.room.rest.dto.response.GetRoomDetailsResponse;
import com.demohotel.hotelapi.adapters.room.rest.dto.response.RoomResponse;
import com.demohotel.hotelapi.common.rest.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URISyntaxException;


/**
 * REST controller for managing {@link RoomEntity}.
 */
@RequestMapping("/api/v1/hotels")
public interface RoomController {


    /**
     * {@code POST  /:id/rooms} : Create a new room.
     *
     * @param hotelId the room to create.
     * @return the {@link Response} with status {@code 201 (Created)} and with body the new room, or with status {@code 400 (Bad Request)} if the room has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/{hotelId}/rooms")
    @ResponseStatus(HttpStatus.CREATED)
    Response<RoomResponse> addRoom(@PathVariable Long hotelId,
                                   @Valid @RequestBody CreateRoomRequest createRoomRequest) throws URISyntaxException;


    /**
     * {@code PUT  /:id/rooms/:room_id} : Updates an existing room.
     *
     * @param hotelId the hotel to update.
     * @param roomId  the room to update.
     * @return the {@link Response} with status {@code 200 (OK)} and with body the updated room,
     * or with status {@code 400 (Bad Request)} if the room is not valid,
     * or with status {@code 500 (Internal Server Error)} if the room couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/{hotelId}/rooms/{roomId}")
    Response<RoomResponse> updateRoom(@PathVariable Long hotelId, @PathVariable Long roomId,
                                      @Valid @RequestBody UpdateRoomRequest updateRoomRequest) throws URISyntaxException;


    /**
     * {@code GET  /:id/rooms/:room_id} : get the "id" room.
     *
     * @param hotelId the id of the hotel to retrieve.
     * @param roomId  the id of the room to retrieve.
     * @return the {@link Response} with status {@code 200 (OK)} and with body the room, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/{hotelId}/rooms/{roomId}")
    Response<GetRoomDetailsResponse> getRoom(@PathVariable Long hotelId, @PathVariable Long roomId);


    /**
     * {@code DELETE  /:id/rooms/:room_id} : delete the "id" room.
     *
     * @param hotelId the id of the hotel to delete.
     * @param roomId  the id of the room to delete.
     * @return the {@link Response} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/{hotelId}/rooms/{roomId}")
    Response<RoomResponse> removeRoom(@PathVariable Long hotelId, @PathVariable Long roomId);
}
