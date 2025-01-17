package com.demohotel.hotelapi.adapters.hotel.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({
        "name"
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TypeDto {

    @JsonProperty("name")
    public String name;
}