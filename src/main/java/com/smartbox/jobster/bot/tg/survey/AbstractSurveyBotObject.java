package com.smartbox.jobster.bot.tg.survey;

import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.entity.survey.SurveyUser;
import com.smartbox.jobster.service.survey.SurveyAnswerService;
import com.smartbox.jobster.service.survey.SurveyQuestionService;
import com.smartbox.jobster.service.survey.SurveyService;

/**
 * @author Jobster team
 * date: 26/07/24 12:25
 */
public class AbstractSurveyBotObject extends AbstractBotObject {

    private SurveyUser surveyUser;

    private SurveyService surveyService;
    private SurveyAnswerService surveyAnswerService;
    private SurveyQuestionService surveyQuestionService;

    public AbstractSurveyBotObject(BotContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    protected InlineKeyboardButton inlineBtn(String text, String callbackId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected SurveyUser surveyUser() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    protected SurveyService surveyService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected SurveyAnswerService surveyAnswerService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected SurveyQuestionService surveyQuestionService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


}
