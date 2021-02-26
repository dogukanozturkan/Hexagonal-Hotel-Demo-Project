package com.demohotel.reservationapi.adapters.reservation.rest.dto.request;

import com.demohotel.reservationapi.common.config.StringToLocalDateConverter;
import com.demohotel.reservationapi.reservation.command.UpdateTravelDates;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTravelDatesRequest {

    private static StringToLocalDateConverter localDateConverter;

    @JsonProperty("check_in")
    private String checkIn;
    @JsonProperty("check_out")
    private String checkOut;


    public UpdateTravelDates toModel(Long reservationId) {
        return UpdateTravelDates.builder()
                .checkIn(localDateConverter.convert(checkIn))
                .checkOut(localDateConverter.convert(checkOut))
                .reservationId(reservationId)
                .build();
    }

}
