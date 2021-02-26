package com.demohotel.hotelapi.adapters.type.rest.dto.response;

import com.demohotel.hotelapi.type.model.RoomType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({
        "id",
        "code",
        "name",
        "hotel_id",
        "description",
        "free_breakfast",
        "free_wifi",
        "free_parking",
        "adult",
        "children",
        "infant",
        "bed"
})
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetRoomTypeDetailsResponse {

    @JsonProperty("id")
    public Long id;
    @JsonProperty("code")
    public String code;
    @JsonProperty("name")
    public String name;
    @JsonProperty("hotel_id")
    public Long hotelId;
    @JsonProperty("description")
    public String description;
    @JsonProperty("free_breakfast")
    public Boolean freeBreakfast;
    @JsonProperty("free_wifi")
    public Boolean freeWifi;
    @JsonProperty("free_parking")
    public Boolean freeParking;
    @JsonProperty("adult")
    public Integer adult;
    @JsonProperty("children")
    public Integer children;
    @JsonProperty("infant")
    public Integer infant;
    @JsonProperty("bed")
    public Integer bed;

    public static GetRoomTypeDetailsResponse fromModel(RoomType roomType) {
        return GetRoomTypeDetailsResponse.builder()
                .id(roomType.getId())
                .code(roomType.getCode())
                .name(roomType.getName())
                .hotelId(roomType.getHotelId())
                .description(roomType.getDescription())
                .freeBreakfast(roomType.getFreeBreakfast())
                .freeWifi(roomType.getFreeWifi())
                .freeParking(roomType.getFreeParking())
                .adult(roomType.getAdult())
                .children(roomType.getChildren())
                .infant(roomType.getInfant())
                .bed(roomType.getBed())
                .build();
    }
}
