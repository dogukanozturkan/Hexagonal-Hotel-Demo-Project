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
    @JsonProperty("rate_plan_id")
    private String ratePlanId;

    public UpdateTravelDates toModel(String hotelId, String roomId) {
        return UpdateTravelDates.builder()
                .checkIn(localDateConverter.convert(checkIn))
                .checkOut(localDateConverter.convert(checkOut))
                .ratePlanId(ratePlanId)
                .reservationId(hotelId)
                .hotelId(roomId)
                .build();
    }

}
