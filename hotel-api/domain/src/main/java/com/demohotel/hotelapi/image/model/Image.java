package com.demohotel.hotelapi.image.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Image {

    private Long id;
    private String url;
    private String tag;
    private String width;
    private String height;
    private Long parentId;
}
