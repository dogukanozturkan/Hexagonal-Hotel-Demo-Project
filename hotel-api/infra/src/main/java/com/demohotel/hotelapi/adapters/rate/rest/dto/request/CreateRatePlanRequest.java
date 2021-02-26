package com.demohotel.hotelapi.adapters.rate.rest.dto.request;

import com.demohotel.hotelapi.rate.command.CreateRate;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateRatePlanRequest {

    @JsonProperty("hotel_id")
    public Long hotelId;
    @JsonProperty("room_type_id")
    public Long roomTypeId;
    @JsonProperty("code")
    public String code;
    @JsonProperty("name")
    public String name;
    @JsonProperty("currency")
    public String currency;
    @JsonProperty("amount")
    public String amount;

    public CreateRate toModel() {
        return CreateRate.builder()
                .hotelId(hotelId)
                .roomTypeId(roomTypeId)
                .name(name)
                .amount(amount)
                .build();
    }
}
