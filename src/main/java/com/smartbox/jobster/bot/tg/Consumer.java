package com.smartbox.jobster.bot.tg;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bot.tg.attendance.AttendanceOvertimeConsumer;
import com.smartbox.jobster.bot.tg.auth.LoginConsumer;
import com.smartbox.jobster.bot.tg.auth.LoginTypeConsumer;
import com.smartbox.jobster.bot.tg.auth.LogoutConsumer;
import com.smartbox.jobster.bot.tg.auth.VerificationConsumer;
import com.smartbox.jobster.bot.tg.branch.BranchListConsumer;
import com.smartbox.jobster.bot.tg.branch.NearestBranchConsumer;
import com.smartbox.jobster.bot.tg.consumer.*;
import com.smartbox.jobster.bot.tg.manager.ManagerPersonCommentConsumer;
import com.smartbox.jobster.bot.tg.manager.consumer.ManagerConsumer;
import com.smartbox.jobster.bot.tg.questionnaire.*;
import com.smartbox.jobster.bot.tg.survey.consumer.TypedAnswerConsumer;
import com.smartbox.jobster.bot.tg.zpcast.ZPCastConsumer;
import com.smartbox.jobster.entity.tg.LoginType;
import com.smartbox.jobster.entity.tg.Menu;
import com.smartbox.jobster.entity.tg.TgUserState;
import com.smartbox.jobster.service.tg.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * @author Jobster team
 * Since: 8/14/2023 5:07 PM
 */
public interface Consumer {

    Logger log = LoggerFactory.getLogger(Consumer.class);
    String START = "/start";
    String RESTART = "/restart";
    String LOGIN = "/login";
    String LOGOUT = "/logout";
    String LOGIN_TYPE = "/start login_type=";
    String START_LOGIN = "/start login";
    String PERSON = "/start person_";
    String REGION = "/start region_";
    String DEPARTMENT = "/start department_";
    String CATEGORY = "/start category_";
    String BRANCH = "/start branch_";
    String VACANCY = "/start vacancy_";
    String SOURCE = "/start source_";
    String UTM_SOURCE = "/start utm_source=";
    String MENU_LINK = "/start menu_";

    static Consumer consumer(BotContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    Object consume();
}
