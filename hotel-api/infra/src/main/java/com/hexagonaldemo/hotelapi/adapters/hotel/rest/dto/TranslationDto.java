package com.hexagonaldemo.hotelapi.adapters.hotel.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({
        "locale",
        "name",
        "description"
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TranslationDto {

    @JsonProperty("locale")
    public String locale;
    @JsonProperty("name")
    public String name;
    @JsonProperty("description")
    public String description;

}