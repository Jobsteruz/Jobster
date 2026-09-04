package com.smartbox.jobster.config.mq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PhotoValidationMQConfiguration {

    @Value("${spring.rabbitmq.jb.template.photo-validation-queue}")
    private String photoValidationQueueName;
    @Value("${spring.rabbitmq.jb.template.photo-validation.routing-key}")
    private String photoValidationRoutingKey;

    @Bean
    Queue photoValidationQueue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public Binding photoValidationBinding(DirectExchange exchange) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
