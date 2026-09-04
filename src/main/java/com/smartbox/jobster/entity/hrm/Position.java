package com.smartbox.jobster.entity.hrm;

import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.integration.hh.HHProfession;
import com.smartbox.jobster.entity.integration.ishgo.IshgoPosition;
import com.smartbox.jobster.entity.ref.ParentTinyRef;
import com.smartbox.jobster.entity.tg.FileType;
import io.jmix.core.FileRef;
import io.jmix.core.MetadataTools;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_POSITION", indexes = {
        @Index(name = "IDX_JB_POSITION_HH_PROFESSION", columnList = "HH_PROFESSION_ID"),
        @Index(name = "IDX_JB_POSITION_TYPE", columnList = "TYPE_ID"),
        @Index(name = "IDX_JB_POSITION_ISHGO_POSITION", columnList = "ISHGO_POSITION_ID")
})
@Entity(name = "jb_Position")
@Getter
@Setter
public class Position extends ParentTinyRef implements Serializable {
    private static final long serialVersionUID = -3462934640085981716L;

    @Column(name = "CONDITION")
    @Lob
    private String condition;

    @Column(name = "REQUIREMENT")
    @Lob
    private String requirement;

    @Column(name = "SKILLS")
    @Lob
    private String skills;

    @Column(name = "RESPONSIBILITY")
    @Lob
    private String responsibility;

    @Column(name = "PHOTO", length = 1024)
    private FileRef photo;

    @Column(name = "FILE_TYPE")
    private String fileType;

    @Column(name = "FILE_ID", length = 512)
    private String fileId;

    @JoinColumn(name = "TYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PositionType type;

    @JoinColumn(name = "HH_PROFESSION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private HHProfession hhProfession;

    @JoinColumn(name = "ISHGO_POSITION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private IshgoPosition ishgoPosition;

    @Column(name = "PLATFORM")
    private String platform;

    @Column(name = "PLATFORM_ID")
    private String platformId;

    public Platform getPlatform() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPlatform(Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getTinyName() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public FileType getFileType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setFileType(FileType fileType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @InstanceName
    @DependsOnProperties({"name"})
    public String getInstanceName(MetadataTools metadataTools) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
