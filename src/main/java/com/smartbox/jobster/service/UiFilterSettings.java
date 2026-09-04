package com.smartbox.jobster.service;

import com.smartbox.jobster.security.specific.UiFilterByDepartment2Enabled;
import com.smartbox.jobster.security.specific.UiFilterByDepartmentEnabled;
import com.vaadin.flow.server.VaadinSession;
import io.jmix.flowui.settings.UserSettingsCache;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * The two per-user department-filter switches, readable from a background thread.
 * <p>
 * Jmix keeps user settings in a VaadinSession attribute, and
 * {@code UserSettingsCacheImpl.getCache()} throws
 * {@code IllegalConcurrentAccessException("Illegal access to settings client from background
 * thread")} the moment {@code VaadinSession.getCurrent()} is null. Once the report views moved their
 * queries onto {@link com.smartbox.jobster.view.abstractview.DeferredLoads}' worker pool, every
 * ReportService method that read the switches directly threw there — the fetch failed, the UI-apply
 * step never ran, and the cards rendered their labels with no values (KPI score report, Aug 2026).
 * <p>
 * So the switches are read ONCE on the UI thread ({@link #snapshotIfAvailable()}) and carried to the
 * worker in a ThreadLocal ({@link #bind}/{@link #unbind}). Readers call {@link #byDepartment()} /
 * {@link #byDepartment2()} and no longer care which thread they run on.
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class UiFilterSettings {

    /** Immutable pair carried from the UI thread to the worker. */
    public record Snapshot(boolean byDepartment, boolean byDepartment2) {
    }

    private static final ThreadLocal<Snapshot> CURRENT = new ThreadLocal<>();

    private final UserSettingsCache userSettingsCache;

    /**
     * Reads both switches from the VaadinSession. Normally called on the UI thread; off it there is
     * no session to read, so whatever this thread already carries is passed on rather than dropped
     * (keeps a nested dispatch from losing its caller's snapshot). May return {@code null} — a
     * caller with nothing to carry simply binds nothing.
     */
    @Nullable
    public Snapshot snapshotIfAvailable() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Makes the UI thread's snapshot visible to the current (worker) thread and returns whatever was
     * bound before, which the caller MUST restore in a {@code finally} — the worker threads are
     * pooled and outlive the load.
     */
    @Nullable
    public static Snapshot bind(@Nullable Snapshot snapshot) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean byDepartment() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean byDepartment2() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean read(String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Defensive path: a background caller that never bound a snapshot. Reading the session cache
     * there would throw and blank the whole report again, so the filter is reported as OFF — its
     * state before these switches existed — and the gap is logged instead.
     */
    private boolean readOrDefault(String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static boolean hasSession() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
