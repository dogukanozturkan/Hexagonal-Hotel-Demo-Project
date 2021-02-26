package com.demohotel.reservationapi.adapters.reservation.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({
        "first_name",
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {

    @JsonProperty("comment")
    private String name;

}