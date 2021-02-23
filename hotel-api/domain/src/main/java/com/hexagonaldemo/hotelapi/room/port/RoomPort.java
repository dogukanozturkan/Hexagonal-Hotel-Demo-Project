package com.hexagonaldemo.hotelapi.room.port;

import com.hexagonaldemo.hotelapi.room.command.CloseRoom;
import com.hexagonaldemo.hotelapi.room.command.CreateRoom;
import com.hexagonaldemo.hotelapi.room.command.UpdateRoom;
import com.hexagonaldemo.hotelapi.room.model.Room;

public interface RoomPort {

    Room create(CreateRoom createRoom);
    Room delete(CloseRoom closeRoom);
    Room update(UpdateRoom createRoom);
}
