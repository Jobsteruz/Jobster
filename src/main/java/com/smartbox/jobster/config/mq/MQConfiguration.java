package com.smartbox.jobster.config.mq;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jobster team
 * Since: 12/12/2023 1:34 PM
 */
@Configuration
public class MQConfiguration {
    @Value("${spring.rabbitmq.jb.host}")
    private String host;
    @Value("${spring.rabbitmq.jb.username}")
    private String username;
    @Value("${spring.rabbitmq.jb.password}")
    private String password;
    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;
    @Value("${spring.rabbitmq.jb.template.mail-queue}")
    private String mailQueueName;
    @Value("${spring.rabbitmq.jb.template.mail.routing-key}")
    private String mailRoutingKey;
    @Value("${spring.rabbitmq.jb.template.sms-queue}")
    private String smsQueueName;
    @Value("${spring.rabbitmq.jb.template.sms.routing-key}")
    private String smsRoutingKey;
    @Value("${spring.rabbitmq.jb.template.tg-queue}")
    private String tgQueueName;
    @Value("${spring.rabbitmq.jb.template.tg.routing-key}")
    private String tgRoutingKey;
    @Value("${spring.rabbitmq.jb.template.socket-j4-queue}")
    private String socketJ4QueueName;
    @Value("${spring.rabbitmq.jb.template.socket-j4.routing-key}")
    private String socketJ4RoutingKey;
    @Value("${spring.rabbitmq.jb.template.socket-queue}")
    private String socketQueueName;
    @Value("${spring.rabbitmq.jb.template.socket.routing-key}")
    private String socketRoutingKey;
    @Value("${spring.rabbitmq.jb.template.ishgo-queue}")
    private String ishgoQueueName;
    @Value("${spring.rabbitmq.jb.template.ishgo.routing-key}")
    private String ishgoRoutingKey;
    @Value("${spring.rabbitmq.jb.template.hh-message-queue}")
    private String hhMessageQueueName;
    @Value("${spring.rabbitmq.jb.template.hh-message.routing-key}")
    private String hhMessageRoutingKey;


    @Bean
    DirectExchange exchange() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    Queue mailQueue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public Binding mailBinding() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    Queue smsQueue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public Binding smsBinding() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    Queue tgQueue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public Binding tgBinding() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    Queue socketJ4Queue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public Binding socketJ4Binding() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    Queue socketQueue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public Binding socketBinding() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    Queue ishgoQueue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public Binding ishgoBinding() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    Queue hhMessageQueue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public Binding hhMessageBinding() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public ConnectionFactory connectionFactory() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public AmqpAdmin amqpAdmin() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
