package com.demohotel.hotelapi.adapters.type.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;

/**
 * A CapacityEntity.
 */
@Entity
@Table(name = "capacity")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CapacityEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "adult")
    private Integer adult;

    @Column(name = "children")
    private Integer children;

    @ManyToOne
    @JsonIgnoreProperties(value = "capacities", allowSetters = true)
    private RoomTypeEntity roomType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAdult() {
        return adult;
    }

    public void setAdult(Integer adult) {
        this.adult = adult;
    }

    public CapacityEntity adult(Integer adult) {
        this.adult = adult;
        return this;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    public CapacityEntity children(Integer children) {
        this.children = children;
        return this;
    }

    public RoomTypeEntity getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomTypeEntity roomType) {
        this.roomType = roomType;
    }

    public CapacityEntity roomType(RoomTypeEntity roomType) {
        this.roomType = roomType;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CapacityEntity)) {
            return false;
        }
        return id != null && id.equals(((CapacityEntity) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CapacityEntity{" +
                "id=" + getId() +
                ", adult=" + getAdult() +
                ", children=" + getChildren() +
                "}";
    }
}
