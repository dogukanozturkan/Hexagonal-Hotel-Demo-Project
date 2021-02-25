package com.demohotel.hotelapi.room;

import com.demohotel.hotelapi.room.command.CreateRoom;
import com.demohotel.hotelapi.room.command.FindRoom;
import com.demohotel.hotelapi.room.command.RemoveRoom;
import com.demohotel.hotelapi.room.command.UpdateRoom;
import com.demohotel.hotelapi.room.model.Room;
import com.demohotel.hotelapi.room.port.RoomPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Facade for managing Rooms via RoomPort {@link Room}.
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class RoomFacade {

    private final RoomPort roomPort;


    public String create(CreateRoom createRoom) {
        log.debug("Room Created under {}", createRoom.getHotel().getName());
        return roomPort.create(createRoom);
    }

    public String update(UpdateRoom updateRoom) {
        log.debug("{}'s Room Updated. RoomId: {}.", updateRoom.getHotel().getName(), updateRoom.getId());
        return roomPort.update(updateRoom);
    }

    public String delete(RemoveRoom removeRoom) {
        log.debug("{}'s room deleted", removeRoom.getHotelId());
        return roomPort.delete(removeRoom);
    }

    public Room find(FindRoom findRoom) {
        return roomPort.find(findRoom);
    }

}
