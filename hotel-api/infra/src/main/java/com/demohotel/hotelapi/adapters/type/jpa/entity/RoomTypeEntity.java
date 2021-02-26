package com.demohotel.hotelapi.adapters.type.jpa.entity;

import com.demohotel.hotelapi.adapters.rate.jpa.entity.RateEntity;
import com.demohotel.hotelapi.adapters.room.jpa.entity.RoomEntity;
import com.demohotel.hotelapi.type.command.CreateRoomType;
import com.demohotel.hotelapi.type.command.UpdateRoomType;
import com.demohotel.hotelapi.type.model.RoomType;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * A RoomTypeEntity.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.MODULE)
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

    @Column(name = "adult")
    private Integer adult;

    @Column(name = "children")
    private Integer children;

    @Column(name = "infant")
    private Integer infant;

    @Column(name = "bed")
    private Integer bed;

    @Column(name = "hotel_id")
    private Long hotelId;

    @OneToMany(mappedBy = "roomType")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private List<RoomEntity> rooms;

    @OneToMany(mappedBy = "roomType")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private List<RateEntity> rates;

    public static RoomTypeEntity fromModel(CreateRoomType createRoomType) {
        return RoomTypeEntity.builder()
                .code(createRoomType.getCode())
                .name(createRoomType.getName())
                .description(createRoomType.getDescription())
                .freeBreakfast(createRoomType.getFreeBreakfast())
                .freeWifi(createRoomType.getFreeWifi())
                .freeParking(createRoomType.getFreeParking())
                .build();
    }

    public static RoomTypeEntity fromModel(RoomTypeEntity roomType, UpdateRoomType update) {
        roomType.setCode(update.getCode());
        roomType.setName(update.getName());
        roomType.setDescription(update.getDescription());
        roomType.setFreeBreakfast(update.getFreeBreakfast());
        roomType.setFreeWifi(update.getFreeWifi());
        roomType.setFreeParking(update.getFreeParking());
        roomType.setAdult(update.getAdult());
        roomType.setChildren(update.getChildren());
        roomType.setInfant(update.getInfant());
        roomType.setBed(update.getBed());

        return roomType;
    }

    public RoomType toModel() {
        return RoomType.builder()
                .id(id)
                .code(code)
                .name(name)
                .hotelId(hotelId)
                .description(description)
                .freeBreakfast(freeBreakfast)
                .freeWifi(freeWifi)
                .freeParking(freeParking)
                .adult(adult)
                .children(children)
                .infant(infant)
                .bed(bed)
                .build();
    }
}
