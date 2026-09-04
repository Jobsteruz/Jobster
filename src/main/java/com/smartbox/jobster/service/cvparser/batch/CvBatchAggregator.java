package com.smartbox.jobster.service.cvparser.batch;

import com.smartbox.jobster.event.CvBatchCreateFinishedEvent;
import com.smartbox.jobster.pojo.ai.cv_parser.CreatePersonFromCVResult;
import com.smartbox.jobster.service.cvparser.CvParseJobStore;
import com.smartbox.jobster.service.cvparser.ResumeParserService;
import com.smartbox.jobster.service.cvparser.batch.dto.CvParseBatch;
import com.smartbox.jobster.service.cvparser.batch.dto.CvParseBatchStatus;
import com.smartbox.jobster.service.cvparser.batch.dto.ZipRejectedEntry;
import com.smartbox.jobster.service.cvparser.dto.CvParseJob;
import com.smartbox.jobster.service.cvparser.dto.CvParseJobStatus;
import io.jmix.core.security.SystemAuthenticator;
import io.micrometer.core.instrument.MeterRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * Fans child-job terminal events back into the owning {@link CvParseBatch} and, on success,
 * triggers the auto-apply that creates a new {@code Applicant} for the batch's vacancy.
 * <p>
 * Called from two places:
 * <ol>
 *   <li>{@code ResumeParserService.notifyBatchAggregatorIfNeeded()} after the webhook handler
 *       transitions a child job to COMPLETED or FAILED.</li>
 *   <li>{@code CvBatchChildUploader.failAndNotifyBatch()} when the upload itself never reaches
 *       the parser (no webhook will fire).</li>
 * </ol>
 * Idempotent — double-delivered webhooks are detected via {@code terminatedChildJobIds}.
 * All updates to the batch aggregate run under a Hazelcast per-key lock via
 * {@link CvParseBatchStore#update(String, java.util.function.Consumer)}.
 */
@Component
public class CvBatchAggregator {

    private static final Logger log = LoggerFactory.getLogger(CvBatchAggregator.class);

    /** Cap on filenames carried by the completion notification — readable, avoids flooding the UI. */
    private static final int MAX_ERROR_NAMES_IN_NOTIFICATION = 5;

    private final CvParseBatchStore batchStore;
    private final CvParseJobStore jobStore;
    private final ResumeParserService resumeParserService;
    private final SystemAuthenticator systemAuthenticator;
    private final MeterRegistry meterRegistry;
    private final ApplicationEventPublisher applicationEventPublisher;

    public CvBatchAggregator(CvParseBatchStore batchStore,
                             CvParseJobStore jobStore,
                             ResumeParserService resumeParserService,
                             SystemAuthenticator systemAuthenticator,
                             MeterRegistry meterRegistry,
                             ApplicationEventPublisher applicationEventPublisher) {
        this.batchStore = batchStore;
        this.jobStore = jobStore;
        this.resumeParserService = resumeParserService;
        this.systemAuthenticator = systemAuthenticator;
        this.meterRegistry = meterRegistry;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    /**
     * Record that a batch child reached a terminal state and (on COMPLETED) trigger auto-apply.
     * Safe to call more than once for the same job — second invocation is detected and ignored.
     */
    public void onChildTerminal(CvParseJob job) {
        if (job == null || job.getBatchId() == null) return;

        final String batchId = job.getBatchId();
        final String jobId = job.getJobId();
        MDC.put("batchId", batchId);
        MDC.put("jobId", jobId);
        try {
            CvParseBatch snapshot = batchStore.get(batchId);
            if (snapshot == null) {
                log.warn("Batch {} missing (expired?) — dropping terminal event for job {}", batchId, jobId);
                return;
            }
            if (snapshot.getStatus() == CvParseBatchStatus.CANCELLED) {
                log.info("Batch {} is cancelled — ignoring terminal event for job {}", batchId, jobId);
                return;
            }

            final CvParseJobStatus childStatus = job.getStatus();
            final boolean isParseCompleted = childStatus == CvParseJobStatus.COMPLETED;
            final boolean isFailure = childStatus == CvParseJobStatus.FAILED;

            if (!isParseCompleted && !isFailure) {
                // APPLIED / UPLOADING / PARSING are not terminal fan-in events.
                return;
            }

            // Auto-apply must happen outside the IMap lock (it starts its own @Transactional).
            // We run it first, then record the outcome under lock.
            boolean appliedOk = false;
            boolean applyFailed = false;
            if (isParseCompleted) {
                appliedOk = tryAutoApply(snapshot, jobId);
                applyFailed = !appliedOk;
            }

            recordChildMetric(isFailure, appliedOk, applyFailed);
            recordOutcome(batchId, jobId, isFailure, appliedOk, applyFailed);
        } finally {
            MDC.remove("batchId");
            MDC.remove("jobId");
        }
    }

    private boolean tryAutoApply(CvParseBatch batch, String jobId) {
        // Defensive re-check: the caller's {@code snapshot} was taken before auto-apply work
        // started. A concurrent Stop click (Thread B) could have flipped the status to
        // CANCELLED in the meantime — if so, we must not create an Applicant the user just
        // asked to discard. The window between this check and the actual DB save inside
        // autoApplyBatchFields is milliseconds; the Hazelcast store gives us a fresh view.
        CvParseBatch fresh = batchStore.get(batch.getBatchId());
        if (fresh == null) {
            log.info("Batch {} expired before auto-apply — skipping job {}", batch.getBatchId(), jobId);
            return false;
        }
        if (fresh.getStatus() == CvParseBatchStatus.CANCELLED) {
            log.info("Batch {} cancelled mid-flight — skipping auto-apply for job {}",
                    batch.getBatchId(), jobId);
            return false;
        }

        String principal = batch.getPrincipalName();
        try {
            if (principal == null || principal.isEmpty()) {
                resumeParserService.autoApplyBatchFields(jobId, batch);
            } else {
                systemAuthenticator.runWithUser(principal,
                        () -> resumeParserService.autoApplyBatchFields(jobId, batch));
            }
            return true;
        } catch (Exception e) {
            log.error("Auto-apply failed for batch {} job {}", batch.getBatchId(), jobId, e);
            // Make the failure visible on the job so the UI can surface a reason.
            jobStore.setError(jobId, "Auto-apply failed: " + e.getMessage());
            return false;
        }
    }

    private void recordOutcome(String batchId,
                               String jobId,
                               boolean parseFailed,
                               boolean appliedOk,
                               boolean applyFailed) {
        CvParseBatch updated = batchStore.update(batchId, batch -> {
            if (batch.getTerminatedChildJobIds().contains(jobId)) {
                // Duplicate webhook / retry — already counted.
                return;
            }
            batch.getTerminatedChildJobIds().add(jobId);

            if (parseFailed) {
                batch.setFailedCount(batch.getFailedCount() + 1);
            } else {
                batch.setCompletedCount(batch.getCompletedCount() + 1);
                if (appliedOk) {
                    batch.setAppliedCount(batch.getAppliedCount() + 1);
                } else if (applyFailed) {
                    batch.setApplyFailedCount(batch.getApplyFailedCount() + 1);
                }
            }

            if (batch.isAllTerminal() && !batch.getStatus().isTerminal()) {
                batch.setStatus(batch.resolveTerminalStatus());
                batch.setFinishedAt(Instant.now());
            }
        });

        if (updated != null && updated.getStatus().isTerminal()) {
            log.info("Batch {} finalised: status={}, completed={}, failed={}, applied={}, applyFailed={}",
                    batchId, updated.getStatus(), updated.getCompletedCount(),
                    updated.getFailedCount(), updated.getAppliedCount(), updated.getApplyFailedCount());
            recordBatchFinalisedMetric(updated);
            publishCompletionEventIfApplicable(updated);
        }
    }

    /**
     * Broadcast a {@link CvBatchCreateFinishedEvent} so {@code CvParsingCreatePersonListener}
     * shows the standard "import finished" dashboard notification to the batch's owner. This
     * runs from the backend — independently of whether the user still has the Batch CV Import
     * dialog open. If they hid the dialog and walked away, they still get the notification as
     * soon as the batch terminates.
     * <p>
     * Skipped for CANCELLED (user initiated it; no news) and FAILED (no applicants created, no
     * list refresh needed). Duplicates are treated as "handled, not failed" (same logic that
     * used to live in the dialog's {@code publishCompletionEventOnce}).
     */
    private void publishCompletionEventIfApplicable(CvParseBatch batch) {
        CvParseBatchStatus status = batch.getStatus();
        if (status == CvParseBatchStatus.CANCELLED || status == CvParseBatchStatus.FAILED) {
            return;
        }
        try {
            // Duplicates arrive in rejectedAtExtraction too — subtract so we don't count them
            // twice against total/fail. Overflow counts the rejections not stored inline.
            int duplicates = batch.getDuplicatesSkipped();
            List<ZipRejectedEntry> storedRejections = batch.getRejectedAtExtraction() == null
                    ? List.of()
                    : batch.getRejectedAtExtraction();
            int overflow = batch.getRejectedOverflowCount();
            int rejectedCount = storedRejections.size() + overflow;
            int rejectedNonDup = Math.max(0, rejectedCount - duplicates);

            int total = batch.getTotalFiles() + rejectedNonDup;
            int success = batch.getAppliedCount();
            int fail = batch.getFailedCount() + batch.getApplyFailedCount() + rejectedNonDup;

            CreatePersonFromCVResult summary = new CreatePersonFromCVResult(
                    batch.getPrincipalName(),
                    total,
                    success,
                    fail,
                    collectErrorNames(batch, storedRejections)
            );
            applicationEventPublisher.publishEvent(new CvBatchCreateFinishedEvent(summary));
        } catch (Exception e) {
            // Never let a notification failure poison the finalization path.
            log.warn("Failed to publish CvBatchCreateFinishedEvent for batch {}",
                    batch.getBatchId(), e);
        }
    }

    /**
     * Pick up to {@link #MAX_ERROR_NAMES_IN_NOTIFICATION} filenames from the batch to show in the
     * completion notification. Prefer parse-failed child filenames (most actionable), fall back
     * to rejection filenames (bomb / type / size) so the user always sees something actionable.
     * Duplicates are skipped — they are not a user error.
     */
    private List<String> collectErrorNames(CvParseBatch batch, List<ZipRejectedEntry> storedRejections) {
        List<String> names = new ArrayList<>(MAX_ERROR_NAMES_IN_NOTIFICATION);
        // Failed parse jobs first.
        if (batch.getChildJobIds() != null && batch.getFailedCount() > 0) {
            for (String jobId : batch.getChildJobIds()) {
                if (names.size() >= MAX_ERROR_NAMES_IN_NOTIFICATION) break;
                CvParseJob child = jobStore.get(jobId);
                if (child != null && child.getStatus() == CvParseJobStatus.FAILED && child.getFilename() != null) {
                    names.add(child.getFilename());
                }
            }
        }
        // Then extraction rejections (excluding duplicates — they aren't user-facing errors).
        if (names.size() < MAX_ERROR_NAMES_IN_NOTIFICATION) {
            Stream<String> fromRejections = storedRejections.stream()
                    .filter(r -> r.reason() != ZipRejectedEntry.Reason.DUPLICATE_HASH)
                    .map(ZipRejectedEntry::filename);
            fromRejections
                    .limit(MAX_ERROR_NAMES_IN_NOTIFICATION - names.size())
                    .forEach(names::add);
        }
        return names;
    }

    /**
     * One {@code jobster.cv_parser.batch.children{outcome}} counter increment per child terminal.
     * Outcome dimension matches the three real end-states for a batch child.
     */
    private void recordChildMetric(boolean parseFailed, boolean appliedOk, boolean applyFailed) {
        String outcome;
        if (parseFailed) outcome = "failed";
        else if (appliedOk) outcome = "applied";
        else if (applyFailed) outcome = "apply_failed";
        else return;
        meterRegistry.counter("jobster.cv_parser.batch.children", "outcome", outcome).increment();
    }

    /**
     * Records wall-clock batch duration in a histogram when the batch reaches a terminal state.
     * {@code startedAt} may be {@code null} if the batch was cancelled before the orchestrator
     * picked it up — in that case we fall back to {@code createdAt} so the histogram still sees
     * the lifecycle without a spurious zero.
     */
    private void recordBatchFinalisedMetric(CvParseBatch batch) {
        Instant start = batch.getStartedAt() != null ? batch.getStartedAt() : batch.getCreatedAt();
        Instant end = batch.getFinishedAt() != null ? batch.getFinishedAt() : Instant.now();
        if (start == null) return;
        Duration d = Duration.between(start, end);
        if (d.isNegative()) return;
        meterRegistry.timer("jobster.cv_parser.batch.duration_seconds",
                        "status", batch.getStatus().name().toLowerCase())
                .record(d.toMillis(), TimeUnit.MILLISECONDS);
    }
}
