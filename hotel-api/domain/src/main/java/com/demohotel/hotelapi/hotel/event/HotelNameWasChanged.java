package com.demohotel.hotelapi.hotel.event;

import com.demohotel.hotelapi.common.event.DomainEvent;
import com.demohotel.hotelapi.hotel.model.Hotel;
import com.demohotel.hotelapi.hotel.model.vo.HotelId;
import lombok.Value;

import java.time.Instant;

@Value(staticConstructor = "from")
public class HotelNameWasChanged implements DomainEvent {

    Instant occurredOn;
    HotelId hotelId;
    String name;

    public static HotelNameWasChanged from(Hotel hotel) {
        return new HotelNameWasChanged(Instant.now(), hotel.getId(), hotel.getName());
    }

}
