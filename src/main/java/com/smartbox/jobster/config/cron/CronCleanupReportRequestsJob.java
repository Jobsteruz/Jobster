package com.smartbox.jobster.config.cron;

import com.smartbox.jobster.entity.report.ReportRequest;
import io.jmix.core.DataManager;
import io.jmix.core.FileRef;
import io.jmix.core.FileStorage;
import io.jmix.core.FileStorageLocator;
import io.jmix.core.TimeSource;
import io.jmix.core.security.SystemAuthenticator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Deletes xlsx files of report requests older than {@value #RETENTION_DAYS} days so
 * FileStorage doesn't grow unbounded. The {@link ReportRequest} row itself is kept
 * for history — only {@code resultFile} is nulled and the underlying file removed.
 * <p>
 * Pinned to the MQ node like every other cleanup cron: this used to be ungated, so all
 * four nodes ran the same deletion concurrently every night (and the two new robot nodes
 * would have made it six) — duplicated work plus a race between the storage delete and
 * the row update.
 */
@Slf4j
@Component("jb_CronCleanupReportRequestsJob")
@ConditionalOnProperty("spring.rabbitmq.listen")
@RequiredArgsConstructor
public class CronCleanupReportRequestsJob {

    private static final int RETENTION_DAYS = 30;

    private final SystemAuthenticator systemAuthenticator;
    private final DataManager dataManager;
    private final FileStorageLocator fileStorageLocator;
    private final TimeSource timeSource;

    @Scheduled(cron = "0 0 3 * * ?", zone = "Asia/Tashkent")
    public void cleanupOldReports() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
