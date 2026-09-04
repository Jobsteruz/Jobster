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
 * Since: 5/16/2024 2:26 PM
 */
@Configuration
public class TraineeMQConfiguration {

    @Value("${spring.rabbitmq.jb.template.trainee-group-queue}")
    private String traineeGroupQueueName;
    @Value("${spring.rabbitmq.jb.template.trainee-group.routing-key}")
    private String traineeGroupRoutingKey;

    @Bean
    Queue traineeGroupQueue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public Binding traineeGroupBinding(DirectExchange exchange) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
