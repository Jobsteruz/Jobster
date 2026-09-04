package com.smartbox.jobster.service.ai;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartbox.jobster.$;
import com.smartbox.jobster.dto.callAgent.AiCallConditionDto;
import com.smartbox.jobster.dto.callAgent.AiCallDataDto;
import com.smartbox.jobster.dto.callAgent.AiCallMessageDto;
import com.smartbox.jobster.dto.callAgent.AiCallPartDto;
import com.smartbox.jobster.dto.callAgent.AiCallQuestionDto;
import com.smartbox.jobster.entity.ai.AiCall;
import com.smartbox.jobster.entity.ai.AiCallMessage;
import com.smartbox.jobster.entity.ai.AiCallQuestion;
import io.jmix.core.DataManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AiCallDtoConverter {

    private static final Logger log = LoggerFactory.getLogger(AiCallDtoConverter.class);

    @Autowired
    private DataManager dataManager;

    @Autowired
    private ObjectMapper objectMapper;

    public AiCallDataDto convertToDto(AiCall dbCall) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<AiCallMessageDto> loadMessages(AiCall aiCall) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private AiCallMessageDto convertMessageToDto(AiCallMessage dbMessage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<AiCallQuestionDto> loadQuestions(AiCall aiCall) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private AiCallQuestionDto convertQuestionToDto(AiCallQuestion dbQuestion) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}


