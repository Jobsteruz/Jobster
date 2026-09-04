package com.smartbox.jobster.config.caching;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.service.UiFilterSettings;
import io.jmix.core.security.CurrentAuthentication;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Cache keys for the reports that narrow their query by the CURRENT USER's departments.
 * <p>
 * {@link JbKeyGenerator} keys on tenant + method arguments, which is right for a report whose result
 * depends only on its arguments. It is wrong for the report methods that additionally apply the
 * per-user department switches ({@code UiFilterByDepartmentEnabled} /
 * {@code UiFilterByDepartment2Enabled}): those narrow the query to the caller's own department, yet
 * two callers in the same tenant with the same arguments produce the same key — so whoever ran the
 * report first decided what everyone else would see for the rest of the day-long TTL.
 * <p>
 * This generator appends the caller's identity to the key whenever either switch is on, and a single
 * shared token when neither is — so the common, unfiltered case keeps one cache entry per tenant
 * exactly as before, and only genuinely per-user results are split per user.
 */
@Component("jb_ReportKeyGenerator")
@RequiredArgsConstructor
public class JbReportKeyGenerator implements KeyGenerator, JbCacheKeyMaker {

    /** Token used while no per-user department filter is active — the whole tenant shares one entry. */
    private static final String SHARED = "all-departments";

    private final UiFilterSettings uiFilterSettings;
    private final CurrentAuthentication currentAuthentication;

    @Override
    @NonNull
    public Object generate(Object target, Method method, Object... params) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Deliberately keyed on the user rather than on the resolved department set: resolving the set
     * costs a query or two on EVERY lookup, hit or miss, while the user id is already in the
     * security context. The looser grouping only costs cache entries, never correctness.
     */
    private String filterScope() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
