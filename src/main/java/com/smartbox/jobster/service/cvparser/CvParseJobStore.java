package com.smartbox.jobster.service.cvparser;

import com.hazelcast.map.IMap;
import com.smartbox.jobster.service.cvparser.dto.CvParseJob;
import com.smartbox.jobster.service.cvparser.dto.CvParseJobStatus;
import com.smartbox.jobster.service.cvparser.dto.ResumeParserResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

@Component
public class CvParseJobStore {

    private static final Logger log = LoggerFactory.getLogger(CvParseJobStore.class);

    // Per-put TTL is authoritative in Hazelcast client mode. The matching MapConfig in
    // HazelcastConfig serves as a server-side default when the backend runs as a member.
    private static final long JOB_TTL_SECONDS = 3600L;
    private static final long JOB_MAX_IDLE_SECONDS = 1800L;
    private static final long LOCK_WAIT_SECONDS = 10L;
    private static final long LOCK_LEASE_SECONDS = 30L;

    private final IMap<String, CvParseJob> jobsMap;

    public CvParseJobStore(@Qualifier("cvParseJobsMap") IMap<String, CvParseJob> jobsMap) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void put(CvParseJob job) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public CvParseJob get(String jobId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Optional<CvParseJob> findActiveByApplicant(UUID applicantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void remove(String jobId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean update(String jobId, Consumer<CvParseJob> mutator) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void updateStatus(String jobId, CvParseJobStatus status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setExternalJobId(String jobId, String externalJobId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setParsedData(String jobId, ResumeParserResponse data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setError(String jobId, String error) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
