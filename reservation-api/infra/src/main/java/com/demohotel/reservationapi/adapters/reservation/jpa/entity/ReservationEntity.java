package com.demohotel.reservationapi.adapters.reservation.jpa.entity;

import com.demohotel.reservationapi.common.config.StringToLocalDateConverter;
import com.demohotel.reservationapi.reservation.command.CreateReservation;
import com.demohotel.reservationapi.reservation.model.Reservation;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A ReservationEntity.
 */
@Data
@Builder
@NoArgsConstructor
@Entity(name = "reservation")
@Table(name = "reservation")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ReservationEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private static StringToLocalDateConverter localDateConverter;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hotel_id")
    private Long hotelId;

    @Column(name = "room_id")
    private Long roomId;

    @Column(name = "rate_id")
    private Long rateId;

    @Column(name = "room_type_id")
    private Long roomTypeId;

    @Column(name = "amount")
    private String amount;

    @Column(name = "currency")
    private String currency;

    @Column(name = "check_in")
    private LocalDate checkIn;

    @Column(name = "check_out")
    private LocalDate checkOut;

    @Column(name = "adult")
    private Integer adult;

    @Column(name = "children")
    private Integer children;

    @Column(name = "infant")
    private Integer infant;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(unique = true)
    private CustomerEntity customer;

    @OneToMany(
            mappedBy = "reservation",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<GuestEntity> guests;

    public static ReservationEntity fromModel(CreateReservation reservation) {
        return ReservationEntity.builder()
                .hotelId(reservation.getHotelId())
                .roomId(reservation.getRoomId())
                .checkIn(reservation.getCheckIn())
                .checkOut(reservation.getCheckOut())
                .currency(reservation.getCurrency())
                .amount(reservation.getAmount())
                .adult(reservation.getAdult())
                .children(reservation.getChildren())
                .infant(reservation.getInfant())
                .customer(CustomerEntity.fromModel(reservation.getCustomer()))
                .guests(reservation.getGuests()
                        .stream()
                        .map(GuestEntity::fromModel)
                        .collect(Collectors.toList())
                )
                .build();
    }

    public Reservation toModel() {
        return Reservation.builder()
                .id(id)
                .hotelId(hotelId)
                .roomId(roomId)
                .amount(amount)
                .currency(currency)
                .adult(adult)
                .children(children)
                .infant(infant)
                .checkIn(checkIn)
                .checkOut(checkOut)
                .customer(customer.toModel())
                .guests(guests.stream()
                        .map(GuestEntity::toModel)
                        .collect(Collectors.toList()))
                .build();
    }
}
