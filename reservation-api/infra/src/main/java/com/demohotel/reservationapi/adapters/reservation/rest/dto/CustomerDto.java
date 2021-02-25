package com.demohotel.reservationapi.adapters.reservation.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({
        "first_name",
        "last_name",
        "phone_number",
        "email",
        "country",
        "passportNo"
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    @JsonProperty("first_name")
    private String name;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("email")
    private String email;
    @JsonProperty("country")
    private String country;
    @JsonProperty("passportNo")
    private String passportNo;

}
