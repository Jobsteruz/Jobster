package com.smartbox.jobster.entity.questionnaire;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_QUESTION_DEFAULT", indexes = {
        @Index(name = "IDX_JB_QUESTION_DEFAULT_QUESTIONNAIRE", columnList = "QUESTIONNAIRE_ID")
})
@Entity(name = "jb_QuestionDefault")
@Getter
@Setter
public class QuestionDefault extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 2612913698851217411L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "QUESTIONNAIRE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Questionnaire questionnaire;

    @Column(name = "ENTITY_FIELD")
    private String entityField;

    @Column(name = "DEFAULT_VALUE")
    @Lob
    private String defaultValue;
}