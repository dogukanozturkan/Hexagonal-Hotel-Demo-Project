package com.demohotel.hotelapi.adapters.room.jpa.entity;

import com.demohotel.hotelapi.occupancy.model.Occupancy;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A OccupancyEntity.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.MODULE)
@Entity
@Table(name = "occupancy")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class OccupancyEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "check_in")
    private LocalDate checkIn;

    @Column(name = "check_out")
    private LocalDate checkOut;

    @Size(min = 3, max = 128)
    @Column(name = "reservation_id", length = 128)
    private Long reservationId;

    @ManyToOne
    @JsonIgnoreProperties(value = "occupancies", allowSetters = true)
    private RoomEntity room;

    public Occupancy toModel() {
        return Occupancy.builder()
                .id(id)
                .roomId(room.getId())
                .checkIn(checkIn)
                .checkOut(checkOut)
                .reservationId(reservationId)
                .build();
    }
}
