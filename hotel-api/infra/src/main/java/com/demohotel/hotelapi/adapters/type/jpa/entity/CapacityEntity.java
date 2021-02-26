package com.demohotel.hotelapi.adapters.type.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;

/**
 * A CapacityEntity.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.MODULE)
@Entity
@Table(name = "capacity")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CapacityEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "adult")
    private Integer adult;

    @Column(name = "children")
    private Integer children;

    @ManyToOne
    @JsonIgnoreProperties(value = "capacities", allowSetters = true)
    private RoomTypeEntity roomType;
}
