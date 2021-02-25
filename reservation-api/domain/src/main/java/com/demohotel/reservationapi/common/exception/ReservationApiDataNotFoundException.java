package com.demohotel.reservationapi.common.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationApiDataNotFoundException extends RuntimeException {

    private final String[] args;
    private String key;

    public ReservationApiDataNotFoundException(String key) {
        super(key);
        this.key = key;
        args = new String[0];
    }

    public ReservationApiDataNotFoundException(String key, String... args) {
        super(key);
        this.key = key;
        this.args = args;
    }
}