package com.demohotel.hotelapi.adapters.room.jpa.entity;


import com.demohotel.hotelapi.adapters.hotel.jpa.entity.HotelEntity;
import com.demohotel.hotelapi.adapters.type.jpa.entity.RoomTypeEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A RoomEntity.
 */
@Entity
@Table(name = "room")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RoomEntity implements Serializable {

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

    @OneToMany(mappedBy = "room")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<OccupancyEntity> occupancies = new HashSet<>();

    @OneToMany(mappedBy = "room")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<RoomImageEntity> roomImages = new HashSet<>();

    @OneToMany(mappedBy = "room")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<RoomTranslationEntity> roomTranslations = new HashSet<>();

    @ManyToOne
    @JsonIgnoreProperties(value = "rooms", allowSetters = true)
    private HotelEntity hotel;

    @ManyToOne
    @JsonIgnoreProperties(value = "rooms", allowSetters = true)
    private RoomTypeEntity roomType;

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

    public RoomEntity name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RoomEntity description(String description) {
        this.description = description;
        return this;
    }

    public Set<OccupancyEntity> getOccupancies() {
        return occupancies;
    }

    public void setOccupancies(Set<OccupancyEntity> occupancies) {
        this.occupancies = occupancies;
    }

    public RoomEntity occupancies(Set<OccupancyEntity> occupancies) {
        this.occupancies = occupancies;
        return this;
    }

    public RoomEntity addOccupancy(OccupancyEntity occupancy) {
        this.occupancies.add(occupancy);
        occupancy.setRoom(this);
        return this;
    }

    public RoomEntity removeOccupancy(OccupancyEntity occupancy) {
        this.occupancies.remove(occupancy);
        occupancy.setRoom(null);
        return this;
    }

    public Set<RoomImageEntity> getRoomImages() {
        return roomImages;
    }

    public void setRoomImages(Set<RoomImageEntity> roomImages) {
        this.roomImages = roomImages;
    }

    public RoomEntity roomImages(Set<RoomImageEntity> roomImages) {
        this.roomImages = roomImages;
        return this;
    }

    public RoomEntity addRoomImage(RoomImageEntity roomImage) {
        this.roomImages.add(roomImage);
        roomImage.setRoom(this);
        return this;
    }

    public RoomEntity removeRoomImage(RoomImageEntity roomImage) {
        this.roomImages.remove(roomImage);
        roomImage.setRoom(null);
        return this;
    }

    public Set<RoomTranslationEntity> getRoomTranslations() {
        return roomTranslations;
    }

    public void setRoomTranslations(Set<RoomTranslationEntity> roomTranslations) {
        this.roomTranslations = roomTranslations;
    }

    public RoomEntity roomTranslations(Set<RoomTranslationEntity> roomTranslations) {
        this.roomTranslations = roomTranslations;
        return this;
    }

    public RoomEntity addRoomTranslation(RoomTranslationEntity roomTranslation) {
        this.roomTranslations.add(roomTranslation);
        roomTranslation.setRoom(this);
        return this;
    }

    public RoomEntity removeRoomTranslation(RoomTranslationEntity roomTranslation) {
        this.roomTranslations.remove(roomTranslation);
        roomTranslation.setRoom(null);
        return this;
    }

    public HotelEntity getHotel() {
        return hotel;
    }

    public void setHotel(HotelEntity hotel) {
        this.hotel = hotel;
    }

    public RoomEntity hotel(HotelEntity hotel) {
        this.hotel = hotel;
        return this;
    }

    public RoomTypeEntity getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomTypeEntity roomType) {
        this.roomType = roomType;
    }

    public RoomEntity roomType(RoomTypeEntity roomType) {
        this.roomType = roomType;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoomEntity)) {
            return false;
        }
        return id != null && id.equals(((RoomEntity) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "RoomEntity{" +
                "id=" + getId() +
                ", name='" + getName() + "'" +
                ", description='" + getDescription() + "'" +
                "}";
    }
}
