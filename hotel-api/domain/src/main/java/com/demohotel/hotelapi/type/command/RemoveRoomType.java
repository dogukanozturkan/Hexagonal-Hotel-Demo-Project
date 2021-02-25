package com.demohotel.hotelapi.type.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RemoveRoomType {

    private String roomTypeId;
}
