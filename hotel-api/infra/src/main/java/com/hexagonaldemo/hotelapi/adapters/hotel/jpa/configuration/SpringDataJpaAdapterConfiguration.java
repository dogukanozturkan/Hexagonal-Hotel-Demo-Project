package com.hexagonaldemo.hotelapi.adapters.hotel.jpa.configuration;

import com.hexagonaldemo.hotelapi.adapters.hotel.jpa.HotelJpaAdapter;
import com.hexagonaldemo.hotelapi.adapters.hotel.jpa.repository.HotelJpaRepository;
import com.hexagonaldemo.hotelapi.hotel.port.HotelPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDataJpaAdapterConfiguration {

    /*@Bean
    public HotelPort getHotelPort(HotelJpaRepository hotelJpaRepository) {
        return new HotelJpaAdapter(hotelJpaRepository);
    }*/
}