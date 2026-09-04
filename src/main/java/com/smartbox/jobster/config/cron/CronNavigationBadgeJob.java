package com.smartbox.jobster.config.cron;

import com.smartbox.jobster.entity.ui.Navigation;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.NavigationService;
import io.jmix.core.security.SystemAuthenticator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Keeps the Hazelcast {@code navigations} cache filled with menu badge counts.
 * <p>
 * Badges used to be computed lazily by {@code NavigationService.getBadge}, which meant the first
 * login after a cold cache ran one COUNT per menu item inside the login round trip — 12.4s of a
 * 15.1s login for a large tenant. The render path now reads the cache only
 * ({@code NavigationService.getBadgeCached}), so this job owns the computing.
 * <p>
 * It also fixes staleness: the {@code navigations} map has no TTL, so before this job a cached
 * badge was only ever recomputed when a user hit the menu refresh icon.
 * <p>
 * Each tenant is processed under its own company admin so the badge queries stay tenant-scoped —
 * running them as the system user would count rows across every tenant.
 * <p>
 * Tuning ({@code application.properties}, both optional):
 * <ul>
 *   <li>{@code jobster.navigation.badge-warmup-delay-ms} — delay before the first run after boot,
 *       default 120000. Keeps startup free while still filling a cold cache within minutes.</li>
 *   <li>{@code jobster.navigation.badge-refresh-ms} — interval between runs, default 3600000.</li>
 * </ul>
 * Runs on the queue-consumer instance only ({@code spring.rabbitmq.listen}), like the other jobs
 * that do tenant-wide work, so the UI nodes never carry it.
 */
@Component("jb_CronNavigationBadgeJob")
@ConditionalOnProperty("spring.rabbitmq.listen")
public class CronNavigationBadgeJob {
    private static final Logger log = LoggerFactory.getLogger(CronNavigationBadgeJob.class);

    @Autowired
    private SystemAuthenticator systemAuthenticator;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private NavigationService navigationService;

    @Scheduled(
            initialDelayString = "${jobster.navigation.badge-warmup-delay-ms:120000}",
            fixedDelayString = "${jobster.navigation.badge-refresh-ms:3600000}")
    public void refreshBadges() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
