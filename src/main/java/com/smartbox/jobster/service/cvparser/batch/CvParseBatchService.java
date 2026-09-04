package com.smartbox.jobster.service.cvparser.batch;

import com.smartbox.jobster.service.cvparser.batch.dto.CvParseBatch;
import com.smartbox.jobster.service.cvparser.batch.dto.CvParseBatchResponse;
import com.smartbox.jobster.service.cvparser.batch.dto.CvParseBatchStatus;
import com.smartbox.jobster.service.cvparser.batch.dto.StartBatchRequest;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.view.survey.sendsurvey.PersonType;
import io.jmix.multitenancy.core.TenantProvider;
import io.micrometer.core.instrument.MeterRegistry;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/**
 * Public entry point for the V2 CV batch pipeline. The Vaadin dialog calls this service
 * directly — there is no REST layer for batch operations (the parser webhook already lives
 * on {@code /webhook-response/cv-parser/{jobId}} and is reused as-is).
 * <p>
 * Thin by design: responsibilities here are (1) validation, (2) creating the batch aggregate,
 * (3) handing off to the async orchestrator. The heavy work lives in {@link CvBatchOrchestrator}.
 */
@Service
@ConditionalOnBean(CvBatchChildUploader.class)
public class CvParseBatchService {

    private static final Logger log = LoggerFactory.getLogger(CvParseBatchService.class);

    /** Error codes used by callers (UI) to pick an i18n message. */
    public static final String ERR_UNSUPPORTED_TYPE = "unsupported_type";
    public static final String ERR_FILE_TOO_LARGE = "file_too_large";
    public static final String ERR_VACANCY_REQUIRED = "vacancy_required";
    public static final String ERR_BATCH_NOT_FOUND = "batch_not_found";

    private final CvParseBatchStore batchStore;
    private final CvBatchOrchestrator orchestrator;
    private final ZipExtractor zipExtractor;
    private final RarExtractor rarExtractor;
    private final ZipSecurityLimits limits;
    private final TenantProvider tenantProvider;
    private final MeterRegistry meterRegistry;

    public CvParseBatchService(CvParseBatchStore batchStore,
                               CvBatchOrchestrator orchestrator,
                               ZipExtractor zipExtractor,
                               RarExtractor rarExtractor,
                               ZipSecurityLimits limits,
                               TenantProvider tenantProvider,
                               MeterRegistry meterRegistry) {
        this.batchStore = batchStore;
        this.orchestrator = orchestrator;
        this.zipExtractor = zipExtractor;
        this.rarExtractor = rarExtractor;
        this.limits = limits;
        this.tenantProvider = tenantProvider;
        this.meterRegistry = meterRegistry;
    }

    /**
     * Start a new batch import. Returns immediately; all heavy work is pushed onto the
     * orchestrator executor.
     *
     * @throws IllegalArgumentException with error code when validation fails before accept
     */
    public CvParseBatchResponse startBatch(StartBatchRequest request) {
        Objects.requireNonNull(request, "request");
        PersonType personType = request.personType();
        // Outlook review imports intentionally have no vacancy yet (assigned later in the review
        // screen); every other APPLICANT batch still requires one.
        if (personType == PersonType.APPLICANT && request.vacancyId() == null
                && request.sourcePlatform() != Platform.OUTLOOK) {
            throw new IllegalArgumentException(ERR_VACANCY_REQUIRED);
        }

        byte[] content = request.fileContent();
        String filename = (request.filename() == null || request.filename().isEmpty())
                ? "upload"
                : request.filename();
        String extension = FilenameUtils.getExtension(filename).toLowerCase(Locale.ROOT);

        boolean isZip = "zip".equals(extension) && zipExtractor.isZipMagic(content);
        boolean isRar = "rar".equals(extension) && rarExtractor.isRarMagic(content);
        boolean isArchive = isZip || isRar;

        // Single-file path only accepts the configured extensions (pdf / doc / docx / rtf).
        if (!isArchive && !limits.isAllowedExtension(extension)) {
            throw new IllegalArgumentException(ERR_UNSUPPORTED_TYPE + ":" + extension);
        }

        if (isArchive && content.length > limits.maxCompressedBytes()) {
            throw new IllegalArgumentException(ERR_FILE_TOO_LARGE);
        }
        // Bare PDF/DOC uploads use the same 2 MB cap as the single-applicant V2 dialog — the
        // looser per-entry cap (10 MB) only applies inside a ZIP.
        if (!isArchive && content.length > limits.maxSingleFileBytes()) {
            throw new IllegalArgumentException(ERR_FILE_TOO_LARGE);
        }

        CvParseBatch batch = new CvParseBatch();
        batch.setBatchId(UUID.randomUUID().toString());
        batch.setTenantId(tenantProvider.getCurrentUserTenantId());
        batch.setPrincipalName(currentPrincipal());
        batch.setPersonType(personType);
        batch.setVacancyId(request.vacancyId());
        batch.setResponsibleUserId(request.responsibleUserId());
        batch.setDepartmentId(request.departmentId());
        batch.setSourcePlatform(request.sourcePlatform());
        batch.setMarkCompleted(request.markCompleted());
        batch.setSourceFilename(filename);
        batch.setZipSource(isZip);
        batch.setStatus(CvParseBatchStatus.QUEUED);

        batchStore.put(batch);
        meterRegistry.counter("jobster.cv_parser.batch.started",
                "source", isRar ? "rar" : isZip ? "zip" : "single",
                "personType", personType.getId()).increment();

        MDC.put("batchId", batch.getBatchId());
        try {
            log.info("Batch {} queued: filename='{}', source={}, tenant={}, personType={}, vacancy={}, department={}",
                    batch.getBatchId(), filename, isRar ? "rar" : isZip ? "zip" : "single", batch.getTenantId(), personType,
                    batch.getVacancyId(), batch.getDepartmentId());

            orchestrator.processAsync(batch.getBatchId(), content, isArchive, filename);
        } finally {
            MDC.remove("batchId");
        }

        return CvParseBatchResponse.from(batch);
    }

    /**
     * @return live batch status, or {@code null} when the batch has expired / never existed.
     * @throws AccessDeniedException when the batch belongs to a different tenant
     */
    public CvParseBatchResponse getStatus(String batchId) {
        CvParseBatch batch = batchStore.get(batchId);
        if (batch == null) return null;
        assertSameTenant(batch);
        return CvParseBatchResponse.from(batch);
    }

    /**
     * Flag the batch as cancelled. In-flight parser jobs are left alone — the parser will finish
     * them but our aggregator will ignore the resulting webhooks (see {@code onChildTerminal}).
     */
    public void cancelBatch(String batchId) {
        CvParseBatch batch = batchStore.get(batchId);
        if (batch == null) {
            throw new IllegalStateException(ERR_BATCH_NOT_FOUND);
        }
        assertSameTenant(batch);
        if (batch.getStatus().isTerminal()) {
            log.info("Cancel requested for already-terminal batch {} (status={})", batchId, batch.getStatus());
            return;
        }
        batchStore.update(batchId, b -> {
            b.setStatus(CvParseBatchStatus.CANCELLED);
            b.setFinishedAt(Instant.now());
        });
        log.info("Batch {} cancelled by user", batchId);
    }

    private void assertSameTenant(CvParseBatch batch) {
        String current = tenantProvider.getCurrentUserTenantId();
        if (!Objects.equals(current, batch.getTenantId())) {
            log.warn("Tenant mismatch on batch {}: batch.tenant={}, current.tenant={}",
                    batch.getBatchId(), batch.getTenantId(), current);
            throw new AccessDeniedException("Batch belongs to a different tenant");
        }
    }

    private static String currentPrincipal() {
        try {
            return SecurityContextHolder.getContext().getAuthentication().getName();
        } catch (Exception e) {
            return null;
        }
    }
}
