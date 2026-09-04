package com.smartbox.jobster.service.ai;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartbox.jobster.dto.callAgent.AiCallRequestDto;
import com.smartbox.jobster.entity.ai.AiCallRequest;
import io.jmix.core.DataManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class AiCallRetryService {

    private static final Logger log = LoggerFactory.getLogger(AiCallRetryService.class);

    @Autowired
    private DataManager dataManager;

    @Autowired
    @Qualifier("aiCallWebClient")
    private WebClient aiCallWebClient;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private AiCallFailedRequestService failedRequestService;

    public void retryFailedAiCallRequests() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void retryAiCallRequest(AiCallRequest failedRequest) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}