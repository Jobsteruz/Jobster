package com.smartbox.jobster.entity;

import com.smartbox.jobster.entity.core.HasSort;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.entity.tg.Format;
import io.jmix.core.FileRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity(name = "jb_AbstractPost")
@MappedSuperclass
@Getter
@Setter
public abstract class AbstractPost extends StandardTenantEntity implements HasSort, Serializable {

    private static final long serialVersionUID = -3416742169256201905L;

    @Lob
    @Column(name = "BODY_")
    private String body;

    @Column(name = "FORMAT")
    private String format;

    @Column(name = "FILE_", length = 1024)
    private FileRef file;

    @Column(name = "FILE_ID", length = 512)
    private String fileId;

    @Column(name = "FILE_TYPE")
    private String fileType;

    @Column(name = "SORT")
    private Integer sort;


    public FileType getFileType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setFileType(FileType fileType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Format getFormat() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setFormat(Format format) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}