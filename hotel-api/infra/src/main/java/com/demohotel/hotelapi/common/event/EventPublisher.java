package com.demohotel.hotelapi.common.event;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {

    private final JmsTemplate jmsTemplate;

    public EventPublisher(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

}
