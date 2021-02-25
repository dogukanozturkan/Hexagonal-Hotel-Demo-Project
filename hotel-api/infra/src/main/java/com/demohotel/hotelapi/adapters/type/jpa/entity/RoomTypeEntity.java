package com.demohotel.hotelapi.adapters.type.jpa.entity;

import com.demohotel.hotelapi.adapters.rate.jpa.entity.RateEntity;
import com.demohotel.hotelapi.adapters.room.jpa.entity.RoomEntity;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A RoomTypeEntity.
 */
@Entity
@Table(name = "room_type")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RoomTypeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3, max = 128)
    @Column(name = "code", length = 128, nullable = false)
    private String code;

    @NotNull
    @Size(min = 3, max = 128)
    @Column(name = "name", length = 128, nullable = false)
    private String name;

    @NotNull
    @Size(min = 3, max = 128)
    @Column(name = "description", length = 128, nullable = false)
    private String description;

    @Column(name = "free_breakfast")
    private Boolean freeBreakfast;

    @Column(name = "free_wifi")
    private Boolean freeWifi;

    @Column(name = "free_parking")
    private Boolean freeParking;

    @OneToMany(mappedBy = "roomType")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<RoomEntity> rooms = new HashSet<>();

    @OneToMany(mappedBy = "roomType")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<RateEntity> rates = new HashSet<>();

    @OneToMany(mappedBy = "roomType")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<CapacityEntity> capacities = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public RoomTypeEntity code(String code) {
        this.code = code;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoomTypeEntity name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RoomTypeEntity description(String description) {
        this.description = description;
        return this;
    }

    public Boolean isFreeBreakfast() {
        return freeBreakfast;
    }

    public RoomTypeEntity freeBreakfast(Boolean freeBreakfast) {
        this.freeBreakfast = freeBreakfast;
        return this;
    }

    public void setFreeBreakfast(Boolean freeBreakfast) {
        this.freeBreakfast = freeBreakfast;
    }

    public Boolean isFreeWifi() {
        return freeWifi;
    }

    public RoomTypeEntity freeWifi(Boolean freeWifi) {
        this.freeWifi = freeWifi;
        return this;
    }

    public void setFreeWifi(Boolean freeWifi) {
        this.freeWifi = freeWifi;
    }

    public Boolean isFreeParking() {
        return freeParking;
    }

    public RoomTypeEntity freeParking(Boolean freeParking) {
        this.freeParking = freeParking;
        return this;
    }

    public void setFreeParking(Boolean freeParking) {
        this.freeParking = freeParking;
    }

    public Set<RoomEntity> getRooms() {
        return rooms;
    }

    public void setRooms(Set<RoomEntity> rooms) {
        this.rooms = rooms;
    }

    public RoomTypeEntity rooms(Set<RoomEntity> rooms) {
        this.rooms = rooms;
        return this;
    }

    public RoomTypeEntity addRoom(RoomEntity room) {
        this.rooms.add(room);
        room.setRoomType(this);
        return this;
    }

    public RoomTypeEntity removeRoom(RoomEntity room) {
        this.rooms.remove(room);
        room.setRoomType(null);
        return this;
    }

    public Set<RateEntity> getRates() {
        return rates;
    }

    public void setRates(Set<RateEntity> rates) {
        this.rates = rates;
    }

    public RoomTypeEntity rates(Set<RateEntity> rates) {
        this.rates = rates;
        return this;
    }

    public RoomTypeEntity addRate(RateEntity rate) {
        this.rates.add(rate);
        rate.setRoomType(this);
        return this;
    }

    public RoomTypeEntity removeRate(RateEntity rate) {
        this.rates.remove(rate);
        rate.setRoomType(null);
        return this;
    }

    public Set<CapacityEntity> getCapacities() {
        return capacities;
    }

    public void setCapacities(Set<CapacityEntity> capacities) {
        this.capacities = capacities;
    }

    public RoomTypeEntity capacities(Set<CapacityEntity> capacities) {
        this.capacities = capacities;
        return this;
    }

    public RoomTypeEntity addCapacity(CapacityEntity capacity) {
        this.capacities.add(capacity);
        capacity.setRoomType(this);
        return this;
    }

    public RoomTypeEntity removeCapacity(CapacityEntity capacity) {
        this.capacities.remove(capacity);
        capacity.setRoomType(null);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoomTypeEntity)) {
            return false;
        }
        return id != null && id.equals(((RoomTypeEntity) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "RoomTypeEntity{" +
                "id=" + getId() +
                ", code='" + getCode() + "'" +
                ", name='" + getName() + "'" +
                ", description='" + getDescription() + "'" +
                ", freeBreakfast='" + isFreeBreakfast() + "'" +
                ", freeWifi='" + isFreeWifi() + "'" +
                ", freeParking='" + isFreeParking() + "'" +
                "}";
    }
}
