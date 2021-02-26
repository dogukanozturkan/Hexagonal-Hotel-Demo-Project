package com.demohotel.hotelapi.adapters.hotel.jpa.entity;

import com.demohotel.hotelapi.adapters.room.jpa.entity.RoomEntity;
import com.demohotel.hotelapi.hotel.command.CreateHotel;
import com.demohotel.hotelapi.hotel.command.UpdateHotel;
import com.demohotel.hotelapi.hotel.model.Hotel;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A HotelEntity.
 */
@Data
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Entity
@Table(name = "hotel")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class HotelEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3)
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Size(min = 3, max = 128)
    @Column(name = "description", length = 128, nullable = false)
    private String description;

    @NotNull
    @Size(min = 3, max = 128)
    @Column(name = "address_line_1", length = 128, nullable = false)
    private String addressLine1;

    @Size(min = 3, max = 128)
    @Column(name = "address_line_2", length = 128)
    private String addressLine2;

    @NotNull
    @Size(min = 3)
    @Column(name = "post_code", nullable = false)
    private String postCode;

    @NotNull
    @Size(min = 2, max = 128)
    @Column(name = "city", length = 128, nullable = false)
    private String city;

    @NotNull
    @Size(min = 3, max = 128)
    @Column(name = "country", length = 128, nullable = false)
    private String country;

    @NotNull
    @Pattern(regexp = "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$")
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @NotNull
    @Pattern(regexp = "^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")
    @Column(name = "email", nullable = false)
    private String email;

    @NotNull
    @Column(name = "latitude", nullable = false)
    private Double latitude;

    @NotNull
    @Column(name = "longitude", nullable = false)
    private Double longitude;

    @NotNull
    @Column(name = "currency", nullable = false)
    private String currency;

    @NotNull
    @Column(name = "star_rating", nullable = false)
    private String starRating;

    @OneToMany(mappedBy = "hotel")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private List<RoomEntity> rooms;

    @OneToMany(mappedBy = "hotel")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private List<HotelImageEntity> images;

    @OneToMany(mappedBy = "hotel")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private List<FacilityEntity> facilities;

    @OneToMany(mappedBy = "hotel")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private List<HotelTranslationEntity> hotelTranslations;

    public static HotelEntity fromModel(CreateHotel createHotel) {
        return HotelEntity.builder()
                .name(createHotel.getName())
                .addressLine1(createHotel.getAddressLine1())
                .addressLine2(createHotel.getAddressLine2())
                .postCode(createHotel.getPostCode())
                .description(createHotel.getDescription())
                .country(createHotel.getCountry())
                .city(createHotel.getCity())
                .phoneNumber(createHotel.getName())
                .email(createHotel.getEmail())
                .currency(createHotel.getCurrency())
                .starRating(createHotel.getStarRating().toString())
                .build();
    }

    public static HotelEntity fromModel(UpdateHotel updateHotel) {
        return HotelEntity.builder()
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
                .build();
    }

    public Hotel toModel() {
        return Hotel.builder()
                .id(id)
                .name(name)
                .addressLine1(addressLine1)
                .addressLine2(addressLine2)
                .postCode(postCode)
                .city(city)
                .country(country)
                .phoneNumber(phoneNumber)
                .email(email)
                .latitude(latitude)
                .longitude(longitude)
                .currency(currency)
                .starRating(starRating)
                .rooms(rooms.stream().map(RoomEntity::toModel).collect(Collectors.toList()))
                .images(images.stream().map(HotelImageEntity::toModel).collect(Collectors.toList()))
                .facilities(facilities.stream().map(FacilityEntity::toModel).collect(Collectors.toList()))
                .translations(hotelTranslations.stream().map(HotelTranslationEntity::toModel).collect(Collectors.toList()))
                .build();
    }
}
