package com.smartbox.jobster.service.cvparser.batch.dto;

import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.view.survey.sendsurvey.PersonType;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * Aggregate root for a CV batch import. Stored in the {@code cv-parse-batches} Hazelcast map
 * (distributed so any jobster-ui / jobster-mq pod can service a polling dialog).
 * <p>
 * Counters are updated atomically under a Hazelcast lock held by
 * {@code CvParseBatchStore.update(batchId, Consumer)}. Do not mutate fields outside that path.
 */
@Getter
@Setter
public class CvParseBatch implements Serializable {

    // Bumped when the aggregate shape changes in a non-backward-compatible way. Current: added
    // personType + departmentId for the Employee V2 pipeline. Hazelcast deserialisation for
    // entries stored under the previous layout will fail cleanly; batch TTL is 2h so a short
    // deploy window purges stale entries.
    @Serial
    private static final long serialVersionUID = 4L;

    /**
     * Hard cap on rejections stored inline on the aggregate. Every rejection above this count is
     * counted by {@link #rejectedOverflowCount} instead of appended to the list — keeps the
     * serialised aggregate size bounded regardless of {@code maxEntries} config.
     */
    public static final int REJECTIONS_STORED_CAP = 50;

    // Identity & ownership ---------------------------------------------------
    private String batchId;
    private String tenantId;
    private String principalName;
    /**
     * Type of person each child creates. {@link PersonType#APPLICANT} (default) requires
     * {@link #vacancyId}; {@link PersonType#EMPLOYEE} uses {@link #departmentId} instead
     * (both optional for Employee — the picker in the batch dialog is non-required).
     */
    private PersonType personType = PersonType.APPLICANT;
    private UUID vacancyId;                 // required for APPLICANT at startBatch()
    private UUID responsibleUserId;         // nullable, APPLICANT-only
    private UUID departmentId;              // nullable, EMPLOYEE-only (StaffingTable linkage)
    /**
     * Outlook mail import: platform stamped on each created Applicant + whether it is marked
     * completed on create. Normal dialog/import flows leave these null → JOBSTER + completed=true;
     * the Outlook flow sets OUTLOOK + completed=false so imports land in the review screen (not the
     * live list) until a recruiter assigns a vacancy. Nullable → backward-compatible (serialVersionUID
     * unchanged; old in-flight batches deserialize with these = null = the default behaviour).
     */
    private Platform sourcePlatform;        // null → JOBSTER
    private Boolean markCompleted;          // null → true

    // Input shape ------------------------------------------------------------
    private String sourceFilename;          // "resumes_2026_04.zip" or "ivan.pdf"
    private boolean zipSource;              // true when the dialog uploaded a .zip

    // Lifecycle --------------------------------------------------------------
    private CvParseBatchStatus status = CvParseBatchStatus.QUEUED;
    private Instant createdAt = Instant.now();
    private Instant startedAt;              // set when orchestrator picks up
    private Instant finishedAt;             // set when status reaches terminal

    // Progress ---------------------------------------------------------------
    /** All child job ids created by the orchestrator (in submission order). */
    private List<String> childJobIds = new ArrayList<>();
    /**
     * Subset of childJobIds whose status is already terminal (COMPLETED/FAILED/APPLIED).
     * {@link LinkedHashSet} gives us O(1) {@code contains} for the aggregator's idempotency
     * check while preserving insertion order for debugging / logging.
     */
    private Set<String> terminatedChildJobIds = new LinkedHashSet<>();
    /** Successfully parsed (parser returned structured data). */
    private int completedCount;
    /** Parser failed for this child. */
    private int failedCount;
    /** Parsed successfully AND applied to a new Applicant. */
    private int appliedCount;
    /** Applied failed after parse succeeded (save error, tenant mismatch, ...). */
    private int applyFailedCount;
    /**
     * Entries rejected at extraction time (size, bomb, path, type) — no child job exists.
     * Capped at {@link #REJECTIONS_STORED_CAP}; additional rejections are counted via
     * {@link #rejectedOverflowCount} to keep the serialised aggregate small.
     */
    private List<ZipRejectedEntry> rejectedAtExtraction = new ArrayList<>();
    /** Count of rejections past {@link #REJECTIONS_STORED_CAP} not stored inline. */
    private int rejectedOverflowCount;
    /** SHA-256 duplicates skipped within this batch. */
    private int duplicatesSkipped;

    // Error surfaces ---------------------------------------------------------
    /** Fatal batch-level error (invalid ZIP, orchestrator threw). {@code null} on success. */
    private String error;

    // Helpers ----------------------------------------------------------------

    /**
     * @return total number of CVs that entered the parse pipeline (excluded rejects/duplicates).
     */
    public int getTotalFiles() {
        return childJobIds == null ? 0 : childJobIds.size();
    }

    /**
     * @return {@code true} when every child has reached a terminal state.
     */
    public boolean isAllTerminal() {
        return getTotalFiles() > 0
                && terminatedChildJobIds != null
                && terminatedChildJobIds.size() >= getTotalFiles();
    }

    /**
     * @return the status the batch should settle on once all children are terminal.
     *         Used by the aggregator at fan-in time.
     */
    public CvParseBatchStatus resolveTerminalStatus() {
        if (status == CvParseBatchStatus.CANCELLED) return CvParseBatchStatus.CANCELLED;
        if (failedCount == 0 && applyFailedCount == 0) return CvParseBatchStatus.COMPLETED;
        if (appliedCount == 0) return CvParseBatchStatus.FAILED;
        return CvParseBatchStatus.PARTIAL;
    }
}
