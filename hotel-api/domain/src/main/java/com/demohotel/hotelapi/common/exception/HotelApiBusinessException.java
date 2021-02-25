package com.demohotel.hotelapi.common.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotelApiBusinessException extends RuntimeException {

    private final String[] args;
    private String key;

    public HotelApiBusinessException(String key) {
        super(key);
        this.key = key;
        args = new String[0];
    }

    public HotelApiBusinessException(String key, String... args) {
        super(key);
        this.key = key;
        this.args = args;
    }
}