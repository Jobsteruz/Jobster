package com.smartbox.jobster.service.ai;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartbox.jobster.dto.callAgent.AiCallRequestDto;
import com.smartbox.jobster.entity.ai.AiCallRequest;
import io.jmix.core.DataManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class AiCallFailedRequestService {

    private static final Logger log = LoggerFactory.getLogger(AiCallFailedRequestService.class);

    @Autowired
    private DataManager dataManager;

    @Autowired
    private ObjectMapper objectMapper;

    public void saveFailedRequestToDatabase(AiCallRequestDto request, String errorMessage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void updateFailedRequest(AiCallRequest aiCallRequest, String errorMessage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void deleteSuccessfulRequest(UUID requestId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}


