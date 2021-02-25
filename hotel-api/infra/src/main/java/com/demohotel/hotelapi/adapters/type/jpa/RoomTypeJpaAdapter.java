package com.demohotel.hotelapi.adapters.type.jpa;

import com.demohotel.hotelapi.adapters.type.jpa.entity.RoomTypeEntity;
import com.demohotel.hotelapi.type.command.CreateRoomType;
import com.demohotel.hotelapi.type.command.FindRoomType;
import com.demohotel.hotelapi.type.command.RemoveRoomType;
import com.demohotel.hotelapi.type.command.UpdateRoomType;
import com.demohotel.hotelapi.type.model.RoomType;
import com.demohotel.hotelapi.type.port.RoomTypePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Adapter Implementation for managing {@link RoomTypeEntity}.
 */
@Service
@RequiredArgsConstructor
public class RoomTypeJpaAdapter implements RoomTypePort {

    private final RoomTypeJpaAdapter roomTypeJpaAdapter;

    @Override
    public String create(CreateRoomType createRoomType) {
        return null;
    }

    @Override
    public String update(UpdateRoomType createRoomType) {
        return null;
    }

    @Override
    public String remove(RemoveRoomType removeRoomType) {
        return null;
    }

    @Override
    public RoomType find(FindRoomType findRoomType) {
        return null;
    }
}
