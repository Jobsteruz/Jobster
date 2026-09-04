package com.smartbox.jobster.listener.mq;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.pojo.HHMessagePojo;
import com.smartbox.jobster.service.hh.HHApplicantService;
import io.jmix.core.DataManager;
import io.jmix.core.security.Authenticated;
import io.jmix.core.security.SystemAuthenticator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * Sends outgoing HH negotiation messages OFF the request/UI thread. Only active on the MQ node
 * ({@code spring.rabbitmq.listen=true}), matching the SMS/TG/ISHGO dedicated-consumer pattern.
 * <p>
 * Why this exists: {@code AutoFillTemplateService#sendByHH} used to call HH synchronously, and the
 * mass-send views drive it in a {@code for} loop over every selected applicant — on the Vaadin UI
 * thread, which holds the VaadinSession lock for the whole loop. One slow HH response froze that
 * UI: every later heartbeat/uidl queued on the same lock until nginx gave up (~90s), producing the
 * "zombie UI" 504 storm seen in prod on 2026-07-30 (one client, 7 polls, all timing out at exactly
 * 90s). Publishing instead makes the loop pure DB work and moves the network call here.
 * <p>
 * {@code begin(username)} restores the sender's authentication so {@code currentUser()} inside
 * {@code sendSMS2HHFromJobster} resolves their HH {@code IntegratedUser} and the right tenant —
 * same approach as {@link HHQueueListener} on the inbound side. Send failures are already logged
 * and swallowed there; the UI-thread-only rejection toast is skipped because there is no UI here.
 */
@Component
@ConditionalOnProperty("spring.rabbitmq.listen")
public class HHMessageQueueListener {
    private static final Logger log = LoggerFactory.getLogger(HHMessageQueueListener.class);

    @Autowired
    private SystemAuthenticator systemAuthenticator;
    @Autowired
    private HHApplicantService hHApplicantService;
    @Autowired
    private DataManager dataManager;

    @Authenticated
    @RabbitListener(queues = "${spring.rabbitmq.jb.template.hh-message-queue:jb.hh_message_queue}")
    public void listen(HHMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Mas'ul xodim — begin() dan keyin o'qiladi, chunki load tenant'ga bog'liq. */
    private Employee responsible(HHMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
