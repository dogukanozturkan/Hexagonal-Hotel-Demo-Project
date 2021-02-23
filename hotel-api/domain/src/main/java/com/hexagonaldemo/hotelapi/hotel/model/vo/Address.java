package com.hexagonaldemo.hotelapi.hotel.model.vo;
import com.hexagonaldemo.hotelapi.common.ValueObject;
import lombok.NonNull;
import lombok.Value;

@Value
@ValueObject
public class Address {

    String addressLine1;
    String addressLine2;
    Double latitude;
    Double longitude;

    private Address(@NonNull String addressLine1, String addressLine2, @NonNull Double latitude, @NonNull Double longitude) {
        if (latitude <= -90 || latitude > 90) {
            throw new IllegalArgumentException(latitude + " is not a valid latitude. Valid range from -90 to 90");
        }

        if (longitude <= -180 || longitude > 180) {
            throw new IllegalArgumentException(latitude.toString() + " is not a valid longitude, Valid range from -180 to 180");
        }

        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public static Address of(String addressLine1, String addressLine2, Double latitude, Double longitude) {
        return new Address(addressLine1, addressLine2, latitude, longitude);
    }
}