package com.smartbox.jobster.listener.mq;

import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.MessageHistory;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.MessageHistoryService;
import io.jmix.core.FetchPlan;
import io.jmix.core.FileRef;
import io.jmix.core.TimeSource;
import io.jmix.core.security.Authenticated;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty("spring.rabbitmq.listen")
@RequiredArgsConstructor
public class SocketQueueListener {
    private static final Logger log = LoggerFactory.getLogger(SocketQueueListener.class);
    private final EntityService entityService;
    private final MessageHistoryService messageHistoryService;
    private final TimeSource timeSource;


    @RabbitListener(queues = "${spring.rabbitmq.jb.template.socket-j4-queue}")
    @Authenticated
    public void listen(String json) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}