package com.smartbox.jobster.service.cvparser;

import com.smartbox.jobster.$;
import com.smartbox.jobster.service.cvparser.dto.CvParseJob;
import io.jmix.core.FileRef;
import io.jmix.core.FileStorage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;

/**
 * Persists a parsed CV's original bytes to {@link FileStorage} so the apply path can attach the
 * file as a {@code RESUME} {@code PersonDocument}. Shared by the V2 single-CV uploader and the
 * V2 batch child uploader so the persistence logic lives in exactly one place.
 * <p>
 * Best-effort by design: a storage failure logs at WARN and returns {@code null}; the parse +
 * apply still run, just without the document attachment. Callers whose {@link CvParseJob}
 * already carries a {@link FileRef} (e.g. the Telegram bot flow, where the resume is already
 * stored in a {@code QuestionAnswer.file}) get the existing ref back unchanged — this prevents
 * the same bytes from being saved a second time.
 */
@Component
public class CvFilePersister {

    private static final Logger log = LoggerFactory.getLogger(CvFilePersister.class);

    private final FileStorage fileStorage;

    public CvFilePersister(FileStorage fileStorage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Returns {@link CvParseJob#getCvFile()} if it is already populated by the caller; otherwise
     * persists {@code fileContent} and returns the new {@link FileRef}. Returns {@code null} on
     * persistence failure or when the byte array is empty.
     */
    public FileRef persist(CvParseJob job, byte[] fileContent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static String resolveFilename(CvParseJob job) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
