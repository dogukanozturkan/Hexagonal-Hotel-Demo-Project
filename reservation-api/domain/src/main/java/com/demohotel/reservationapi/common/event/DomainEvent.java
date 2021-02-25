package com.demohotel.reservationapi.common.event;

import java.time.Instant;

public interface DomainEvent {

    Instant getOccurredOn();
}
