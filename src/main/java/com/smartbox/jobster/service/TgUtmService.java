package com.smartbox.jobster.service;

import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.entity.tg.TgUtm;
import com.smartbox.jobster.view.reports.utmsourcereport.UtmSourceFilter;
import io.jmix.core.DataManager;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.data.QueryTransformer;
import io.jmix.data.QueryTransformerFactory;
import lombok.RequiredArgsConstructor;
import com.smartbox.jobster.config.replica.UseReplica;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TgUtmService {

    /** Applicant carrying the same utm tag (source + param) as the TgUtm row. */
    private static final String APPLICANT_JOIN = " join jb_Applicant a on a.tgUser = t.tgUser and a.utmSource = t.source and (a.utmParam = t.param or (a.utmParam is null and t.param is null))";
    /** Total-count query is not grouped by param, so it matches on source only. */
    private static final String APPLICANT_JOIN_BY_SOURCE = " join jb_Applicant a on a.tgUser = t.tgUser and a.utmSource = t.source";
    private static final String HIRED_CONDITION = "a.status = '%s'".formatted(PersonStatus.ACCEPTED.getId());

    private final DataManager dataManager;
    private final QueryTransformerFactory transformerFactory;


    public boolean isNewTgUtm(TgUser tgUser, String source, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public TgUtm getLastTgUtm(TgUser tgUser, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "utmSourceReport", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictUtmSourceReport(UtmSourceFilter filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @UseReplica
    @Cacheable(value = "utmSourceReport", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> getUtmSourceReport(UtmSourceFilter filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "utmSourceReportCount", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictUtmSourceReportCount(UtmSourceFilter filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @UseReplica
    @Cacheable(value = "utmSourceReportCount", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public long getUtmSourceReportCount(UtmSourceFilter filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Conditions on the joined applicant, or {@code null} when no applicant-side filter is on —
     * both flags share one join so that ticking them together cannot duplicate the {@code a} alias.
     */
    @Nullable
    private String applicantCondition(UtmSourceFilter filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
