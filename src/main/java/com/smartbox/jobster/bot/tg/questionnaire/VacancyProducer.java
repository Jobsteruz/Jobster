package com.smartbox.jobster.bot.tg.questionnaire;


import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.MenuBackProducer;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.bot.tg.producer.StartProducer;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.questionnaire.QuestionAnswer;
import com.smartbox.jobster.entity.questionnaire.StandardQuestionnaireEntity;
import com.smartbox.jobster.entity.ref.ParentRef;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.Format;
import jakarta.persistence.Entity;

/**
 * @author Jobster team
 * Since: 9/10/2024 1:06 PM
 */
public class VacancyProducer extends AbstractEntityObject<Vacancy> implements Producer {
    Vacancy vacancy;
    Question question;
    boolean byLink = false;

    public VacancyProducer(BotContext botContext, String vacancyId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public VacancyProducer(BotContext botContext, String vacancyId, boolean byLink) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private <T extends ParentRef> void makeQuestionAnswerBefore(Question question, T ref) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Vacancy t() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
