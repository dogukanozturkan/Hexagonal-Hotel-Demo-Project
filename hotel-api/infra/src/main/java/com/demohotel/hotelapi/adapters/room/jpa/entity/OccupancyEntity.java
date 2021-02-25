package com.demohotel.hotelapi.adapters.room.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A OccupancyEntity.
 */
@Entity
@Table(name = "occupancy")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class OccupancyEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Size(min = 3, max = 128)
    @Column(name = "reservation_id", length = 128)
    private String reservationId;

    @ManyToOne
    @JsonIgnoreProperties(value = "occupancies", allowSetters = true)
    private com.demohotel.hotelapi.adapters.room.jpa.entity.RoomEntity room;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public OccupancyEntity startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public OccupancyEntity endDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public OccupancyEntity reservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }

    public RoomEntity getRoom() {
        return room;
    }

    public void setRoom(RoomEntity room) {
        this.room = room;
    }

    public OccupancyEntity room(RoomEntity room) {
        this.room = room;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OccupancyEntity)) {
            return false;
        }
        return id != null && id.equals(((OccupancyEntity) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "OccupancyEntity{" +
                "id=" + getId() +
                ", startDate='" + getStartDate() + "'" +
                ", endDate='" + getEndDate() + "'" +
                ", reservationId='" + getReservationId() + "'" +
                "}";
    }
}
