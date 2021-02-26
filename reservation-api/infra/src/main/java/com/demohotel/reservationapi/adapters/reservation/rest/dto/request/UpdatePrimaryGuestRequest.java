package com.demohotel.reservationapi.adapters.reservation.rest.dto.request;

import com.demohotel.reservationapi.common.config.StringToLocalDateConverter;
import com.demohotel.reservationapi.reservation.command.UpdatePrimaryGuest;
import com.demohotel.reservationapi.reservation.model.Reservation;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdatePrimaryGuestRequest {

    private static StringToLocalDateConverter localDateConverter;

    @JsonProperty("name")
    private String name;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("title")
    private String title;
    @JsonProperty("birth_date")
    private String birthDate;
    @JsonProperty("passport_no")
    private String passportNo;
    @JsonProperty("country")
    private String country;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("email")
    private String email;

    public UpdatePrimaryGuest toModel(Long reservationId) {
        return UpdatePrimaryGuest.builder()
                .reservation(Reservation.builder()
                        .id(reservationId)
                        .build())
                .name(name)
                .lastName(lastName)
                .title(title)
                .birthDate(localDateConverter.convert(birthDate))
                .passportNo(passportNo)
                .country(country)
                .phoneNumber(phoneNumber)
                .email(email)
                .build();
    }
}
