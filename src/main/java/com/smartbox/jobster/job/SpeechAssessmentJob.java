package com.smartbox.jobster.job;

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
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * @author Jobster team
 * date: 14/06/24 18:43
 */
@Component("jb_SpeechAssessmentJob")
public class SpeechAssessmentJob implements Job {
    private static final Logger log = LoggerFactory.getLogger(SpeechAssessmentJob.class);

    @Value("${app.url}")
    private String appUrl;
    @Value("${spring.rabbitmq.listen}")
    private String listen;

    @Autowired
    private DataManager dataManager;
    @Autowired
    private SpeechAssessmentService speechAssessmentService;
    @Autowired
    private AppSettings appSettings;

    @Authenticated
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendToAssessment(QuestionAnswer questionAnswer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
