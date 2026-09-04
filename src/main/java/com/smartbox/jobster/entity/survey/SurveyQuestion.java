package com.smartbox.jobster.entity.survey;

import com.smartbox.jobster.entity.core.HasSort;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.tg.FileType;
import io.jmix.core.DeletePolicy;
import io.jmix.core.FileRef;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_SURVEY_QUESTION", indexes = {
        @Index(name = "IDX_JB_SURVEY_QUESTION_SURVEY", columnList = "SURVEY_ID"),
        @Index(name = "IDX_JB_SURVEY_QUESTION_GROUP", columnList = "GROUP_ID")
})
@Entity(name = "jb_SurveyQuestion")
@Getter
@Setter
public class SurveyQuestion extends StandardTenantEntity implements HasSort, Serializable {

    private static final long serialVersionUID = -721084802926553543L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "SURVEY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Survey survey;

    @InstanceName
    @Column(name = "QUESTION")
    @Lob
    private String question;

    @JoinColumn(name = "GROUP_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SurveyQuestionGroup group;

    @Column(name = "MULTI_ANSWER")
    private Boolean multiAnswer;

    @Column(name = "FILE_", length = 1024)
    private FileRef file;

    @Column(name = "FILE_TYPE")
    private String fileType;

    @Column(name = "SORT")
    private Integer sort;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "question")
    private List<SurveyQuestionCondition> conditions;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "question")
    @OrderBy("sort")
    private List<SurveyAnswer> answers;

    public FileType getFileType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setFileType(FileType fileType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}