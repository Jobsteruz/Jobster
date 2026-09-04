package com.smartbox.jobster.bot.tg.survey.producer;

import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;
import com.pengrad.telegrambot.model.request.Keyboard;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.BotData;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.bot.tg.survey.AbstractSurveyBotObject;
import com.smartbox.jobster.bot.tg.survey.SurveyData;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.survey.SurveyAnswer;
import com.smartbox.jobster.entity.survey.SurveyQuestion;
import com.smartbox.jobster.entity.survey.SurveyUser;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.entity.tg.TgUserState;
import com.smartbox.jobster.service.TranslateService;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Jobster team
 * date: 24/07/24 19:10
 */
public class SurveyProducer extends AbstractSurveyBotObject implements Producer {

    private final SurveyUser surveyUser;
    private final SurveyQuestion question;
    private final TranslateService translateService;

    public SurveyProducer(BotContext botContext, SurveyUser surveyUser) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public SurveyProducer(BotContext botContext, SurveyUser surveyUser, SurveyQuestion question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Keyboard getKeyboard() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private InlineKeyboardButton makeSurveyInlineKeyboard(SurveyAnswer answer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void makeExtraButtons(InlineKeyboardMarkup keyboard) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
