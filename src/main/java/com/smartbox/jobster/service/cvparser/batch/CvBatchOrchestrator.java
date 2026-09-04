package com.smartbox.jobster.service.cvparser.batch;

import com.smartbox.jobster.config.cvparser.CvBatchAsyncConfig;
import com.smartbox.jobster.service.cvparser.ResumeParserService;
import com.smartbox.jobster.service.cvparser.batch.dto.CvParseBatch;
import com.smartbox.jobster.service.cvparser.batch.dto.CvParseBatchStatus;
import com.smartbox.jobster.service.cvparser.batch.dto.ZipExtractionResult;
import com.smartbox.jobster.service.cvparser.batch.dto.ZipRejectedEntry;
import com.smartbox.jobster.service.cvparser.dto.CvParseJob;
import io.micrometer.core.instrument.MeterRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Async zip-extract and per-child dispatch pipeline. Runs on the single-thread orchestrator
 * executor ({@link CvBatchAsyncConfig#CV_BATCH_ORCHESTRATOR_EXECUTOR}) to keep one batch's
 * extraction work off the 4-thread upload pool.
 * <p>
 * Flow:
 * <ol>
 *   <li>Mark batch EXTRACTING.</li>
 *   <li>Run {@link ZipExtractor} (either ZIP or single-file validation path).</li>
 *   <li>Record extraction rejections + duplicates on the batch aggregate.</li>
 *   <li>For each accepted entry: register a child {@link CvParseJob} (via ResumeParserService)
 *       and hand the bytes to {@link CvBatchChildUploader} for the 4-thread upload pool.</li>
 *   <li>Transition batch to PARSING once every accepted entry has been submitted.</li>
 *   <li>If the batch ends up with zero accepted entries, mark FAILED immediately — there will
 *       be no webhooks to trigger the aggregator's fan-in.</li>
 * </ol>
 */
@Component
@ConditionalOnBean(CvBatchChildUploader.class)
public class CvBatchOrchestrator {

    private static final Logger log = LoggerFactory.getLogger(CvBatchOrchestrator.class);

    private final CvParseBatchStore batchStore;
    private final ZipExtractor zipExtractor;
    private final RarExtractor rarExtractor;
    private final ResumeParserService resumeParserService;
    private final CvBatchChildUploader childUploader;
    private final MeterRegistry meterRegistry;

    public CvBatchOrchestrator(CvParseBatchStore batchStore,
                               ZipExtractor zipExtractor,
                               RarExtractor rarExtractor,
                               ResumeParserService resumeParserService,
                               CvBatchChildUploader childUploader,
                               MeterRegistry meterRegistry) {
        this.batchStore = batchStore;
        this.zipExtractor = zipExtractor;
        this.rarExtractor = rarExtractor;
        this.resumeParserService = resumeParserService;
        this.childUploader = childUploader;
        this.meterRegistry = meterRegistry;
    }

    @Async(CvBatchAsyncConfig.CV_BATCH_ORCHESTRATOR_EXECUTOR)
    public void processAsync(String batchId, byte[] content, boolean isArchive, String sourceFilename) {
        MDC.put("batchId", batchId);
        try {
            CvParseBatch batch = batchStore.get(batchId);
            if (batch == null) {
                log.warn("Orchestrator picked up missing batch {}", batchId);
                return;
            }
            if (batch.getStatus() == CvParseBatchStatus.CANCELLED) {
                log.info("Batch {} was cancelled before extraction started", batchId);
                return;
            }

            // Lock #1 — flip status and timestamp so polling UIs see progress immediately.
            batchStore.update(batchId, b -> {
                b.setStatus(CvParseBatchStatus.EXTRACTING);
                b.setStartedAt(Instant.now());
            });

            ZipExtractionResult extraction;
            try {
                extraction = !isArchive ? zipExtractor.extractSingle(content, sourceFilename)
                        : RarMagic.isRarSignature(content) ? rarExtractor.extract(content)
                        : zipExtractor.extract(content);
            } catch (ZipExtractor.ZipExtractionException e) {
                log.warn("Extraction failed for batch {}: {}", batchId, e.getMessage());
                batchStore.setError(batchId, e.getMessage());
                meterRegistry.counter("jobster.cv_parser.batch.zip_rejected",
                        "reason", "extraction_failed").increment();
                return;
            }

            // Metrics: one counter per rejection reason (independent of the batch aggregate).
            extraction.rejected().forEach(r ->
                    meterRegistry.counter("jobster.cv_parser.batch.zip_rejected",
                            "reason", r.reason().name().toLowerCase()).increment());

            int duplicates = (int) extraction.rejected().stream()
                    .filter(r -> r.reason() == ZipRejectedEntry.Reason.DUPLICATE_HASH)
                    .count();

            if (extraction.accepted().isEmpty()) {
                log.warn("Batch {}: no accepted entries after extraction ({} rejected)",
                        batchId, extraction.rejectedCount());
                // Merge rejections + duplicates + failure terminal state into one lock cycle.
                // The UI can still explain why nothing was imported from the rejectedAtExtraction list.
                batchStore.update(batchId, b -> {
                    if (!extraction.rejected().isEmpty()) {
                        addCappedRejections(b, extraction.rejected());
                    }
                    if (duplicates > 0) b.setDuplicatesSkipped(b.getDuplicatesSkipped() + duplicates);
                    b.setError("No valid CVs in archive");
                    b.setStatus(CvParseBatchStatus.FAILED);
                    b.setFinishedAt(Instant.now());
                });
                return;
            }

            // Register every child job first so the batch aggregate sees the full list before any
            // webhook could fan-in. Job ids are collected in submission order — we still need them
            // later to populate childJobIds on the aggregate under a single lock.
            List<String> registeredJobIds = new ArrayList<>(extraction.accepted().size());
            for (ZipExtractionResult.AcceptedEntry entry : extraction.accepted()) {
                CvParseJob job = resumeParserService.registerBatchChildJob(
                        UUID.randomUUID(),
                        entry.filename(),
                        batchId,
                        batch.getTenantId(),
                        batch.getPrincipalName(),
                        batch.getPersonType()
                );
                registeredJobIds.add(job.getJobId());
            }

            // Lock #2 — final aggregate mutation: rejections + duplicates + child ids + PARSING.
            // Webhooks cannot fire until uploads start after this block.
            batchStore.update(batchId, b -> {
                if (!extraction.rejected().isEmpty()) {
                    addCappedRejections(b, extraction.rejected());
                }
                if (duplicates > 0) b.setDuplicatesSkipped(b.getDuplicatesSkipped() + duplicates);
                b.getChildJobIds().addAll(registeredJobIds);
                b.setStatus(CvParseBatchStatus.PARSING);
            });

            // Dispatch uploads by streaming: hand one entry at a time to the 4-thread upload pool,
            // then drop the local reference so the GC can reclaim the bytes once the upload queue
            // copies them. CallerRunsPolicy on the executor provides natural back-pressure when the
            // queue fills, so this thread can serialise instead of piling up 500 MB of heap.
            int dispatched = 0;
            for (int i = 0; i < extraction.accepted().size(); i++) {
                ZipExtractionResult.AcceptedEntry entry = extraction.accepted().get(i);
                childUploader.uploadChildAsync(registeredJobIds.get(i), entry.content());
                dispatched++;
            }

            log.info("Batch {}: submitted {} children, {} rejected at extraction",
                    batchId, dispatched, extraction.rejectedCount());
        } catch (Exception e) {
            log.error("Unexpected failure in orchestrator for batch {}", batchId, e);
            batchStore.setError(batchId, "Orchestration error: " + e.getMessage());
        } finally {
            MDC.remove("batchId");
        }
    }

    /**
     * Add rejections to the aggregate while honouring {@link CvParseBatch#REJECTIONS_STORED_CAP}.
     * Overflow entries are counted separately so the UI can still tell the user the real total.
     */
    private static void addCappedRejections(CvParseBatch batch, List<ZipRejectedEntry> incoming) {
        List<ZipRejectedEntry> stored = batch.getRejectedAtExtraction();
        int capacity = CvParseBatch.REJECTIONS_STORED_CAP - stored.size();
        if (capacity <= 0) {
            batch.setRejectedOverflowCount(batch.getRejectedOverflowCount() + incoming.size());
            return;
        }
        if (incoming.size() <= capacity) {
            stored.addAll(incoming);
            return;
        }
        stored.addAll(incoming.subList(0, capacity));
        batch.setRejectedOverflowCount(batch.getRejectedOverflowCount() + (incoming.size() - capacity));
    }
}
