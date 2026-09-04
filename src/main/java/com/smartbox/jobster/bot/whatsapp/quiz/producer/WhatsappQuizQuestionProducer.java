package com.smartbox.jobster.bot.whatsapp.quiz.producer;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.whatsapp.InlineMarkup;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.producer.WhatsappData;
import com.smartbox.jobster.bot.whatsapp.producer.WhatsappProducer;
import com.smartbox.jobster.bot.whatsapp.quiz.AbstractWhatsappQuizObject;
import com.smartbox.jobster.entity.quiz.QuizAnswer;
import com.smartbox.jobster.entity.quiz.QuizPerson;
import com.smartbox.jobster.entity.quiz.QuizPersonQuestion;
import com.smartbox.jobster.entity.quiz.QuizQuestion;
import com.smartbox.jobster.entity.ref.SettingType;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class WhatsappQuizQuestionProducer extends AbstractWhatsappQuizObject implements WhatsappProducer {
    QuizPersonQuestion quizPersonQuestion;
    QuizPerson quizPerson;

    public WhatsappQuizQuestionProducer(WhatsappContext botContext, QuizPersonQuestion quizPersonQuestion) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public QuizQuestion quizQuestion() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
