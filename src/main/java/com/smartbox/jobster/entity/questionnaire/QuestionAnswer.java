package com.smartbox.jobster.entity.questionnaire;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.tg.FileType;
import io.jmix.core.FileRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_QUESTION_ANSWER", indexes = {
        @Index(name = "IDX_JB_QUESTION_ANSWER_QUESTIONNAIRE", columnList = "QUESTIONNAIRE_ID"),
        @Index(name = "IDX_JB_QUESTION_ANSWER_QUESTION", columnList = "QUESTION_ID"),
        @Index(name = "IDX_JB_QUESTION_ANSWER_ENTITY_ID", columnList = "ENTITY_ID")
})
@Entity(name = "jb_QuestionAnswer")
@Getter
@Setter
public class QuestionAnswer extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 6633708989776664773L;

    @JoinColumn(name = "QUESTIONNAIRE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Questionnaire questionnaire;

    // yaratilinayotgan entityning classi
    @Column(name = "ENTITY_NAME")
    private String entityName;

    // yaratilinayotgan entityning idsi
    @Column(name = "ENTITY_ID")
    private UUID entityId;

    @JoinColumn(name = "QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Question question;

    // userga ko'rsatiadigan text
    @Column(name = "ANSWER")
    @Lob
    private String answer;

    // question ga qo'yilgan entityning listga tegishli id lardan biri, options, yoki enum
    @Column(name = "EID")
    private String eid;

    @Column(name = "SKIPPED")
    private Boolean skipped;

    @Column(name = "FILE_", length = 1024)
    private FileRef file;

    @Column(name = "FILE_TYPE")
    private String fileType;

    @Column(name = "DATE_")
    private OffsetDateTime date;

    @Column(name = "SA_DISPATCHED_AT")
    private OffsetDateTime saDispatchedAt;

    public FileType getFileType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setFileType(FileType fileType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}