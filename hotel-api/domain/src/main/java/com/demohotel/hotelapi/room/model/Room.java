package com.demohotel.hotelapi.room.model;

import com.demohotel.hotelapi.common.Entity;
import com.demohotel.hotelapi.common.ValueObject;
import com.demohotel.hotelapi.common.model.Image;
import com.demohotel.hotelapi.hotel.model.Hotel;
import com.demohotel.hotelapi.hotel.model.vo.Bed;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@ValueObject
public class Room implements Entity {

    Long number;
    Long floor;
    Hotel hotel;
    RoomType roomType;
    String description;
    // Many-To-One Relationship.
    List<Bed> beds;
    List<Image> images;

    @Override
    public boolean isManaged() {
        return false;
    }
}
