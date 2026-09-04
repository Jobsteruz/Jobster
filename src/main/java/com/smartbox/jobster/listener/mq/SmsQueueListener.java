package com.smartbox.jobster.listener.mq;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.entity.company.CompanySms;
import com.smartbox.jobster.pojo.SmsPojo;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.VerificationService;
import com.smartbox.jobster.service.sms.EskizService;
import com.smartbox.jobster.service.sms.SmsService;
import io.jmix.core.security.Authenticated;
import io.jmix.multitenancy.core.TenantProvider;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author Jobster team
 * Since: 12/14/2023 6:06 PM
 */
@Component
@ConditionalOnProperty("spring.rabbitmq.listen")
public class SmsQueueListener {
    private static final Logger log = LoggerFactory.getLogger(SmsQueueListener.class);

    @Autowired
    private CompanyService companyService;
    @Autowired
    private VerificationService verificationService;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Authenticated
    @RabbitListener(queues = "${spring.rabbitmq.jb.template.sms-queue}", containerFactory = "smsListenerContainerFactory")
    public void listen(SmsPojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // Resend fallback: kompaniyaning sozlangan gateway'lari mos kelmasa, ro'yxatdan skip'dan farqli
    // BIRINCHI global provayderni qaytaradi (2 provayderda — skip qilinmaganini).
    private String resolveAnyGateway(String skipGateway) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String resolveGateway(List<CompanySms> smsSettings, SmsPojo pojo, String skipGateway) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
