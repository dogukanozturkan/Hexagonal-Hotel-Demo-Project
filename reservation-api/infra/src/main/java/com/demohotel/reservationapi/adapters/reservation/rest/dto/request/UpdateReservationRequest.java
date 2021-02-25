package com.demohotel.reservationapi.adapters.reservation.rest.dto.request;

import com.demohotel.reservationapi.reservation.model.vo.Customer;
import com.demohotel.reservationapi.reservation.model.vo.Traveller;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateReservationRequest {

    @JsonProperty("hotel_id")
    private String hotelId;
    @JsonProperty("room_name")
    private String roomId;
    @JsonProperty("start_date")
    private LocalDate startDate;
    @JsonProperty("end_date")
    private LocalDate endDate;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("customer")
    private Customer customer;
    @JsonProperty("travellers")
    private List<Traveller> travellers;
}
