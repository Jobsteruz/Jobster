package com.smartbox.jobster.pebble;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.web.Page;
import com.smartbox.jobster.entity.web.Website;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.website.WebSiteService;
import lombok.Getter;
import org.springframework.core.env.Environment;

/**
 * @author Jobster team
 * Since: 11/14/2024 6:00 PM
 */
@Getter
public class PageRenderConfig {
    String tenantId;
    String domain;
    String baseUrl;
    Website website;
    Page page;
    String lang;
    Vacancy vacancy;
    Questionnaire questionnaire;

    public PageRenderConfig(String domain, String uri, String lang) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public PageRenderConfig(String domain, String uri, String lang, String vacancyId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public PageRenderConfig(String domain, String uri, String lang, String vacancyId, String questionnaireId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Base URL every link inside a rendered page is built from.
     *
     * <p>Prefers the site's own {@link Website#getHost()} — the vanity domain, e.g.
     * {@code https://<tenant>.example.com} — so a tenant that has DNS and a certificate keeps its
     * own address throughout the site. That only works with a vhost mapping the subdomain onto
     * {@code /web/<domain>}; see {@code ops/nginx/<tenant-sites-host>.conf}.
     *
     * <p>Falls back to the app path ({@code https://app.jobster.hr/web/<tenant>}, the address the
     * builder's "view site" button opens) when {@code host} is empty or is not an absolute URL.
     * Both cases are real: most sites leave the field blank, and some hold a bare label such as
     * {@code <tenant>}, which as a link resolves against the current page and goes nowhere.
     *
     * <p>An absolute {@code host} is taken at face value — a domain filled in before its DNS exists
     * still yields dead links, so that field is the first thing to check when a tenant reports
     * broken navigation.
     */
    private static String siteBaseUrl(String domain, Website website) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static String trimTrailingSlash(String url) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Page for the site root ({@code /web/{domain}}). {@code defaultPage} is optional in the builder,
     * so a site whose owner never picked one falls back to its first page instead of rendering the
     * "not found" template. Only the root falls back — an explicit {@code uri} that matches nothing
     * must stay "not found" rather than quietly serving a different page.
     */
    private Page resolveRootPage(WebSiteService webSiteService) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
