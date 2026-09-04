package com.smartbox.jobster.listener.mq;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.config.JobDescription;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.Translate;
import com.smartbox.jobster.pojo.JobDescriptionPojo;
import com.smartbox.jobster.service.LanguageService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.VacancyService;
import com.smartbox.jobster.entity.ai.AiUsageFeature;
import com.smartbox.jobster.service.ai.AIConfig;
import com.smartbox.jobster.service.ai.GeminiAIService;
import com.smartbox.jobster.service.ai.GeminiModel;
import io.jmix.appsettings.AppSettings;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import io.jmix.core.security.SystemAuthenticator;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
@ConditionalOnProperty("spring.rabbitmq.listen")
@RequiredArgsConstructor
public class JobDescriptionQueueListener {
    private static final Logger log = LoggerFactory.getLogger(JobDescriptionQueueListener.class);
    private final SystemAuthenticator systemAuthenticator;
    private final LanguageService languageService;
    private final TranslateService translateService;
    private final AppSettings appSettings;
    private final GeminiAIService geminiAIService;
    private final DataManager dataManager;
    private final VacancyService vacancyService;


    @RabbitListener(queues = "${spring.rabbitmq.jb.template.job-description-queue}")
    public void listen(JobDescriptionPojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Translate getTranslateByLocale(List<Translate> translates, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private JSONObject getAIResponse(String prompt) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}