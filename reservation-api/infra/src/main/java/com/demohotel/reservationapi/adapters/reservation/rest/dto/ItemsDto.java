package com.demohotel.reservationapi.adapters.reservation.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonPropertyOrder({
        "comments",
        "guests",
        "check_in",
        "check_out",
        "price",
        "rate_plan_id",
        "room_id",
        "adults",
        "children",
        "infant"
})
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemsDto {

    @JsonProperty("comments")
    private String comments;
    @JsonProperty("guests")
    private List<GuestDto> guests;
    @JsonProperty("check_in")
    private String checkIn;
    @JsonProperty("check_out")
    private String checkOut;
    @JsonProperty("price")
    private PriceDto price;
    @JsonProperty("rate_plan_id")
    private String ratePlanId;
    @JsonProperty("room_id")
    private String roomId;
    @JsonProperty("adults")
    private String adults;
    @JsonProperty("children")
    private String children;
    @JsonProperty("infant")
    private String infant;

}
