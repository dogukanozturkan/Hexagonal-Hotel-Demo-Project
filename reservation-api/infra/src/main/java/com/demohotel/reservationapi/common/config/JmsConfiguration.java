package com.demohotel.reservationapi.common.config;

import com.demohotel.reservationapi.adapters.reservation.event.out.ReservationCreatedEvent;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

import javax.jms.Topic;
import java.util.HashMap;

@Configuration
@EnableJms
public class JmsConfiguration {

    @Bean
    public Topic reservationCreated() {
        return new ActiveMQTopic("reservation.created");
    }

    @Bean
    public Topic reservationUpdated() {
        return new ActiveMQTopic("reservation.updated");
    }

    @Bean
    public Topic reservationCustomerUpdated() {
        return new ActiveMQTopic("reservation.customerUpdated");
    }

    @Bean
    public Topic reservationGuestAdded() {
        return new ActiveMQTopic("reservation.guestAdded");
    }

    @Bean
    public Topic reservationDatesChanged() {
        return new ActiveMQTopic("reservation.datesChanged");
    }

    @Bean
    public MessageConverter messageConverter(ObjectMapper objectMapper) {
        MappingJackson2MessageConverter messageConverter = new MappingJackson2MessageConverter();

        messageConverter.setObjectMapper(objectMapper);
        messageConverter.setTargetType(MessageType.TEXT);
        messageConverter.setTypeIdPropertyName("type");

        HashMap<String, Class<?>> idMapping = new HashMap<>();

        // out:
        idMapping.put(ReservationCreatedEvent.class.getSimpleName(), ReservationCreatedEvent.class);

        messageConverter.setTypeIdMappings(idMapping);
        return messageConverter;
    }

}