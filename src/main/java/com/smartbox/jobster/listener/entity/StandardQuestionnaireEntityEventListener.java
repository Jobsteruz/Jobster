package com.smartbox.jobster.listener.entity;

import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.questionnaire.StandardQuestionnaireEntity;
import com.smartbox.jobster.pojo.event.QuestionnaireEntityCompletedEventPojo;
import io.jmix.core.DataManager;
import io.jmix.core.event.AttributeChanges;
import io.jmix.core.event.EntityChangedEvent;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class StandardQuestionnaireEntityEventListener {


    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;
    @Value("${spring.rabbitmq.jb.template.fire-event.routing-key}")
    private String routingKey;

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private DataManager dataManager;

//    @TransactionalEventListener
//    public void onApplicantChangedAfterCommit(final EntityChangedEvent<Applicant> event) {
//        fireUIEventOnUpdate(event);
//    }
//
//    @TransactionalEventListener
//    public void onEmployeeChangedAfterCommit(final EntityChangedEvent<Employee> event) {
//        fireUIEventOnUpdate(event);
//    }
//
//    @TransactionalEventListener
//    public void onVacancyChangedAfterCommit(final EntityChangedEvent<Vacancy> event) {
//        fireUIEventOnUpdate(event);
//    }


    private void fireUIEventOnUpdate(EntityChangedEvent<? extends StandardQuestionnaireEntity> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
