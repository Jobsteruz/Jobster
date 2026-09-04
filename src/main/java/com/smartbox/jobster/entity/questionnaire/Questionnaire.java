package com.smartbox.jobster.entity.questionnaire;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.DeletePolicy;
import io.jmix.core.MetadataTools;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_QUESTIONNAIRE")
@Entity(name = "jb_Questionnaire")
@Getter
@Setter
public class Questionnaire extends ParentRef implements Serializable {
    @Serial
    private static final long serialVersionUID = 6782135311033530195L;

    @Column(name = "ENTITY_NAME")
    private String entityName;

    @Column(name = "ICON")
    private String icon;

    @Column(name = "COLOR")
    private String color;

    @Column(name = "LIMIT_")
    private Integer limit;

    @Column(name = "LIMIT_TYPE")
    private String limitType;

    @Column(name = "CSS_LINK")
    private String cssLink;

    @Lob
    @Column(name = "CSS_OVERRIDE")
    private String cssOverride;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OrderBy("sort")
    @OneToMany(mappedBy = "questionnaire")
    private List<Question> questions;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "questionnaire")
    private List<QuestionDefault> defaults;

    public Integer getLimit() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public QuestionnaireLimitType getLimitType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setLimitType(QuestionnaireLimitType limitType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public QuestionnaireColor getColor() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setColor(QuestionnaireColor color) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @InstanceName
    @DependsOnProperties({"name", "shortName"})
    public String getInstanceName(MetadataTools metadataTools) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}