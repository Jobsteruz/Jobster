package com.smartbox.jobster.listener.mq;

import com.smartbox.jobster.$;
import com.smartbox.jobster.pojo.IshGoMessagePojo;
import com.smartbox.jobster.service.ishgo.IshGOApplicantService;
import io.jmix.core.security.Authenticated;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * Consumes ISHGO applicant messages OFF the request/UI thread. Only active on the MQ node
 * ({@code spring.rabbitmq.listen=true}), matching the SMS/TG dedicated-consumer pattern. The actual
 * WebClient send — which can be slow or (before the timeout fix) hang — happens here, so it can
 * never freeze a Vaadin UI by holding the session lock. {@code message2Applicant} already logs and
 * swallows its own send failures.
 */
@Component
@ConditionalOnProperty("spring.rabbitmq.listen")
public class IshGoMessageQueueListener {

    @Autowired
    private IshGOApplicantService ishGOApplicantService;

    @Authenticated
    @RabbitListener(queues = "${spring.rabbitmq.jb.template.ishgo-queue}")
    public void listen(IshGoMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
