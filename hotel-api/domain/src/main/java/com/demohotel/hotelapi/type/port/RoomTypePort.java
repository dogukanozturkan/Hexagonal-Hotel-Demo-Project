package com.demohotel.hotelapi.type.port;

import com.demohotel.hotelapi.common.Port;
import com.demohotel.hotelapi.type.command.CreateRoomType;
import com.demohotel.hotelapi.type.command.FindRoomType;
import com.demohotel.hotelapi.type.command.RemoveRoomType;
import com.demohotel.hotelapi.type.command.UpdateRoomType;
import com.demohotel.hotelapi.type.model.RoomType;

/**
 * Port for managing {@link RoomType}.
 */
@Port
public interface RoomTypePort {

    Long create(CreateRoomType createRoomType);

    Long update(UpdateRoomType createRoomType);

    Long remove(RemoveRoomType removeRoomType);

    RoomType find(FindRoomType findRoomType);
}
