package com.smartbox.jobster.service.restservices.request;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Currency;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.ats.Priority;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.company.DepartmentCategory;
import com.smartbox.jobster.entity.core.CoreEntity;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.PersonGroup;
import com.smartbox.jobster.entity.hrm.*;
import com.smartbox.jobster.entity.integration.hh.HHProfession;
import com.smartbox.jobster.entity.integration.ishgo.IshgoPosition;
import com.smartbox.jobster.entity.ref.Gender;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.LanguageLevel;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.service.person.EmployeeService;
import io.jmix.core.*;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.data.QueryTransformer;
import io.jmix.data.QueryTransformerFactory;
import io.jmix.rest.annotation.RestHttpMethod;
import io.jmix.rest.annotation.RestMethod;
import io.jmix.rest.annotation.RestService;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

@RestService("api_requestService")
@RequiredArgsConstructor
public class RestRequestService {
    private final EntityService entityService;
    private final DataManager dataManager;
    private final TimeSource timeSource;
    private final QueryTransformerFactory queryTransformerFactory;
    private final UserService userService;
    private final EmployeeService employeeService;
    private final TranslateService translateService;
    private final CurrentAuthentication currentAuthentication;


    @RestMethod
    public List<RequestAllResponseDTO> getAll(RequestAllDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String resolveLocale(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void localizeRequestEntities(Vacancy request, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod(httpMethods = RestHttpMethod.GET)
    public ResponseEntity<Vacancy> getOne(UUID id, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod(httpMethods = RestHttpMethod.GET)
    public ResponseEntity<Department> getDepartmentByEmployee() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod(httpMethods = RestHttpMethod.GET)
    public ResponseEntity<List<RequestTypeDTO>> getRequestTypes(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod(httpMethods = RestHttpMethod.GET)
    public ResponseEntity<List<RequestCancelReasonDTO>> getCancelReasons(String locale, Boolean vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod(httpMethods = RestHttpMethod.GET)
    public ResponseEntity<List<DepartmentCategory>> getCategories() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod(httpMethods = RestHttpMethod.POST)
    public ResponseEntity<UUID> saveRequest(RequestDTO request) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod
    public ResponseEntity<String> updateStatus(String id, String status, UUID cancelReason, String comment) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public @NotNull Map<UUID, FileRef> getUserPhotoByRequests(List<Vacancy> requests) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Vacancy updateRequest(Vacancy updateRequest, RequestDTO request) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean saveLanguages(SaveContext saveContext, Vacancy request, List<VacancyLanguageDTO> languages) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull VacancyLanguage updateVacancyLanguage(VacancyLanguage vacancyLanguage, Vacancy request, VacancyLanguageDTO language) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Vacancy getNewRequest() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod(httpMethods = RestHttpMethod.POST)
    public ResponseEntity<UUID> savePosition(PositionDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
