package com.smartbox.jobster.service;

import com.google.common.io.ByteSource;
import com.smartbox.jobster.$;
import io.jmix.core.FileRef;
import io.jmix.core.FileStorage;
import io.jmix.core.FileStorageLocator;
import kong.unirest.Unirest;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
@RequiredArgsConstructor
public class FileService {
    private static final Logger log = LoggerFactory.getLogger(FileService.class);
    private final FileStorageLocator fileStorageLocator;

    /**
     * Fileni urldan FileRef qilib beradi
     *
     * @param url      file url
     * @param fileName File name with extension
     * @return FileRef or null
     */
    //todo: buni unirest emas boshqa connection orqali partially yuklab keyin save qiladigan qilish kerak
    public FileRef getFileRefFromUrl(@NonNull String url, @NonNull String fileName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public FileRef getFileRefFromUrl(@NonNull String url, @NonNull String fileName, @NonNull String token) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Base64 dan FileRef qilib beradi
     *
     * @param base64   Base64
     * @param fileName FileName with extension
     * @return FileRef or null
     */
    public FileRef getFileFromBase64(@NonNull String base64, @NonNull String fileName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * @param resourcePath File path in resources
     * @param fileName     FileName with extension
     */
    public FileRef getFileFromResource(@NonNull String resourcePath, @NonNull String fileName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * @param inputStream File Input Stream
     * @param fileName    FileName with extension
     */
    public FileRef getFileFromInputStream(@NonNull InputStream inputStream, @NonNull String fileName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * FileRef'dan temp file yaratish
     */
    public File createTempFile(FileRef fileRef) throws IOException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void deleteTempFile(File file) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getFileExtension(String fileName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Urldan file nomini olib beradi
     *
     * @param url URL from HH
     * @return File name
     */
    public String hhFilenameFromUrl(String url) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Urldan file nomini olib beradi
     *
     * @param url URL from LINKEDIN
     * @return File name
     */
    public String linkedinFilenameFromUrl(String url) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
