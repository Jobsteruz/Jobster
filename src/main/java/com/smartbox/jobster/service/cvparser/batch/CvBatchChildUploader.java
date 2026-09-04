package com.smartbox.jobster.service.cvparser.batch;

import com.smartbox.jobster.config.cvparser.CvBatchAsyncConfig;
import com.smartbox.jobster.config.cvparser.ResumeParserProperties;
import com.smartbox.jobster.service.cvparser.CvFilePersister;
import com.smartbox.jobster.service.cvparser.CvParseJobStore;
import com.smartbox.jobster.service.cvparser.ResumeParserClient;
import com.smartbox.jobster.service.cvparser.ResumeParserException;
import com.smartbox.jobster.service.cvparser.dto.CvParseJob;
import com.smartbox.jobster.service.cvparser.dto.CvParseJobStatus;
import io.jmix.core.FileRef;
import io.jmix.core.security.SystemAuthenticator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Per-file upload worker for the V2 batch pipeline.
 * <p>
 * Deliberately a sibling (not a subclass) of {@code CvParserUploader} so batch work runs on a
 * dedicated, 4-thread executor ({@link CvBatchAsyncConfig#CV_BATCH_UPLOAD_EXECUTOR}). This
 * prevents a big batch from starving the single-applicant V2 flow — and vice versa — and caps
 * concurrent outbound requests to the parser so its internal RabbitMQ workers aren't flooded
 * when several tenants upload ZIPs at the same time.
 * <p>
 * Every upload runs under {@code SystemAuthenticator.runWithUser(principal, ...)} so the Jmix
 * tenant context is restored inside the async thread — otherwise downstream auditing and
 * {@code @TenantId} filters would see an anonymous user.
 */
@Component
@ConditionalOnBean(ResumeParserClient.class)
public class CvBatchChildUploader {

    private static final Logger log = LoggerFactory.getLogger(CvBatchChildUploader.class);

    private final ResumeParserClient parserClient;
    private final ResumeParserProperties parserProperties;
    private final CvParseJobStore jobStore;
    private final SystemAuthenticator systemAuthenticator;
    private final CvFilePersister cvFilePersister;
    /** Lazy to break a cycle: aggregator → uploader would otherwise appear on boot. */
    private final ObjectProvider<CvBatchAggregator> aggregatorProvider;

    public CvBatchChildUploader(ResumeParserClient parserClient,
                                ResumeParserProperties parserProperties,
                                CvParseJobStore jobStore,
                                SystemAuthenticator systemAuthenticator,
                                CvFilePersister cvFilePersister,
                                @Lazy ObjectProvider<CvBatchAggregator> aggregatorProvider) {
        this.parserClient = parserClient;
        this.parserProperties = parserProperties;
        this.jobStore = jobStore;
        this.systemAuthenticator = systemAuthenticator;
        this.cvFilePersister = cvFilePersister;
        this.aggregatorProvider = aggregatorProvider;
    }

    /**
     * Submit one batch child CV to the parser asynchronously. Never throws from the async path —
     * upload failures land in {@link CvParseJobStore#setError} so the webhook aggregator can
     * fan-in the outcome like a normal parser failure.
     */
    @Async(CvBatchAsyncConfig.CV_BATCH_UPLOAD_EXECUTOR)
    public void uploadChildAsync(String jobId, byte[] fileContent) {
        MDC.put("jobId", jobId);
        try {
            CvParseJob job = jobStore.get(jobId);
            if (job == null) {
                log.warn("Cannot upload batch child — job {} not found in store", jobId);
                return;
            }
            if (job.getBatchId() != null) {
                MDC.put("batchId", job.getBatchId());
            }

            String principal = job.getPrincipalName();
            try {
                if (principal == null || principal.isEmpty()) {
                    uploadInternal(job, fileContent);
                } else {
                    systemAuthenticator.runWithUser(principal, () -> uploadInternal(job, fileContent));
                }
            } catch (Exception e) {
                log.error("Async batch upload failed for job {}", jobId, e);
                failAndNotifyBatch(jobId, "Upload failed: " + e.getMessage());
            }
        } finally {
            MDC.remove("jobId");
            MDC.remove("batchId");
        }
    }

    private void uploadInternal(CvParseJob job, byte[] fileContent) {
        String jobId = job.getJobId();
        jobStore.updateStatus(jobId, CvParseJobStatus.UPLOADING);

        // Persist the original CV before sending it to the parser so the apply path can attach
        // it as a RESUME PersonDocument. Best-effort — a storage failure must not block parsing.
        FileRef cvFile = cvFilePersister.persist(job, fileContent);
        if (cvFile != null && !cvFile.equals(job.getCvFile())) {
            jobStore.update(jobId, j -> j.setCvFile(cvFile));
        }

        try {
            String callbackUrl = parserProperties.callbackBaseUrl()
                    + "/webhook-response/cv-parser/" + jobId;

            String externalJobId = parserClient.uploadAsync(fileContent, job.getFilename(), callbackUrl);

            jobStore.update(jobId, j -> {
                j.setExternalJobId(externalJobId);
                j.setStatus(CvParseJobStatus.PARSING);
            });

            log.info("Batch CV '{}' uploaded to parser, externalJobId={}, jobId={}, batchId={}",
                    job.getFilename(), externalJobId, jobId, job.getBatchId());
        } catch (ResumeParserException e) {
            log.error("Parser upload failed for batch child '{}' (job {}): {}",
                    job.getFilename(), jobId, e.getMessage());
            failAndNotifyBatch(jobId, "Parser upload failed: " + e.getMessage());
        } catch (Exception e) {
            log.error("Unexpected error uploading batch child '{}' (job {})",
                    job.getFilename(), jobId, e);
            failAndNotifyBatch(jobId, "Unexpected error: " + e.getMessage());
        }
    }

    /**
     * Mark a batch child failed <em>and</em> notify the aggregator directly. When an upload
     * fails there is no webhook to tie off the child's contribution to the batch counters — if we
     * only called {@code jobStore.setError} the batch would sit in PARSING forever and never
     * reach a terminal state.
     * <p>
     * <b>Executor note:</b> this path runs on {@code CV_BATCH_UPLOAD_EXECUTOR} (4 threads). The
     * aggregator call it triggers is always a <em>parse-failed</em> fan-in (child status is
     * {@link CvParseJobStatus#FAILED}), so it never invokes the transactional
     * {@code autoApplyBatchFields} that a COMPLETED webhook would. The work kept on this pool is
     * therefore O(ms) — safe to keep inline. If future changes route COMPLETED events through
     * here, dispatch them via {@code ApplicationEventPublisher} or a separate executor so parser
     * upload throughput stays decoupled from DB latency.
     */
    private void failAndNotifyBatch(String jobId, String error) {
        jobStore.setError(jobId, error);
        CvParseJob reloaded = jobStore.get(jobId);
        if (reloaded == null || reloaded.getBatchId() == null) return;
        CvBatchAggregator aggregator = aggregatorProvider.getIfAvailable();
        if (aggregator == null) {
            log.debug("Aggregator unavailable — skipping batch fan-in after upload failure (job {})", jobId);
            return;
        }
        try {
            aggregator.onChildTerminal(reloaded);
        } catch (Exception e) {
            log.error("Aggregator failed during upload-failure fan-in for job {} (batch {})",
                    jobId, reloaded.getBatchId(), e);
        }
    }
}
