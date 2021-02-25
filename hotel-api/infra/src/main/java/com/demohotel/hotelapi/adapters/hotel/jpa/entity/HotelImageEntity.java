package com.demohotel.hotelapi.adapters.hotel.jpa.entity;

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
 * A HotelImageEntity.
 */
@Builder(toBuilder = true)
@Getter
@Setter()
@AllArgsConstructor(access = AccessLevel.MODULE)
@NoArgsConstructor
@Entity
@Table(name = "hotel_image")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class HotelImageEntity implements Serializable {

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
    @JsonIgnoreProperties(value = "hotelImages", allowSetters = true)
    private HotelEntity hotel;

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

    public HotelImageEntity url(String url) {
        this.url = url;
        return this;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public HotelImageEntity tag(String tag) {
        this.tag = tag;
        return this;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public HotelImageEntity width(String width) {
        this.width = width;
        return this;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public HotelImageEntity height(String height) {
        this.height = height;
        return this;
    }

    public HotelEntity getHotel() {
        return hotel;
    }

    public void setHotel(HotelEntity hotel) {
        this.hotel = hotel;
    }

    public HotelImageEntity hotel(HotelEntity hotel) {
        this.hotel = hotel;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HotelImageEntity)) {
            return false;
        }
        return id != null && id.equals(((HotelImageEntity) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "HotelImageEntity{" +
                "id=" + getId() +
                ", url='" + getUrl() + "'" +
                ", tag='" + getTag() + "'" +
                ", width='" + getWidth() + "'" +
                ", height='" + getHeight() + "'" +
                "}";
    }
}
