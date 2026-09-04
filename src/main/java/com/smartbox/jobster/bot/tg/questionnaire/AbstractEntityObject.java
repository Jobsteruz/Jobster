package com.smartbox.jobster.bot.tg.questionnaire;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.MenuBackProducer;
import com.smartbox.jobster.bot.tg.producer.StartProducer;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.questionnaire.QuestionAnswer;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.questionnaire.StandardQuestionnaireEntity;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.Format;
import com.smartbox.jobster.entity.tg.TgUserState;
import jakarta.persistence.Entity;
import org.apache.commons.beanutils.PropertyUtils;

import java.util.UUID;

public abstract class AbstractEntityObject<T extends JbEntity<UUID>> extends AbstractBotObject {

    public AbstractEntityObject(BotContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected Object consume(String qnrKey, Class<T> entityClass) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public abstract T t();

    public QuestionAnswer makeQuestionAnswer(Question question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setEntityProperty(Question question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
