package com.demohotel.reservationapi.adapters.reservation.rest.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReservationResponse {

    private String reservationId;

    public static ReservationResponse fromModel(String reservationId) {
        return ReservationResponse.builder()
                .reservationId(reservationId)
                .build();
    }
}
