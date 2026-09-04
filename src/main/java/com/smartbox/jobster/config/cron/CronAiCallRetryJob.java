package com.smartbox.jobster.config.cron;

import com.smartbox.jobster.service.ai.AiCallRetryService;
import io.jmix.core.security.SystemAuthenticator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component("jb_CronAiCallRetryJob")
@ConditionalOnProperty("spring.rabbitmq.listen")
public class CronAiCallRetryJob {

    @Autowired
    private AiCallRetryService aiCallRetryService;

    @Autowired
    private SystemAuthenticator systemAuthenticator;

    @Scheduled(cron = "0 0 */12 * * ?", zone = "Asia/Tashkent")
    public void retryFailedAiCallRequests() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}