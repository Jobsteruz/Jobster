package com.smartbox.jobster.service.ishgo;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.integration.ishgo.IshgoCategory;
import com.smartbox.jobster.entity.integration.ishgo.IshgoPosition;
import com.smartbox.jobster.entity.integration.ishgo.IshgoRegion;
import com.smartbox.jobster.service.EntityService;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriBuilder;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class IshGOMappingService {
    private final WebClient webClient;
    private final EntityService entityService;
    private final DataManager dataManager;


    public IshGOMappingService(@Qualifier("ishGOClient") WebClient webClient, EntityService entityService, DataManager dataManager) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void syncRegions(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void convertToIshgoRegion(RegionResponse region, IshgoRegion parent, SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void syncCategories(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private IshgoCategory getIshGOCategory(UUID id, boolean forPosition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void syncPositions(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private <T> Mono<List<T>> getRequest(Class<T> resultClass, String url, Map<String, String> queryParams) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private record PositionResponse(UUID id, String name, UUID categoryId) {
    }

    private record CategoryResponse(UUID id, String name) {
    }

    private record RegionResponse(UUID id, String name, List<RegionResponse> children) {
    }
}
