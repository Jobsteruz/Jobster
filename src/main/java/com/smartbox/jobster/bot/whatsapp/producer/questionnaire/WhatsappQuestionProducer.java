package com.smartbox.jobster.bot.whatsapp.producer.questionnaire;

import com.smartbox.jobster.bot.whatsapp.InlineExceededException;
import com.smartbox.jobster.bot.whatsapp.InlineMarkup;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.producer.WhatsappMenuBackProducer;
import com.smartbox.jobster.bot.whatsapp.producer.WhatsappProducer;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.questionnaire.QuestionBotType;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.questionnaire.RequestButton;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.whatsapp.WAUserState;
import com.whatsapp.api.domain.messages.Body;
import com.whatsapp.api.domain.messages.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

public class WhatsappQuestionProducer extends AbstractWhatsappQuestionObject implements WhatsappProducer {

    private static final Logger log = LoggerFactory.getLogger(WhatsappQuestionProducer.class);
    protected Question question;


    public WhatsappQuestionProducer(WhatsappContext context, Questionnaire questionnaire) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public WhatsappQuestionProducer(WhatsappContext context, Question question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public Question question() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Body getMessageBody() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendQuestionMessage() throws InlineExceededException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
