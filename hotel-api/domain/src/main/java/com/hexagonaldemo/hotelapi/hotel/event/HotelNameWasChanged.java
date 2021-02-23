package com.hexagonaldemo.hotelapi.hotel.event;

import com.hexagonaldemo.hotelapi.common.event.DomainEvent;
import com.hexagonaldemo.hotelapi.hotel.model.Hotel;
import com.hexagonaldemo.hotelapi.hotel.model.vo.HotelId;
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
