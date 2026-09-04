package com.smartbox.jobster.service.ai;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartbox.jobster.$;
import com.smartbox.jobster.dto.callAgent.AiCallConditionDto;
import com.smartbox.jobster.dto.callAgent.AiCallQuestionDto;
import com.smartbox.jobster.dto.callAgent.AiCallRequestDto;
import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.entity.company.CompanyConfig;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.questionnaire.QuestionCondition;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.questionnaire.QuestionService;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.flowui.Notifications;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class AiCallRequestService {

    private static final Logger log = LoggerFactory.getLogger(AiCallRequestService.class);

    @Autowired
    private DataManager dataManager;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    @Qualifier("aiCallWebClient")
    private WebClient aiCallWebClient;
    @Autowired
    private AiCallFailedRequestService failedRequestService;
    @Autowired
    private Messages messages;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private TranslateService translateService;

    public void createAiCallForMultiple(List<Person> persons, Questionnaire questionnaire, String language, Notifications notifications) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void createAiCall(Person person, Questionnaire questionnaire, String language, Notifications notifications) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private AiCallRequestDto buildAiCallRequest(Person person, Company company, List<Question> questions, String language) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<AiCallQuestionDto> convertQuestionsToDto(List<Question> questions, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<AiCallConditionDto> convertConditionsToDto(List<QuestionCondition> conditions) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void makeAiCallRequest(AiCallRequestDto request, Notifications notifications) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void showError(Notifications notifications, String messageKey) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}


