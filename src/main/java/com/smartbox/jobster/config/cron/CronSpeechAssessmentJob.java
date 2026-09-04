package com.smartbox.jobster.config.cron;

import com.smartbox.jobster.$;
import com.smartbox.jobster.controller.open.SpeechAssessmentController;
import com.smartbox.jobster.entity.ai.AIServiceLog;
import com.smartbox.jobster.entity.ai.AIServiceType;
import com.smartbox.jobster.entity.config.NetworkSettings;
import com.smartbox.jobster.entity.questionnaire.QuestionAnswer;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.pojo.ai.request.SpeechAssessmentRequest;
import com.smartbox.jobster.service.SpeechAssessmentService;
import io.jmix.appsettings.AppSettings;
import io.jmix.core.DataManager;
import io.jmix.core.security.Authenticated;
import jakarta.persistence.Entity;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;


@Component("jb_CronSpeechAssessmentJob")
@ConditionalOnProperty("spring.rabbitmq.listen")
public class CronSpeechAssessmentJob {
    private static final Logger log = LoggerFactory.getLogger(CronSpeechAssessmentJob.class);

    @Value("${app.url}")
    private String appUrl;

    @Autowired
    private DataManager dataManager;
    @Autowired
    private SpeechAssessmentService speechAssessmentService;
    @Autowired
    private AppSettings appSettings;

    @Authenticated
    @Scheduled(initialDelay = 1, fixedDelay = 1, timeUnit = TimeUnit.MINUTES, scheduler = "speechAssessmentJobScheduled")
    public void cronRun() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendToAssessment(QuestionAnswer questionAnswer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
