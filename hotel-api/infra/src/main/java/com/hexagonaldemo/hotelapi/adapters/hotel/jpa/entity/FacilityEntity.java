package com.hexagonaldemo.hotelapi.adapters.hotel.jpa.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hexagonaldemo.hotelapi.common.entity.AbstractEntity;
import com.hexagonaldemo.hotelapi.hotel.model.vo.Status;
import lombok.*;
import org.hibernate.annotations.Where;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder(toBuilder = true)
@Getter
@Setter()
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Entity(name = "facilities")
@Table(name = "facilities")
@Where(clause = "status <> -1")
public class FacilityEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column
    private LocalDateTime updatedAt;

    @Column(nullable = false)
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "hotel_id")
    private HotelEntity hotel;

    @JsonProperty("name")
    private String name;

    @JsonProperty("category")
    private String category;
}
