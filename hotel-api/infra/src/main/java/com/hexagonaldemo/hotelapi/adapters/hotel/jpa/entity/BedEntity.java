package com.hexagonaldemo.hotelapi.adapters.hotel.jpa.entity;

import com.hexagonaldemo.hotelapi.common.entity.AbstractEntity;
import lombok.*;

import javax.persistence.*;

@Builder(toBuilder = true)
@Getter
@Setter()
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Entity(name = "bed_types")
@Table(name = "bed_types")
public class BedEntity extends AbstractEntity {

    String name;
    Double occupancy;
    Double numberOfBeds;
}
