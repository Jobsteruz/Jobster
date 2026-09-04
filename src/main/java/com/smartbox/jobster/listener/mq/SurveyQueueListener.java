package com.smartbox.jobster.listener.mq;

import com.smartbox.jobster.entity.survey.Survey;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.pojo.SurveyPojo;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.survey.SurveyService;
import io.jmix.core.security.Authenticated;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@ConditionalOnProperty("spring.rabbitmq.listen")
public class SurveyQueueListener {
    @Autowired
    private EntityService entityService;
    @Autowired
    private SurveyService surveyService;


    @RabbitListener(queues = "${spring.rabbitmq.jb.template.survey-queue}")
    @Authenticated
    public void listen(SurveyPojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}