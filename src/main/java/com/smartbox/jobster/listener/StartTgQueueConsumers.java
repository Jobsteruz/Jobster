package com.smartbox.jobster.listener;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.company.CompanyStatus;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.MQService;
import io.jmix.core.security.Authenticated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component("jb_StartTgQueueConsumers")
@ConditionalOnProperty("tg.rabbitmq.listen")
public class StartTgQueueConsumers {

    @Autowired
    private CompanyService companyService;
    @Autowired
    private MQService mqService;

    @Authenticated
    @EventListener
    public void onApplicationStarted(final ApplicationStartedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}