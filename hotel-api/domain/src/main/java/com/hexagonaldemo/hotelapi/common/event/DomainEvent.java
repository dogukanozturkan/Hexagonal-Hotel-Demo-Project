package com.hexagonaldemo.hotelapi.common.event;

import java.time.Instant;

public interface DomainEvent {

    Instant getOccurredOn();
}
