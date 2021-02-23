package com.demohotel.hotelapi.adapters.hotel.rest.dto.response;

import com.demohotel.hotelapi.hotel.model.vo.HotelIdentifier;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HotelResponse {

    private Long id;
    private String name;

    public static HotelResponse fromModel(HotelIdentifier hotelIdentifier) {
        return HotelResponse.builder()
                .id(hotelIdentifier.getId())
                .name(hotelIdentifier.getName())
                .build();
    }

}
