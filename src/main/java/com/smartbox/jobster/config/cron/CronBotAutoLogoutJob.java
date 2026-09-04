package com.smartbox.jobster.config.cron;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.producer.StartProducer;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.tg.AutoLogout;
import com.smartbox.jobster.entity.tg.TgUser;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import io.jmix.core.security.Authenticated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;
import java.util.List;

@Component("jb_CronBotAutoLogoutJob")
@ConditionalOnProperty("spring.rabbitmq.listen")
public class CronBotAutoLogoutJob {
    @Autowired
    private DataManager dataManager;

    @Authenticated
    @Scheduled(cron = "0 0 0 * * ?", zone = "Asia/Tashkent", scheduler = "botAutoLogoutScheduled")
    public void runJob() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void logout(TgUser tgUser, SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateUser(TgUser tgUser, SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void startMsg(TgUser tgUser) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<TgUser> loadTgUser() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
