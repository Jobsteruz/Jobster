package com.smartbox.jobster.view.monitoring.loader;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.questionnaire.StandardQuestionnaireEntity;
import com.smartbox.jobster.view.monitoring.loader.datasupport.LoadConfiguration;
import io.jmix.core.Metadata;
import io.jmix.core.Sort;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.DataComponents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.UUID;

/**
 * @author Jobster team
 * date: 20/08/24 11:05
 */
@Component
public class DataContextProducer {


    @Autowired
    private Metadata metadata;

    @Autowired
    private DataComponents dataComponents;


    DataContext<JbEntity<UUID>> produce(LoadConfiguration configuration) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


}
