package com.smartbox.jobster.pebble.function;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.JbTenantEntity;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.questionnaire.QuestionBotType;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.questionnaire.QuestionService;
import io.jmix.core.Metadata;
import io.jmix.core.metamodel.datatype.Enumeration;
import io.jmix.core.metamodel.model.MetaClass;
import io.pebbletemplates.pebble.extension.Function;
import io.pebbletemplates.pebble.template.EvaluationContext;
import io.pebbletemplates.pebble.template.PebbleTemplate;
import jakarta.persistence.Entity;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 11/10/2024 10:02 PM
 */
public class EntityFunction implements Function {

    private final Metadata metadata = AppBeans.get(Metadata.class);
    private final EntityService entityService = AppBeans.get(EntityService.class);
    private final QuestionService questionService = AppBeans.get(QuestionService.class);

    @Override
    public List<?> execute(Map<String, Object> args, PebbleTemplate self, EvaluationContext context, int lineNumber) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<String> getArgumentNames() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<? extends JbEntity<UUID>> loadEntities(Question question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
