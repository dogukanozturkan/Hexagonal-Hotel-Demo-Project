package com.demohotel.reservationapi.reservation.command;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class UpdateTravelDates {

    private Long reservationId;
    private Long hotelId;
    private Long roomId;
    private Long ratePlanId;
    private LocalDate checkIn;
    private LocalDate checkOut;

}
