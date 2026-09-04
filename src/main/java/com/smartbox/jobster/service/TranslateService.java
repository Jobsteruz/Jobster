package com.smartbox.jobster.service;

import com.smartbox.jobster.bean.local_cache.TranslateCache;
import com.smartbox.jobster.config.caching.RedisCacheNames;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.ref.Translate;
import io.jmix.core.DataManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TranslateService {
    private static final Logger log = LoggerFactory.getLogger(TranslateService.class);

    @Autowired
    private DataManager dataManager;
    @Qualifier("hazelcastCacheManager")
    @Autowired
    private CacheManager cacheManager;
    @Autowired
    private LocalCacheService localCacheService;

    public void cacheEvict() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void cacheEvictTranslate(JbEntity<UUID> entity, String field, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String translate(JbEntity<UUID> entity, String field, String locale, String source) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Translate> getTranslates(UUID entityId, String entityField) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
