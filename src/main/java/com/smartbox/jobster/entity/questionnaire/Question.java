package com.smartbox.jobster.entity.questionnaire;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.DocumentType;
import com.smartbox.jobster.entity.ref.ParentRef;
import com.smartbox.jobster.entity.tg.FileType;
import io.jmix.core.DeletePolicy;
import io.jmix.core.FileRef;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.json.JSONObject;

import java.io.Serial;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@JmixEntity
@Table(name = "JB_QUESTION", indexes = {
        @Index(name = "IDX_JB_QUESTION_QUESTIONNAIRE", columnList = "QUESTIONNAIRE_ID"),
        @Index(name = "IDX_JB_QUESTION_ANSWER_FORMAT", columnList = "ANSWER_FORMAT_ID")
})
@Entity(name = "jb_Question")
@Getter
@Setter
public class Question extends ParentRef implements Serializable {
    @Serial
    private static final long serialVersionUID = 1977270537368951401L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "QUESTIONNAIRE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Questionnaire questionnaire;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OrderBy("createdDate")
    @OneToMany(mappedBy = "question")
    private List<QuestionName> names;

    @Column(name = "PHOTO", length = 1024)
    private FileRef photo;

    @Column(name = "REQUIRED")
    private Boolean required = true;

    @Column(name = "AUTO_SELECT_IF_SINGLE")
    private Boolean autoSelectIfSingle = false;

    @Column(name = "BOT_TYPE")
    private String botType;

    @Column(name = "WEB_TYPE")
    private String webType;

    @Column(name = "FILE_TYPES")
    private String fileTypes;

    @Column(name = "WEB_APP")
    private Boolean webApp;

    @Column(name = "VISIBILITY_TYPE")
    private String visibilityType;

    @Column(name = "ENTITY_FIELD")
    private String entityField;

    @Column(name = "ENTITY_NAME")
    private String entityName;

    @Column(name = "SKIPPED_ENTITIES")
    @Lob
    private String skippedEntities;

    @Column(name = "DOCUMENT_TYPE")
    private String documentType;

    @JoinColumn(name = "ANSWER_FORMAT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AnswerFormat answerFormat;

    @Column(name = "REQUEST_BTN")
    private Boolean requestBtn;

    @Column(name = "REQUEST_BTN_TYPE")
    private String requestBtnType;

    @Column(name = "ONLY_REQUEST_BTN")
    private Boolean onlyRequestBtn;

    @Column(name = "COLUMN_COUNT")
    private Integer columnCount;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "question")
    private List<QuestionCondition> conditions;

    @Column(name = "FACE_DETECTION")
    private Boolean faceDetection = false;

    @Column(name = "PHOTO_DETECTION_IN_WEB")
    private Boolean photoDetectionInWeb = false;

    @Column(name = "CV_PARSER")
    private Boolean cvParser;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OrderBy("sort")
    @OneToMany(mappedBy = "question")
    private List<QuestionOption> options;

    @Column(name = "EXPECTED_ANSWER")
    private String expectedAnswer;

    @Column(name = "MACHINE_NAME")
    private String machineName;

    @Column(name = "SA_ENABLED")
    private Boolean saEnabled = Boolean.FALSE;

    @Override
    public void prePersist() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void preUpdate() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void syncSaEnabled() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Collection<FileType> getFileTypes() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setFileTypes(Collection<FileType> fileTypes) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public VisibilityType getVisibilityType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setVisibilityType(VisibilityType visibilityType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<String> getSkippedEntities() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setSkippedEntities(List<String> skippedEntities) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public RequestButton getRequestBtnType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setRequestBtnType(RequestButton requestBtnType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public DocumentType getDocumentType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setDocumentType(DocumentType documentType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Integer getColumnCount() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public QuestionBotType getBotType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setBotType(QuestionBotType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public QuestionWebType getWebType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setWebType(QuestionWebType webType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}