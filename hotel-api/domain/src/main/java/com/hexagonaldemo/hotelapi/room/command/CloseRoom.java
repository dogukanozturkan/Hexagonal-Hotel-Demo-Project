package com.hexagonaldemo.hotelapi.room.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CloseRoom {

    String roomId;

    String hotelId;
}
