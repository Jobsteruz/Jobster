package com.smartbox.jobster.config.caching;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.core.JbEntity;
import io.jmix.flowui.model.DataLoader;
import io.jmix.multitenancy.core.TenantProvider;
import jakarta.persistence.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Builds cache keys. The key SHAPE — tenant prefix, separator, per-element token, null marker —
 * lives in exactly one place ({@link #makeKeyFromTokens} + {@link #entityToken}), so a caller that
 * already knows an element's entity name and id can build a byte-identical key without holding the
 * entity instance, and cannot drift when the shape changes here.
 * <p>
 * That id-only path is not a micro-optimisation. Obtaining an instance purely to build a key means
 * {@code DataManager.getReference}, which INSTANTIATES the entity and therefore fires our
 * {@code @PostConstruct} hooks — and those hit the database (GenCodeService / SequenceService, both
 * reading JB_SEQ). In the robot scan that was ~11k queries and ~20s per run.
 */
public interface JbCacheKeyMaker {

    String SEPARATOR = "_";
    String NULL_TOKEN = "null";

    /**
     * One key element rendered as {@code entityName(id)} — exactly the text
     * {@link #makeKey(Object...)} produces for an entity instance. When the element itself is
     * absent, pass {@link #NULL_TOKEN} instead of calling this.
     */
    static String entityToken(String entityName, Object id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Joins ready-made tokens under the current tenant. THE definition of the key shape. */
    default String makeKeyFromTokens(String... tokens) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default String makeKey(Object... params) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String tokenOf(Object param) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static String resolveDomain(Object obj) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
