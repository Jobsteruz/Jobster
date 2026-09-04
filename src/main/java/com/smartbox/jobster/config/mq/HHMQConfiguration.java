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
 * Since: 1/25/2025 12:39 PM
 */
@Configuration
public class HHMQConfiguration {

    @Value("${spring.rabbitmq.jb.template.hh-queue}")
    private String hhQueueName;
    @Value("${spring.rabbitmq.jb.template.hh.routing-key}")
    private String hhRoutingKey;

    @Bean
    Queue hhQueue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public Binding hhBinding(DirectExchange exchange) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

