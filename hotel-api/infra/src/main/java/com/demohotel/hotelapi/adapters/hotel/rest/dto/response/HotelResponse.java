package com.demohotel.hotelapi.adapters.hotel.rest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HotelResponse {

    private Long hotelId;

    public static HotelResponse fromModel(Long id) {
        return HotelResponse.builder()
                .hotelId(id)
                .build();
    }

}
