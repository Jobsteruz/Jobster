package com.smartbox.jobster.bot.tg;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.DeleteMessage;
import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bean.TgMessageIdsCache;
import com.smartbox.jobster.bot.tg.attendance.AttendanceConsumer;
import com.smartbox.jobster.bot.tg.attendance.AttendanceData;
import com.smartbox.jobster.bot.tg.checklist.FinishTaskConsumer;
import com.smartbox.jobster.bot.tg.checklist.TaskConsumer;
import com.smartbox.jobster.bot.tg.checklist.TaskData;
import com.smartbox.jobster.bot.tg.consumer.LanguageConsumer;
import com.smartbox.jobster.bot.tg.consumer.MenuConsumer;
import com.smartbox.jobster.bot.tg.event.EventCancelReasonConsumer;
import com.smartbox.jobster.bot.tg.event.EventData;
import com.smartbox.jobster.bot.tg.event.EventResponseConsumer;
import com.smartbox.jobster.bot.tg.event.ManagerEventResponseConsumer;
import com.smartbox.jobster.bot.tg.manager.ManagerData;
import com.smartbox.jobster.bot.tg.manager.ManagerPositionConsumer;
import com.smartbox.jobster.bot.tg.manager.consumer.*;
import com.smartbox.jobster.bot.tg.questionnaire.QuestionnaireConsumer;
import com.smartbox.jobster.bot.tg.quiz.*;
import com.smartbox.jobster.bot.tg.schedule.ScheduleData;
import com.smartbox.jobster.bot.tg.schedule.ScheduleTimeConsumer;
import com.smartbox.jobster.bot.tg.schedule.ScheduleWeekConsumer;
import com.smartbox.jobster.bot.tg.survey.SurveyData;
import com.smartbox.jobster.bot.tg.survey.consumer.AnswerConsumer;
import com.smartbox.jobster.bot.tg.survey.consumer.FinishSurveyConsumer;
import com.smartbox.jobster.bot.tg.survey.consumer.InvitationConsumer;
import com.smartbox.jobster.bot.tg.survey.consumer.QuestionConsumer;

import java.util.Collection;

/**
 * @author Jobster team
 * Since: 12/2/2023 1:42 PM
 */
public interface CallbackConsumer extends Consumer {

    static Consumer consumer(BotContext botContext, String callbackData) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    static Consumer managerConsumer(BotContext botContext, String callbackData) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    static Consumer scheduleConsumer(BotContext botContext, String callbackData) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    static Consumer surveyConsumer(BotContext botContext, String callbackData) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    static Consumer quizConsumer(BotContext botContext, String callbackData) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    static Consumer taskConsumer(BotContext botContext, String callbackData) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    static void killOldMessages(BotContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    static void killOldMessages(BotContext botContext, Collection<Integer> tgMessageIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
