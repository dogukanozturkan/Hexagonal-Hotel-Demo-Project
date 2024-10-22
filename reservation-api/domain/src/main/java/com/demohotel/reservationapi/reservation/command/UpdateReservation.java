package com.demohotel.reservationapi.reservation.command;

import com.demohotel.reservationapi.reservation.model.vo.Customer;
import com.demohotel.reservationapi.reservation.model.vo.Guest;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class UpdateReservation {

    private Long id;
    private Long hotelId;
    private Long roomId;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private String currency;
    private String amount;
    private Integer adult;
    private Integer children;
    private Integer infant;
    private Customer customer;
    private List<Guest> guests;
}
