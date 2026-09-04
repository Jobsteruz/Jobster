package com.smartbox.jobster.service.tg;

import com.pengrad.telegrambot.model.Update;
import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.config.caching.RedisCacheNames;
import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.entity.company.CompanyStatus;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.ref.Setting;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.entity.tg.Format;
import com.smartbox.jobster.entity.tg.PostType;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.pojo.JobsterBot;
import com.smartbox.jobster.service.CompanyService;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static java.util.Locale.forLanguageTag;

/**
 * @author Jobster team
 * Date: 9/15/2023 2:38 PM
 */

@Service
public class BotService {
    private static final Logger log = LoggerFactory.getLogger(BotService.class);

    @Value("${bot.url}")
    private String botUrl;

    @Autowired
    private DataManager dataManager;
    @Autowired
    private TgUserService tgUserService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private TelegramService telegramService;
    @Autowired
    private Messages messages;
    @Qualifier("hazelcastCacheManager")
    @Autowired
    private CacheManager cacheManager;

    public Boolean botStatus(UUID botId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CachePut(value = RedisCacheNames.BOT_STATUS, key = "#botId", cacheManager = "hazelcastCacheManager")
    public Boolean cachePutBotStatus(UUID botId, Boolean status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = RedisCacheNames.BOT_STATUS, key = "#botId", cacheManager = "hazelcastCacheManager")
    public void cacheEvictBotStatus(UUID botId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean startBot(Bot bot) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean stopBot(Bot bot) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void processUpdate(Bot bot, Update update) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = RedisCacheNames.BOTS, key = "#botId", cacheManager = "hazelcastCacheManager")
    public Bot getById(UUID botId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = RedisCacheNames.BOTS, key = "#botId", cacheManager = "hazelcastCacheManager")
    public void cacheEvictBot(UUID botId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Setting getSettingByType(Bot bot, SettingType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Setting getSettingByType(Questionnaire questionnaire, SettingType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Bot getZpCastBot() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
