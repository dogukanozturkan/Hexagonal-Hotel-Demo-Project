package com.demohotel.hotelapi.adapters.hotel.jpa.entity;

import com.demohotel.hotelapi.facility.model.Facility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * A FacilityEntity.
 */
@Builder(toBuilder = true)
@Data
@AllArgsConstructor(access = AccessLevel.MODULE)
@NoArgsConstructor
@Entity
@Table(name = "facility")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class FacilityEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "category", nullable = false)
    private String category;

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JsonIgnoreProperties(value = "facilities", allowSetters = true)
    private HotelEntity hotel;

    public Facility toModel() {
        return Facility.builder()
                .id(id)
                .category(category)
                .name(name)
                .parentId(hotel.getId())
                .build();
    }
}
