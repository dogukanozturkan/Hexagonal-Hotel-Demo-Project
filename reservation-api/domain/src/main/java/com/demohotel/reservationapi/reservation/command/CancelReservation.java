package com.demohotel.reservationapi.reservation.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CancelReservation {

    private Long reservationId;
}
