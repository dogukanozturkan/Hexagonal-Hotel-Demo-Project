package com.demohotel.reservationapi.adapters.reservation.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A TravellerEntity.
 */
@Entity
@Table(name = "traveller")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TravellerEntity implements Serializable {

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
    @Column(name = "title", length = 128, nullable = true)
    private String title;

    @Size(min = 1, max = 128)
    @Column(name = "birth_date", length = 128, nullable = true)
    private LocalDate birthDate;

    @Column(name = "passport_no")
    private String passportNo;

    @NotNull
    @Size(min = 3, max = 128)
    @Column(name = "country", length = 128, nullable = false)
    private String country;

    @NotNull
    @Pattern(regexp = "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$")
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @NotNull
    @Pattern(regexp = "^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")
    @Column(name = "email", nullable = false)
    private String email;

    @ManyToOne
    @JsonIgnoreProperties(value = "travellers", allowSetters = true)
    private ReservationEntity reservation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public TravellerEntity name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public TravellerEntity lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public TravellerEntity title(String title) {
        this.title = title;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public TravellerEntity birthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public TravellerEntity passportNo(String passportNo) {
        this.passportNo = passportNo;
        return this;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getCountry() {
        return country;
    }

    public TravellerEntity country(String country) {
        this.country = country;
        return this;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public TravellerEntity phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public TravellerEntity email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ReservationEntity getReservation() {
        return reservation;
    }

    public TravellerEntity reservation(ReservationEntity reservation) {
        this.reservation = reservation;
        return this;
    }

    public void setReservation(ReservationEntity reservation) {
        this.reservation = reservation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TravellerEntity)) {
            return false;
        }
        return id != null && id.equals(((TravellerEntity) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "TravellerEntity{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", title='" + getTitle() + "'" +
            ", birthDate='" + getBirthDate() + "'" +
            ", passportNo='" + getPassportNo() + "'" +
            ", country='" + getCountry() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }
}
