package com.demohotel.hotelapi.adapters.hotel.rest.dto.request;

import com.demohotel.hotelapi.adapters.hotel.rest.dto.LocationDto;
import com.demohotel.hotelapi.facility.model.Facility;
import com.demohotel.hotelapi.hotel.command.UpdateHotel;
import com.demohotel.hotelapi.image.model.Image;
import com.demohotel.hotelapi.translation.model.Translation;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateHotelRequest {

    @JsonProperty("name")
    public String name;
    @JsonProperty("description")
    public String description;
    @JsonProperty("address_line_1")
    public String addressLine1;
    @JsonProperty("address_line_2")
    public String addressLine2;
    @JsonProperty("postcode")
    public String postcode;
    @JsonProperty("city")
    public String city;
    @JsonProperty("country")
    public String country;
    @JsonProperty("location")
    public LocationDto location;
    @JsonProperty("phone_number")
    public String phoneNumber;
    @JsonProperty("email")
    public String email;
    @JsonProperty("currency")
    public String currency;
    public List<Image> images = new ArrayList<>();
    @JsonProperty("translations")
    public List<Translation> translations = new ArrayList<>();
    @JsonProperty("facilities")
    public List<Facility> facilities = new ArrayList<>();

    public UpdateHotel toModel() {
        return UpdateHotel.builder()
                .name(name)
                .description(description)
                .addressLine1(addressLine1)
                .addressLine2(addressLine2)
                .latitude(getLocation().latitude)
                .longitude(getLocation().longitude)
                .postCode(postcode)
                .city(city)
                .country(country)
                .phoneNumber(phoneNumber)
                .email(email)
                .currency(currency)
                .images(images)
                .translations(translations)
                .facilities(facilities)
                .build();
    }
}
