package com.demohotel.hotelapi.adapters.rate.jpa.entity;

import com.demohotel.hotelapi.adapters.type.jpa.entity.RoomTypeEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * A RateEntity.
 */
@Entity
@Table(name = "rate")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RateEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3)
    @Column(name = "code", nullable = false)
    private String code;

    @NotNull
    @Size(min = 3, max = 128)
    @Column(name = "name", length = 128, nullable = false)
    private String name;

    @NotNull
    @Column(name = "currency", nullable = false)
    private String currency;

    @NotNull
    @Column(name = "amount", precision = 21, scale = 2, nullable = false)
    private BigDecimal amount;

    @ManyToOne
    @JsonIgnoreProperties(value = "rates", allowSetters = true)
    private RoomTypeEntity roomType;

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

    public RateEntity code(String code) {
        this.code = code;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RateEntity name(String name) {
        this.name = name;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public RateEntity currency(String currency) {
        this.currency = currency;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public RateEntity amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public RoomTypeEntity getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomTypeEntity roomType) {
        this.roomType = roomType;
    }

    public RateEntity roomType(RoomTypeEntity roomType) {
        this.roomType = roomType;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RateEntity)) {
            return false;
        }
        return id != null && id.equals(((RateEntity) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "RateEntity{" +
                "id=" + getId() +
                ", code='" + getCode() + "'" +
                ", name='" + getName() + "'" +
                ", currency='" + getCurrency() + "'" +
                ", amount=" + getAmount() +
                "}";
    }
}
