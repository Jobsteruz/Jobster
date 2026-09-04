package com.smartbox.jobster.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.smartbox.jobster.entity.UserIntegration;
import io.jmix.core.FileRef;
import io.jmix.core.FileStorage;
import io.jmix.core.FileStorageLocator;
import io.netty.channel.ChannelOption;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

import java.io.InputStream;
import java.time.Duration;

@Service
public class FaceDetectionService {

    private static final Logger log = LoggerFactory.getLogger(FaceDetectionService.class);
    private final WebClient faceDetectionClient;
    private final FileStorageLocator fileStorageLocator;

    public FaceDetectionService(FileStorageLocator fileStorageLocator) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean detectFaces(FileRef fileRef) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public HalfBodyValidationResponse validateHalfBody(FileRef fileRef) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public HalfBodyValidationResponse validateHalfBody(byte[] bytes, String filename) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private MultiValueMap<String, Object> createMultipartData(FileRef fileRef) throws Exception {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private MultiValueMap<String, Object> buildMultipart(byte[] bytes, String filename) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private <T> T makeRequest(String uri, MultiValueMap<String, Object> parts, Class<T> responseType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Known half-body validation reason strings. The first group mirrors the exact
     * strings returned by the external FaceDetection API (main.py /validate_half_body);
     * the second group is produced locally. Used both as the response reason and as the
     * i18n lookup key in SecondQuestionnaireController — keep them in sync.
     */
    public static final class Reason {
        public static final String NO_FACE_DETECTED = "No face detected";
        public static final String MULTIPLE_FACES = "Multiple faces detected";
        public static final String FACE_SIZE_RANGE = "Face size not within expected range";
        public static final String SHOULDERS_NOT_VISIBLE = "Shoulders not visible";
        public static final String ERROR_PROCESSING = "Error processing image";
        public static final String ERROR_READING = "Error reading image";
        public static final String EMPTY_FILE = "Empty file";
        public static final String FILE_TOO_LARGE = "File too large (max 5MB)";

        private Reason() {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }

    public record FaceDetectionResponse(
            String filename,
            @JsonProperty("size_mb") Double sizeMb,
            @JsonProperty("faces_detected") Integer facesDetected,
            @JsonProperty("face_boxes") Object[] faceBoxes
    ) {
    }

    public record HalfBodyValidationResponse(
            Boolean valid,
            String reason,
            @JsonProperty("face_box") FaceBox faceBox,
            @JsonProperty("size_mb") Double sizeMb
    ) {
    }

    public record FaceBox(
            Integer x,
            Integer y,
            Integer width,
            Integer height
    ) {
    }
}
