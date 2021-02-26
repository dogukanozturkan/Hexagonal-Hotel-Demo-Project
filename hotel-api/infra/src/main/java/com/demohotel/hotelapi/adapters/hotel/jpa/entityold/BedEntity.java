package com.demohotel.hotelapi.adapters.hotel.jpa.entityold;

import com.demohotel.hotelapi.common.entity.AbstractEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

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
