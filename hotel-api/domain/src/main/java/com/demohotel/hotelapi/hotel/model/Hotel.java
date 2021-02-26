package com.demohotel.hotelapi.hotel.model;

import com.demohotel.hotelapi.common.aggregate.Aggregate;
import com.demohotel.hotelapi.facility.model.Facility;
import com.demohotel.hotelapi.image.model.Image;
import com.demohotel.hotelapi.rate.model.Rate;
import com.demohotel.hotelapi.room.model.Room;
import com.demohotel.hotelapi.translation.model.Translation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
public class Hotel extends Aggregate {

    private Long id;
    private String name;
    private String addressLine1;
    private String addressLine2;
    private Double latitude;
    private Double longitude;
    private String description;
    private String postCode;
    private String country;
    private String city;
    private String phoneNumber;
    private String email;
    private String currency;
    private String starRating;
    private List<Image> images;
    private List<Facility> facilities;
    private List<Translation> translations;
    private List<Room> rooms;
    private List<Rate> rate;
}
