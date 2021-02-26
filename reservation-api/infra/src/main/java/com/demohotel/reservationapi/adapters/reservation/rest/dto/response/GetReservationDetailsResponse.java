package com.demohotel.reservationapi.adapters.reservation.rest.dto.response;

import com.demohotel.reservationapi.adapters.reservation.rest.dto.PriceDto;
import com.demohotel.reservationapi.reservation.model.Reservation;
import com.demohotel.reservationapi.reservation.model.vo.Customer;
import com.demohotel.reservationapi.reservation.model.vo.Guest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonPropertyOrder({
        "hotel_id",
        "room_id",
        "check_in",
        "check_out",
        "price",
        "adult",
        "children",
        "customer",
        "guests"
})
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetReservationDetailsResponse {

    @JsonProperty("hotel_id")
    private Long hotelId;
    @JsonProperty("room_id")
    private Long roomId;
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

    public static GetReservationDetailsResponse fromModel(Reservation reservation) {
        return GetReservationDetailsResponse.builder()
                .hotelId(reservation.getHotelId())
                .roomId(reservation.getRoomId())
                .checkIn(reservation.getCheckIn().toString())
                .checkOut(reservation.getCheckOut().toString())
                .price(PriceDto.builder()
                        .amount(reservation.getAmount())
                        .currency(reservation.getCurrency())
                        .build())
                .adult(reservation.getAdult())
                .children(reservation.getChildren())
                .infant(reservation.getInfant())
                .customer(reservation.getCustomer())
                .guests(reservation.getGuests())
                .build();
    }
}
