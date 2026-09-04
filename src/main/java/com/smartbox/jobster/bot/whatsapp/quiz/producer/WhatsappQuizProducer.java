package com.smartbox.jobster.bot.whatsapp.quiz.producer;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.whatsapp.InlineExceededException;
import com.smartbox.jobster.bot.whatsapp.InlineMarkup;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.producer.WhatsappData;
import com.smartbox.jobster.bot.whatsapp.producer.WhatsappProducer;
import com.smartbox.jobster.bot.whatsapp.quiz.AbstractWhatsappQuizObject;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.quiz.Quiz;
import com.smartbox.jobster.entity.quiz.QuizPerson;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.whatsapp.WAUserState;
import com.whatsapp.api.domain.messages.Body;

import java.util.LinkedList;
import java.util.List;

public class WhatsappQuizProducer extends AbstractWhatsappQuizObject implements WhatsappProducer {
    QuizPerson quizPerson;

    String message;

    public WhatsappQuizProducer(WhatsappContext context, QuizPerson quizPerson) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Body getMessageBody() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
