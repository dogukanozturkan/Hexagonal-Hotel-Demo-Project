package com.demohotel.hotelapi.room.command;

import com.demohotel.hotelapi.image.model.Image;
import com.demohotel.hotelapi.translation.model.Translation;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UpdateRoom {

    private String name;
    private String description;
    private Long hotelId;
    private Long roomTypeId;
    private List<Image> images;
    private List<Translation> translations;
}
