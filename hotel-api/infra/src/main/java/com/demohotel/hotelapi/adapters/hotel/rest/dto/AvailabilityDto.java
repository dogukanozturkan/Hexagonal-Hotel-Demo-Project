package com.demohotel.hotelapi.adapters.hotel.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({
        "hotel_id",
        "room_id",
        "rate_plan_id",
        "currency",
        "price"
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AvailabilityDto {

    @JsonProperty("hotel_id")
    private String hotelId;
    @JsonProperty("room_id")
    private String roomId;
    @JsonProperty("rate_plan_id")
    private String rateId;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("price")
    private String price;
}
