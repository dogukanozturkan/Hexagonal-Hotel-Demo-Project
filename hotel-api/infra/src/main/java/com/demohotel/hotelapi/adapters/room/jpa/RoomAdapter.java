package com.demohotel.hotelapi.adapters.room.jpa;

import com.demohotel.hotelapi.adapters.room.jpa.entity.RoomEntity;
import com.demohotel.hotelapi.adapters.room.jpa.repository.RoomJpaRepository;
import com.demohotel.hotelapi.occupancy.command.CreateOccupancy;
import com.demohotel.hotelapi.occupancy.command.FindOccupancy;
import com.demohotel.hotelapi.occupancy.command.RemoveOccupancy;
import com.demohotel.hotelapi.occupancy.command.UpdateOccupancy;
import com.demohotel.hotelapi.occupancy.model.Occupancy;
import com.demohotel.hotelapi.occupancy.port.OccupancyPort;
import com.demohotel.hotelapi.room.command.CreateRoom;
import com.demohotel.hotelapi.room.command.FindRoom;
import com.demohotel.hotelapi.room.command.RemoveRoom;
import com.demohotel.hotelapi.room.command.UpdateRoom;
import com.demohotel.hotelapi.room.model.Room;
import com.demohotel.hotelapi.room.port.RoomPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Adapter Implementation for managing {@link RoomEntity}.
 */
@Service
@RequiredArgsConstructor
public class RoomAdapter implements RoomPort, OccupancyPort {

    private final RoomJpaRepository roomJpaRepository;

    @Override
    public Long create(CreateRoom createRoom) {
        return null;
    }

    @Override
    public Long delete(RemoveRoom removeRoom) {
        return null;
    }

    @Override
    public Long update(UpdateRoom createRoom) {
        return null;
    }

    @Override
    public Room find(FindRoom findRoom) {
        return null;
    }

    @Override
    public Long create(CreateOccupancy createOccupancy) {
        return null;
    }

    @Override
    public Long update(UpdateOccupancy createOccupancy) {
        return null;
    }

    @Override
    public Long remove(RemoveOccupancy createOccupancy) {
        return null;
    }

    @Override
    public Occupancy find(FindOccupancy createOccupancy) {
        return null;
    }
}
