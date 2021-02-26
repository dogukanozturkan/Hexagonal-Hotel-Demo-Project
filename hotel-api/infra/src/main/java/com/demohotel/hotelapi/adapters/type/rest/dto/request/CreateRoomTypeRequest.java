package com.demohotel.hotelapi.adapters.type.rest.dto.request;


import com.demohotel.hotelapi.type.command.CreateRoomType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateRoomTypeRequest {

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

    public static CreateRoomType fromModel(Long hotelId, CreateRoomTypeRequest createRoomTypeRequest) {
        return CreateRoomType.builder()
                .code(createRoomTypeRequest.getCode())
                .name(createRoomTypeRequest.getName())
                .hotelId(hotelId)
                .description(createRoomTypeRequest.getDescription())
                .freeBreakfast(createRoomTypeRequest.getFreeBreakfast())
                .freeWifi(createRoomTypeRequest.getFreeWifi())
                .freeParking(createRoomTypeRequest.getFreeParking())
                .adult(createRoomTypeRequest.getAdult())
                .children(createRoomTypeRequest.getChildren())
                .infant(createRoomTypeRequest.getInfant())
                .bed(createRoomTypeRequest.getBed())
                .build();
    }
}
