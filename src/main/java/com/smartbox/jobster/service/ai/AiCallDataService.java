package com.smartbox.jobster.service.ai;

import com.smartbox.jobster.$;
import com.smartbox.jobster.dto.callAgent.AiCallDataDto;
import com.smartbox.jobster.dto.callAgent.AiCallMessageDto;
import com.smartbox.jobster.dto.callAgent.AiCallQAData;
import com.smartbox.jobster.entity.ai.AiCall;
import io.jmix.core.DataManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class AiCallDataService {
    private static final Logger log = LoggerFactory.getLogger(AiCallDataService.class);

    @Autowired
    private DataManager dataManager;

    @Autowired
    private AiCallDtoConverter converter;

    public List<AiCallDataDto> getCallsForUser(String userId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<AiCallQAData> processCallQAData(AiCallDataDto callData) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getSummaryFromAnswers(List<AiCallQAData> qaDataList) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
