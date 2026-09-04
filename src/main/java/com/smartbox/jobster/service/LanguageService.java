package com.smartbox.jobster.service;

import com.smartbox.jobster.$;
import com.smartbox.jobster.config.caching.RedisCacheNames;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.core.PersonLanguage;
import com.smartbox.jobster.entity.ref.Language;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.security.Authenticated;
import io.jmix.multitenancy.core.TenantProvider;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

/**
 * @author Jobster team
 * Since: 12/2/2023 1:20 PM
 */
@Service
public class LanguageService {

    @Autowired
    private DataManager dataManager;
    @Autowired
    private TenantProvider tenantProvider;

    public List<Language> getLanguages(boolean translatable) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Language> getLanguages(String tenantId, boolean translatable) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Language> getLanguagesNotVisible(String tenantId,boolean translatable) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "allLocales", key = "#tenantId + '_' + #translatable", cacheManager = "hazelcastCacheManager")
    public void cacheEvictGetLocales(String tenantId, boolean translatable) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "allLocales", key = "#tenantId + '_' + #translatable", cacheManager = "hazelcastCacheManager")
    public List<String> getLocales(String tenantId, boolean translatable) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean hasDefaultLanguage() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getDefaultLocale() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Language getLanguageByName(String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Language getLanguageByLocaleForExtension(String tenant, Locale locale, String languageName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public Language getLanguageByLocale(String tenant, Locale locale, String languageName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static final Locale[] DISPLAY_LOCALES = {
            Locale.getDefault(), Locale.forLanguageTag("ru"), Locale.ENGLISH, Locale.forLanguageTag("uz")
    };

    /**
     * Language name orqali localini topib qaytaradi, agar mavjud bo'lmasa null qaytadi.
     * Til nomi inglizcha, ruscha yoki o'zbekcha bo'lishi mumkin (masalan: "English", "Английский").
     *
     * @param languageName Language name
     * @return The locale found or null
     */
    public Locale getLocaleByLanguageName(String languageName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Language getLanguageByLocale(String locale, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public PersonLanguage getOrCreateByLanguage(Person person, Language language) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
