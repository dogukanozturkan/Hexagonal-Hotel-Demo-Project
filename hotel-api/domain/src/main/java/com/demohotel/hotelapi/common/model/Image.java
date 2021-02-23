package com.demohotel.hotelapi.common.model;

import com.demohotel.hotelapi.common.ValueObject;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@Builder
@Value
@ValueObject
public class Image {

    String url;
    String tag;
    String width;
    String height;
}
