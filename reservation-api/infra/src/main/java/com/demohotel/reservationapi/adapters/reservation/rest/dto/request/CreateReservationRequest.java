package com.demohotel.reservationapi.adapters.reservation.rest.dto.request;

import com.demohotel.reservationapi.adapters.reservation.rest.dto.PriceDto;
import com.demohotel.reservationapi.common.config.StringToLocalDateConverter;
import com.demohotel.reservationapi.reservation.command.CreateReservation;
import com.demohotel.reservationapi.reservation.model.vo.Customer;
import com.demohotel.reservationapi.reservation.model.vo.Guest;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
public class CreateReservationRequest {

    @JsonProperty("hotel_id")
    private String hotelId;
    @JsonProperty("room_id")
    private String roomId;
    @JsonProperty("check_in")
    private String checkIn;
    @JsonProperty("check_out")
    private String checkOut;
    @JsonProperty("price")
    private PriceDto price;
    @JsonProperty("adult")
    private Integer adult;
    @JsonProperty("children")
    private Integer children;
    @JsonProperty("infant")
    private Integer infant;
    @JsonProperty("customer")
    private Customer customer;
    @JsonProperty("guests")
    private List<Guest> guests;


    public CreateReservation toModel() {
        StringToLocalDateConverter converter = new StringToLocalDateConverter();
        return CreateReservation.builder()
                .hotelId(hotelId)
                .roomId(roomId)
                .checkIn(converter.convert(checkIn))
                .checkOut(converter.convert(checkOut))
                .amount(price.getAmount())
                .currency(price.getCurrency())
                .adult(adult)
                .children(children)
                .infant(infant)
                .customer(customer)
                .guests(guests)
                .build();
    }


}
