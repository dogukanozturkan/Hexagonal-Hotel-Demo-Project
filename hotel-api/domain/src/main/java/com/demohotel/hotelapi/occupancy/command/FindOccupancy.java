package com.demohotel.hotelapi.occupancy.command;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class FindOccupancy {

    private Long id;
    private Long hotelId;
    private Long roomId;
    private Long reservationId;
    private LocalDate startDate;
    private LocalDate endDate;
}
