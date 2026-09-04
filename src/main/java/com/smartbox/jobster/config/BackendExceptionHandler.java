package com.smartbox.jobster.config;

import com.smartbox.jobster.entity.ats.TicketSource;
import com.smartbox.jobster.service.TicketService;
import io.jmix.rest.exception.RestAPIException;
import jakarta.servlet.DispatcherType;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartException;

import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Captures unhandled backend runtime exceptions thrown from REST controllers
 * and the service layer underneath them, persists them as
 * {@link TicketSource#BACKEND} tickets and returns a JSON error response.
 * <p>
 * Ordered at {@link Ordered#LOWEST_PRECEDENCE} so more specific
 * {@code @ControllerAdvice} beans (validation, auth, etc.) run first and can
 * short-circuit without producing a ticket. The response Content-Type is forced
 * to {@code application/json} so it does not depend on the client's
 * {@code Accept} header — this avoids {@code HttpMessageNotWritableException}
 * when the request was made with {@code Accept: text/plain} or similar.
 */
@RestControllerAdvice
@Order(Ordered.LOWEST_PRECEDENCE)
public class BackendExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(BackendExceptionHandler.class);

    @Autowired
    private TicketService ticketService;

    // Flood guard: fire (full stack trace + a jb_ticket) at most ONCE per distinct
    // exception per window. A retrying client that throws the same exception
    // hundreds of times/min (e.g. a broken /oauth2/token or webhook caller) was
    // the root of the jb_ticket disk-full incident — this caps both the ticket
    // table and the app-log growth. Per node, in-memory, no external dependency.
    private static final long DEDUP_WINDOW_MS = 5 * 60_000L;
    private static final int DEDUP_MAX = 10_000;
    private final Map<String, Long> recentErrors = new ConcurrentHashMap<>();

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, Object>> handleRuntime(RuntimeException exception) {
        if (firstOccurrence(exception)) {
            log.error("Unhandled backend exception", exception);
            try {
                ticketService.createAndSend(exception, TicketSource.BACKEND);
            } catch (Exception ticketEx) {
                log.warn("Backend exception sniffer failed: {}", ticketEx.getMessage());
            }
        } else {
            log.warn("Unhandled backend exception (duplicate suppressed): {}", exception.toString());
        }
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", OffsetDateTime.now().toString());
        body.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        body.put("error", HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        body.put("message", exception.getMessage() != null ? exception.getMessage() : "");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .contentType(MediaType.APPLICATION_JSON)
                .body(body);
    }

    /**
     * Keeps a failure to render the {@code /error} page from being amplified into a 500.
     * <p>
     * This advice is not restricted to the project's own controllers, so it also covers Spring
     * Boot's {@code BasicErrorController}. When a request calls {@code sendError(...)} after the
     * response Content-Type has already been pinned, {@code BasicErrorController.error()} cannot
     * serialize its {@code LinkedHashMap} body and throws — and {@link #handleRuntime} would then
     * report a 500 plus a ticket for what was a perfectly handled 4xx.
     * <p>
     * Seen in production (2026-07-30, {@code GET /sw-runtime-resources-precache.js}): a browser
     * service worker keeps fetching that resource after its session expired, so Vaadin's
     * {@code VaadinService.handleSessionExpired} sets {@code Content-Type: text/plain} and calls
     * {@code sendError(403, "Session expired")}. The {@code /error} dispatch then failed with
     * {@code No converter for [class java.util.LinkedHashMap] with preset Content-Type
     * 'text/plain;charset=ISO-8859-1'}, we turned the 403 into a 500, and the LB 5xx alerter fired
     * on a node that was healthy.
     * <p>
     * On an {@link DispatcherType#ERROR} dispatch we therefore return the ORIGINAL status with an
     * empty body (no converter needed, so nothing can fail) and log a single WARN without a ticket.
     * Any other {@link HttpMessageNotWritableException} is a genuine serialization bug in our own
     * code and still flows through {@link #handleRuntime}, so it is neither hidden nor un-ticketed.
     */
    @ExceptionHandler(HttpMessageNotWritableException.class)
    public ResponseEntity<?> handleNotWritable(HttpMessageNotWritableException exception,
                                               HttpServletRequest request) {
        Object errorStatus = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        if (request.getDispatcherType() == DispatcherType.ERROR && errorStatus instanceof Integer status) {
            log.warn("Error page for status {} could not be rendered (response Content-Type already set),"
                    + " returning it without a body: {}", status, exception.getMessage());
            return ResponseEntity.status(status).build();
        }
        return handleRuntime(exception);
    }

    /**
     * Handles unparseable or oversized {@code multipart/form-data} requests as the CLIENT errors
     * they are, instead of letting them fall through to {@link #handleRuntime} and become 500s.
     * Both are raised by {@code DispatcherServlet.checkMultipart} BEFORE any handler is mapped, so
     * none of our code ran and nothing is broken on the server.
     * <p>
     * <b>{@link MaxUploadSizeExceededException} does not reliably mean the upload was too large.</b>
     * Spring's {@code StandardMultipartHttpServletRequest.handleParseFailure} classifies the
     * underlying Tomcat failure by MESSAGE TEXT: any message containing "exceed" plus "size" or
     * "length" is rethrown as {@code MaxUploadSizeExceededException} with size {@code -1}. Tomcat's
     * {@code "Header section has more than 512 bytes (maybe it is not properly terminated)"} — the
     * multipart HEADER limit, unrelated to file size — matches that pattern, so a body that cannot
     * be parsed at all is reported as a size violation. The exception alone cannot tell the two
     * apart, which is why the WARN below logs the ROOT CAUSE instead of
     * {@code exception.getMessage()}: the latter reads "Maximum upload size exceeded" even when
     * nothing exceeded any upload limit.
     * <p>
     * Production 2026-09-03: 128 occurrences over ~4 days, two of which fired a "🟡 XATO QAYTARDI"
     * Telegram alert on BOTH UI nodes in the same second. Every one was the 512-byte header limit —
     * a scanner ({@code <redacted-ip>}, {@code <redacted-ip>}) POSTing a {@code multipart/form-data}
     * Content-Type whose body is not valid multipart, across {@code /}, {@code /signin},
     * {@code /register}, {@code /admin}… none of which exist in this application. The configured
     * 500MB limits were never involved. Both nodes alert together because cookieless POSTs land on
     * {@code upstream jb_entry} with {@code least_conn}, which spreads serial probes across both,
     * so each crosses the alerter's 3-in-5-minutes threshold at the same moment.
     * <p>
     * Diagnosis cost a day mostly because {@link #handleRuntime} logs a stack trace with no IP and
     * no path, leaving no way to tell scanner traffic from a real user hitting a real limit. The
     * WARN here carries both.
     * <p>
     * The status follows Spring's own verdict — {@code 413} where it decided the request was too
     * large, {@code 400} for a {@link MultipartException} it reported as an outright parse failure.
     * Re-classifying by message text here would just repeat the mistake that produced the wrong
     * exception type in the first place; the logged root cause carries the truth either way.
     */
    @ExceptionHandler(MultipartException.class)
    public ResponseEntity<Map<String, Object>> handleMultipart(MultipartException exception,
                                                               HttpServletRequest request) {
        boolean tooLarge = exception instanceof MaxUploadSizeExceededException;
        HttpStatus status = tooLarge ? HttpStatus.PAYLOAD_TOO_LARGE : HttpStatus.BAD_REQUEST;

        log.warn("Rejected multipart request {} from IP {} (path {}): {}",
                status.value(), getClientIp(request), request.getRequestURI(), rootCauseMessage(exception));

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", OffsetDateTime.now().toString());
        body.put("status", status.value());
        body.put("error", status.getReasonPhrase());
        body.put("message", tooLarge ? "Maximum upload size exceeded" : "Malformed multipart request");

        return ResponseEntity.status(status)
                .contentType(MediaType.APPLICATION_JSON)
                .body(body);
    }

    /**
     * Handles {@link RestAPIException} from the Jmix generic REST API. Client errors
     * (4xx) are logged as a single WARN and returned with their real status WITHOUT
     * creating a ticket; only 5xx server errors create one.
     * <p>
     * The "Invalid file reference" case is a malformed client request — typically an
     * automated scanner probing {@code /files/download} with SSRF/LFI/path-traversal
     * payloads (e.g. {@code file:///etc/passwd}, {@code http://169.254.169.254/...},
     * {@code s3://...}). Jmix already rejects these in {@code FileRef.fromString}, so no
     * attack succeeds. We log a single {@code WARN} line (no stack trace) and return
     * {@code 400 Bad Request} WITHOUT creating a backend ticket — this stops scanner
     * traffic from flooding the ticket system and the logs.
     * <p>
     * IMPORTANT: only client errors (4xx) are suppressed. Any 5xx
     * {@link RestAPIException} (or any other runtime exception) still flows through
     * {@link #handleRuntime} and IS recorded as a ticket, so genuine server errors are
     * never silently lost.
     */
    @ExceptionHandler(RestAPIException.class)
    public ResponseEntity<Map<String, Object>> handleRestApi(RestAPIException exception,
                                                             HttpServletRequest request) {
        // Client-side faults must NOT create a ticket or a full-stack-trace ERROR line —
        // they are the caller's bug and ticketing them floods jb_ticket and the logs:
        //   - "Invalid file reference": SSRF/LFI scanner probes on /files/download.
        //   - any 4xx RestAPIException, e.g. the mobile app calling
        //     GET /rest/entities/jb_Employee/null (id="null") -> "Invalid entity ID" (400).
        boolean invalidFileRef = isInvalidFileReference(exception);
        HttpStatus status = exception.getHttpStatus();

        if (invalidFileRef || (status != null && status.is4xxClientError())) {
            HttpStatus resolved = (invalidFileRef || status == null) ? HttpStatus.BAD_REQUEST : status;
            log.warn("Rejected client REST error {} from IP {} (path {}): {}",
                    resolved.value(), getClientIp(request), request.getRequestURI(), rootCauseMessage(exception));

            Map<String, Object> body = new LinkedHashMap<>();
            body.put("timestamp", OffsetDateTime.now().toString());
            body.put("status", resolved.value());
            body.put("error", resolved.getReasonPhrase());
            body.put("message", invalidFileRef
                    ? "Invalid file reference"
                    : (exception.getMessage() != null ? exception.getMessage() : "Bad request"));

            return ResponseEntity.status(resolved)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(body);
        }

        // 5xx or unknown status — genuine server error: keep the ticket-creating behaviour.
        return handleRuntime(exception);
    }

    private boolean isInvalidFileReference(RestAPIException exception) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String rootCauseMessage(Throwable exception) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String getClientIp(HttpServletRequest request) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * True the first time this exception signature is seen in the current window.
     */
    private boolean firstOccurrence(Throwable t) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * exception class + first line of message — stable across identical repeats.
     */
    private static String signatureOf(Throwable t) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
