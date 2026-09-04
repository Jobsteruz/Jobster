package com.smartbox.jobster.listener;

import com.smartbox.jobster.pojo.ApplicantIshGoStatusPojo;
import com.smartbox.jobster.service.ishgo.IshGOApplicantService;
import io.jmix.core.security.SystemAuthenticator;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty("spring.rabbitmq.listen")
@RequiredArgsConstructor
public class ApplicantIshGoChangeStatusQueueListener {
    private static final Logger log = LoggerFactory.getLogger(ApplicantIshGoChangeStatusQueueListener.class);

    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;
    @Value("${spring.rabbitmq.jb.template.applicant--change-status.routing-key}")
    private String routingKey;

    private final SystemAuthenticator systemAuthenticator;
    private final IshGOApplicantService ishGOApplicantService;
    private final RabbitTemplate rabbitTemplate;

    @RabbitListener(queues = "${spring.rabbitmq.jb.template.applicant-ishgo-change-status-queue}")
    public void listen(ApplicantIshGoStatusPojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
