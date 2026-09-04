package com.smartbox.jobster.view.vacancy.map;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.shared.Registration;

import java.util.UUID;
import java.util.function.Consumer;

/**
 * Google Maps web component (vacancy-map.ts). Data flows one way — JSON string properties in,
 * an {@code open-vacancies} DOM event (popup link click) back out. Zoom/pan stays client-side.
 */
@Tag("vacancy-map")
@JsModule("./themes/jobster/js/vacancy-map.ts")
@NpmPackage(value = "@googlemaps/js-api-loader", version = "1.16.8")
@NpmPackage(value = "@googlemaps/markerclusterer", version = "2.5.3")
@NpmPackage(value = "@types/google.maps", version = "3.58.1")
public class VacancyMapComponent extends Component implements HasSize {

    public void setApiKey(String apiKey) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setLang(String lang) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setMapId(String mapId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Localized popup labels as JSON: {sapCode, category, vacancyCount, openList}. */
    public void setLabels(String labelsJson) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** JSON array of {@link VacancyMapPoint}; replaces all markers and refits bounds. */
    public void setPoints(String pointsJson) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Registration addOpenVacanciesListener(Consumer<UUID> consumer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
