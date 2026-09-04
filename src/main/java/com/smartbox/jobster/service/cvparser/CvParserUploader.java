package com.smartbox.jobster.service.cvparser;

import com.smartbox.jobster.$;
import com.smartbox.jobster.config.cvparser.CvParserAsyncConfig;
import com.smartbox.jobster.config.cvparser.ResumeParserProperties;
import com.smartbox.jobster.service.cvparser.dto.CvParseJob;
import com.smartbox.jobster.service.cvparser.dto.CvParseJobStatus;
import io.jmix.core.FileRef;
import io.jmix.core.security.SystemAuthenticator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(ResumeParserClient.class)
public class CvParserUploader {

    private static final Logger log = LoggerFactory.getLogger(CvParserUploader.class);

    private final ResumeParserClient parserClient;
    private final ResumeParserProperties parserProperties;
    private final CvParseJobStore jobStore;
    private final SystemAuthenticator systemAuthenticator;
    private final CvFilePersister cvFilePersister;

    public CvParserUploader(ResumeParserClient parserClient,
                            ResumeParserProperties parserProperties,
                            CvParseJobStore jobStore,
                            SystemAuthenticator systemAuthenticator,
                            CvFilePersister cvFilePersister) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Async(CvParserAsyncConfig.CV_PARSER_EXECUTOR)
    public void uploadFileToParser(String jobId, byte[] fileContent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void uploadInternal(CvParseJob job, byte[] fileContent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
