package com.demohotel.hotelapi.adapters.hotel.jpa;

import com.demohotel.hotelapi.adapters.hotel.jpa.entity.HotelEntity;
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
        return hotelJpaRepository.save(HotelEntity.fromModel(createHotel)).getId().toString();
    }

    @Override
    public String update(UpdateHotel updateHotel) {
        return hotelJpaRepository.findById(updateHotel.getId()).map(hotelEntity -> {
            hotelEntity.setName(updateHotel.getName());
            hotelEntity.setAddressLine1(updateHotel.getAddressLine1());
            hotelEntity.setAddressLine2(updateHotel.getAddressLine2());
            hotelEntity.setPostCode(updateHotel.getPostCode());
            hotelEntity.setDescription(updateHotel.getDescription());
            hotelEntity.setCountry(updateHotel.getCountry());
            hotelEntity.setCity(updateHotel.getCity());
            hotelEntity.setPhoneNumber(updateHotel.getPhoneNumber());
            hotelEntity.setEmail(updateHotel.getEmail());
            hotelEntity.setCurrency(updateHotel.getName());
            hotelEntity.setStarRating(updateHotel.getStarRating().toString());

            hotelJpaRepository.save(hotelEntity);
            return hotelEntity.getId();
        }).get().toString();
    }

    @Override
    public Hotel find(FindHotel findHotel) {
        return hotelJpaRepository.findById(findHotel.getId()).get().toModel();
    }

    @Override
    public String close(CloseHotel closeHotel) {
        hotelJpaRepository.deleteById(closeHotel.getId());
        return null;
    }


}
