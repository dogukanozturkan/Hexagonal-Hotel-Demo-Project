package com.demohotel.hotelapi.adapters.rate.jpa.entity;

import com.demohotel.hotelapi.adapters.type.jpa.entity.RoomTypeEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
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
@Data
@Builder
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

}
