package com.demohotel.hotelapi.adapters.room.rest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomResponse {

    private Long roomId;

    public static RoomResponse fromModel(Long id) {
        return RoomResponse.builder()
                .roomId(id)
                .build();
    }

}
