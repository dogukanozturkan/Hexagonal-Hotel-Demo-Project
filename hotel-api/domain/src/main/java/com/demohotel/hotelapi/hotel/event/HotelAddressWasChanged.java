package com.demohotel.hotelapi.hotel.event;

import com.demohotel.hotelapi.common.event.DomainEvent;
import com.demohotel.hotelapi.hotel.model.Hotel;
import com.demohotel.hotelapi.hotel.model.vo.HotelId;
import lombok.Value;

import java.time.Instant;

@Value(staticConstructor = "from")
public class HotelAddressWasChanged implements DomainEvent {

    Instant occurredOn;
    HotelId hotelId;
    String addressLine1;
    String addressLine2;
    Double latitude;
    Double longitude;

    public static HotelAddressWasChanged from(Hotel hotel) {
        return new HotelAddressWasChanged(
                Instant.now(),
                hotel.getId(),
                hotel.getAddress().getAddressLine1(),
                hotel.getAddress().getAddressLine2(),
                hotel.getAddress().getLatitude(),
                hotel.getAddress().getLongitude()
        );
    }

}
