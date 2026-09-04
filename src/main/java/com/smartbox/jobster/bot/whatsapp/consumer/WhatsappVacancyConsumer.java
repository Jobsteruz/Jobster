package com.smartbox.jobster.bot.whatsapp.consumer;

import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.consumer.questionnaire.AbstractWhatsappQuestionConsumer;
import com.smartbox.jobster.bot.whatsapp.producer.WhatsappStarterProducer;
import com.smartbox.jobster.bot.whatsapp.producer.questionnaire.WhatsappNextQuestionProducer;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.questionnaire.QuestionAnswer;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.questionnaire.StandardQuestionnaireEntity;
import com.smartbox.jobster.entity.ref.ParentRef;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.entity.whatsapp.WAUserState;
import jakarta.persistence.Entity;

import java.util.UUID;

public class WhatsappVacancyConsumer extends AbstractWhatsappQuestionConsumer {

    public WhatsappVacancyConsumer(WhatsappContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private <T extends ParentRef> void makeQuestionAnswerBefore(Question question, T ref) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
