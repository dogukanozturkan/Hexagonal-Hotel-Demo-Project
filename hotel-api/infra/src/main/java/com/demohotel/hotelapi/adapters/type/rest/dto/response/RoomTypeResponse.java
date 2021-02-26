package com.demohotel.hotelapi.adapters.type.rest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomTypeResponse {

    private Long roomId;

    public static RoomTypeResponse fromModel(Long id) {
        return RoomTypeResponse.builder()
                .roomId(id)
                .build();
    }

}
