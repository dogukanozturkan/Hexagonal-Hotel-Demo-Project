package com.demohotel.reservationapi.reservation.model.vo;

import com.demohotel.reservationapi.reservation.model.Reservation;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
    private String id;
    private String name;
    private String title;
    private String birthDate;
    private String lastName;
    private String passportNo;
    private String country;
    private String phoneNumber;
    private String email;
    private Reservation reservation;
}
