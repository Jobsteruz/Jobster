package com.smartbox.jobster.service.cvparser;

import com.smartbox.jobster.config.caching.RedisCacheNames;
import com.smartbox.jobster.entity.hrm.Education;
import com.smartbox.jobster.entity.hrm.Experience;
import com.smartbox.jobster.entity.ref.Language;
import io.jmix.core.DataManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Loads reference-data lists used by the CV parser fuzzy-matcher (Language, Education level,
 * Experience level). Extracted into a dedicated bean so that {@link ResumeParserService} can
 * invoke these methods through the Spring AOP proxy — self-invocation within a single bean
 * bypasses the proxy and silently defeats {@link Cacheable}.
 * <p>
 * All three tables are {@code @TenantId}-scoped, so every method takes the tenant purely as a
 * cache key: the queries themselves are already filtered by Jmix multitenancy, but without the
 * key the first tenant to warm a cache served its own reference rows to every other tenant for
 * the rest of the entry's lifetime.
 */
@Component
public class CvParserRefDataLoader {

    private final DataManager dataManager;

    public CvParserRefDataLoader(DataManager dataManager) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = RedisCacheNames.CV_PARSER_LANGUAGES, key = "#tenantId",
            cacheManager = "hazelcastCacheManager")
    public List<Language> loadAllLanguages(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = RedisCacheNames.CV_PARSER_EDUCATION_LEVELS, key = "#tenantId",
            cacheManager = "hazelcastCacheManager")
    public List<Education> loadAllEducationLevels(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = RedisCacheNames.CV_PARSER_EXPERIENCE_LEVELS, key = "#tenantId",
            cacheManager = "hazelcastCacheManager")
    public List<Experience> loadAllExperienceLevels(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
