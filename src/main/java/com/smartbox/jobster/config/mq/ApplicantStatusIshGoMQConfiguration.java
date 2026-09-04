package com.smartbox.jobster.config.mq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicantStatusIshGoMQConfiguration {
    @Value("${spring.rabbitmq.jb.template.applicant-ishgo-change-status-queue}")
    private String applicantIshGOQueueNameStatus;
    @Value("${spring.rabbitmq.jb.template.applicant--change-status.routing-key}")
    private String applicantIshGORoutingKeyStatus;

    @Bean
    Queue applicantStatusIshGOQueue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public Binding applicantStatusIshGOBinding(DirectExchange exchange) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
