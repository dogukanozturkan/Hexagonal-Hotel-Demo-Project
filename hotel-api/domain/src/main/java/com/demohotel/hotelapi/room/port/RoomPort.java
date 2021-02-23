package com.demohotel.hotelapi.room.port;

import com.demohotel.hotelapi.room.command.CloseRoom;
import com.demohotel.hotelapi.room.command.CreateRoom;
import com.demohotel.hotelapi.room.command.UpdateRoom;
import com.demohotel.hotelapi.room.model.Room;

public interface RoomPort {

    Room create(CreateRoom createRoom);

    Room delete(CloseRoom closeRoom);

    Room update(UpdateRoom createRoom);
}
