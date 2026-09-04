package com.smartbox.jobster.view.abstractview;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.service.UiFilterSettings;
import com.vaadin.flow.component.UI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/**
 * Runs the data-fetch half of a deferred (one-shot timer) view load on a worker thread, so the
 * VaadinSession lock — held for the whole of a uidl request — is NOT held while the DB works.
 * A slow report/badge query then delays only its own card instead of freezing every tab of the
 * user's session (prod thread dumps 2026-08-06/10: every 10–38 s "Too long timer processing"
 * event was DB work inside a one-shot deferral timer on the UI thread).
 * <p>
 * Contract: the {@code fetch} supplier runs OFF the UI thread — it must not touch components;
 * snapshot component values BEFORE calling {@link #run}. The Runnable it returns is executed
 * under {@code ui.access(..)} and is the only place allowed to mutate the UI. Push is enabled
 * globally ({@code @Push} on JobsterApplication), so the applied result reaches the client
 * without waiting for the next request.
 */
@Slf4j
public final class DeferredLoads {

    /** Hard ceiling so a stuck query cannot leave a card's spinner up forever (mirrors monitoring3). */
    private static final long TIMEOUT_SECONDS = 30;

    /**
     * One pool for every deferred view load on the node. Override with
     * {@code -Djobster.deferred-load.threads=N} — a system property because the field is static and
     * initialises before any application context exists.
     * <p>
     * Sizing is a <b>connection budget</b>, not a CPU one: every thread here wants a Hikari
     * connection, and so do monitoring3's 16 workers. The budget only works if
     * {@code main.datasource.hikari.maximum-pool-size} is set explicitly — Hikari's default of 10
     * is smaller than either pool, and then threads sit waiting for a connection rather than for
     * the database (measured: a local run held exactly 10 connections while the monitoring board
     * dispatched ~25 concurrent queries, leaving the columns on their 3-dot loaders).
     * <p>
     * 16 here + 16 for monitoring3 = 32 of a 50-connection pool, leaving room for the request
     * threads that still do their own synchronous work (saves, detail views, REST).
     */
    private static final Executor EXECUTOR = Executors.newFixedThreadPool(
            Math.max(4, Integer.getInteger("jobster.deferred-load.threads", 16)),
            new java.util.concurrent.ThreadFactory() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private DeferredLoads() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static void run(UI ui, Supplier<Runnable> fetch) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * @param ui     the UI the result belongs to; taken on the caller's (UI) thread
     * @param fetch  runs on the worker pool with the caller's {@link SecurityContext} propagated
     *               (Jmix DataManager needs it — same trick as monitoring3's securityAware);
     *               returns the UI-apply step
     * @param always runs under {@code ui.access} after the apply step, on success AND on failure —
     *               views use it to swap the spinner for the (possibly empty) content
     */
    public static void run(UI ui, Supplier<Runnable> fetch, Runnable always) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
