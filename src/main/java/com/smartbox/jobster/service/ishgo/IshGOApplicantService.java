package com.smartbox.jobster.service.ishgo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.smartbox.jobster.$;
import com.smartbox.jobster.config.caching.RedisCacheNames;
import com.smartbox.jobster.entity.UserIntegration;
import com.smartbox.jobster.entity.core.PersonStatus;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Base64;
import java.util.List;

@Service
public class IshGOApplicantService {
    private static final Logger log = LoggerFactory.getLogger(IshGOApplicantService.class);
    private static final String TOKEN_CACHE_KEY = "ishgo_token";

    @Qualifier("ishGOClient")
    @Autowired
    private WebClient webClient;
    @Qualifier("hazelcastCacheManager")
    @Autowired
    private CacheManager cacheManager;

    public void rejectApplicant(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void acceptApplicant(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void message2Applicant(String id, String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean putRequest(String url) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private JsonNode sendRequest(String url, String token) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void changeStatusApplicant(List<String> ids, PersonStatus status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String getOrRefreshToken() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String getTokenFromCache() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String refreshToken() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public record Token(@JsonProperty("access_token") String accessToken,
                        @JsonProperty("token_type") String tokenType,
                        @JsonProperty("expires_in") Long expiresIn) {
    }

    public record TgMessageDTO(String id, String message) {
    }

    public static class UnauthorizedException extends RuntimeException {
        public UnauthorizedException(String message) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }

    public static class ServerErrorException extends RuntimeException {
        public ServerErrorException(String message) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }
}
