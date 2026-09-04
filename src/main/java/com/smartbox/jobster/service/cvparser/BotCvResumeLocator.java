package com.smartbox.jobster.service.cvparser;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.questionnaire.QuestionAnswer;
import io.jmix.core.DataManager;
import io.jmix.core.FileRef;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

/**
 * Locates the most recent resume {@link FileRef} uploaded through a questionnaire answer for a
 * given person. Used by the questionnaire bot flow ({@code CvParserQueueListener}) to resolve
 * which file should be sent to the external CV parser — the candidate can upload several files
 * across questionnaire answers and only resume-type documents should be parsed.
 * <p>
 * Replaces the V1 helper on {@code CvParserBotService} so the new V2 flow does not depend on
 * deprecated code.
 */
@Component
public class BotCvResumeLocator {

    private static final Logger log = LoggerFactory.getLogger(BotCvResumeLocator.class);

    private static final Set<String> RESUME_EXTENSIONS = Set.of("pdf", "doc", "docx", "rtf", "html");

    private final DataManager dataManager;

    public BotCvResumeLocator(DataManager dataManager) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Returns the newest {@link QuestionAnswer#getFile()} attached to the given person whose
     * extension matches a known resume format. Returns {@link Optional#empty()} when the person
     * has no file answers or none of them carry a resume.
     */
    public Optional<FileRef> findResumeFile(String entityName, UUID personId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static String extension(String fileName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
