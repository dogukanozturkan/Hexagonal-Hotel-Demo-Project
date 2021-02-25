package com.demohotel.reservationapi.common.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationApiBusinessException extends RuntimeException {

    private final String[] args;
    private String key;

    public ReservationApiBusinessException(String key) {
        super(key);
        this.key = key;
        args = new String[0];
    }

    public ReservationApiBusinessException(String key, String... args) {
        super(key);
        this.key = key;
        this.args = args;
    }
}