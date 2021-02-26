package com.demohotel.hotelapi.adapters.room.jpa.entity;

import com.demohotel.hotelapi.translation.model.Translation;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * A RoomTranslationEntity.
 */
@Data
@Entity
@Table(name = "room_translation")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RoomTranslationEntity implements Serializable {

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
    @JsonIgnoreProperties(value = "roomTranslations", allowSetters = true)
    private RoomEntity room;

    public Translation toModel() {
        return Translation.builder()
                .id(id)
                .locale(locale)
                .name(name)
                .description(description)
                .build();
    }
}
