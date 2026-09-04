package com.smartbox.jobster.entity.questionnaire.temp;

import com.smartbox.jobster.entity.core.HasSort;
import com.smartbox.jobster.entity.core.SmartTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_TEMP_ANSWER", indexes = {
        @Index(name = "IDX_JB_TEMP_ANSWER_QUESTIONNAIRE", columnList = "TEMP_QUESTIONNAIRE_ID"),
        @Index(name = "IDX_JB_TEMP_ANSWER_QUESTION", columnList = "TEMP_QUESTION_ID")
})
@Entity(name = "jb_TempAnswer")
@Getter
@Setter
public class TempAnswer extends SmartTenantEntity implements Serializable, HasSort {
    @Serial
    private static final long serialVersionUID = -1498963052320424475L;

    @JoinColumn(name = "TEMP_QUESTIONNAIRE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TempQuestionnaire tempQuestionnaire;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "TEMP_QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TempQuestion tempQuestion;

    @InstanceName
    @Column(name = "ANSWER")
    @Lob
    private String answer;

    @Column(name = "SCORE")
    private Integer score = 0;

    @Column(name = "SORT")
    private Integer sort;
}