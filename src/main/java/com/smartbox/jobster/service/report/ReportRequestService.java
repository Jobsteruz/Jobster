package com.smartbox.jobster.service.report;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.report.ReportRequest;
import com.smartbox.jobster.entity.report.ReportRequestStatus;
import com.smartbox.jobster.service.NotificationService;
import io.jmix.core.DataManager;
import io.jmix.core.FileRef;
import io.jmix.core.FileStorage;
import io.jmix.core.FileStorageLocator;
import io.jmix.core.Messages;
import io.jmix.core.TimeSource;
import io.jmix.core.security.CurrentAuthentication;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.ByteArrayInputStream;
import java.util.Base64;
import java.util.Map;
import java.util.UUID;

/**
 * Jobster4-side facade over the whole async-report workflow.
 * <p>
 * Lifecycle:
 * <ol>
 *   <li>{@link #order(String, String, Map)} — create a QUEUED row and push it to report-sender</li>
 *   <li>report-sender callback arrives → {@link #applyCallback} promotes to DONE/FAILED</li>
 * </ol>
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ReportRequestService {

    private final DataManager dataManager;
    private final CurrentAuthentication currentAuthentication;
    private final TimeSource timeSource;
    private final FileStorageLocator fileStorageLocator;
    private final ObjectMapper objectMapper;
    private final ReportSenderClient reportSenderClient;
    private final NotificationService notificationService;
    private final Messages messages;

    /**
     * Persists a new request (status=QUEUED), hands it to report-sender, and stores the
     * worker's taskId on success. On transport failure the request is flipped to FAILED with
     * the error message — the caller UI can then surface it to the user.
     */
    @Transactional
    public ReportRequest order(String reportCode, String reportName, Map<String, Object> parameters) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Applies a callback payload received from report-sender-service.
     * Looks up the request by {@code externalTaskId} (primary) or {@code externalRequestId}
     * (if the worker echoed it back).
     */
    @Transactional
    public void applyCallback(String externalTaskId, String externalRequestId,
                              String status, String fileBase64, String fileName,
                              Integer rowCount, String errorMessage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Drops a row into jb_Notification so the user sees the badge on the top bar. */
    private void notifyRequester(ReportRequest request) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private ReportRequest findByTaskOrRequestId(String externalTaskId, String externalRequestId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private FileRef storeResultFile(String base64, String fileName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String serializeParameters(Map<String, Object> parameters) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private User loadCurrentUser() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
