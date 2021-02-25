package com.demohotel.hotelapi.room.port;

import com.demohotel.hotelapi.common.Port;
import com.demohotel.hotelapi.room.command.CreateRoom;
import com.demohotel.hotelapi.room.command.FindRoom;
import com.demohotel.hotelapi.room.command.RemoveRoom;
import com.demohotel.hotelapi.room.command.UpdateRoom;
import com.demohotel.hotelapi.room.model.Room;


/**
 * Port for managing {@link Room}.
 */
@Port
public interface RoomPort {

    String create(CreateRoom createRoom);

    String delete(RemoveRoom removeRoom);

    String update(UpdateRoom createRoom);

    Room find(FindRoom findRoom);

}
