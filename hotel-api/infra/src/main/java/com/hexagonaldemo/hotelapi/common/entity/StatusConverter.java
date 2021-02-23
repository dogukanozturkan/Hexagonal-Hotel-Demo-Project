package com.hexagonaldemo.hotelapi.common.entity;


import com.hexagonaldemo.hotelapi.hotel.model.vo.Status;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class StatusConverter implements AttributeConverter<Status, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Status status) {
        if (status == null)
            return null;
        return status.getValue();
    }

    @Override
    public Status convertToEntityAttribute(Integer statusCode) {
        return Status.of(statusCode);
    }
}
