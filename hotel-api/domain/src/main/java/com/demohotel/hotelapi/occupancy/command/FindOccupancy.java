package com.demohotel.hotelapi.occupancy.command;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class FindOccupancy {

    private String id;
    private String hotelId;
    ;
    private String roomId;
    private String reservationId;
    private LocalDate startDate;
    private LocalDate endDate;
}
