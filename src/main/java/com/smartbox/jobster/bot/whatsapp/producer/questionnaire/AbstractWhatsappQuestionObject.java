package com.smartbox.jobster.bot.whatsapp.producer.questionnaire;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.whatsapp.AbstractWhatsappService;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.entity.company.Branch;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.company.DepartmentCategory;
import com.smartbox.jobster.entity.core.JbTenantEntity;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.hrm.WorkSchedule;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.questionnaire.QuestionOption;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.questionnaire.StandardQuestionnaireEntity;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.entity.ref.SettingType;
import com.whatsapp.api.domain.messages.Body;
import io.jmix.core.FetchPlan;
import io.jmix.core.metamodel.datatype.Enumeration;
import io.jmix.core.metamodel.model.MetaClass;
import jakarta.persistence.Entity;
import lombok.Getter;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Getter
public abstract class AbstractWhatsappQuestionObject extends AbstractWhatsappService {

    private final WhatsappContext botContext;

    private List<? extends JbTenantEntity<UUID>> questionEntities;

    protected AbstractWhatsappQuestionObject(WhatsappContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Question question() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Body getMessageBody() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected Boolean isSkipped() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected StandardQuestionnaireEntity getEntity(Questionnaire questionnaire) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected StandardQuestionnaireEntity getEntity(Question question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public List<QuestionOption> options() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<? extends JbTenantEntity<UUID>> entities() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Enum> enums() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public QuestionOption selectedOption() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public JbTenantEntity<UUID> selectedEntity(boolean link) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Enum<?> selectedEnum() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
