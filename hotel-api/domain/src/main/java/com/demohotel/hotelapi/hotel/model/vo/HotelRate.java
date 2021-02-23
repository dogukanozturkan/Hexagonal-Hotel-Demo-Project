package com.demohotel.hotelapi.hotel.model.vo;

import com.demohotel.hotelapi.common.Entity;
import com.demohotel.hotelapi.common.ValueObject;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
@ValueObject
public class HotelRate implements Entity {

    private Long code;

    private BigDecimal weekdayRegularRate;

    private BigDecimal weekendRegularRate;

    private BigDecimal weekdayRewardRate;

    private BigDecimal weekendRewardRate;

    @Override
    public boolean isManaged() {
        return false;
    }
}