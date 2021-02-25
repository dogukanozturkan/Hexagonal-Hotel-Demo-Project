package com.demohotel.reservationapi.reservation.command;

import com.demohotel.reservationapi.reservation.model.vo.Customer;
import com.demohotel.reservationapi.reservation.model.vo.Traveller;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class UpdateReservation {

    private String id;
    private String roomId;
    private String hotelId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String currency;
    private String amount;
    private Integer adult;
    private Integer children;
    private Customer customer;
    private List<Traveller> travellers;
}
