package com.smartbox.jobster.entity.questionnaire;

import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.HasSort;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
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
@Table(name = "JB_QUESTION_OPTION", indexes = {
        @Index(name = "IDX_JB_QUESTION_OPTION_QUESTION", columnList = "QUESTION_ID")
})
@Entity(name = "jb_QuestionOption")
@Getter
@Setter
public class QuestionOption extends StandardTenantEntity implements HasName.HasShortName, HasSort, Serializable {
    @Serial
    private static final long serialVersionUID = -2029309273670141523L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Question question;

    @InstanceName
    @Column(name = "OPTION_")
    private String shortName;

    @Column(name = "INNER_ID")
    private String innerId;

    @Column(name = "SORT")
    private Integer sort;
}