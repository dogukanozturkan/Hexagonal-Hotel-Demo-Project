package com.demohotel.hotelapi.hotel.model.vo;

import com.demohotel.hotelapi.common.ValueObject;

import java.util.stream.Stream;

@ValueObject
public enum Status {

    ACTIVE(1),
    PASSIVE(0),
    DELETED(-1);

    private final Integer value;

    Status(Integer value) {
        this.value = value;
    }

    public static Status of(Integer value) {
        return Stream.of(Status.values())
                .filter(status -> status.value.equals(value)).findFirst().orElseThrow();
    }

    public Integer getValue() {
        return value;
    }
}
