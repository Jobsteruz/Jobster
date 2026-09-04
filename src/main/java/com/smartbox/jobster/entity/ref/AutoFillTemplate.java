package com.smartbox.jobster.entity.ref;

import com.smartbox.jobster.entity.tg.FileType;
import io.jmix.core.FileRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_AUTO_FILL_TEMPLATE")
@Entity(name = "jb_AutoFillTemplate")
@Getter
@Setter
public class AutoFillTemplate extends ParentRef implements Serializable {
    @Serial
    private static final long serialVersionUID = 8469363610089438354L;

    @Column(name = "BODY_")
    @Lob
    private String body;

    @Column(name = "SMS_BODY")
    @Lob
    private String smsBody;

    @Column(name = "FILE_", length = 1024)
    private FileRef file;

    @Column(name = "FILE_TYPE")
    private String fileType;

    @Column(name = "FILE_ID", length = 512)
    private String fileId;

    /**
     * Non-persistent. Marks that {@link #body}/{@link #smsBody} still hold the stored template text,
     * so a send may resolve them into each recipient's own language. Mass actions render their
     * preview in the first recipient's language only — without this flag every recipient would be
     * messaged in that one language. Left unset when the recruiter types over the text by hand,
     * since a hand-written message has no translations to look up.
     */
    @Transient
    private Boolean localize;

    public FileType getFileType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setFileType(FileType fileType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}