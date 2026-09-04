package com.smartbox.jobster.entity.quiz;

import com.smartbox.jobster.entity.questionnaire.QuestionnaireColor;
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
@Table(name = "JB_QUIZ")
@Entity(name = "jb_Quiz")
@Getter
@Setter
public class Quiz extends ParentRef implements Serializable {
    @Serial
    private static final long serialVersionUID = -6091362117549296958L;

    @Column(name = "PASS_SCORE")
    private Double passScore;

    @Column(name = "NUM_OF_QS")
    private Integer numOfQs;

    @Column(name = "RANDOM")
    private Boolean random;

    @Column(name = "ICON")
    private String icon;

    @Column(name = "DURATION")
    private Integer duration;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "quiz")
    @OrderBy("sort, createdDate")
    private List<QuizQuestion> questions;

    @Column(name = "COLOR")
    private String color;

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