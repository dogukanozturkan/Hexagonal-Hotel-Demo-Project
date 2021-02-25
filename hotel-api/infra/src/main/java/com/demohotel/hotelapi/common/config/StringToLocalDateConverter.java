package com.demohotel.hotelapi.common.config;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class StringToLocalDateConverter implements Converter<String, LocalDate> {
    public LocalDate convert(String source) {
        return LocalDate.parse(source, DateTimeFormatter.ISO_DATE);
    }
}