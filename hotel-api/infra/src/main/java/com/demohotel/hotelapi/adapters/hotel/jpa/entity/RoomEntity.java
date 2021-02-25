package com.demohotel.hotelapi.adapters.hotel.jpa.entity;

import com.demohotel.hotelapi.common.entity.AbstractEntity;
import com.demohotel.hotelapi.room.model.RoomType;
import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

@Builder(toBuilder = true)
@Getter
@Setter()
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Entity(name = "rooms")
@Table(name = "rooms")
@Where(clause = "status <> -1")
public class RoomEntity extends AbstractEntity {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "hotel_id")
    private HotelEntity hotel;
    private Long number;
    private Long floor;
    private RoomType roomType;
    private String description;
    private String name;
    private Double occupancy;
    private Double numberOfBeds;

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<RoomImageEntity> images;
}
