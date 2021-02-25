package com.demohotel.bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BusApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusApplication.class, args);
    }
}