package com.demohotel.hotelapi.adapters.type.jpa;

import com.demohotel.hotelapi.adapters.type.jpa.entity.RoomTypeEntity;
import com.demohotel.hotelapi.adapters.type.jpa.repository.RoomTypeRepository;
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

    private final RoomTypeRepository roomTypeRepository;

    @Override
    public Long create(CreateRoomType createRoomType) {
        return roomTypeRepository.save(RoomTypeEntity.fromModel(createRoomType)).getId();
    }

    @Override
    public Long update(UpdateRoomType updateRoomType) {
        return roomTypeRepository.findById(updateRoomType.getRoomTypeId()).map(
                roomTypeEntity -> roomTypeRepository.save(RoomTypeEntity.fromModel(roomTypeEntity, updateRoomType))
        ).get().getId();
    }

    @Override
    public Long remove(RemoveRoomType removeRoomType) {
        roomTypeRepository.deleteById(removeRoomType.getRoomTypeId());
        return removeRoomType.getRoomTypeId();
    }

    @Override
    public RoomType find(FindRoomType findRoomType) {
        return roomTypeRepository.findById(findRoomType.getRoomTypeId()).get().toModel();
    }
}
