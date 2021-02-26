package com.demohotel.hotelapi.adapters.hotel.jpa.entityold;

import com.demohotel.hotelapi.common.entity.AbstractEntity;
import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Builder(toBuilder = true)
@Getter
@Setter()
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Entity()
@Table(name = "hotels")
@Where(clause = "status <> -1")
public class HotelEntity extends AbstractEntity {

    @Column(nullable = false)
    private String name;

    private String description;

    private String addressLine1;

    private String addressLine2;

    private String postcode;

    private String city;

    private String country;

    /*@OneToOne(mappedBy = "hotel", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private LocationEntity location;*/

    private String phoneNumber;

    private String email;

    private String currency;

    private Integer starRating;

    private List<RoomEntity> roomEntityList;

    /*@OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<ImageEntity> images;

    @OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<TranslationEntity> translations;

    @OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<FacilityEntity> facilities;

    @OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<RoomEntity> rooms;*/


}
