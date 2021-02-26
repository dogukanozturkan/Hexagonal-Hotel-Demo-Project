package com.demohotel.reservationapi.adapters.reservation.rest.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({
        "name",
        "lastName",
        "title",
        "passportNo",
        "birthDate",
        "country",
        "phoneNumber",
        "email"
})
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GuestDto {

    @JsonProperty("name")
    private String name;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("title")
    private String title;
    @JsonProperty("passport_no")
    private String passportNo;
    @JsonProperty("birthDate")
    private String birthDate;
    @JsonProperty("country")
    private String country;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("email")
    private String email;

}