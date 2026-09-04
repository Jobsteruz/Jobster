package com.smartbox.jobster.service;

import com.hazelcast.core.DistributedObject;
import com.hazelcast.core.HazelcastInstance;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.config.caching.RedisCacheNames;
import io.jmix.core.Messages;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author Jobster team
 * date: 08/07/24 12:46
 */

@Service("jb_GeneralCacheManagerService")
public class GeneralCacheManagerService {

    @Autowired
    private Messages messages;
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private HazelcastInstance hazelcastInstance;
    @Autowired
    private TranslateService translateService;

    public void flushAll() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    // key - cacheManager
    // value - cache names
    public Map<String, Collection<String>> getAllCacheNames() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull Map<String, Collection<String>> extractUnprotectedCaches(Map<String, Collection<String>> cacheManagerMap) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean clearCacheWithCheck(String cacheManagerName, String cacheName) throws IllegalCacheAccessException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void checkProtectedCache(String cacheManagerName, String cacheName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean clearCache(String cacheManagerName, String cacheName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static class IllegalCacheAccessException extends RuntimeException {
        public IllegalCacheAccessException(String message) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }
}
