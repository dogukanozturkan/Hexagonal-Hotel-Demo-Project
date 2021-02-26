package com.demohotel.hotelapi.occupancy.command;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class CreateOccupancy {

    private Long hotelId;
    private Long roomId;
    private Long reservationId;
    private LocalDate startDate;
    private LocalDate endDate;
}
