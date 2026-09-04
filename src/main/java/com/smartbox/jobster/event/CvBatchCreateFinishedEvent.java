package com.smartbox.jobster.event;

import com.smartbox.jobster.pojo.ai.cv_parser.CreatePersonFromCVResult;
import org.springframework.context.ApplicationEvent;

    public class CvBatchCreateFinishedEvent extends ApplicationEvent {
        public CvBatchCreateFinishedEvent(CreatePersonFromCVResult result) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        public CreatePersonFromCVResult getSource() {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }
