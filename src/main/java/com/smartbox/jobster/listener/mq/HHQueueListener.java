package com.smartbox.jobster.listener.mq;

import com.smartbox.jobster.entity.integration.IntegratedUser;
import com.smartbox.jobster.pojo.HHPojo;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.hh.HHApplicantService;
import io.jmix.core.security.Authenticated;
import io.jmix.core.security.SystemAuthenticator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * @author Jobster team
 * Since: 1/25/2025 1:58 PM
 */
@Component
@ConditionalOnProperty("spring.rabbitmq.listen")
public class HHQueueListener {
    private static final Logger log = LoggerFactory.getLogger(HHQueueListener.class);

    @Autowired
    private SystemAuthenticator systemAuthenticator;
    @Autowired
    private HHApplicantService hHApplicantService;
    @Autowired
    private EntityService entityService;

    @Authenticated
    @RabbitListener(queues = "${spring.rabbitmq.jb.template.hh-queue}")
    public void hhListener(HHPojo hhPojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
