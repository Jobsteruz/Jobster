package com.smartbox.jobster.service;

import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.Setting;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.service.tg.BotService;
import io.jmix.core.Messages;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class SettingTypeService {
    private final BotService botService;
    private final Messages messages;
    private final TranslateService translateService;


    public String translateSettingType(SettingType type, Bot bot, Language language) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Memoized variant for loops that render the same (type, bot, locale) text for many recipients
     * — the plain variant costs one jb_Setting query per call. The memo is caller-owned and
     * per-run, so setting edits are picked up on the caller's next run (deliberately NOT a shared
     * TTL-less cache).
     */
    public String translateSettingType(SettingType type, Bot bot, Language language, Map<String, String> memo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String translateSetting(Setting setting, SettingType type, Language language) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
