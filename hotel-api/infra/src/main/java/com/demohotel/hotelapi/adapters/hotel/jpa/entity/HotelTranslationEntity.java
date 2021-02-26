package com.demohotel.hotelapi.adapters.hotel.jpa.entity;

import com.demohotel.hotelapi.translation.model.Translation;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * A HotelTranslationEntity.
 */
@Builder(toBuilder = true)
@Data
@AllArgsConstructor(access = AccessLevel.MODULE)
@NoArgsConstructor
@Entity
@Table(name = "hotel_translation")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class HotelTranslationEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "locale", nullable = false)
    private String locale;

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JsonIgnoreProperties(value = "hotelTranslations", allowSetters = true)
    private HotelEntity hotel;

    public Translation toModel() {
        return Translation.builder()
                .id(id)
                .locale(locale)
                .name(name)
                .description(description)
                .build();
    }
}
