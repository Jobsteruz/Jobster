package com.smartbox.jobster.config.cron;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.kanban.KanbanStageAction;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.kanban.KanbanActionService;
import com.smartbox.jobster.service.kanban.KanbanService;
import io.jmix.core.security.SystemAuthenticator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component("jb_CronKanbanStageDailyJob")
@ConditionalOnProperty("spring.rabbitmq.listen")
public class CronKanbanStageDailyJob {
    private static final Logger log = LoggerFactory.getLogger(CronKanbanStageDailyJob.class);

    @Autowired
    private KanbanService kanbanService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private KanbanActionService kanbanActionService;
    @Autowired
    private SystemAuthenticator systemAuthenticator;

    @Scheduled(cron = "0 0 6 * * ?")
    public void cronRun() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void startProcess(Map<String, List<KanbanStage>> robotWithKanbanStages) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
