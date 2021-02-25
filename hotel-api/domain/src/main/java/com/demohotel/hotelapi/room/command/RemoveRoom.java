package com.demohotel.hotelapi.room.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RemoveRoom {

    private String roomId;
    private String hotelId;
}
