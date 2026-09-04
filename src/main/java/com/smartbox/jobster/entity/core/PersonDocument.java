package com.smartbox.jobster.entity.core;

import io.jmix.core.FileRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_PERSON_DOCUMENT")
@Entity(name = "jb_PersonDocument")
@Getter
@Setter
public class PersonDocument extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = -8061502886926983154L;

    @Column(name = "PERSON_ENTITY")
    private String personEntity;

    @Column(name = "PERSON_ID")
    private UUID personId;

    @Column(name = "DOCUMENT_FILE", length = 1024)
    private FileRef documentFile;

    @Column(name = "DOCUMENT_TYPE")
    private String documentType;

    @Column(name = "MEMO")
    @Lob
    private String memo;

    @Column(name = "AI_MEMO")
    @Lob
    private String aiMemo;

    public DocumentType getDocumentType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setDocumentType(DocumentType documentType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}