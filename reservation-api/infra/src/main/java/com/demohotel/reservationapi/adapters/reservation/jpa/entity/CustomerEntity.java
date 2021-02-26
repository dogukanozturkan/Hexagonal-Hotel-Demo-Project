package com.demohotel.reservationapi.adapters.reservation.jpa.entity;

import com.demohotel.reservationapi.reservation.model.vo.Customer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A CustomerEntity.
 */
@Data
@Builder
@NoArgsConstructor
@Entity(name = "customer")
@Table(name = "customer")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CustomerEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name", length = 128, nullable = false)
    private String name;

    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "last_name", length = 128, nullable = false)
    private String lastName;

    @Size(min = 1, max = 128)
    @Column(name = "title", length = 128)
    private String title;

    @Column(name = "birth_date", length = 128)
    private LocalDate birthDate;

    @Column(name = "passport_no", unique = true)
    private String passportNo;

    @NotNull
    @Size(min = 3, max = 128)
    @Column(name = "country", length = 128, nullable = false)
    private String country;

    @NotNull
    @Pattern(regexp = "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s/0-9]*$")
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @NotNull
    @Pattern(regexp = "^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")
    @Column(name = "email", nullable = false)
    private String email;

    @ManyToOne
    @JsonIgnoreProperties(value = "customers", allowSetters = true)
    private ReservationEntity reservation;

    public static CustomerEntity fromModel(Customer customer) {
        return CustomerEntity.builder()
                .name(customer.getName())
                .lastName(customer.getLastName())
                .title(customer.getTitle())
                .passportNo(customer.getPassportNo())
                .birthDate(customer.getBirthDate())
                .country(customer.getCountry())
                .phoneNumber(customer.getPhoneNumber())
                .email(customer.getEmail())
                .build();
    }

    public Customer toModel() {
        return Customer.builder()
                .name(name)
                .lastName(lastName)
                .title(title)
                .passportNo(passportNo)
                .birthDate(birthDate)
                .country(country)
                .phoneNumber(phoneNumber)
                .email(email)
                .reservationId(reservation.getId())
                .build();
    }

}
