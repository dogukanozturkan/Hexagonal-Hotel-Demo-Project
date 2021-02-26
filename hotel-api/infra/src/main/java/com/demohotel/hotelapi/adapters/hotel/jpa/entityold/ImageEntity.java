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
@Entity(name = "images")
@Table(name = "images")
@Where(clause = "status <> -1")
public class ImageEntity extends AbstractEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "hotel_id")
    private HotelEntity hotel;

    @JsonProperty("height")
    private String height;

    @JsonProperty("width")
    private String width;

    @JsonProperty("url")
    private String url;

    @JsonProperty("tag")
    private String tag;

}
