package com.smartbox.jobster.service.cvparser.batch;

import com.smartbox.jobster.config.cvparser.CvBatchProperties;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Typed, validated view onto {@link CvBatchProperties} for the extractor / uploader.
 * Centralised so every guard pulls from a single source of truth — no scattered {@code @Value}s.
 */
@Component
public class ZipSecurityLimits {

    private final int maxEntries;
    private final long maxCompressedBytes;
    private final long maxUncompressedBytes;
    private final long maxEntryBytes;
    private final long maxSingleFileBytes;
    private final double maxCompressionRatio;
    private final Set<String> allowedExtensions;

    public ZipSecurityLimits(CvBatchProperties properties) {
        this.maxEntries = requirePositive(properties.maxEntriesOrDefault(), "maxEntries");
        this.maxCompressedBytes = requirePositive(properties.maxCompressedBytesOrDefault(), "maxCompressedBytes");
        this.maxUncompressedBytes = requirePositive(properties.maxUncompressedBytesOrDefault(), "maxUncompressedBytes");
        this.maxEntryBytes = requirePositive(properties.maxEntryBytesOrDefault(), "maxEntryBytes");
        this.maxSingleFileBytes = requirePositive(properties.maxSingleFileBytesOrDefault(), "maxSingleFileBytes");
        this.maxCompressionRatio = requireRatio(properties.maxCompressionRatioOrDefault());
        Set<String> exts = properties.allowedExtensionsOrDefault();
        if (exts == null || exts.isEmpty()) {
            throw new IllegalArgumentException("allowedExtensions must not be empty");
        }
        this.allowedExtensions = Set.copyOf(exts);
    }

    private static int requirePositive(int value, String name) {
        if (value <= 0) throw new IllegalArgumentException(name + " must be > 0, was " + value);
        return value;
    }

    private static long requirePositive(long value, String name) {
        if (value <= 0) throw new IllegalArgumentException(name + " must be > 0, was " + value);
        return value;
    }

    private static double requireRatio(double value) {
        if (!(value >= 1.0) || Double.isNaN(value) || Double.isInfinite(value)) {
            throw new IllegalArgumentException(
                    "maxCompressionRatio must be finite and >= 1.0, was " + value);
        }
        return value;
    }

    public int maxEntries() {
        return maxEntries;
    }

    public long maxCompressedBytes() {
        return maxCompressedBytes;
    }

    public long maxUncompressedBytes() {
        return maxUncompressedBytes;
    }

    public long maxEntryBytes() {
        return maxEntryBytes;
    }

    /**
     * Per-file cap for a bare upload (not a ZIP). Matches the single-applicant V2 dialog (2 MB)
     * so recruiters hit the same limit in both places. ZIP entries use the looser
     * {@link #maxEntryBytes()}.
     */
    public long maxSingleFileBytes() {
        return maxSingleFileBytes;
    }

    public double maxCompressionRatio() {
        return maxCompressionRatio;
    }

    public Set<String> allowedExtensions() {
        return allowedExtensions;
    }

    public boolean isAllowedExtension(String ext) {
        if (ext == null) return false;
        return allowedExtensions.contains(ext.toLowerCase());
    }
}
