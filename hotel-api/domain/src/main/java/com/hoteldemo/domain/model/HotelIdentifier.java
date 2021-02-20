package com.hoteldemo.domain.model;

import lombok.Getter;
import lombok.Builder;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Builder
public class HotelIdentifier {

    @Getter
    private final Long id;

}
