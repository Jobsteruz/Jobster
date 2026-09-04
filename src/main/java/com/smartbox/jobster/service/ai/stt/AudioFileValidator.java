package com.smartbox.jobster.service.ai.stt;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.UserIntegration;
import com.smartbox.jobster.service.FileService;
import com.smartbox.jobster.service.ai.stt.exceptions.InvalidAudioFileException;
import com.smartbox.jobster.service.ai.stt.exceptions.SpeechToTextException;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;

@Component
@RequiredArgsConstructor
public class AudioFileValidator {

    private static final Logger log = LoggerFactory.getLogger(AudioFileValidator.class);
    private final FileService fileService;


    /**
     * Audio file'ni validate qilish
     */
    public void validate(File file, String originalFileName) throws SpeechToTextException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void validateFileExists(File file, String fileName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void validateFileNotEmpty(File file, String fileName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void validateFileSize(File file, String fileName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void validateFileFormat(String fileName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}