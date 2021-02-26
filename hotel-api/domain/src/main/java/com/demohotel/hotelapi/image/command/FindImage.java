package com.demohotel.hotelapi.image.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FindImage {

    private Long imageId;
    private Long parentId;
}