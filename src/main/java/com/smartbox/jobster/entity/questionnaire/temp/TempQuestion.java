package com.smartbox.jobster.entity.questionnaire.temp;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_TEMP_QUESTION", indexes = {
        @Index(name = "IDX_JB_TEMP_QUESTION_QUESTIONNAIRE", columnList = "QUESTIONNAIRE_ID")
})
@Entity(name = "jb_TempQuestion")
@Getter
@Setter
public class TempQuestion extends ParentRef implements Serializable {
    @Serial
    private static final long serialVersionUID = 5259045244567341476L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "QUESTIONNAIRE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TempQuestionnaire questionnaire;

    @Column(name = "LOB")
    private Boolean lob;

    @Column(name = "IS_TEXT_ANSWER")
    private Boolean isTextAnswer;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "tempQuestion")
    @OrderBy("sort")
    private List<TempAnswer> answers;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "question")
    private List<TempQuestionCondition> conditions;
}