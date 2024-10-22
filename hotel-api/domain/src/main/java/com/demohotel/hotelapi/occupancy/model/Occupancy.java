package com.demohotel.hotelapi.occupancy.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Occupancy {

    private Long id;
    private Long roomId;
    private Long reservationId;
    private LocalDate checkIn;
    private LocalDate checkOut;
}
