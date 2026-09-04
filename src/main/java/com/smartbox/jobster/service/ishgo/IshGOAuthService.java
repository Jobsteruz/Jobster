package com.smartbox.jobster.service.ishgo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.UserIntegration;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.integration.IntegratedUser;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.UserService;
import io.jmix.core.FetchPlan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Base64;
import java.util.Map;

@Service
public class IshGOAuthService {
    private final WebClient webClient;
    private final WebClient tokenClient;
    private final UserService userService;
    private final EntityService entityService;

    public IshGOAuthService(
            @Qualifier("ishGOClient") WebClient webClient,
            UserService userService,
            EntityService entityService) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean sentCode(String phone) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean verifyCode(String phone, String code) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean saveIntegrationUser(String phone, String inn) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean checkAuth() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private JsonNode refreshAndRetry() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateUserToken(IntegratedUser user, Token token) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private <T> Mono<T> getRequest(Class<T> resultClass, String url, Map<String, String> body) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Mono<JsonNode> getAuthenticatedRequest() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Token refreshToken(String refreshToken) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private record LoginResponse(JsonNode companyUser, Token token) {
    }

    private record Token(
            @JsonProperty("access_token")
            String accessToken,
            @JsonProperty("refresh_token")
            String refreshToken,
            @JsonProperty("token_type")
            String tokenType,
            @JsonProperty("expires_in")
            Long expiresIn
    ) {
    }
}
