package com.demohotel.hotelapi.room.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CloseRoom {

    String roomId;

    String hotelId;
}
