package com.demohotel.reservationapi.adapters.reservation.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PriceDto {

    @JsonProperty("amount")
    private String amount;
    @JsonProperty("currency")
    private String currency;

}
