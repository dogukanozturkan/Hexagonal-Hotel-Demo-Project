package com.hexagonaldemo.hotelapi.adapters.hotel.rest.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hexagonaldemo.hotelapi.adapters.hotel.rest.dto.*;
import com.hexagonaldemo.hotelapi.common.model.Image;
import com.hexagonaldemo.hotelapi.hotel.command.CreateHotel;
import com.hexagonaldemo.hotelapi.hotel.model.vo.Address;
import com.hexagonaldemo.hotelapi.hotel.model.vo.Facility;
import com.hexagonaldemo.hotelapi.hotel.model.vo.HotelType;
import com.hexagonaldemo.hotelapi.hotel.model.vo.Translation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateHotelRequest {

    @JsonProperty("name")
    public String name;
    @JsonProperty("type")
    public TypeDto type;
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
    @JsonProperty("star_rating")
    public Integer starRating;
    @JsonProperty("images")
    public List<ImageDto> images = null;
    @JsonProperty("translations")
    public List<TranslationDto> translations = null;
    @JsonProperty("facilities")
    public List<FacilityDto> facilities = null;

    public CreateHotel toModel() {
        return CreateHotel.builder()
                .name(name)
                .hotelType(HotelType.builder().name(getType().getName()).build())
                .description(description)
                .address(Address.of(getAddressLine1(), getAddressLine2(), getLocation().latitude, getLocation().longitude))
                .postCode(postcode)
                .city(city)
                .country(country)
                .phoneNumber(phoneNumber)
                .email(email)
                .currency(currency)
                .starRating(starRating)
                .images(getImages().stream().map(
                        image -> Image.builder()
                                .height(image.getHeight())
                                .width(image.getWidth())
                                .url(image.getUrl())
                                .tag(image.getTag())
                                .build())
                        .collect(Collectors.toList()))
                .translations(getTranslations().stream().map(
                        translation -> Translation.builder()
                                .locale(translation.getLocale())
                                .description(translation.getDescription())
                                .name(translation.getName())
                                .build())
                        .collect(Collectors.toList()))
                .facilities(getFacilities().stream().map(
                        facility -> Facility.builder()
                                .category(facility.getCategory())
                                .name(facility.getName())
                                .build())
                        .collect(Collectors.toList()))
                .build();
    }
}
