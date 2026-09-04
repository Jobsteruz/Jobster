package com.smartbox.jobster.entity.web;

import com.smartbox.jobster.entity.core.HasSort;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.tg.FileType;
import io.jmix.core.DeletePolicy;
import io.jmix.core.FileRef;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_SECTION_FILE", indexes = {
        @Index(name = "IDX_JB_SECTION_FILE_SECTION", columnList = "SECTION_ID")
})
@Entity(name = "jb_SectionFile")
@Getter
@Setter
public class SectionFile extends StandardTenantEntity implements HasSort, Serializable {

    private static final long serialVersionUID = -6956844472376061374L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "SECTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Section section;

    @Column(name = "FILE_", length = 1024)
    private FileRef file;

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
}