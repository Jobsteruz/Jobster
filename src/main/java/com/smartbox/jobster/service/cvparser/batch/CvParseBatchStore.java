package com.smartbox.jobster.service.cvparser.batch;

import com.hazelcast.map.IMap;
import com.smartbox.jobster.config.cvparser.CvBatchProperties;
import com.smartbox.jobster.service.cvparser.batch.dto.CvParseBatch;
import com.smartbox.jobster.service.cvparser.batch.dto.CvParseBatchStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/**
 * Thin wrapper around the distributed {@code cv-parse-batches} Hazelcast map.
 * <p>
 * Mutations go through {@link #update(String, Consumer)} which acquires a per-key
 * {@code IMap.tryLock} with a bounded wait + lease — this serialises concurrent webhook
 * deliveries for the same batch (Parser fans out children in parallel; race is real).
 * <p>
 * Per-put TTL/max-idle values take precedence over the {@code MapConfig} defaults defined in
 * {@code HazelcastConfig.addCvParseBatchesConfig(...)} because we run as a Hazelcast client —
 * server-side {@code MapConfig} only applies when the backend hosts the member.
 */
@Component
public class CvParseBatchStore {

    private static final Logger log = LoggerFactory.getLogger(CvParseBatchStore.class);

    private static final long LOCK_WAIT_SECONDS = 10L;
    private static final long LOCK_LEASE_SECONDS = 30L;

    private final IMap<String, CvParseBatch> batchesMap;
    private final CvBatchProperties properties;

    public CvParseBatchStore(@Qualifier("cvParseBatchesMap") IMap<String, CvParseBatch> batchesMap,
                             CvBatchProperties properties) {
        this.batchesMap = batchesMap;
        this.properties = properties;
    }

    public void put(CvParseBatch batch) {
        // IMap.set() is preferred over put() when the previous value is not needed — it
        // skips the return-value serialisation round-trip. See Hazelcast performance notes.
        batchesMap.set(batch.getBatchId(), batch,
                properties.batchTtlSecondsOrDefault(), TimeUnit.SECONDS,
                properties.batchMaxIdleSecondsOrDefault(), TimeUnit.SECONDS);
    }

    public CvParseBatch get(String batchId) {
        return batchesMap.get(batchId);
    }

    public void remove(String batchId) {
        batchesMap.remove(batchId);
    }

    /**
     * Apply {@code mutator} under a lock; safe against concurrent webhook fan-in.
     *
     * @return the mutated batch, or {@code null} when the batch is missing / lock not acquired.
     */
    public CvParseBatch update(String batchId, Consumer<CvParseBatch> mutator) {
        boolean locked;
        try {
            locked = batchesMap.tryLock(batchId,
                    LOCK_WAIT_SECONDS, TimeUnit.SECONDS,
                    LOCK_LEASE_SECONDS, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            log.warn("Interrupted acquiring lock for cv-parse batch {}", batchId);
            return null;
        }
        if (!locked) {
            log.warn("Could not acquire lock for cv-parse batch {} within {}s", batchId, LOCK_WAIT_SECONDS);
            return null;
        }
        try {
            CvParseBatch batch = batchesMap.get(batchId);
            if (batch == null) {
                log.warn("Attempted to update missing cv-parse batch: {}", batchId);
                return null;
            }
            mutator.accept(batch);
            put(batch);
            return batch;
        } finally {
            batchesMap.unlock(batchId);
        }
    }

    public void updateStatus(String batchId, CvParseBatchStatus status) {
        update(batchId, batch -> batch.setStatus(status));
    }

    public void setError(String batchId, String error) {
        update(batchId, batch -> {
            batch.setError(error);
            batch.setStatus(CvParseBatchStatus.FAILED);
            batch.setFinishedAt(java.time.Instant.now());
        });
    }
}
