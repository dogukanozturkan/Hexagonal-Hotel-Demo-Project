package com.demohotel.hotelapi.translation.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RemoveTranslation {

    private String id;
}
