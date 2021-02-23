package com.hexagonaldemo.hotelapi.common.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotelApiDataNotFoundException extends RuntimeException {

    private String key;
    private final String[] args;

    public HotelApiDataNotFoundException(String key) {
        super(key);
        this.key = key;
        args = new String[0];
    }

    public HotelApiDataNotFoundException(String key, String... args) {
        super(key);
        this.key = key;
        this.args = args;
    }
}