package com.smartbox.jobster.service.ai.aisearch;

import com.smartbox.jobster.entity.ai.AIServiceLog;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.core.PersonEducation;
import com.smartbox.jobster.entity.core.PersonExperience;
import com.smartbox.jobster.service.SpeechAssessmentService;
import io.jmix.core.DataManager;
import io.jmix.core.security.SystemAuthenticator;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Component("jb_AISearchCronService")
@RequiredArgsConstructor
@ConditionalOnProperty("spring.rabbitmq.listen")
public class AISearchCronService {

    private static final Logger log = LoggerFactory.getLogger(AISearchCronService.class);

    private final DataManager dataManager;
    private final SystemAuthenticator systemAuthenticator;
    private final SpeechAssessmentService speechAssessmentService;
    private final ApplicantBatchSyncService applicantBatchSyncService;


//    @Scheduled(fixedDelay = 30, timeUnit = TimeUnit.SECONDS, zone = "Asia/Tashkent", scheduler = "aiSearchJobScheduled")
    @Scheduled(cron = "0 0,30 * * * ?", zone = "Asia/Tashkent", scheduler = "aiSearchJobScheduled")
    public void syncRecentApplicants() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
