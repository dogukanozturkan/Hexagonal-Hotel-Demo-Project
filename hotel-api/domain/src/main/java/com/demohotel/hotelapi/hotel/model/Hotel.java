package com.demohotel.hotelapi.hotel.model;

import com.demohotel.hotelapi.common.aggregate.Aggregate;
import com.demohotel.hotelapi.common.model.Image;
import com.demohotel.hotelapi.hotel.event.HotelWasCreated;
import com.demohotel.hotelapi.hotel.model.vo.*;
import com.demohotel.hotelapi.hotel.port.HotelPort;
import com.demohotel.hotelapi.room.model.Room;
import lombok.*;

import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
public class Hotel extends Aggregate {

    @EqualsAndHashCode.Include
    @Getter
    @NonNull
    private HotelId id;

    private String name;

    private HotelType hotelType;

    private Address address;

    private String postCode;

    private String country;

    private String phoneNumber;

    private String email;

    private String currency;

    private List<Image> images;

    private List<Facility> facilities;

    // One-To-Many relationship
    private List<Room> rooms;

    // Many-To-One relationship
    private HotelRate rate;


    //Uçur
    // Transient
    private HotelPort repository;


    /**
     * Returns a hotel.
     *
     * @param repository
     */
    public Hotel(HotelPort repository) {
        super();
        this.repository = repository;
    }

    /**
     * Returns a hotel managed.
     *
     * @param name
     * @param hotelType
     * @param address
     * @param postCode
     * @param country
     * @param phoneNumber
     * @param email
     * @param currency
     * @param images
     * @param facilities
     * @param rooms
     */
    public Hotel(String name, HotelType hotelType, Address address, String postCode, String country, String phoneNumber,
                 String email, String currency, List<Image> images, List<Facility> facilities, List<Room> rooms) {
        this.name = name;
        this.hotelType = hotelType;
        this.address = address;
        this.postCode = postCode;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.currency = currency;
        this.images = images;
        this.facilities = facilities;
        this.rooms = rooms;
    }

    /**
     * Returns a hotel managed.
     *
     * @param name
     * @param hotelType
     * @param address
     * @param postCode
     * @param country
     * @param phoneNumber
     * @param email
     * @param currency
     * @param images
     * @param facilities
     * @param rooms
     * @param rate
     * @param repository
     */
    public Hotel(String name, HotelType hotelType, Address address, String postCode, String country,
                 String phoneNumber, String email, String currency, List<Image> images, List<Facility> facilities,
                 List<Room> rooms, HotelRate rate, HotelPort repository) {
        super();
        this.name = name;
        this.hotelType = hotelType;
        this.address = address;
        this.postCode = postCode;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.currency = currency;
        this.images = images;
        this.facilities = facilities;
        this.rooms = rooms;
        this.rate = rate;
        this.repository = repository;
    }

    // Behavior
    public static Hotel create(String name, HotelType hotelType, Address address, String postCode,
                               String country, String phoneNumber, String email, String currency, List<Image> images,
                               List<Facility> facilities, List<Room> rooms, HotelRate rate, HotelPort repository) {

        Hotel hotel = new Hotel(HotelId.create(), name, hotelType, address,
                postCode, country, phoneNumber, email, currency,
                images, facilities, rooms, rate, repository);

        hotel.addEvent(HotelWasCreated.from(hotel));
        return hotel;
    }


   /* // Optional dönme.
    public List<Hotel> getAvailableHotels(Date to, Date from) throws Exception {
        if (to == null && from == null) {
            //TODO: Validation.
        }
        return repository.getAvailableHotels(to, from);
    }

    public List<Hotel> getAvailableHotels(Date to, Date from, String city) throws Exception {
        if (to == null && from == null) {
            //TODO: Validation.
        }
        return repository.getAvailableHotels(to, from, city);
    }

    public Hotel findById(HotelId id) throws Exception {
        return repository.findById(id);
    }

    public List<Hotel> findAll() throws Exception {
        return repository.findAll();
    }

    public void store(){
        if(this.id == null)
            this.id = nextId();
        repository.create(this);
    }

    //Getters
    public HotelId nextId() {
        return nextId();
    }

    public void changeName(@NonNull String newName) {
        this.name = newName;

        addEvent(HotelNameWasChanged.from(this));
    }

    public void changeAddress(Address address) {
        this.address = address;

        addEvent(HotelAddressWasChanged.from(this));
    }

    */
}
