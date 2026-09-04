package com.smartbox.jobster.bean;

import jakarta.annotation.PostConstruct;
import kong.unirest.Unirest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * Global timeout floor for every Unirest call in the application.
 * <p>
 * Unirest's own defaults are 10s connect / 60s socket, and several call sites never set their own
 * — including ones that run on the Vaadin UI thread while it holds the VaadinSession lock (mass
 * send, Superset dashboard tokens, kanban ticket API). A slow third party there freezes the whole
 * UI: every later heartbeat/uidl blocks on the same lock and hangs until nginx gives up (~90s),
 * which is the "zombie UI" 504 storm — the same failure mode {@link WebClientConfig} bounds for
 * the reactive clients.
 * <p>
 * Setting the floor here means a newly added call cannot reintroduce an unbounded one. Per-request
 * {@code .connectTimeout()/.socketTimeout()} still override this, so the UI-thread paths tighten it
 * further and {@code SpeechAssessmentService} keeps its deliberate 2-minute bound.
 * <p>
 * NOTE: {@code socketTimeout} is the gap allowed BETWEEN reads, not a cap on the whole exchange —
 * a server that dribbles bytes can still hold a connection open longer than this value. It is a
 * floor against dead peers, not a request deadline.
 */
@Configuration
public class UnirestConfig {

    private static final Logger log = LoggerFactory.getLogger(UnirestConfig.class);

    private static final int CONNECT_TIMEOUT_MS = 5_000;
    private static final int SOCKET_TIMEOUT_MS = 20_000;

    /**
     * Unirest refuses config changes once its http client has been built, so this has to land
     * before the first call. A @PostConstruct on a @Configuration class runs during startup, well
     * ahead of any request thread — but if some bean ever calls out from its own initializer we
     * log and carry on rather than failing the boot over a timeout default.
     */
    @PostConstruct
    void applyGlobalTimeouts() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
