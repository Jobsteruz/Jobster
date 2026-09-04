package com.smartbox.jobster.service.tg;

import com.pengrad.telegrambot.model.Contact;
import com.pengrad.telegrambot.model.Location;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.producer.StartProducer;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.ref.Setting;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.entity.tg.Format;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.service.TranslateService;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.Messages;
import io.jmix.core.security.Authenticated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;

/**
 * @author Jobster team
 * Date: 9/15/2023 2:33 PM
 */

@Service
public class TgUserService {

    @Autowired
    private DataManager dataManager;
    @Autowired
    private BotService botService;
    @Autowired
    private Messages messages;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private TelegramService telegramService;

    public TgUser getTgUser(Bot bot, Update update) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void loginAsAnEmployee(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public TgUser getByBotIdAndChatId(String botId, Long chatId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public TgUser getByChatId(String chatId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getUserName(Long chatId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isLoggedIn(Bot bot, Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Bulk "is this employee currently logged into a bot" check for list grids. An employee counts as
     * logged in when a TgUser row points at them (set on bot /login via {@link #loginAsAnEmployee},
     * cleared on logout / auto-logout). Returns the subset of the given ids that are logged in — one
     * query, so a grid can render the column without an N+1 per row.
     */
    public Set<UUID> getLoggedInEmployeeIds(Collection<UUID> employeeIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
