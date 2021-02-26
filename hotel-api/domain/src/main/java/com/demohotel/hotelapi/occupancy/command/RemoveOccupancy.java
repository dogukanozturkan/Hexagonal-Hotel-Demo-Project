package com.demohotel.hotelapi.occupancy.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RemoveOccupancy {

    private Long id;
    private Long hotelId;
    private Long roomId;
    private Long reservationId;
}
