package com.smartbox.jobster.listener.mq;

import com.smartbox.jobster.pojo.VacancyToIshGOPojo;
import com.smartbox.jobster.service.ishgo.IshGOVacancyService;
import io.jmix.core.security.SystemAuthenticator;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty("spring.rabbitmq.listen")
@RequiredArgsConstructor
public class VacancyToIshGOQueueListener {
    private static final Logger log = LoggerFactory.getLogger(VacancyToIshGOQueueListener.class);

    private final SystemAuthenticator systemAuthenticator;
    private final IshGOVacancyService ishGOVacancyService;


    @RabbitListener(queues = "${spring.rabbitmq.jb.template.vacancy-to-ishgo-queue}")
    public void listen(VacancyToIshGOPojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}