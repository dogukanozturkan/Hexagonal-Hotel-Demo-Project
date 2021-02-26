package com.demohotel.reservationapi.reservation.model;

import com.demohotel.reservationapi.reservation.model.vo.Customer;
import com.demohotel.reservationapi.reservation.model.vo.Guest;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class Reservation {

    private String id;
    private String hotelId;
    private String roomId;
    private String currency;
    private String amount;
    private Integer adult;
    private Integer children;
    private Integer infant;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Customer customer;
    private List<Guest> guests;

}
