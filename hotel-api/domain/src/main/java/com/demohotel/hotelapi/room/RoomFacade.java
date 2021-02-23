package com.demohotel.hotelapi.room;

import com.demohotel.hotelapi.room.command.CloseRoom;
import com.demohotel.hotelapi.room.command.CreateRoom;
import com.demohotel.hotelapi.room.command.UpdateRoom;
import com.demohotel.hotelapi.room.model.Room;
import com.demohotel.hotelapi.room.port.RoomPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RoomFacade {

    private final RoomPort roomPort;

    public RoomFacade(RoomPort roomPort) {
        this.roomPort = roomPort;
    }

    public Room create(CreateRoom createRoom) {
        log.debug("Room Created under {}", createRoom.getHotelId());
        return roomPort.create(createRoom);
    }

    public Room update(UpdateRoom updateRoom) {
        log.debug("{}'s Room Updated. RoomId: {}.", updateRoom.getHotelId(), updateRoom.getRoomId());
        return roomPort.update(updateRoom);
    }

    public Room delete(CloseRoom closeRoom) {
        log.debug("{}'s room deleted", closeRoom.getHotelId());
        return roomPort.delete(closeRoom);
    }

}
