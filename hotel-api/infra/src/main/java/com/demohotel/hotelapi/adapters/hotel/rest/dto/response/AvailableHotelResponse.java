package com.demohotel.hotelapi.adapters.hotel.rest.dto.response;

import com.demohotel.hotelapi.adapters.hotel.jpa.entity.HotelEntity;
import com.demohotel.hotelapi.adapters.hotel.rest.dto.AvailabilityDto;
import com.demohotel.hotelapi.adapters.rate.jpa.entity.RateEntity;
import com.demohotel.hotelapi.adapters.room.jpa.entity.RoomEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AvailableHotelResponse {

    private List<AvailabilityDto> availability;
    private List<HotelEntity> hotels;
    private List<RateEntity> ratePlans;
    private List<RoomEntity> rooms;

    public static AvailableHotelResponse fromModel(
            List<AvailabilityDto> availability,
            List<HotelEntity> hotels,
            List<RateEntity> ratePlans,
            List<RoomEntity> rooms) {
        return AvailableHotelResponse.builder()
                .availability(availability)
                .hotels(hotels)
                .ratePlans(ratePlans)
                .rooms(rooms)
                .build();
    }
}
