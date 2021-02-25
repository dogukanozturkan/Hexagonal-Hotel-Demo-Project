package com.demohotel.reservationapi.common.event;

import com.demohotel.reservationapi.adapters.reservation.event.out.ReservationCreatedEvent;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

@Component
public class EventPublisher {

    private final Topic reservationCreatedTopic;

    private final JmsTemplate jmsTemplate;

    public EventPublisher(@Qualifier("reservationCreated") Topic reservationCreatedTopic, JmsTemplate jmsTemplate) {
        this.reservationCreatedTopic = reservationCreatedTopic;
        this.jmsTemplate = jmsTemplate;
    }

    public void publishEvent(ReservationCreatedEvent event) {
        jmsTemplate.convertAndSend(reservationCreatedTopic, event);
    }

}
