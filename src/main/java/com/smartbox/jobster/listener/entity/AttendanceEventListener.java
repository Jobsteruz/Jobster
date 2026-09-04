package com.smartbox.jobster.listener.entity;

import com.smartbox.jobster.entity.vision.Attendance;
import io.jmix.core.event.EntityChangedEvent;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @author Jobster team
 * date: 25/06/24 14:02
 */
@Component
public class AttendanceEventListener {

    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;
    @Value("${spring.rabbitmq.jb.template.attendance.routing-key}")
    private String routingKey;

    @Autowired
    private RabbitTemplate rabbitTemplate;


    @TransactionalEventListener
    public void onAttendanceChangedAfterCommit(final EntityChangedEvent<Attendance> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
