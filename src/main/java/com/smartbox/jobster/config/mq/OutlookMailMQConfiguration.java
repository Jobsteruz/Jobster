package com.smartbox.jobster.config.mq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Declares the Outlook mail-import queue + binding, mirroring {@link ApplicantIshGOMQConfiguration}.
 * Graph change-notifications enqueue one {@code OutlookMailPojo} per new message; the queue decouples
 * the (fast, must-answer-in-10s) webhook from the (Graph fetch + parse) work on the worker node.
 */
@Configuration
public class OutlookMailMQConfiguration {

    @Value("${spring.rabbitmq.jb.template.outlook-mail-queue}")
    private String outlookMailQueueName;
    @Value("${spring.rabbitmq.jb.template.outlook-mail.routing-key}")
    private String outlookMailRoutingKey;

    @Bean
    Queue outlookMailQueue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public Binding outlookMailBinding(DirectExchange exchange) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
