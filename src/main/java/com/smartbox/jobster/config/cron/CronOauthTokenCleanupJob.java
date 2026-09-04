package com.smartbox.jobster.config.cron;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Deletes fully-expired rows from {@code oauth2_authorization} — Spring Authorization Server's
 * token store, which has no JPA entity (hence raw SQL). Every password-grant login inserts a row
 * and nothing ever deleted them, so the table only grows and drags the login path and the nightly
 * backup with it.
 * <p>
 * A row is deleted only when its LATEST credential expired more than {@value #EXPIRY_MARGIN_DAYS}
 * days ago — {@code greatest()} over every *_expires_at column, and the refresh token (30-day TTL)
 * outlives the rest — so nothing still usable can be touched. Deletes run in
 * {@value #BATCH_SIZE}-row batches, each committing on its own, so a large backlog can't produce
 * one giant transaction / WAL spike and the streaming replica never falls far behind.
 * <p>
 * Pinned to the MQ node like every other cleanup cron.
 */
@Slf4j
@Component("jb_CronOauthTokenCleanupJob")
@ConditionalOnProperty("spring.rabbitmq.listen")
@RequiredArgsConstructor
public class CronOauthTokenCleanupJob {

    private static final int EXPIRY_MARGIN_DAYS = 7;
    private static final int BATCH_SIZE = 20_000;
    /** Backstop against an endless loop; 200 × 20k = 4M rows is far above any real backlog. */
    private static final int MAX_BATCHES = 200;

    private static final String DELETE_BATCH_SQL = "[не публикуется]";

    private final JdbcTemplate jdbcTemplate;

    @Scheduled(cron = "0 30 3 * * ?", zone = "Asia/Tashkent")
    public void cleanupExpiredAuthorizations() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
