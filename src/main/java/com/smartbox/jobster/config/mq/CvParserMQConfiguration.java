package com.smartbox.jobster.config.mq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Declares the RabbitMQ queue + binding consumed by {@code CvParserQueueListener} — the V2
 * entry point for bot-initiated CV parsing. Producers (e.g. {@code QuestionConsumer}) publish
 * {@link com.smartbox.jobster.pojo.CvParserQueuePojo} messages to the shared Jobster exchange
 * with the configured routing key.
 */
@Configuration
public class CvParserMQConfiguration {

    @Value("${spring.rabbitmq.jb.template.cv-parser-queue}")
    private String cvParserQueueName;

    @Value("${spring.rabbitmq.jb.template.cv-parser.routing-key}")
    private String cvParserRoutingKey;

    @Bean
    public Queue cvParserQueue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public Binding cvParserBinding(DirectExchange exchange) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
