package com.hexagonaldemo.hotelapi.room.model;

import com.hexagonaldemo.hotelapi.hotel.model.Hotel;
import com.hexagonaldemo.hotelapi.hotel.model.vo.Bed;
import com.hexagonaldemo.hotelapi.common.Entity;
import com.hexagonaldemo.hotelapi.common.ValueObject;
import com.hexagonaldemo.hotelapi.common.model.Image;
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
