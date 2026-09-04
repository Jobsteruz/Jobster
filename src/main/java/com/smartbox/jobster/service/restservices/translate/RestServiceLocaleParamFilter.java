package com.smartbox.jobster.service.restservices.translate;

import io.jmix.rest.impl.config.RestServicesConfiguration;
import io.jmix.rest.impl.config.RestServicesConfiguration.RestServiceInfo;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Lets the client pass the translation locale as a uniform {@code ?locale=xx} query parameter on
 * EVERY REST call — including Jmix {@code /rest/services/**} endpoints.
 * <p>
 * Jmix resolves a service method by matching the request's query-parameter NAMES against the method's
 * declared parameters. So an extra {@code locale} param makes e.g. {@code getPositions(department)}
 * resolve to "Service method not found" (HTTP 404). This filter hides the {@code locale} parameter from
 * Jmix's parameter view for service methods that do NOT declare a {@code locale} parameter, so the method
 * matches again. The raw query string is left intact, so {@link RestEntityTranslateAdvice} still reads the
 * locale (via {@code request.getURI().getQuery()}) and translates the response.
 * <p>
 * Methods that DO declare {@code locale} (e.g. {@code getDepartments(locale)}) are left untouched so they
 * keep receiving it as a normal argument. Non-service requests are ignored.
 */
@Component
@RequiredArgsConstructor
public class RestServiceLocaleParamFilter extends OncePerRequestFilter {
    private static final String SERVICES_PREFIX = "/rest/services/";
    private static final String LOCALE_PARAM = RestEntityTranslateAdvice.LOCALE_PARAM;

    private final RestServicesConfiguration servicesConfiguration;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean shouldHideLocale(HttpServletRequest request) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Hides the {@code locale} parameter from every {@code getParameter*} view while leaving the raw query
     * string ({@code getQueryString}) untouched, so the translation advice can still read it.
     */
    private static class LocaleHidingRequestWrapper extends HttpServletRequestWrapper {
        LocaleHidingRequestWrapper(HttpServletRequest request) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        @Override
        public String getParameter(String name) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        @Override
        public String[] getParameterValues(String name) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        @Override
        public Map<String, String[]> getParameterMap() {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        @Override
        public Enumeration<String> getParameterNames() {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }
}
