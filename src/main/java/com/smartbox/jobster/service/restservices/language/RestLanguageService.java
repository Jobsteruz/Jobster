package com.smartbox.jobster.service.restservices.language;

import com.smartbox.jobster.entity.hrm.VacancyLanguage;
import io.jmix.core.DataManager;
import io.jmix.rest.annotation.RestHttpMethod;
import io.jmix.rest.annotation.RestMethod;
import io.jmix.rest.annotation.RestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestService("api_languageService")
@RequiredArgsConstructor
public class RestLanguageService {

    private final DataManager dataManager;

    @RestMethod(httpMethods = RestHttpMethod.GET)
    public ResponseEntity<List<VacancyLanguage>> getVacancyLanguage() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
