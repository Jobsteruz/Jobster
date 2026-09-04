package com.smartbox.jobster.config.mq;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jobster team
 * Since: 11/28/2024 8:43 PM
 */
@Configuration
public class FireEventMQConfiguration {

    @Value("${spring.rabbitmq.jb.template.fire-event-queue}")
    private String fireEventQueueName;
    @Value("${spring.rabbitmq.jb.template.fire-event.routing-key}")
    private String fireEventRoutingKey;

    @Bean
    Queue fireEventQueue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public Binding fireEventBinding(DirectExchange exchange) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
