package com.hoteldemo.domain.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DeleteHotel {

    private String hotelId;
}
