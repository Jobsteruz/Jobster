package com.smartbox.jobster.listener.mq;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.entity.company.CompanyEmail;
import com.smartbox.jobster.entity.config.MailgunSettings;
import com.smartbox.jobster.pojo.MailPojo;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.email.MailgunService;
import com.smartbox.jobster.service.email.NotiSendService;
import io.jmix.appsettings.AppSettings;
import io.jmix.core.security.Authenticated;
import io.jmix.multitenancy.core.TenantProvider;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Jobster team
 * Since: 12/14/2023 6:05 PM
 */
@Component
@ConditionalOnProperty("spring.rabbitmq.listen")
public class MailQueueListener {
    private static final Logger log = LoggerFactory.getLogger(MailQueueListener.class);

    @Autowired
    private AppSettings appSettings;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private MailgunService mailgunService;
    @Autowired
    private NotiSendService notiSendService;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Authenticated
    @RabbitListener(queues = "${spring.rabbitmq.jb.template.mail-queue}")
    public void listen(MailPojo message) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean sendMail(MailPojo message, String to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
