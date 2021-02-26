package com.demohotel.hotelapi.room.model;

import com.demohotel.hotelapi.image.model.Image;
import com.demohotel.hotelapi.occupancy.model.Occupancy;
import com.demohotel.hotelapi.translation.model.Translation;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Room {

    @JsonProperty("name")
    public String name;
    @JsonProperty("description")
    public String description;
    @JsonProperty("hotel_id")
    public Long hotelId;
    @JsonProperty("room_type_id")
    public Long roomTypeId;
    @JsonProperty("images")
    public List<Image> images;
    @JsonProperty("translations")
    public List<Translation> translations;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("images")
    private List<Occupancy> occupancies;
}
