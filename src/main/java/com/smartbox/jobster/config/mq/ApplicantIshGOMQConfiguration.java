package com.smartbox.jobster.config.mq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicantIshGOMQConfiguration {

    @Value("${spring.rabbitmq.jb.template.applicant-ishgo-queue}")
    private String applicantIshGOQueueName;
    @Value("${spring.rabbitmq.jb.template.applicant-ishgo.routing-key}")
    private String applicantIshGORoutingKey;


    @Bean
    Queue applicantIshGOQueue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public Binding applicantIshGOBinding(DirectExchange exchange) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}