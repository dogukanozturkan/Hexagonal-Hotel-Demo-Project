package com.demohotel.hotelapi.adapters.room.rest.dto.response;

import com.demohotel.hotelapi.image.model.Image;
import com.demohotel.hotelapi.room.model.Room;
import com.demohotel.hotelapi.translation.model.Translation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonPropertyOrder({
        "id",
        "name",
        "description",
        "hotel_id",
        "room_type_id",
        "images",
        "translations"
})
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetRoomDetailsResponse {

    @JsonProperty("id")
    public Long id;
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


    public static GetRoomDetailsResponse fromModel(Room room) {
        return GetRoomDetailsResponse.builder()
                .id(room.getId())
                .name(room.getName())
                .description(room.getDescription())
                .hotelId(room.getHotelId())
                .roomTypeId(room.getRoomTypeId())
                .images(room.getImages())
                .translations(room.getTranslations())
                .build();
    }
}
