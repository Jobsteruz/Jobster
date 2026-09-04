package com.smartbox.jobster.config.mq;

import com.smartbox.jobster.$;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.connection.stream.MapRecord;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.data.redis.stream.StreamMessageListenerContainer;
import org.springframework.data.redis.stream.StreamMessageListenerContainer.StreamMessageListenerContainerOptions;

import java.time.Duration;

@Configuration
@ConditionalOnProperty(value = "spring.redis.aicall.enabled")
public class AiCallRedisStreamConfiguration {

    @Value("${spring.redis.aicall.host}")
    @Getter
    private String host;

    @Value("${spring.redis.aicall.port}")
    @Getter
    private int port;

    @Value("${spring.redis.aicall.password}")
    @Getter
    private String password;

    @Getter
    @Value("${spring.redis.aicall.stream-key}")
    private String streamKey;

    @Getter
    @Value("${spring.redis.aicall.consumer-group}")
    private String consumerGroup;

    @Bean(name = "aiCallRedisConnectionFactory")
    @Qualifier("aiCallRedisConnectionFactory")
    public RedisConnectionFactory aiCallRedisConnectionFactory() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean(name = "aiCallRedisTemplate")
    public RedisTemplate<String, String> aiCallRedisTemplate() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean(name = "aiCallStreamMessageListenerContainer")
    public StreamMessageListenerContainer<String, MapRecord<String, String, String>> aiCallStreamMessageListenerContainer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}