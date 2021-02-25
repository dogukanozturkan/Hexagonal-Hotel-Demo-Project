package com.demohotel.reservationapi.reservation.command;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class UpdateTravelDates {

    private LocalDate checkIn;
    private LocalDate checkOut;
    private String reservationId;
    private String ratePlanId;
    private String hotelId;
    private String roomId;

}
