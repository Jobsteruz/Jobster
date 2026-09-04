package com.smartbox.jobster.bot.tg.quiz;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.CallbackConsumer;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.entity.quiz.QuizPerson;
import com.smartbox.jobster.entity.quiz.QuizPersonQuestion;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.Format;

public class FinishQuizProducer extends AbstractBotObject implements Producer {
    QuizPerson quizPerson;
    boolean alreadyFinished;

    public FinishQuizProducer(BotContext botContext, QuizPerson quizPerson, boolean alreadyFinished) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
