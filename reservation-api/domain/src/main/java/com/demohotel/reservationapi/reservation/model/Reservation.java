package com.demohotel.reservationapi.reservation.model;

import com.demohotel.reservationapi.reservation.model.vo.Customer;
import com.demohotel.reservationapi.reservation.model.vo.Traveller;
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
    private LocalDate startDate;
    private LocalDate endDate;
    private Customer customer;
    private List<Traveller> travellers;

}
