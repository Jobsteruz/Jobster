package com.smartbox.jobster.entity.quiz;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.core.HasSort;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.service.SequenceService;
import io.jmix.core.DeletePolicy;
import io.jmix.core.FileRef;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_QUIZ_QUESTION", indexes = {
        @Index(name = "IDX_JB_QUIZ_QUESTION_QUIZ", columnList = "QUIZ_ID")
})
@Entity(name = "jb_QuizQuestion")
@Getter
@Setter
public class QuizQuestion extends StandardTenantEntity implements HasSort, Serializable {
    @Serial
    private static final long serialVersionUID = -9208661783049778913L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "QUIZ_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Quiz quiz;

    @InstanceName
    @Column(name = "QUESTION")
    @Lob
    private String question;

    @Column(name = "MULTI_ANSWER")
    private Boolean multiAnswer;

    @Column(name = "FILE_", length = 1024)
    private FileRef file;

    @Column(name = "FILE_TYPE")
    private String fileType;

    @Column(name = "REQUIRED")
    private Boolean required;

    @Column(name = "SORT")
    private Integer sort;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "question")
    @OrderBy("sort")
    private List<QuizAnswer> answers;

    public FileType getFileType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setFileType(FileType fileType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @PostConstruct
    public void postConstruct() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}