package com.demohotel.hotelapi.adapters.room.jpa.entity;

import com.demohotel.hotelapi.image.model.Image;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A RoomImageEntity.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.MODULE)
@Entity
@Table(name = "room_image")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RoomImageEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Pattern(regexp = "^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")
    @Column(name = "url", nullable = false)
    private String url;

    @Size(min = 3, max = 128)
    @Column(name = "tag", length = 128)
    private String tag;

    @NotNull
    @Column(name = "width", nullable = false)
    private String width;

    @NotNull
    @Column(name = "height", nullable = false)
    private String height;

    @ManyToOne
    @JsonIgnoreProperties(value = "roomImages", allowSetters = true)
    private RoomEntity room;

    public Image toModel() {
        return Image.builder()
                .id(id)
                .url(url)
                .tag(tag)
                .width(width)
                .height(height)
                .parentId(room.getId())
                .build();
    }
}
