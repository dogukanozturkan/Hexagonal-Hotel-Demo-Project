package com.demohotel.hotelapi.adapters.hotel.jpa.entityold;

import com.demohotel.hotelapi.common.entity.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Builder(toBuilder = true)
@Getter
@Setter()
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Entity(name = "translations")
@Table(name = "translations")
@Where(clause = "status <> -1")
public class TranslationEntity extends AbstractEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "hotel_id")
    private HotelEntity hotel;

    @JsonProperty("locale")
    private String locale;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

}