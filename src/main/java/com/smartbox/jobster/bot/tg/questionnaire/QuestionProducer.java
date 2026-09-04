package com.smartbox.jobster.bot.tg.questionnaire;

import com.pengrad.telegrambot.model.request.Keyboard;
import com.pengrad.telegrambot.model.request.KeyboardButton;
import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.MenuBackProducer;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.bot.tg.producer.StartProducer;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.questionnaire.QuestionBotType;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.questionnaire.RequestButton;
import com.smartbox.jobster.entity.questionnaire.StandardQuestionnaireEntity;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.entity.tg.Format;
import com.smartbox.jobster.entity.tg.TgUserState;
import org.apache.commons.beanutils.PropertyUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @author Jobster team
 * Since: 2/26/2024 10:48 AM
 */
public class QuestionProducer extends AbstractQuestionObject implements Producer {
    Question question;

    /** Avtomatik tanlash davom etayotgani - qarang {@link #getKeyboard()}. */
    private boolean autoSelecting;

    public QuestionProducer(BotContext botContext, Questionnaire questionnaire) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public QuestionProducer(BotContext botContext, Question question) {
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
     * "Bitta variant qolsa, avtomatik tanlash" yoqilgan savolni foydalanuvchiga ko'rsatmasdan javoblaydi
     * va keyingi savolga o'tadi. Savol odatdagidek so'ralishi kerak bo'lsa null qaytaradi.
     * <p>
     * Bo'lim/region kabi daraxtsimon savolda {@code getNextQuestion} o'sha savolning o'zini qaytaradi -
     * bu keyingi darajaga tushish degani, shuning uchun sikl davom etadi.
     */
    private Object autoSelect() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setEntityProperty(Object value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendRequestBtnMessage() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Keyboard getKeyboard() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
