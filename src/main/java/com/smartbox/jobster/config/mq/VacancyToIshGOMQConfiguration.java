package com.smartbox.jobster.config.mq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VacancyToIshGOMQConfiguration {

    @Value("${spring.rabbitmq.jb.template.vacancy-to-ishgo-queue}")
    private String vacancyToIshgoQueueName;
    @Value("${spring.rabbitmq.jb.template.vacancy-to-ishgo.routing-key}")
    private String vacancyToIshgoRoutingKey;


    @Bean
    Queue vacancyToIshgoQueue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public Binding vacancyToIshgoBinding(DirectExchange exchange) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}