package com.smartbox.jobster.view.abstractview;

import com.smartbox.jobster.entity.questionnaire.StandardQuestionnaireEntity;
import io.jmix.core.TimeSource;
import io.jmix.flowui.view.Subscribe;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Jobster team
 * Since: 3/4/2024 12:20 PM
 */
public abstract class AbstractQuestionnaireEntityDetailView<T extends StandardQuestionnaireEntity> extends AbstractDetailView<T> {

    @Autowired
    private TimeSource timeSource;

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
