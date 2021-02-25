package com.demohotel.hotelapi.occupancy.model;

import com.demohotel.hotelapi.hotel.model.Hotel;
import com.demohotel.hotelapi.room.model.Room;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Occupancy {

    private String id;
    private Hotel hotel;
    private Room room;
    private LocalDate startDate;
    private LocalDate endDate;
    private String reservationId;
}
