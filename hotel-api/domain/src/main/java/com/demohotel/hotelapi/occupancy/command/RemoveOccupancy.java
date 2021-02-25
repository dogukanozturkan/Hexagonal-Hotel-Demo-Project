package com.demohotel.hotelapi.occupancy.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RemoveOccupancy {
    private String id;
    private String hotelId;
    ;
    private String roomId;
    private String reservationId;
}
