package com.demohotel.hotelapi.adapters.hotel.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({
        "tag",
        "url",
        "width",
        "height"
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ImageDto {

    @JsonProperty("tag")
    public String tag;
    @JsonProperty("url")
    public String url;
    @JsonProperty("width")
    public String width;
    @JsonProperty("height")
    public String height;

}