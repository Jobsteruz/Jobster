package com.smartbox.jobster.config.mq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TicketMQConfiguration {

    @Value("${spring.rabbitmq.jb.template.ticket-queue}")
    private String ticketQueueName;
    @Value("${spring.rabbitmq.jb.template.ticket.routing-key}")
    private String ticketRoutingKey;

    @Bean
    Queue ticketQueue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public Binding ticketBinding(DirectExchange exchange) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
