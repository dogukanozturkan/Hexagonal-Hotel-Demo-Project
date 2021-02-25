package com.demohotel.reservationapi.adapters.reservation.jpa.entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * A ReservationEntity.
 */
@Entity
@Table(name = "reservation")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ReservationEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hotel_id")
    private String hotelId;

    @Column(name = "room_id")
    private String roomId;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "adult")
    private Integer adult;

    @Column(name = "children")
    private Integer children;

    @OneToOne
    @JoinColumn(unique = true)
    private CustomerEntity customer;

    @OneToMany(mappedBy = "reservation")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<TravellerEntity> travellers = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotelId() {
        return hotelId;
    }

    public ReservationEntity hotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getRoomId() {
        return roomId;
    }

    public ReservationEntity roomId(String roomId) {
        this.roomId = roomId;
        return this;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public ReservationEntity startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public ReservationEntity endDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Integer getAdult() {
        return adult;
    }

    public ReservationEntity adult(Integer adult) {
        this.adult = adult;
        return this;
    }

    public void setAdult(Integer adult) {
        this.adult = adult;
    }

    public Integer getChildren() {
        return children;
    }

    public ReservationEntity children(Integer children) {
        this.children = children;
        return this;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public ReservationEntity customer(CustomerEntity customer) {
        this.customer = customer;
        return this;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    public Set<TravellerEntity> getTravellers() {
        return travellers;
    }

    public ReservationEntity travellers(Set<TravellerEntity> travellers) {
        this.travellers = travellers;
        return this;
    }

    public ReservationEntity addTraveller(TravellerEntity traveller) {
        this.travellers.add(traveller);
        traveller.setReservation(this);
        return this;
    }

    public ReservationEntity removeTraveller(TravellerEntity traveller) {
        this.travellers.remove(traveller);
        traveller.setReservation(null);
        return this;
    }

    public void setTravellers(Set<TravellerEntity> travellers) {
        this.travellers = travellers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReservationEntity)) {
            return false;
        }
        return id != null && id.equals(((ReservationEntity) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ReservationEntity{" +
            "id=" + getId() +
            ", hotelId='" + getHotelId() + "'" +
            ", roomId='" + getRoomId() + "'" +
            ", startDate='" + getStartDate() + "'" +
            ", endDate='" + getEndDate() + "'" +
            ", adult=" + getAdult() +
            ", children=" + getChildren() +
            "}";
    }
}
