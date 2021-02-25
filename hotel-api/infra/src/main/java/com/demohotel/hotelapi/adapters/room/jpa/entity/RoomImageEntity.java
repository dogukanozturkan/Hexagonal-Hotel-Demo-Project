package com.demohotel.hotelapi.adapters.room.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public RoomImageEntity url(String url) {
        this.url = url;
        return this;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public RoomImageEntity tag(String tag) {
        this.tag = tag;
        return this;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public RoomImageEntity width(String width) {
        this.width = width;
        return this;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public RoomImageEntity height(String height) {
        this.height = height;
        return this;
    }

    public RoomEntity getRoom() {
        return room;
    }

    public void setRoom(RoomEntity room) {
        this.room = room;
    }

    public RoomImageEntity room(RoomEntity room) {
        this.room = room;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoomImageEntity)) {
            return false;
        }
        return id != null && id.equals(((RoomImageEntity) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "RoomImageEntity{" +
                "id=" + getId() +
                ", url='" + getUrl() + "'" +
                ", tag='" + getTag() + "'" +
                ", width='" + getWidth() + "'" +
                ", height='" + getHeight() + "'" +
                "}";
    }
}
