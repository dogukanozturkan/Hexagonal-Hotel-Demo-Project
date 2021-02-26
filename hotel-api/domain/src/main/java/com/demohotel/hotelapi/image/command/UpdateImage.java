package com.demohotel.hotelapi.image.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateImage {

    private Long parentId;
    private String url;
    private String tag;
    private String width;
    private String height;
}
