package com.demohotel.reservationapi.adapters.reservation.rest.dto.request;

import com.demohotel.reservationapi.common.config.StringToLocalDateConverter;
import com.demohotel.reservationapi.reservation.command.AddGuest;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddGuestRequest {

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

    public static AddGuest toModel(Long reservationId, AddGuestRequest guest) {
        return AddGuest.builder()
                .reservationId(reservationId)
                .name(guest.getName())
                .lastName(guest.getLastName())
                .title(guest.getTitle())
                .birthDate(localDateConverter.convert(guest.getBirthDate()))
                .passportNo(guest.getBirthDate())
                .country(guest.getCountry())
                .phoneNumber(guest.getPhoneNumber())
                .email(guest.email)
                .build();
    }
}
