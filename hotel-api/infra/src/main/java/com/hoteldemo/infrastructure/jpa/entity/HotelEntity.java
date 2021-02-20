package com.hoteldemo.infrastructure.jpa.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "hotel")
@Table(name = "hotel")
@Builder
@Where(clause = "status <> -1")
@NoArgsConstructor
public class HotelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phoneNumber;

}
