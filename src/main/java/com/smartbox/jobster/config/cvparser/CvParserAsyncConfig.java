package com.smartbox.jobster.config.cvparser;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@EnableConfigurationProperties(ResumeParserProperties.class)
public class CvParserAsyncConfig {

    public static final String CV_PARSER_EXECUTOR = "cvParserExecutor";
    public static final String CV_PARSER_POLL_SCHEDULER = "cvParserPollScheduler";

    @Bean(CV_PARSER_EXECUTOR)
    public AsyncTaskExecutor cvParserExecutor() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean(CV_PARSER_POLL_SCHEDULER)
    public TaskScheduler cvParserPollScheduler() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
