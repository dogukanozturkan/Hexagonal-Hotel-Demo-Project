package com.demohotel.hotelapi.adapters.room.jpa.entity;


import com.demohotel.hotelapi.adapters.hotel.jpa.entity.HotelEntity;
import com.demohotel.hotelapi.adapters.type.jpa.entity.RoomTypeEntity;
import com.demohotel.hotelapi.room.model.Room;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A RoomEntity.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.MODULE)
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
    private List<OccupancyEntity> occupancies;

    @OneToMany(mappedBy = "room")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private List<RoomImageEntity> roomImages;

    @OneToMany(mappedBy = "room")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private List<RoomTranslationEntity> roomTranslations;

    @ManyToOne
    @JsonIgnoreProperties(value = "rooms", allowSetters = true)
    private HotelEntity hotel;

    @ManyToOne
    @JsonIgnoreProperties(value = "rooms", allowSetters = true)
    private RoomTypeEntity roomType;

    public Room toModel() {
        return Room.builder()
                .id(id)
                .name(name)
                .description(description)
                .occupancies(occupancies.stream().map(OccupancyEntity::toModel).collect(Collectors.toList()))
                .images(roomImages.stream().map(RoomImageEntity::toModel).collect(Collectors.toList()))
                .translations(roomTranslations.stream().map(RoomTranslationEntity::toModel).collect(Collectors.toList()))
                .build();

    }

}
