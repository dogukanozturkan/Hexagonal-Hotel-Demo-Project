package com.demohotel.hotelapi.adapters.room.rest.dto.request;

import com.demohotel.hotelapi.image.model.Image;
import com.demohotel.hotelapi.room.command.UpdateRoom;
import com.demohotel.hotelapi.translation.model.Translation;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateRoomRequest {

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

    public UpdateRoom toModel() {
        return UpdateRoom.builder()
                .name(name)
                .description(description)
                .hotelId(hotelId)
                .roomTypeId(roomTypeId)
                .images(images)
                .translations(translations)
                .build();
    }

}
