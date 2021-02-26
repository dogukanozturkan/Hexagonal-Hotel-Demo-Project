package com.demohotel.hotelapi.adapters.hotel.rest.dto.response;

import com.demohotel.hotelapi.adapters.hotel.jpa.entity.HotelEntity;
import com.demohotel.hotelapi.adapters.hotel.rest.dto.AvailabilityDto;
import com.demohotel.hotelapi.adapters.rate.jpa.entity.RateEntity;
import com.demohotel.hotelapi.adapters.room.jpa.entity.RoomEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HotelAvailabilityResponse {

    @JsonProperty("availability")
    private List<AvailabilityDto> availability;

    @JsonProperty("hotel")
    private HotelEntity hotel;

    @JsonProperty("rate_plans")
    private List<RateEntity> ratePlans;

    @JsonProperty("rooms")
    private List<RoomEntity> rooms;

    public static HotelAvailabilityResponse fromModel(List<AvailabilityDto> availability, HotelEntity hotel,
                                                      List<RateEntity> ratePlans, List<RoomEntity> rooms) {
        return HotelAvailabilityResponse.builder()
                .availability(availability)
                .hotel(hotel)
                .ratePlans(ratePlans)
                .rooms(rooms)
                .build();
    }
}
