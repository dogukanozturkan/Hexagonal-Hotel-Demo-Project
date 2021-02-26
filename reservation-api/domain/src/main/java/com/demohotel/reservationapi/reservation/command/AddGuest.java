package com.demohotel.reservationapi.reservation.command;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class AddGuest {

    private Long id;
    private Long reservationId;
    private String name;
    private String lastName;
    private String title;
    private LocalDate birthDate;
    private String passportNo;
    private String country;
    private String phoneNumber;
    private String email;
}
