package com.smartbox.jobster.service.tg;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.Setting;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.*;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.TranslateService;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TgChannelService {

    private final BotService botService;
    private final TranslateService translateService;
    private final TelegramService telegramService;
    private final DataManager dataManager;
    private final Messages messages;
    private final EntityService entityService;


    public void sendVacancyInfo(Collection<Bot> bots, Vacancy vacancy, Position position) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendVacancyInfo(TgChannel channel, Vacancy vacancy, Position position) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String getConditions(String responsibility, JbEntity<UUID> entity, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<TgChannel> getChannels(Collection<Bot> bots) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<TgChannel> getChannelsByBotIds(Collection<UUID> bots) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
