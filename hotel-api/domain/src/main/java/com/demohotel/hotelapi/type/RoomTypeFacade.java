package com.demohotel.hotelapi.type;

import com.demohotel.hotelapi.type.command.CreateRoomType;
import com.demohotel.hotelapi.type.command.FindRoomType;
import com.demohotel.hotelapi.type.command.RemoveRoomType;
import com.demohotel.hotelapi.type.command.UpdateRoomType;
import com.demohotel.hotelapi.type.model.RoomType;
import com.demohotel.hotelapi.type.port.RoomTypePort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Facade for managing RoomTypes via RoomTypePort {@link RoomType}.
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class RoomTypeFacade {

    private final RoomTypePort roomTypePort;

    public String create(CreateRoomType createRoomType) {
        return roomTypePort.create(createRoomType);
    }

    public String update(UpdateRoomType updateRoomType) {
        return roomTypePort.update(updateRoomType);
    }

    public String remove(RemoveRoomType removeRoomType) {
        return roomTypePort.remove(removeRoomType);
    }

    public RoomType find(FindRoomType findRoomType) {
        return roomTypePort.find(findRoomType);
    }

}
