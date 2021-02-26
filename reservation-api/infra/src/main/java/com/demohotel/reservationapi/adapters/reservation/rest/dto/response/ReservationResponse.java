package com.demohotel.reservationapi.adapters.reservation.rest.dto.response;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;

@JsonPropertyOrder({
        "reservationId",

})
@Data
@Builder
public class ReservationResponse {

    private Long reservationId;

    public static ReservationResponse fromModel(Long reservationId) {
        return ReservationResponse.builder()
                .reservationId(reservationId)
                .build();
    }
}
