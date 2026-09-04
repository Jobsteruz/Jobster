package com.smartbox.jobster.bot.tg.consumer;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.MenuBackProducer;
import com.smartbox.jobster.bot.tg.attendance.AttendanceProducer;
import com.smartbox.jobster.bot.tg.auth.LoginProducer;
import com.smartbox.jobster.bot.tg.branch.BranchListProducer;
import com.smartbox.jobster.bot.tg.branch.NearestBranchProducer;
import com.smartbox.jobster.bot.tg.manager.producer.ManagerProducer;
import com.smartbox.jobster.bot.tg.producer.*;
import com.smartbox.jobster.bot.tg.questionnaire.CheckUpProducer;
import com.smartbox.jobster.bot.tg.questionnaire.QuestionProducer;
import com.smartbox.jobster.bot.tg.request.RequestProducer;
import com.smartbox.jobster.bot.tg.zpcast.ZPCastProducer;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.questionnaire.StandardQuestionnaireEntity;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.Format;
import com.smartbox.jobster.entity.tg.Menu;
import com.smartbox.jobster.entity.tg.PostType;
import com.smartbox.jobster.service.person.PersonActionService;

import java.util.List;

/**
 * @author Jobster team
 * Since: 12/3/2023 3:31 PM
 */
public class MenuConsumer extends AbstractBotObject implements Consumer {
    Menu menu;

    public MenuConsumer(BotContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public MenuConsumer(BotContext botContext, String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public MenuConsumer(BotContext botContext, Menu menu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean hasMatchingMenu() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean findMenu(Menu currentMenu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
