package com.demohotel.hotelapi.adapters.hotel.jpa;

import com.demohotel.hotelapi.adapters.hotel.jpa.entity.HotelEntity;
import com.demohotel.hotelapi.adapters.hotel.jpa.entityold.LocationEntity;
import com.demohotel.hotelapi.adapters.hotel.jpa.repository.HotelJpaRepository;
import com.demohotel.hotelapi.hotel.command.CloseHotel;
import com.demohotel.hotelapi.hotel.command.CreateHotel;
import com.demohotel.hotelapi.hotel.command.FindHotel;
import com.demohotel.hotelapi.hotel.command.UpdateHotel;
import com.demohotel.hotelapi.hotel.model.Hotel;
import com.demohotel.hotelapi.hotel.port.HotelPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Adapter Implementation for managing {@link HotelEntity}.
 */
@Service
@RequiredArgsConstructor
public class HotelJpaAdapter implements HotelPort {

    private final HotelJpaRepository hotelJpaRepository;

    @Override
    public String create(CreateHotel createHotel) {

        HotelEntity hotelEntity = new HotelEntity();

        //hotelEntity.setStatus(Status.ACTIVE);
        hotelEntity.setName(createHotel.getName());
        hotelEntity.setDescription(createHotel.getDescription());
        hotelEntity.setAddressLine1(createHotel.getAddressLine1());
        hotelEntity.setAddressLine2(createHotel.getAddressLine2());
        hotelEntity.setPostCode(createHotel.getPostCode());
        hotelEntity.setCity(createHotel.getCity());
        hotelEntity.setCountry(createHotel.getCountry());

        LocationEntity locationEntity = new LocationEntity();
        locationEntity.setLatitude(createHotel.getLatitude());
        locationEntity.setLongitude(createHotel.getLongitude());

        hotelEntity.setPhoneNumber(createHotel.getPhoneNumber());
        hotelEntity.setEmail(createHotel.getEmail());
        hotelEntity.setCurrency(createHotel.getCurrency());
        hotelEntity.setStarRating(createHotel.getStarRating().toString());

        //hotelEntity.setCreatedAt(LocalDateTime.now());

        return hotelJpaRepository.save(hotelEntity).getId().toString();
    }

    @Override
    public String update(UpdateHotel updateHotel) {
        return hotelJpaRepository.findById(updateHotel.getId()).map(hotelEntity -> {
            return hotelJpaRepository.save(HotelEntity.builder()
                    .name(updateHotel.getName())
                    .addressLine1(updateHotel.getAddressLine1())
                    .addressLine2(updateHotel.getAddressLine2())
                    .postCode(updateHotel.getPostCode())
                    .description(updateHotel.getDescription())
                    .country(updateHotel.getCountry())
                    .city(updateHotel.getCity())
                    .phoneNumber(updateHotel.getName())
                    .email(updateHotel.getEmail())
                    .currency(updateHotel.getCurrency())
                    .starRating(updateHotel.getStarRating().toString())
                    .build());
        }).get().getId().toString();
    }

    @Override
    public Hotel find(FindHotel findHotel) {
        return null;
    }

    @Override
    public String close(CloseHotel closeHotel) {
        hotelJpaRepository.deleteById(closeHotel.getId());
        return null;
    }


}
