package com.smartbox.jobster.service.restservices.messagehistory;

import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.service.person.EmployeeService;
import io.jmix.core.DataManager;
import io.jmix.core.FluentValuesLoader;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.data.QueryTransformer;
import io.jmix.data.QueryTransformerFactory;
import io.jmix.rest.annotation.RestMethod;
import io.jmix.rest.annotation.RestService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;


@RestService("api_messageHistoryService")
@RequiredArgsConstructor
public class RestMessageHistoryService {

    /** Hard cap on how many rows a single request may return (anti-scraping). */
    private static final int MAX_LIMIT = 50;
    /** Default page size when the client sends null / 0 / a negative limit. */
    private static final int DEFAULT_LIMIT = 20;
    /** Minimum search length — blocks broad wildcard sweeps like "." or "%". */
    private static final int MIN_SEARCH_LENGTH = 2;

    private final QueryTransformerFactory transformerFactory;
    private final DataManager dataManager;
    private final EmployeeService employeeService;


    @RestMethod
    public List<ApplicantUnreadCountResDTO> getApplicantAndUnreadCount(ApplicantUnreadCountReqDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static int clampLimit(Integer limit) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static int safeOffset(Integer offset) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
