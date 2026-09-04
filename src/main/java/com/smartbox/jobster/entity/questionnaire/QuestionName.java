package com.smartbox.jobster.entity.questionnaire;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_QUESTION_NAME", indexes = {
        @Index(name = "IDX_JB_QUESTION_NAME_QUESTION", columnList = "QUESTION_ID")
})
@Entity(name = "jb_QuestionName")
@Getter
@Setter
public class QuestionName extends ParentRef implements Serializable {
    @Serial
    private static final long serialVersionUID = -675068670194219935L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Question question;
}