package com.demohotel.hotelapi.adapters.rate.rest.dto.request;

import com.demohotel.hotelapi.rate.command.UpdateRate;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateRatePlanRequest {

    @JsonProperty("rate_id")
    public String rateId;
    @JsonProperty("hotel_id")
    public String hotelId;
    @JsonProperty("room_type_id")
    public String roomTypeId;
    @JsonProperty("code")
    public String code;
    @JsonProperty("name")
    public String name;
    @JsonProperty("currency")
    public String currency;
    @JsonProperty("amount")
    public String amount;

    public UpdateRate toModel() {
        return UpdateRate.builder()
                .id(Long.getLong(rateId))
                .hotelId(hotelId)
                .roomTypeId(roomTypeId)
                .name(name)
                .amount(amount)
                .build();
    }

}