package com.demohotel.hotelapi.room.command;

import com.demohotel.hotelapi.common.model.Image;
import com.demohotel.hotelapi.hotel.model.vo.Bed;
import com.demohotel.hotelapi.room.model.RoomType;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UpdateRoom {

    private String roomId;
    private Long number;
    private Long floor;
    private String hotelId;
    private RoomType roomType;
    private String description;
    private List<Bed> beds;
    private List<Image> images;
}
