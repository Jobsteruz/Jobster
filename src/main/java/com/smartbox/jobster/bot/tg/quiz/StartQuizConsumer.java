package com.smartbox.jobster.bot.tg.quiz;

import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.entity.quiz.Quiz;
import com.smartbox.jobster.entity.quiz.QuizPerson;
import com.smartbox.jobster.entity.quiz.QuizPersonQuestion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class StartQuizConsumer extends AbstractBotObject implements Consumer {
    Logger log = LoggerFactory.getLogger(StartQuizConsumer.class);
    QuizPerson quizPerson = null;

    public StartQuizConsumer(BotContext botContext, String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
