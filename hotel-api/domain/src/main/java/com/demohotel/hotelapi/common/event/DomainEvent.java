package com.demohotel.hotelapi.common.event;

import java.time.Instant;

public interface DomainEvent {

    Instant getOccurredOn();
}
