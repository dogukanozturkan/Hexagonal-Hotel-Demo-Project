package com.demohotel.hotelapi.adapters.hotel.jpa.entity;

import com.demohotel.hotelapi.adapters.room.jpa.entity.RoomEntity;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A HotelEntity.
 */
@Builder(toBuilder = true)
@Getter
@Setter()
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
    private Set<RoomEntity> rooms = new HashSet<>();

    @OneToMany(mappedBy = "hotel")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<HotelImageEntity> images = new HashSet<>();

    @OneToMany(mappedBy = "hotel")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<FacilityEntity> facilities = new HashSet<>();

    @OneToMany(mappedBy = "hotel")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<HotelTranslationEntity> hotelTranslations = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HotelEntity name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HotelEntity description(String description) {
        this.description = description;
        return this;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public HotelEntity addressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public HotelEntity addressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public HotelEntity postCode(String postCode) {
        this.postCode = postCode;
        return this;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public HotelEntity city(String city) {
        this.city = city;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public HotelEntity country(String country) {
        this.country = country;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public HotelEntity phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HotelEntity email(String email) {
        this.email = email;
        return this;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public HotelEntity latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public HotelEntity longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public HotelEntity currency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getStarRating() {
        return starRating;
    }

    public void setStarRating(String starRating) {
        this.starRating = starRating;
    }

    public HotelEntity starRating(String starRating) {
        this.starRating = starRating;
        return this;
    }

    public Set<RoomEntity> getRooms() {
        return rooms;
    }

    public void setRooms(Set<RoomEntity> rooms) {
        this.rooms = rooms;
    }

    public HotelEntity rooms(Set<RoomEntity> rooms) {
        this.rooms = rooms;
        return this;
    }

    public HotelEntity addRoom(RoomEntity room) {
        this.rooms.add(room);
        room.setHotel(this);
        return this;
    }

    public HotelEntity removeRoom(RoomEntity room) {
        this.rooms.remove(room);
        room.setHotel(null);
        return this;
    }

    public Set<HotelImageEntity> getImages() {
        return images;
    }

    public void setImages(Set<HotelImageEntity> images) {
        this.images = images;
    }

    public HotelEntity hotelImages(Set<HotelImageEntity> hotelImages) {
        this.images = hotelImages;
        return this;
    }

    public HotelEntity addHotelImage(HotelImageEntity hotelImage) {
        this.images.add(hotelImage);
        hotelImage.setHotel(this);
        return this;
    }

    public HotelEntity removeHotelImage(HotelImageEntity hotelImage) {
        this.images.remove(hotelImage);
        hotelImage.setHotel(null);
        return this;
    }

    public Set<FacilityEntity> getFacilities() {
        return facilities;
    }

    public void setFacilities(Set<FacilityEntity> facilities) {
        this.facilities = facilities;
    }

    public HotelEntity facilities(Set<FacilityEntity> facilities) {
        this.facilities = facilities;
        return this;
    }

    public HotelEntity addFacility(FacilityEntity facility) {
        this.facilities.add(facility);
        facility.setHotel(this);
        return this;
    }

    public HotelEntity removeFacility(FacilityEntity facility) {
        this.facilities.remove(facility);
        facility.setHotel(null);
        return this;
    }

    public Set<HotelTranslationEntity> getHotelTranslations() {
        return hotelTranslations;
    }

    public void setHotelTranslations(Set<HotelTranslationEntity> hotelTranslations) {
        this.hotelTranslations = hotelTranslations;
    }

    public HotelEntity hotelTranslations(Set<HotelTranslationEntity> hotelTranslations) {
        this.hotelTranslations = hotelTranslations;
        return this;
    }

    public HotelEntity addHotelTranslation(HotelTranslationEntity hotelTranslation) {
        this.hotelTranslations.add(hotelTranslation);
        hotelTranslation.setHotel(this);
        return this;
    }

    public HotelEntity removeHotelTranslation(HotelTranslationEntity hotelTranslation) {
        this.hotelTranslations.remove(hotelTranslation);
        hotelTranslation.setHotel(null);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HotelEntity)) {
            return false;
        }
        return id != null && id.equals(((HotelEntity) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "HotelEntity{" +
                "id=" + getId() +
                ", name='" + getName() + "'" +
                ", description='" + getDescription() + "'" +
                ", addressLine1='" + getAddressLine1() + "'" +
                ", addressLine2='" + getAddressLine2() + "'" +
                ", postCode='" + getPostCode() + "'" +
                ", city='" + getCity() + "'" +
                ", country='" + getCountry() + "'" +
                ", phoneNumber='" + getPhoneNumber() + "'" +
                ", email='" + getEmail() + "'" +
                ", latitude=" + getLatitude() +
                ", longitude=" + getLongitude() +
                ", currency='" + getCurrency() + "'" +
                ", starRating='" + getStarRating() + "'" +
                "}";
    }
}
