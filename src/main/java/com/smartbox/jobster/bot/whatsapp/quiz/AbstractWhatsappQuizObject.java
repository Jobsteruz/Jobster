package com.smartbox.jobster.bot.whatsapp.quiz;

import com.smartbox.jobster.bot.whatsapp.AbstractWhatsappService;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.producer.WhatsappData;
import com.smartbox.jobster.entity.quiz.QuizQuestion;
import com.whatsapp.api.domain.messages.Body;

public class AbstractWhatsappQuizObject extends AbstractWhatsappService {
    private final WhatsappContext botContext;

    public AbstractWhatsappQuizObject(WhatsappContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public WhatsappContext getBotContext() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public QuizQuestion quizQuestion() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Body getMessageBody() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


}
