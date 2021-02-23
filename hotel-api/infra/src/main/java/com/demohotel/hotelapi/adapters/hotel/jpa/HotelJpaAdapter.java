package com.demohotel.hotelapi.adapters.hotel.jpa;

import com.demohotel.hotelapi.adapters.hotel.jpa.entity.HotelEntity;
import com.demohotel.hotelapi.adapters.hotel.jpa.entity.LocationEntity;
import com.demohotel.hotelapi.adapters.hotel.jpa.repository.HotelJpaRepository;
import com.demohotel.hotelapi.hotel.command.CloseHotel;
import com.demohotel.hotelapi.hotel.command.CreateHotel;
import com.demohotel.hotelapi.hotel.command.UpdateHotel;
import com.demohotel.hotelapi.hotel.model.vo.HotelIdentifier;
import com.demohotel.hotelapi.hotel.model.vo.Status;
import com.demohotel.hotelapi.hotel.port.HotelPort;
import com.demohotel.hotelapi.room.command.CloseRoom;
import com.demohotel.hotelapi.room.command.CreateRoom;
import com.demohotel.hotelapi.room.command.UpdateRoom;
import com.demohotel.hotelapi.room.model.Room;
import com.demohotel.hotelapi.room.port.RoomPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class HotelJpaAdapter implements HotelPort, RoomPort {

    private final HotelJpaRepository hotelJpaRepository;

    @Override
    public HotelIdentifier create(CreateHotel createHotel) {

        HotelEntity hotelEntity = new HotelEntity();

        hotelEntity.setStatus(Status.ACTIVE);
        hotelEntity.setName(createHotel.getName());
        hotelEntity.setDescription(createHotel.getDescription());
        hotelEntity.setAddressLine1(createHotel.getAddress().getAddressLine1());
        hotelEntity.setAddressLine2(createHotel.getAddress().getAddressLine2());
        hotelEntity.setPostcode(createHotel.getPostCode());
        hotelEntity.setCity(createHotel.getCity());
        hotelEntity.setCountry(createHotel.getCountry());

        LocationEntity locationEntity = new LocationEntity();
        locationEntity.setLatitude(createHotel.getAddress().getLatitude());
        locationEntity.setLatitude(createHotel.getAddress().getLongitude());

        //hotelEntity.setLocation(locationEntity);
        hotelEntity.setPhoneNumber(createHotel.getPhoneNumber());
        hotelEntity.setEmail(createHotel.getEmail());
        hotelEntity.setCurrency(createHotel.getCurrency());
        hotelEntity.setStarRating(createHotel.getStarRating());

        /*hotelEntity.setImages(createHotel.getImages().stream().map(
                image -> ImageEntity.builder()
                    .height(image.getHeight())
                    .width(image.getWidth())
                    .url(image.getUrl())
                    .tag(image.getTag())
                .build())
                .collect(Collectors.toList()));

        hotelEntity.setTranslations(createHotel.getTranslations().stream().map(
                translation -> TranslationEntity.builder()
                        .locale(translation.getLocale())
                        .description(translation.getDescription())
                        .name(translation.getName())
                .build())
                .collect(Collectors.toList())
                );

        hotelEntity.setFacilities(createHotel.getFacilities().stream().map(
                facility -> FacilityEntity.builder()
                    .category(facility.getCategory())
                    .name(facility.getName())
                .build())
                .collect(Collectors.toList())
        );*/

        hotelEntity.setCreatedAt(LocalDateTime.now());

        return hotelJpaRepository.save(hotelEntity).toModel();
    }

    @Override
    public HotelIdentifier close(CloseHotel closeHotel) {
        hotelJpaRepository.deleteById(closeHotel.getHotelId());
        return null;
    }

    @Override
    public HotelIdentifier update(UpdateHotel updateHotel) {
        return null;
    }

    @Override
    public Room create(CreateRoom createRoom) {
        return null;
    }

    @Override
    public Room delete(CloseRoom closeRoom) {
        return null;
    }

    @Override
    public Room update(UpdateRoom createRoom) {
        return null;
    }
}
