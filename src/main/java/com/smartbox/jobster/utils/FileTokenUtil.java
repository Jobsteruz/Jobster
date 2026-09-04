package com.smartbox.jobster.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.smartbox.jobster.AppBeans;
import org.springframework.core.env.Environment;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class FileTokenUtil {
    private static final ObjectMapper M = new ObjectMapper();
    private static String MASTER_KEY = AppBeans.get(Environment.class).getProperty("file.token.secret.key");
    private static long TOKEN_TTL_SECONDS = Long.parseLong(AppBeans.get(Environment.class).getProperty("file.token.tts"));
    private static long MAX_CACHE_BYTES = Long.parseLong(AppBeans.get(Environment.class).getProperty("file.max.token.cache.size"));

    private static final Cache<String, String> tokenCache = Caffeine.newBuilder()
            .expireAfterWrite(Duration.ofSeconds(TOKEN_TTL_SECONDS))
            .maximumWeight(MAX_CACHE_BYTES)
            .weigher(FileTokenUtil::estimateWeight)
            .build();


    public static String makeS3Url(String fileRef, String size) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String createToken(String masterKey, String fileRef, String size, long ttlSeconds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static byte[] deriveDailyKey(String masterKey, LocalDate date) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static int estimateWeight(String key, String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
