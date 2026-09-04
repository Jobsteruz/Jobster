package com.smartbox.jobster.bot.tg.questionnaire;

import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.MenuBackProducer;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.entity.questionnaire.Question;

/**
 * @author Jobster team
 * Since: 2/26/2024 12:50 PM
 */
public class QuestionBackProducer extends AbstractQuestionObject implements Producer {
    Question question;

    public QuestionBackProducer(BotContext botContext, Question question) {
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

    /**
     * Avtomatik tanlanadigan savollarni ortga qarab ham o'tkazib yuboradi: aks holda "Orqaga" bosilganda
     * {@link QuestionProducer} o'sha savolni yana avtomatik javoblab, foydalanuvchini shu yerga
     * qaytarardi va ortga qaytishning iloji bo'lmasdi.
     */
    private Question prevQuestion() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
