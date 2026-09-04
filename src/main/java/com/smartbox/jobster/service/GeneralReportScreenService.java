package com.smartbox.jobster.service;

import com.smartbox.jobster.entity.ats.Applicant;
import io.jmix.core.DataManager;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import com.smartbox.jobster.config.replica.UseReplica;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
@RequiredArgsConstructor
@UseReplica
public class GeneralReportScreenService {
    private final DataManager dataManager;


    @CacheEvict(value = "applicantRejectDate", allEntries = true, cacheManager = "hazelcastCacheManager")
    public void cacheEvictApplicantRejectDate() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "applicantRejectDate", key = "#applicant.id", cacheManager = "hazelcastCacheManager")
    public OffsetDateTime getApplicantRejectDate(Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "applicantRejectReason", allEntries = true, cacheManager = "hazelcastCacheManager")
    public void cacheEvictApplicantRejectReason() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "applicantRejectReason", key = "#applicant.id", cacheManager = "hazelcastCacheManager")
    public String getApplicantRejectReason(Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
