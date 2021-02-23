package com.hexagonaldemo.hotelapi.adapters.hotel.jpa.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hexagonaldemo.hotelapi.common.entity.AbstractEntity;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Entity(name = "location")
@Table(name = "location")
public class LocationEntity {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @JsonProperty("longitude")
    private double longitude;

    @JsonProperty("latitude")
    private double latitude;
}
