package com.smartbox.jobster.config.cvparser;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Set;

/**
 * Configuration for the V2 CV parser batch (ZIP / single file) pipeline.
 * <p>
 * All limits are defensive — the ZIP extractor applies every guard below before a single byte is
 * forwarded to the external parser. Thread pool sizing is intentionally conservative: the parser
 * server queues internally via RabbitMQ, so flooding it with >4 concurrent uploads per app instance
 * would only waste bandwidth and compete with other tenants for parser workers.
 *
 * @param maxEntries              hard cap on CV files accepted from a single ZIP (DoS guard)
 * @param maxCompressedBytes      max size of the uploaded ZIP itself
 * @param maxUncompressedBytes    cumulative uncompressed size across all accepted entries
 * @param maxEntryBytes           per-file uncompressed size limit <em>inside the ZIP</em>
 * @param maxSingleFileBytes      per-file size limit when the dialog uploads a bare PDF/DOC/
 *                                DOCX/RTF (no ZIP wrapper). Matches the single-applicant V2
 *                                dialog ({@code CvParserV2Dialog}, 2 MB) for a consistent UX
 * @param maxCompressionRatio     reject entries whose uncompressed:compressed ratio exceeds this
 *                                (ZIP-bomb protection; normal PDFs/DOCX are under 10:1)
 * @param allowedExtensions       lower-case, dot-less file extensions permitted inside the archive
 * @param uploadCoreThreads        steady-state worker count of the per-file upload executor
 * @param uploadMaxThreads         hard ceiling for burst concurrency
 * @param uploadQueueCapacity      queued tasks before CallerRunsPolicy engages backpressure
 * @param orchestratorCoreThreads  workers handling the ZIP extract + child dispatch stage
 * @param orchestratorMaxThreads   burst ceiling for the orchestrator pool
 * @param orchestratorQueueCapacity queued batches before CallerRunsPolicy engages
 * @param batchTtlSeconds          Hazelcast time-to-live for batch aggregate entries
 * @param batchMaxIdleSeconds      idle eviction for batch entries once no one polls them
 */
@ConfigurationProperties(prefix = "jobster.cv-parser.batch")
public record CvBatchProperties(
        int maxEntries,
        long maxCompressedBytes,
        long maxUncompressedBytes,
        long maxEntryBytes,
        long maxSingleFileBytes,
        double maxCompressionRatio,
        Set<String> allowedExtensions,
        int uploadCoreThreads,
        int uploadMaxThreads,
        int uploadQueueCapacity,
        int orchestratorCoreThreads,
        int orchestratorMaxThreads,
        int orchestratorQueueCapacity,
        long batchTtlSeconds,
        long batchMaxIdleSeconds
) {

    // Safe defaults mirrored from application.properties; used when properties are absent (tests).
    public static final int DEFAULT_MAX_ENTRIES = 100;
    public static final long DEFAULT_MAX_COMPRESSED = 52_428_800L;      // 50 MB
    public static final long DEFAULT_MAX_UNCOMPRESSED = 524_288_000L;   // 500 MB
    public static final long DEFAULT_MAX_ENTRY = 2_097_152L;            // 2 MB (inside ZIP — matches single-file cap)
    public static final long DEFAULT_MAX_SINGLE_FILE = 2_097_152L;      // 2 MB (bare PDF/DOC/DOCX)
    public static final double DEFAULT_MAX_RATIO = 100.0d;
    public static final Set<String> DEFAULT_EXTENSIONS = Set.of("pdf", "doc", "docx", "rtf");
    public static final int DEFAULT_UPLOAD_CORE = 4;
    public static final int DEFAULT_UPLOAD_MAX = 8;
    public static final int DEFAULT_UPLOAD_QUEUE = 200;
    public static final int DEFAULT_ORCHESTRATOR_CORE = 1;
    public static final int DEFAULT_ORCHESTRATOR_MAX = 2;
    public static final int DEFAULT_ORCHESTRATOR_QUEUE = 5;
    public static final long DEFAULT_BATCH_TTL = 7_200L;
    public static final long DEFAULT_BATCH_MAX_IDLE = 3_600L;

    public int maxEntriesOrDefault() {
        return maxEntries > 0 ? maxEntries : DEFAULT_MAX_ENTRIES;
    }

    public long maxCompressedBytesOrDefault() {
        return maxCompressedBytes > 0 ? maxCompressedBytes : DEFAULT_MAX_COMPRESSED;
    }

    public long maxUncompressedBytesOrDefault() {
        return maxUncompressedBytes > 0 ? maxUncompressedBytes : DEFAULT_MAX_UNCOMPRESSED;
    }

    public long maxEntryBytesOrDefault() {
        return maxEntryBytes > 0 ? maxEntryBytes : DEFAULT_MAX_ENTRY;
    }

    public long maxSingleFileBytesOrDefault() {
        return maxSingleFileBytes > 0 ? maxSingleFileBytes : DEFAULT_MAX_SINGLE_FILE;
    }

    public double maxCompressionRatioOrDefault() {
        return maxCompressionRatio > 0 ? maxCompressionRatio : DEFAULT_MAX_RATIO;
    }

    public Set<String> allowedExtensionsOrDefault() {
        return allowedExtensions == null || allowedExtensions.isEmpty()
                ? DEFAULT_EXTENSIONS
                : allowedExtensions;
    }

    public int uploadCoreThreadsOrDefault() {
        return uploadCoreThreads > 0 ? uploadCoreThreads : DEFAULT_UPLOAD_CORE;
    }

    public int uploadMaxThreadsOrDefault() {
        return uploadMaxThreads > 0 ? uploadMaxThreads : DEFAULT_UPLOAD_MAX;
    }

    public int uploadQueueCapacityOrDefault() {
        return uploadQueueCapacity > 0 ? uploadQueueCapacity : DEFAULT_UPLOAD_QUEUE;
    }

    public int orchestratorCoreThreadsOrDefault() {
        return orchestratorCoreThreads > 0 ? orchestratorCoreThreads : DEFAULT_ORCHESTRATOR_CORE;
    }

    public int orchestratorMaxThreadsOrDefault() {
        return orchestratorMaxThreads > 0 ? orchestratorMaxThreads : DEFAULT_ORCHESTRATOR_MAX;
    }

    public int orchestratorQueueCapacityOrDefault() {
        return orchestratorQueueCapacity > 0 ? orchestratorQueueCapacity : DEFAULT_ORCHESTRATOR_QUEUE;
    }

    public long batchTtlSecondsOrDefault() {
        return batchTtlSeconds > 0 ? batchTtlSeconds : DEFAULT_BATCH_TTL;
    }

    public long batchMaxIdleSecondsOrDefault() {
        return batchMaxIdleSeconds > 0 ? batchMaxIdleSeconds : DEFAULT_BATCH_MAX_IDLE;
    }
}
