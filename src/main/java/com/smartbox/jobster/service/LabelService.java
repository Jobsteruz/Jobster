package com.smartbox.jobster.service;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Label;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.questionnaire.QuestionnaireEntityLabel;
import io.jmix.core.DataManager;
import io.jmix.core.entity.KeyValueEntity;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 4/20/2024 1:03 PM
 */
@Service
public class LabelService {

    @Autowired
    private DataManager dataManager;

    public Label getByTitle(String title) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<QuestionnaireEntityLabel> getEntityLabels(String entityName, UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<QuestionnaireEntityLabel> getEntityLabels(String entityName, List<UUID> entityIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<QuestionnaireEntityLabel> updateEntityLabels(List<QuestionnaireEntityLabel> oldEntityLabels,
                                                             List<Label> labels, Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
