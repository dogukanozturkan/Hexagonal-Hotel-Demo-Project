package com.demohotel.hotelapi.hotel.event;

import com.demohotel.hotelapi.common.event.DomainEvent;
import com.demohotel.hotelapi.hotel.model.Hotel;
import lombok.Value;

import java.time.Instant;

@Value(staticConstructor = "from")
public class HotelAddressWasChanged implements DomainEvent {

    Instant occurredOn;
    Long hotelId;
    String addressLine1;
    String addressLine2;
    Double latitude;
    Double longitude;

    public static HotelAddressWasChanged from(Hotel hotel) {
        return new HotelAddressWasChanged(
                Instant.now(),
                hotel.getId(),
                hotel.getAddressLine1(),
                hotel.getAddressLine2(),
                hotel.getLatitude(),
                hotel.getLongitude()
        );
    }

}
