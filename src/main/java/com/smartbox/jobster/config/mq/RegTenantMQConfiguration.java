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
 * date: 19/08/24 18:24
 */
@Configuration
public class RegTenantMQConfiguration {

    @Value("${spring.rabbitmq.jb.template.reg-tenant-queue}")
    private String queueName;
    @Value("${spring.rabbitmq.jb.template.reg-tenant.routing-key}")
    private String routingKey;


    @Bean
    Queue regTenantQueue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public Binding regTenantBinding(DirectExchange exchange) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
