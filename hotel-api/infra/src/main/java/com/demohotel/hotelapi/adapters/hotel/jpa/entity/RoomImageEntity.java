package com.demohotel.hotelapi.adapters.hotel.jpa.entity;


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
@Entity(name = "room_images")
@Table(name = "room_images")
@Where(clause = "status <> -1")
public class RoomImageEntity extends AbstractEntity {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "room_id", nullable = false)
    private RoomEntity room;

    @JsonProperty("height")
    private int height;
    @JsonProperty("width")
    private int width;
    @JsonProperty("url")
    private String url;
    @JsonProperty("tag")
    private String tag;
}
