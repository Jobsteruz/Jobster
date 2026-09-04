package com.smartbox.jobster.listener.mq;


import com.smartbox.jobster.pojo.event.AbstractEventPojo;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * @author Jobster team
 * Since: 11/28/2024 8:45 PM
 */
@Component
@ConditionalOnProperty("ui.rabbitmq.listen")
public class FireEventQueueListener {

    @RabbitListener(queues = "${spring.rabbitmq.jb.template.fire-event-queue}")
    public void listen(AbstractEventPojo eventPojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
