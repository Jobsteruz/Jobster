package com.smartbox.jobster.config.cron;

import com.smartbox.jobster.bean.local_cache.TranslateCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("jb_CronTranslateCacheJob")
public class CronTranslateCacheJob {
    private static final Logger log = LoggerFactory.getLogger(CronTranslateCacheJob.class);

    @Scheduled(cron = "0 0 0 * * ?")
    public void cronRun() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
