package com.hexagonaldemo.hotelapi.room;

import com.hexagonaldemo.hotelapi.room.command.UpdateRoom;
import com.hexagonaldemo.hotelapi.room.model.Room;
import com.hexagonaldemo.hotelapi.room.command.CreateRoom;
import com.hexagonaldemo.hotelapi.room.command.CloseRoom;
import com.hexagonaldemo.hotelapi.room.port.RoomPort;
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
