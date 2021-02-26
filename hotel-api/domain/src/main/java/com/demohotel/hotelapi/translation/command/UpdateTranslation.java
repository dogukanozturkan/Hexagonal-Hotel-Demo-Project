package com.demohotel.hotelapi.translation.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateTranslation {

    private Long id;
    private Long parentId;
    private String text;
    private String language;
    private String description;
    private String name;

}
