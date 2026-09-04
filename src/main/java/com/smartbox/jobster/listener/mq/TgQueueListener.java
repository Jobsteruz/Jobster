package com.smartbox.jobster.listener.mq;

import com.google.common.util.concurrent.RateLimiter;
import com.smartbox.jobster.entity.tg.Format;
import com.smartbox.jobster.pojo.RegCompanyPojo;
import com.smartbox.jobster.pojo.TgMessagePojo;
import com.smartbox.jobster.service.MQService;
import com.smartbox.jobster.service.tg.BotMessageService;
import io.jmix.core.security.Authenticated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Jobster team
 * Since: 12/12/2023 3:28 PM
 */
@Component
@Scope("prototype")
@ConditionalOnProperty("tg.rabbitmq.listen")
public class TgQueueListener {
    private static final Logger log = LoggerFactory.getLogger(TgQueueListener.class);
    private static final RateLimiter rateLimit = RateLimiter.create(29);

    @Autowired
    private MQService mQService;
    @Autowired
    private BotMessageService botMessageService;

    @RabbitListener(queues = "${spring.rabbitmq.jb.template.reg-tenant-queue}")
    public void regTenantQueue(RegCompanyPojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RabbitListener(queues = "${spring.rabbitmq.jb.template.tg-queue}")
    public void listen(TgMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public void sendTgMessage(TgMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
