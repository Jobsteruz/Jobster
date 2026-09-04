package com.smartbox.jobster.service.whatsapp;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.consumer.WhatsappConsumer;
import com.smartbox.jobster.bot.whatsapp.producer.WhatsappProducer;
import com.smartbox.jobster.config.caching.RedisCacheNames;
import com.smartbox.jobster.entity.config.NetworkSettings;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.ref.WhatsappSetting;
import com.smartbox.jobster.entity.whatsapp.WhatsappBot;
import com.smartbox.jobster.entity.whatsapp.WhatsappUser;
import com.smartbox.jobster.service.CompanyService;
import com.whatsapp.api.domain.webhook.Message;
import io.jmix.appsettings.AppSettings;
import io.jmix.core.DataManager;
import io.jmix.core.security.Authenticated;
import io.jmix.core.security.SystemAuthenticator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WhatsappBotService {
    private static final Logger log = LoggerFactory.getLogger(WhatsappBotService.class);

    @Autowired
    private CompanyService companyService;

    @Autowired
    private SystemAuthenticator systemAuthenticator;

    @Autowired
    private DataManager dataManager;

    @Autowired
    private WhatsappUserService whatsappUserService;

    @Autowired
    private AppSettings appSettings;

    public WhatsappBot getBot(String phoneNumberId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Authenticated
    public void processUpdate(Message message, String botPhoneNumberId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void processUpdateInternal(Message message, WhatsappBot bot) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public WhatsappSetting getSettingByType(WhatsappBot bot, SettingType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Cacheable(value = RedisCacheNames.NETWORK_SETTINGS_CACHE, key = "#root.methodName", cacheManager = "hazelcastCacheManager", unless = "#result == null")
    public String getWhatsappProxyServerHost() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getTenantByVerifyToken(String verifyToken) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public WhatsappBot getWhatsappBot() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
