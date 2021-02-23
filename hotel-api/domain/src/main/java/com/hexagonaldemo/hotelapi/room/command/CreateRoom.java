package com.hexagonaldemo.hotelapi.room.command;

import com.hexagonaldemo.hotelapi.common.model.Image;
import com.hexagonaldemo.hotelapi.hotel.model.vo.Bed;
import com.hexagonaldemo.hotelapi.room.model.RoomType;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CreateRoom {
    private Long number;
    private Long floor;
    private String hotelId;
    private RoomType roomType;
    private String description;
    private List<Bed> beds;
    private List<Image> images;
}
