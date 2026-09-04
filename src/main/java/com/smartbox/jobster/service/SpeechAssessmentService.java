package com.smartbox.jobster.service;

import com.google.gson.Gson;
import com.smartbox.jobster.config.caching.RedisCacheNames;
import com.smartbox.jobster.entity.ai.AIServiceLog;
import com.smartbox.jobster.entity.config.SpeechAssessmentSettings;
import com.smartbox.jobster.entity.questionnaire.QuestionAnswer;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.pojo.ai.request.SpeechAssessmentRequest;
import com.smartbox.jobster.pojo.ai.response.SpeechAssessmentResponse;
import io.jmix.appsettings.AppSettings;
import io.jmix.core.*;
import kong.unirest.ContentType;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author Jobster team
 * date: 14/06/24 18:45
 */

@Service
public class SpeechAssessmentService {
    private static final Logger log = LoggerFactory.getLogger(SpeechAssessmentService.class);

    @Autowired
    private FileStorage fileStorage;

    @Autowired
    private DataManager dataManager;

    @Autowired
    private FetchPlans fetchPlans;

    @Autowired
    private AppSettings appSettings;


    @SuppressWarnings({"all"})
    @Transactional(readOnly = true)
    public List<QuestionAnswer> getAllQuestionAnswers() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public Map<UUID, AIServiceLog> getAllQuestionAnswers(List<UUID> entityIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean sendToSpeechAssessmentQueue(AIServiceLog aiServiceLog) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public SpeechAssessmentResponse sendToSpeechAssessment(SpeechAssessmentRequest request, FileRef inputFile) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean handleSpeechAssessmentResponse(SpeechAssessmentResponse assessmentResponse, UUID aiLogServiceId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = RedisCacheNames.AI_SERVICE_LOG, keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager",
            unless = "#result==null || #result.outputParams==null")
    public AIServiceLog getAILogByEntityId(UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
