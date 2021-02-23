package com.hexagonaldemo.hotelapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HotelApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelApiApplication.class, args);
    }
}
