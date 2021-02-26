package com.demohotel.reservationapi.reservation.model.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Guest {

    @JsonProperty("id")
    private String id;
    @JsonProperty("reservation_id")
    private Long reservationId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("title")
    private String title;
    @JsonProperty("passport_no")
    private String passportNo;
    @JsonProperty("birth_date")
    private LocalDate birthDate;
    @JsonProperty("country")
    private String country;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("email")
    private String email;
    @JsonProperty("is_primary")
    private Boolean isPrimary;
}
