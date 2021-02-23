package com.hexagonaldemo.hotelapi.adapters.hotel.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.hexagonaldemo.hotelapi.common.entity.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({
        "latitude",
        "longitude"
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LocationDto {

    @JsonProperty("latitude")
    public Double latitude;
    @JsonProperty("longitude")
    public Double longitude;

}