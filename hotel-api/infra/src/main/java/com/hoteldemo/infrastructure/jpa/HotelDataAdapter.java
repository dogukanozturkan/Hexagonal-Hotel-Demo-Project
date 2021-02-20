package com.hoteldemo.infrastructure.jpa;

import com.hoteldemo.domain.model.Hotel;
import com.hoteldemo.domain.model.HotelIdentifier;
import com.hoteldemo.domain.port.outgoing.HotelRepository;
import com.hoteldemo.infrastructure.jpa.entity.HotelEntity;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class HotelDataAdapter implements HotelRepository {

    private final HotelJpaRepository hotelJpaRepository;

    @Override
    public HotelIdentifier save(Hotel hotel) {
        return HotelIdentifier.builder().id(hotelJpaRepository.save(HotelEntity.builder().build()).getId()).build();
    }

    @Override
    public Optional<Hotel> getHotelById(String id) {
        return Optional.empty();
    }
}
