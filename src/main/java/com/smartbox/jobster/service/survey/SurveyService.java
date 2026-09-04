package com.smartbox.jobster.service.survey;

import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;
import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.bot.tg.survey.SurveyData;
import com.smartbox.jobster.bot.tg.survey.producer.SurveyProducer;
import com.smartbox.jobster.controller.open.SurveyView;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.ref.*;
import com.smartbox.jobster.entity.survey.*;
import com.smartbox.jobster.entity.tg.Format;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.service.AutoFillTemplateService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.tg.BotService;
import com.smartbox.jobster.service.tg.TelegramService;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.core.SaveContext;
import io.jmix.core.TimeSource;
import io.jmix.core.security.Authenticated;
import jakarta.persistence.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Locale;
import java.util.Objects;


/**
 * @author Jobster team
 * date: 23/07/24 14:53
 */
@Service
public class SurveyService {

    @Value("${app.url}")
    private String appUrl;

    @Autowired
    private TranslateService translateService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private Messages messages;
    @Autowired
    private BotService botService;
    @Autowired
    private TelegramService telegramService;
    @Autowired
    private AutoFillTemplateService autoFillTemplateService;
    @Autowired
    private TimeSource timeSource;


    @Transactional(readOnly = true)
    public void remindTgSurvey(Survey survey, TgUser tgUser) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public <T extends Person> void sendSurveyInvitation(Survey survey, T person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendSurveyInvitation(Survey survey, TgUser tgUser) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional
    public SurveyUser makeSurveyUser(Survey survey, TgUser tgUser) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    @Nullable
    public SurveyUser getIncompleteSurveyUser(TgUser tgUser) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public <T extends Person> void sendSurveyTemplate(Survey survey, T person, AutoFillTemplate template, Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private AutoFillTemplate generateSurveyLink(SurveyPerson surveyPerson, AutoFillTemplate template) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private <T extends Person> @NotNull SurveyPerson makeSurveyPerson(Survey survey, T person, Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public void saveSurveyNotAuth(SurveyPerson surveyPerson, boolean withQuestions) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
