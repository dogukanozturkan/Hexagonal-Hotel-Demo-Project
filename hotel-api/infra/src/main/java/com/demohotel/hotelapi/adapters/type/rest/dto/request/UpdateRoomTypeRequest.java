package com.demohotel.hotelapi.adapters.type.rest.dto.request;

import com.demohotel.hotelapi.type.command.UpdateRoomType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateRoomTypeRequest {

    @JsonProperty("code")
    public String code;
    @JsonProperty("name")
    public String name;
    @JsonProperty("hotel_id")
    public Long hotelId;
    @JsonProperty("room_type_id")
    public Long roomTypeId;
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


    public UpdateRoomType toModel(Long roomTypeId, Long hotelId) {
        return UpdateRoomType.builder()
                .roomTypeId(roomTypeId)
                .hotelId(hotelId)
                .code(code)
                .name(name)
                .description(description)
                .freeBreakfast(freeBreakfast)
                .freeWifi(freeWifi)
                .freeParking(freeParking)
                .adult(adult)
                .children(children)
                .infant(infant)
                .bed(bed)
                .build();
    }
}